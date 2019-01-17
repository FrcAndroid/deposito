import static org.junit.Assert.*;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DepositoCombustibleTestParametrizada {
	

	private double deposito;
	private double valor;
	private double resultado;
	
	public DepositoCombustibleTestParametrizada(double n1, double n2, double r) {
		deposito=n1;
		valor=n2;
		resultado=r;
	}

	@Parameters
	public static Collection<Object[]> numeros2(){
		return Arrays.asList(new Object[][] {
			{0.0,5.0,5.0},{0.0,35.0,35.0},{0.0,-5.0,-5.0}
		});
	}
	@Test
	public void testLlenar() {
		double res=deposito+valor;
		assertEquals(res, resultado,0.1);
	}
				
}