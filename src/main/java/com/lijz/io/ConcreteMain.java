package com.lijz.io;

import java.io.*;

public class ConcreteMain {
   public static void main(String... args) throws Exception, IOException {
       File f= new File("a.txt");
	   ConcretePage cp= new ConcretePage("Ankita","Atul");
	   
	   ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
       out.writeObject(cp);  
      
       ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
       cp=(ConcretePage)in.readObject();
       System.out.println("After deserialize user is: " +cp.getUser()+" and author is:"+cp.getAuthor());   
   }
}