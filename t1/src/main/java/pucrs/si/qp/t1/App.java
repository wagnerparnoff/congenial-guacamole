package pucrs.si.qp.t1;


/**
 * 
 * @author marco.mangan@pucrs.br
 * 
 */
public class App {

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int identificaTriangulo(int a, int b, int c) {
		if ((a < b + c) && (b < a + c) && (c < b + a)) {
			if ((a == b) && (b == c))
				return tipos.EQUILATERO.value();
			else if ((a != b) && (a != c) && (b != c))
				return tipos.ESCALENO.value();
			else
				return tipos.ISOSCELES.value();
		}
		return tipos.INVALIDO.value();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Triângulos!");
		System.out.println(identificaTriangulo(2, 3, 4));
	}
}