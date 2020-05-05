package pucrs.si.qp.t1;


/**
 * 
 * @author Pedro Sasso, Wagner Parnoff
 * 
 */
public class App {

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * @throws Exception
	 */

	public static int identificaTriangulo(int a, int b, int c) {
		if ((a == 0) && (b == 0) && (c == 0)) {
			return tipos.INVALIDO.value();
		} else if ((a <= 0) || (b <= 0) || (c <= 0)) {
			throw new RuntimeException("Valor menor ou igual a zero!");
		} else {
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
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Triângulos!");
		System.out.println(identificaTriangulo(2, 2, 4));
	}
}
