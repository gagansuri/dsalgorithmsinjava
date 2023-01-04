package com.iamgagansuri;

public class SnykClass {


public void login() {
  String userName = "gagan";
  String p = "star";
  boolean loggedIn = authenticate(userName,p);
  System.out.println("logged in successfully");

}

public boolean authenticate(String u,String p) {
   return u.equals("gagan") && p.equals("star");

}

}
