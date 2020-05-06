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
	
	//fim da base//
	
	@Test
	public void testEntradaZeroException()
	{
		int actual = App.identificaTriangulo(8, 0, 9);
		int expected = tipos.INVALIDO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testValorNegativo()
	{
		int actual = App.identificaTriangulo(2, 3, -4);
		int expected = tipos.INVALIDO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void  testLinha()
	{
		int actual = App.identificaTriangulo(1, 2, 3);
		int expected = tipos.NAOTRIANGULO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void variantesDeSete()
	{
		int actual = App.identificaTriangulo(1, 2, 3);
		int expected = tipos.NAOTRIANGULO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void variantesDeSete2()
	{
		int actual = App.identificaTriangulo(3, 1, 2);
		int expected = tipos.NAOTRIANGULO.value();
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testLinhaLonga()
	{
		int actual = App.identificaTriangulo(1, 2, 8);
		int expected = tipos.NAOTRIANGULO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLinhaLongaVariante()
	{
		int actual = App.identificaTriangulo(8, 2, 1);
		int expected = tipos.NAOTRIANGULO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTudoZero()
	{
		int actual = App.identificaTriangulo(0, 0, 0);
		int expected = tipos.NAOTRIANGULO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumReais()
	{
		int actual = App.identificaTriangulo(0.5, 0.75, 5);
		int expected = tipos.INVALIDO.value();
		assertEquals(expected, actual);
	}
	
}