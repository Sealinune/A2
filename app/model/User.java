package model;

import java.util.*;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

public class User{
    
    String id;
    String email;
    String hash;
	private ArrayList<Message> messages;
	
	ConcurrentHashMap<String, Session> activeSessions = new ConcurrentHashMap<>();
	
	public User(String id, String email, String hash) {
        this.id = id;
        this.email = email;
        this.hash = hash;
        this.messages = new ArrayList<Message>();
	}
		
    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public String getHash() {
        return hash;
    }
    
    public void setHash(String hash){
        this.hash = hash;
    }
    
    
    public ArrayList<Message> getMessageList(){
		return messages;
	}

    public void addMessage(Message message) {
		
		messages.add(message);
		message.setAuthor(email);
	}
	
    public boolean hasSession(String sessionId) {
        return activeSessions.containsKey(sessionId);
    }

    public Session[] getSessions() {
        Collection<Session> values = activeSessions.values();
        return values.toArray(new Session[values.size()]);
    }

    /**
     * Record that a particular session is logged in as this user
     */
    public void pushSession(Session s) {
        activeSessions.put(s.id, s);
    }

    /**
     * Remove an active session from this user
     */
    public void removeSession(String sessionId) {
        activeSessions.remove(sessionId);
    }
    
    
}
