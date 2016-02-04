package domain;

import org.junit.Assert;
import org.junit.Test;

import domain.toys.ActionMan;
import domain.toys.BatteryToy;
import domain.toys.Toy;

public class ActionManUnitTests {
	
	@Test
	public void shouldTestActionManInstances() {
		
		ActionMan actionMan = new ActionMan(1, "ActionMan", 50.0F, 3, "Comando");
		Assert.assertEquals(1, actionMan.getId());
		Assert.assertTrue(actionMan instanceof Product);
		Assert.assertEquals(61.5F, actionMan.getPrice(), 0);
			
		Toy toy = new ActionMan(2, "ActionMan", 50.0F, 3, "Comando");
		Assert.assertEquals(2, toy.getId());
		Assert.assertTrue(toy instanceof ActionMan);
		Assert.assertTrue(toy instanceof BatteryToy);
		Assert.assertTrue(toy instanceof PortableDevice);
		Assert.assertTrue(toy instanceof Chef);
		
		Assert.assertEquals("Comando", ((ActionMan)toy).getType());
		
		System.out.println(actionMan);
		System.out.println(toy.toString());
		
		((PortableDevice)toy).m1();
		((BatteryToy)toy).m1();
	}
}
