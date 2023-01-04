package com.iamgagansuri;

public class SnykClass {


public void login() {
  String userName = "gagan";
  String p = "testpassword";
  boolean loggedIn = authenticate(userName,password);
  System.out.println("logged in successfully");

}

public boolean authenticate(String u,String p) {
   return user.equals("gagan") && p.equals("testpassword");

}

}
