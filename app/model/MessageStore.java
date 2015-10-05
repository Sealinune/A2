package model;

import java.util.*;
import org.mindrot.jbcrypt.BCrypt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageStore {
	
	private static List<User> users = new ArrayList<User>();
	private static List<Message> messages = new ArrayList<Message>();
	
	public void addUser(String email ,String pw) {
		User user = new User(java.util.UUID.randomUUID().toString(), email, BCrypt.hashpw(pw, BCrypt.gensalt()));
		users.add(user);
	}
	
    public boolean matchePW(String email ,String pw) {
        User user = new User(java.util.UUID.randomUUID().toString(), email, BCrypt.hashpw(pw, BCrypt.gensalt()));
        user = users.get(userIndexByEmail(email));
        String last = user.getHash();
        return BCrypt.checkpw(pw, last);
    }
	
	
	public void updateUserMessage(String email , Message me) {
		if(userIndexByEmail(email)!=-1){
			users.get(userIndexByEmail(email)).addMessage(me);
		}
	}
	
	public int userIndexByEmail(String email){
		for(int i = 0 ; i < users.size() ; i++)
		{
			if(users.get(i).getEmail().equals(email))
				return i;
		}
		return -1;
	}
	
	public ArrayList<Message> getUserMessagesByEmail(String email)
	{
	    int index = -1;
	    ArrayList<Message> result = new ArrayList<Message>();
	    for(int i = 0 ; i < users.size() ; i++)
		{
			if(users.get(i).getEmail().equals(email))
				index = i;
		}
		if(index != -1){
		    result = users.get(index).getMessageList();
		}
		return result;
	}
	
	public MessageStore() {
		// TODO Auto-generated constructor stub
	
		users = new ArrayList<User>();
	}

	public ArrayList<Message> searchByUserName(String email){
		
		ArrayList<Message> result = new ArrayList<Message>();
		
		for(int i = 0;i < users.size() ; i++){
			if(users.get(i).getEmail().equals(email))
				result = users.get(i).getMessageList();
		}
		
		return result;
		
	}
	
    public ArrayList<String> searchByTag(String tag){
		
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i = 0;i < users.size() ; i++){
		    User user = users.get(i);
		    ArrayList<Message> messages = user.getMessageList();
		    
		    for(int j = 0; j < messages.size() ; j++){
		        Message message = messages.get(j);
		        for(int cnt = 0 ; cnt <message.tagList.size() ; cnt++){
		            
		            String str = message.tagList.get(cnt);
		            String regEx = tag; 
                    Pattern p = Pattern.compile(regEx);
                    
                    Matcher m = p.matcher(str);
                    
                    if( m.find()){
                        result.add(message.content);
                    }

		        }
		    }
		    

		}
		
		return result;
		
	}	
	
	public static boolean findUserByEmail(String email){
	    boolean result = false;
	    for(int i = 0;i < users.size() ; i++){
			if(users.get(i).getEmail().equals(email))
				result = true;
		}
	    return result;
	}
}

