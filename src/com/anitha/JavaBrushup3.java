package com.anitha;

public class JavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = new String("Welcome");
		String s = "Anitha Automation learning";
		String[] splittedstring = s.split("Auto");
		for(int i= 0; i<splittedstring.length;i++)
		{
		System.out.println(splittedstring[i]);
		} 
		for(int i= 0; i<s.length();i++)
		{
		System.out.println(s.charAt(i));
		} 
		for(int i= s.length()-1;i>=0;i--)
		{
		System.out.println(s.charAt(i));
		System.out.println("Char matches");
		} 
	}

}
