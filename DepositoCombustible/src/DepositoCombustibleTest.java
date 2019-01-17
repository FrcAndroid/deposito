import static org.junit.Assert.*;



import org.junit.Test;


public class DepositoCombustibleTest {
	DepositoCombustible Deposito= new DepositoCombustible(40.0,0.0);
	
	@Test
	public void testGetDepositoNivel() {
	assertEquals(0.0, Deposito.getDepositoNivel(),0.1);
	}

	@Test
	public void testGetDepositoMax() {
	assertEquals(40.0, Deposito.getDepositoMax(),0.1);
	}

	@Test
	public void testEstaVacio() {
	assertSame(true, Deposito.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		Deposito.fill(20.0);
		assertSame(false, Deposito.estaLleno());
	}
	
}
	
	

