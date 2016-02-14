package com.lijz.io;

import java.io.*;

public class ConcretePage implements Serializable {
    public static final long serialVersionUID = 1L;
	private String user;
	private transient String author;
	
	public ConcretePage(String user,String author){
		this.user=user;
		this.author=author;
	}
	private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(this.author);
    }
 
    private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException {
        throw new InvalidClassException("can not deserilized");
//        in.defaultReadObject();
//        this.author = (String)in.readObject();
    }
 
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}