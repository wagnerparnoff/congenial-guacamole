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
    public void testInvalido()
    {
        int actual = App.identificaTriangulo(6, 6, -7);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual);
    }
	
	@Test
    public void testZero()
    {
        int actual = App.identificaTriangulo(6, 0, 9);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual); 
    }
	
	@Test
    public void testLinha()
    {
        int actual = App.identificaTriangulo(1, 2, 3);
        int expected = tipos.NAOTRIANGULO.value();
        assertEquals(expected, actual);
    }

	@Test
    public void testNumParametros()
    {
        int actual = App.identificaTriangulo(1, 2, 3);
        int expected = tipos.NAOTRIANGULO.value();
        assertEquals(expected, actual);
    }
	
	@Test
    public void testDouble()
    {
        int actual = App.identificaTriangulo(1, 2, 3);
        int expected = tipos.NAOTRIANGULO.value();
        assertEquals(expected, actual);
    }

}