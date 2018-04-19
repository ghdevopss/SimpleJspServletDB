package emailDemo;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Testadd {

	@Test
	public void testadd()
	{
		Addition obj=new Addition(3,5);
		System.out.println("inside this method");
		Assert.assertEquals(8,obj.add());
	}

}
