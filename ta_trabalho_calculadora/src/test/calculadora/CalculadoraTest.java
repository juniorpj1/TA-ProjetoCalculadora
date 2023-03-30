package test.calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class CalculadoraTest {
	private Calculadora calc;
	
	@Test
	public void testarConstrutorSemParametroIniciaMemoriaComZero() {
		int resultadoEsperado = 0;
		
		calc = new Calculadora();
		int resultadoObtido = calc.getMemoria();

		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	  public void testConstrutorComParametro() {
	    Calculadora c = new Calculadora(3);
	    int resultadoObtido = c.getMemoria();
	    int resultadoEsperado = 3;
	    assertEquals(resultadoEsperado, resultadoObtido);
	  }
	
	@Test
    public void testSomarNumeroNegativo() {
        Calculadora calc = new Calculadora(3);
        calc.somar(-5);
        assertEquals(-2, calc.getMemoria());
    }
	
	@Test
    public void testSubtrairNumeroPositivo() {
        Calculadora calc = new Calculadora(3);
        calc.subtrair(2);
        assertEquals(1, calc.getMemoria());
    }
	
	@Test
    public void testMultiplicarNumeroPositivo() {
        Calculadora calc = new Calculadora(3);
        calc.multiplicar(4);
        assertEquals(12, calc.getMemoria());
    }
	
	@Test
	  public void testDividePorZero() throws Exception {
	    Calculadora c = new Calculadora(3);
	    Assertions.assertThrows(Exception.class, () -> c.dividir(0));
	  }
	
	@Test
	  public void testDividirPorValorPositivo() throws Exception {
	    Calculadora c = new Calculadora(3);
	    c.dividir(3);
	    int resultadoObtido = c.getMemoria();
	    int resultadoEsperado = 1;
	    assertEquals(resultadoEsperado, resultadoObtido);
	  }

	  @Test
	  public void testExponenciarPor1() throws Exception {
	    Calculadora c = new Calculadora(3);
	    c.exponenciar(1);
	    int resultadoObtido = c.getMemoria();
	    int resultadoEsperado = 3;
	    assertEquals(resultadoEsperado, resultadoObtido);
	  }

	  @Test
	  public void testExponenciarPor10() throws Exception {
	    Calculadora c = new Calculadora(3);
	    c.exponenciar(10);
	    int resultadoObtido = c.getMemoria();
	    int resultadoEsperado = 59049;
	    assertEquals(resultadoEsperado, resultadoObtido);
	  }
	
	  @Test
	    public void testZerarMemoria() {
	        Calculadora calc = new Calculadora(3);
	        calc.zerarMemoria();
	        assertEquals(0, calc.getMemoria());
	    }
	
}