package pucrs.si.qp.t1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
	@Test
    public void testEscaleno()
    {
        int actual = App.identificaTriangulo(2, 3, 4);
        int expected = tipos.ESCALENO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testEquilatero()
    {
        int actual = App.identificaTriangulo(5, 5, 5);
        int expected = tipos.EQUILATERO.value();
        assertEquals(expected, actual);
    }
	
	@Test
    public void testIsosceles()
    {
        int actual = App.identificaTriangulo(6, 6, 7);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }
	
	
	@Test
	public void testIsosceles2()
	{
		int actual = App.identificaTriangulo(6, 7, 6);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
	}
	
	@Test
	public void testIsosceles3() 
	{
		int actual = App.identificaTriangulo(7, 6, 6);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
	}
	
	
	@Test
	public void testEntradaZeroException()
	{
		try {
			App.identificaTriangulo(0, 3, 4);
		} catch(RuntimeException e) {
			String message = " Valor menor ou igual a zero";
			assertEquals(message, e.getMessage());
			
		}
	}
	
}