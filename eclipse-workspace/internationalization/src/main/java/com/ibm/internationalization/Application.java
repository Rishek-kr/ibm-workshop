package com.ibm.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class Application
{
	public static void main( String[] args )
	{
		double d = 123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
		NumberFormat nf2 = NumberFormat.getInstance(Locale.CHINA);
		
		System.out.println("ITALY representation of "+ d +":"+nf.format(d));
		System.out.println("US representation of "+ d +":"+nf1.format(d));
		System.out.println("CHINA representation of "+ d +":"+nf2.format(d));
		
		System.out.println(Locale.US);
	}
}