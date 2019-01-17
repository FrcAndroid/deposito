import static org.junit.Assert.*;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;


@RunWith(Parameterized.class)
public class DepositoCombustibleTestParametrizada2{
	

	private double deposito;
	private double valor;
	private double resultado;
	
	public DepositoCombustibleTestParametrizada2(double n1, double n2, double r) {
		deposito=n1;
		valor=n2;
		resultado=r;
	}
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {
			{40.0,5.0,35.0},{40.0,35.0,5.0},{0.0,-5.0,5.0}
		});
		
	}	
	@Test
	public void testConsumir() {
			double res= deposito-valor;
			assertEquals(res, resultado, 0.1);
		}
				
				
}
