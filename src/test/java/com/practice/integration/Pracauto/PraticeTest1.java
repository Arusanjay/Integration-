package com.practice.integration.Pracauto;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PraticeTest1 {
	
	
	
	@Test
	public void method1() {
		
		System.out.println("method1 one executed");
		Assert.assertEquals(1, 4);
		
	}
	@Test
	public void method2() {
		
		System.out.println("method2 one executed");
		Assert.assertEquals(4, 4);
	}
	
	@Test
	public void method3() {
		
		System.out.println("method2 one executed");
		Assert.assertEquals(1, 4);
		
	}


}
