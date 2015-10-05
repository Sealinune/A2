package model;

import java.util.ArrayList;
import java.util.*;


import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Message {
	
	public String author;
	public String content;
	public ArrayList<String> tagList ;//= new ArrayList<String>();
	public String UUID;
	
	public Message() {
		// TODO Auto-generated constructor stub
		tagList = new ArrayList<String>();
		author = new String();
		content = new String();
	}
	
	public Message(String author , String content) {
		// TODO Auto-generated constructor stub
		tagList = new ArrayList<String>();
		author = author;
		content = content;
	}	
	
	public void setContent(String s){
		content = s;
	}
	public String getContent() {
		return content;
	}
	public void addTag(String tag){
		tagList.add(tag);
	}
	
	/**
	 * use for search one tag
	 * @param tag
	 * @return true if this message have the tag , false if this message do not have the tag
	 */
	public boolean blongTag(String tag){
		if(tagList.contains(tag))
			return true;
		else 
			return false;
	}
	
	public void setAuthor(String a){
		author = a;
	}
	
	public String getAuthor(){
		return author;
	}
}
