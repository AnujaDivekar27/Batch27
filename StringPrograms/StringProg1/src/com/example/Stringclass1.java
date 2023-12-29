package com.example;

public class Stringclass1 {

 public static void main(String[] args) {
	
  String s="Welcome In New Year";
  System.out.println("String without space-------------");
  String s1=s.replaceAll(" ", "");
  
  int lcnt=0,ucnt=0;
  for(int i=0;i<s1.length();i++)
  {
	  char c= s1.charAt(i);
	  if(Character.isUpperCase(c))
	  {
		 ucnt++;
	  }
	  else if(Character.isLowerCase(c))
	  {
		 lcnt++;
	  }
  }
   System.out.println("Count total uppercase letter in string"+" "+ucnt);
   System.out.println("Count total lowercase letter in string"+" "+lcnt);
  }
	
}
