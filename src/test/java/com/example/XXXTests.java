package com.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.Test;

public class XXXTests {
	
	@Test
	public void xxx() {
		NumberFormat format = NumberFormat.getInstance();
		format.setMaximumFractionDigits(4);
		format.setMinimumFractionDigits(2);
		String v = format.format(123456.5);
		System.out.println(v);
		
		DecimalFormat xx = new DecimalFormat("000,000");
		System.out.println(xx.format(123456789));
		
	}

}
