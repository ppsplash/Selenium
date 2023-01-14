package com.anitha;

public class Javabrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		String b = "BASICS";
		char c = 'X';
		double d = 12.99;		
		boolean e = true;
		System.out.println(a +b + c+d+ e);

		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] =4;
		arr[4] = 5;
		System.out.println(arr[3]);
		
		int[] arr2 = {3,6,9,12,15};
		System.out.println(arr2[3]);
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = {"anitha","automation","learning"};
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		for(String s:name)
		{
			System.out.println(s);
		}
	}

}
