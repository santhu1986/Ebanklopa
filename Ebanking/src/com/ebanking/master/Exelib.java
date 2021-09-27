package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws IOException 
	{
		Library Lb=new Library();
		
		String Rval=Lb.OpenApp("http://122.175.8.158/ranford2");
		System.out.println(Rval);
		Lb.AdminLgn("Admin","Testing@");
		Lb.Branch();
	}

}
