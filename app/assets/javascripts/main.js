(function(){
	var MessageList = React.createClass({displayName: "MessageList",
		  render: function() {
			var elements = [];
			for(var i = 0;i<this.props.data.length;i++){
				var item = this.props.data[i];
				var tags = [];
				for(var j=0;j<item.tags.length;j++){
					var element  = React.createElement("span", {className:"label label-info marginRight15"},item.tags[j]);
					tags.push(element);
				}
				var tagwrapper = React.createElement("p",null,tags,"");
				var element = React.createElement("div", {className: "col-sm-12 marginTop15"}, 
				React.createElement("label",null,item.uuid),
				React.createElement("label",{className: "pull-right"},item.email),
				React.createElement("p",null,item.content),
				tagwrapper);
				elements.push(element);
			}
			return React.createElement("div", null,elements, "");
		  }
	});
	
	var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
    var messageSocket = new WS("ws://localhost:9000/getmessage");

	
	var mountNode = document.getElementById("message-list");
    var receiveEvent = function(event) {
		var data = JSON.parse(event.data);
		React.render(React.createElement(MessageList, {data:data}), mountNode);
    }
	
	messageSocket.onmessage = receiveEvent
	
	
	var checklogin = function(){
		$.get("/islogin",{},function(response){
			if(response.code == 1001){
				$(".login").removeClass("hidden");
				$(".logout").addClass("hidden");
				$("#user").html(response.message);
				$("#send_message_wrapper").removeClass("hidden");
			}else{
				$(".login").addClass("hidden");
				$(".logout").removeClass("hidden");
				$("#user").html();
				$("#send_message_wrapper").addClass("hidden");
			}
		},"json");
	}
	
	checklogin();

	
	$("#logout").click(function(){
		$.get("/login",{},function(response){
			if(response.code == 1001){
				$(".login").addClass("hidden");
				$(".logout").removeClass("hidden");
				$("#user").html();
				$("#send_message_wrapper").addClass("hidden");
			}
		},"json");
	});
	
	$("#login-confirm").click(function(){
		if($("#login-email").val() == ""){
			$("#login-email").next().html("email can not be empty!");
			$("#login-email").parent().addClass("has-error");
		}else{
			$("#login-email").next().html("");
			$("#login-email").parent().removeClass("has-error");
		}
		if($("#login-password").val() == ""){
			$("#login-password").next().html("password can not be empty!");
			$("#login-password").parent().addClass("has-error");
		}else{
			$("#login-password").next().html("");
			$("#login-password").parent().removeClass("has-error");
		}
		if(!$("#loginmodal .form-group").hasClass("has-error")){
			$.post("/login",$("#loginform").serialize(),function(response){
				if(response.code == 1001){
					$("#loginmodal").modal('hide');
					$("#send_message_wrapper").removeClass("hidden");
					$(".login").removeClass("hidden");
					$(".logout").addClass("hidden");
					$("#user").html($("#login-email").val());
					$("#login-cancel").trigger("click");
				}else{
					$("#login-form-tip").html(response.message);
				}
			},"json");
		}
	});
	
	$("#login-cancel").click(function(){
		$("#loginmodal form")[0].reset();
		$("#loginmodal .form-group").removeClass("has-error");
		$("#loginmodal .help-block").html("");
	});
	
	$("#register-confirm").click(function(){
		if($("#register-email").val() == ""){
			$("#register-email").next().html("email can not be empty!");
			$("#register-email").parent().addClass("has-error");
		}else{
			$("#register-email").next().html("");
			$("#register-email").parent().removeClass("has-error");
		}
		if($("#register-password").val() == ""){
			$("#register-password").next().html("password can not be empty!");
			$("#register-password").parent().addClass("has-error");
		}else{
			$("#register-password").next().html("");
			$("#register-password").parent().removeClass("has-error");
		}
		if(!$("#registermodal .form-group").hasClass("has-error")){
			$.post("/register",$("#registerform").serialize(),function(response){
				if(response.code == 1001){
					$("#tipmodal-content").html(response.message);
					$("#registermodal").modal('hide');
					$("#tipmodal").modal('show');
					$("#register-cancel").trigger("click");
				}else{
					$("#register-form-tip").html(response.message);
				}
			},"json");
		}
	});
	
	
	$("#register-cancel").click(function(){
		$("#registerform")[0].reset();
		$("#registermodal .form-group").removeClass("has-error");
		$("#registermodal .help-block").html("");
	});
	
	
	$("#send-message").click(function(){
		$("#send-tip").html("");
		if($("#message-content").val() == ""){
			$("#send-tip").html("message can not be empty");
		}else{
			$.post("/send",{content:$("#message-content").val()},function(response){
				if(response.code == 1001){
					$("#message-content").val("");
				}else{
					$("#send_message_wrapper").addClass("hidden");
				}
			},"json");
		}
	});
	
	
	$("#Search").click(function(){
		//console.log("onclick:"+messageSocket.readyState);
		if(messageSocket.readyState == 1){
			messageSocket.send($("#input-key").val());
		}
	});
	$("#All").click(function(){
		//console.log("onclick:"+messageSocket.readyState);
		if(messageSocket.readyState == 1){
			messageSocket.send("");
		}
		$("#input-key").val("");
	});
})