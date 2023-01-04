package com.iamgagansuri;

public class SnykClass {


public void login() {
  String userName = "gagan";
  String part1="st";
  String part2="ar";
  String pwd = part1 + part2;
  boolean loggedIn = authenticate(userName,pwd);
  System.out.println("logged in successfully");

}

public boolean authenticate(String u,String p) {
   return u.equals("gagan") && p.equals("star");

}

}
