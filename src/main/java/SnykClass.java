package com.iamgagansuri;

public class SnykClass {


public void login() {
  String userName = "gagan";
  String password = "atom";
  boolean loggedIn = authenticate(userName,password);
  System.out.println("logged in successfully");

}

public boolean authenticate(String u,String p) {
   return u.equals("gagan") && p.equals("atom");

}

}
