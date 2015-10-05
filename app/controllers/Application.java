package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import model.*;
import models.*;

import java.util.*;
import java.*;
import java.net.*;
 
import play.*;
import play.mvc.*;
import play.data.Form;
import java.util.UUID;



public class Application extends Controller {

    private static MessageStore messageStore = new MessageStore();
    private static List<Message> messages = new ArrayList<Message>();
    private static List<String>  messageStringList = new ArrayList<String>();
    
    public final static String SESSIONVAR = "MYSESSION";
    
    //home page
    public static Result index() {
        User u = UserController.getOnlineUser();
        if (u == null){
                return ok(views.html.application.index.render());
            }else{
                String email = u.getEmail();
                return ok(views.html.application.loginok.render(email));
        }
    }
    
    //home page
    public static Result front() {
        User u = UserController.getOnlineUser();
        if (u == null){
                return ok(views.html.application.spa.index.render());
            }else{
                String email = u.getEmail();
                return ok(views.html.application.loginok.render(email));
        }
    }
    
    

    public static Result publish(){
        
        User u = UserController.getOnlineUser();
        if (u != null) {
            String email = u.getEmail();
            for(int i= 0 ; i < messages.size() ; i++ ){
                messageStringList.add(messages.get(i).content);
            }
			return ok(views.html.application.publish.render(messageStringList, email));
		} else {
			return redirect("/login");
		}
    }
    
    
    //Go to search page
    public static Result search(){
        String email = UserController.getOnlineUser().getEmail();
        return ok(views.html.application.search.render(messageStringList,email));
    }
    
    
    
    //Method of searching by username
    public static Result searchuser(){
        
        String email = UserController.getOnlineUser().getEmail();
        
        String searchuser= Form.form().bindFromRequest().get("searchuser");
        
        if(searchuser != null)
        {
            if(messageStore.findUserByEmail(searchuser)){
                messages = messageStore.getUserMessagesByEmail(searchuser);
                for(int i= 0 ; i < messages.size() ; i++ ){
                    messageStringList.add(messages.get(i).content);
                }
            }
        }
        
                
        return ok(views.html.application.search.render(messageStringList,email));
    }
    //Method of searching by tags
    public static Result searchtopic(){
        
        String email = UserController.getOnlineUser().getEmail();

        String searchtopic= Form.form().bindFromRequest().get("searchtopic");
        
        if(searchtopic != null)
        {
            messageStringList = messageStore.searchByTag(searchtopic);
        }
        
                
        return ok(views.html.application.search.render(messageStringList,email));
    }    
    //Post a message        
    public static Result postmessage(){
        
        User u = UserController.getOnlineUser();
        String email = u.getEmail();
        
        String newMessageString= Form.form().bindFromRequest().get("newMessage");
        
        Logger.trace(newMessageString);
        
        String tag1=Form.form().bindFromRequest().get("tag1");
        String tag2=Form.form().bindFromRequest().get("tag2");
        String tag3=Form.form().bindFromRequest().get("tag3");
        String tag4=Form.form().bindFromRequest().get("tag4");

        //Message newMessage = new Message(email,"newMessageString");
        
        Message newMessage = new Message();
        newMessage.author = email;
        newMessage.content = newMessageString + "------" + email;
        if(tag1!=null)
            newMessage.addTag(tag1);
        if(tag2!=null)
            newMessage.addTag(tag2);
        if(tag3!=null)
            newMessage.addTag(tag3);
        if(tag4!=null)
            newMessage.addTag(tag4);
        
        newMessage.UUID = UUID.randomUUID().toString();
        
        if(email != null)
        {
            messageStore.updateUserMessage(email,newMessage);
            messages = messageStore.getUserMessagesByEmail(email);
        }
        
        for(int i= 0 ; i < messages.size() ; i++ ){
            messageStringList.add(messages.get(i).content);
        }

        return ok(views.html.application.publish.render(messageStringList , email));        
        
    }


    //API_POSTMESSAGE
    public static Result api_postmessage(){
        
        String email = UserController.getOnlineUser().getEmail();
        
        if(email == null)
            email = "apiuser";

        
        if(email != null)
        {
            messages = messageStore.getUserMessagesByEmail(email);
        }
        
        for(int i= 0 ; i < messages.size() ; i++ ){
            messageStringList.add(messages.get(i).content);
            
        }        
        
        
        return ok();
    }
    //API_SEARCH_BY_USER
    public static Result api_users(String username){
        
        //String username = "test";
        
        String result  = "{";
        
        if(username != null)
            messages = messageStore.getUserMessagesByEmail(username);
        
        int i;
        for(i= 0 ; i < messages.size() ; i++ ){
            String content = messages.get(i).content;
            result = result + "\"no."+i+"\":"+"\""+content+"\",";
        }
        result = result.substring(0,result.length()-1);
        result = result + "}";
        
        return ok(result);
    }
    //API_SEARCH_BY_TAGS
    public static Result api_tags(String tag){
        
        
        
        String result= "{";
        
        ArrayList<String> messages = new ArrayList<String>();

        
        if(tag != null)
        {
            messages = messageStore.searchByTag(tag);
        }
        
        int i;
        for(i= 0 ; i < messages.size() ; i++ ){
            String content = messages.get(i);
            result = result + "\"no."+i+"\":"+"\""+content+"\",";
        }
        if(i!=0)
            result = result.substring(0,result.length()-1);
        
        result = result + "}";                
        
        return ok(result);
    }
    
    public static Result api_tag(){

        return ok("result");
    }   

    
}
