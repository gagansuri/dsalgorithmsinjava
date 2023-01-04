package com.iamgagansuri;

public class SnykClass {


public void login() {
  String userName = "gagan";
  String pwd = "testpassword";
  boolean loggedIn = authenticate(userName,password);
  System.out.println("logged in successfully");

}

public boolean authenticate(String u,String pwd) {
   return user.equals("gagan") && pwd.equals("testpassword");

}

}
