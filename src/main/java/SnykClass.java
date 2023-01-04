package com.iamgagansuri;

public class SnykClass {


public void login() {
  String userName = "gagan";
  String part1="st";
  String part2="ar";
  String password = part1 + part2;
  String password1 = "atom";
  boolean loggedIn = authenticate(userName,password1);
  System.out.println("logged in successfully");

}

public boolean authenticate(String u,String p) {
   return u.equals("gagan") && p.equals("star");

}

}
