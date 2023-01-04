package com.iamgagansuri;

public class SnykClass {


public void login() {
  String userName = "gagan";
  String password = "testpassword";
  boolean loggedIn = authenticate(userName,password);
  System.out.println("logged in successfully");

}

public boolean authenticate() {
   return user.equals("gagan") && password.equals("testpassword");

}

}
