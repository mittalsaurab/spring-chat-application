package com.personal.springchatapplication.model;

public class Message {
	private String from;
	private String content;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Message(String from, String content) {
		super();
		this.from = from;
		this.content = content;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Message [from=" + from + ", content=" + content + "]";
	}
	
}
