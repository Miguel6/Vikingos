package personaje;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestPersonaje {
	private Vikingo v1;
	private Vikingo v2;
	@Before
	public void inicio(){
		this.v1 = new Vikingo();
		this.v2 = new Vikingo();
	}
	@Test
	public void sobrioVsSobrio(){
		v1.atacaA(v2);
		Assert.assertEquals(95, v2.getSalud());
	}
	
	@Test
	public void sobrioVsBorracho(){
		v2.beber();
		v1.atacaA(v2);
		Assert.assertEquals(92, v2.getSalud());
	}
	@Test
	public void borrachoVsBorracho(){
		v2.beber();
		v1.beber();
		v1.atacaA(v2);
		Assert.assertEquals(95, v2.getSalud());
	}
	@Test
	public void berserkerVsNormal(){
		v1.esSacudido();
		v1.esSacudido();
		v1.atacaA(v2);
		v2.atacaA(v1);
		Assert.assertEquals(80, v1.getSalud());
		Assert.assertEquals(25, v2.getSalud());
	}
	
	
}
