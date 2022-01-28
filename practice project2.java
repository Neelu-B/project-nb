package com.nb.Training;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		ArrayList<String>emails=new ArrayList<String>();
		emails.add("abc@gmail.com");
		emails.add("abc@gmail.co.in");
		emails.add("abc.name@gmail.com");
		emails.add("abc#gmail.com");
		emails.add("yahoo.com");
		String regex="^(.+)@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		for(String email1:emails)
		{
			Matcher matcher=pattern.matcher(email1);
			System.out.println(email1+":"+matcher.matches()+"\n");
		}

	}

}
