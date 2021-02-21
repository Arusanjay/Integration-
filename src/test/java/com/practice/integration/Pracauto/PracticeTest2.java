package com.practice.integration.Pracauto;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTest2 {
	
	@Test
	public void method4() {
		
		System.out.println("method1 one executed");
		Assert.assertEquals(1, 4);
		
	}
	@Test
	public void method5() {
		
		System.out.println("method2 one executed");
		Assert.assertEquals(4, 4);
	}
	
	@Test
	public void method6() {
		
		System.out.println("method2 one executed");
		Assert.assertEquals(1, 4);
		
	}


}
