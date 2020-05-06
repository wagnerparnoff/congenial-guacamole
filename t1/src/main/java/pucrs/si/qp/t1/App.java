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
			return tipos.NAOTRIANGULO.value();
		} else if ((a <= 0) || (b <= 0) || (c <= 0)) {
			//throw new IllegalArgumentException("Entrada inválida");
			return tipos.INVALIDO.value();
		} else {
			if ((a < b + c) && (b < a + c) && (c < b + a)) {
				if ((a == b) && (b == c))
					return tipos.EQUILATERO.value();
				else if ((a != b) && (a != c) && (b != c))
					return tipos.ESCALENO.value();
				else
					return tipos.ISOSCELES.value();
			}
			
			int varA = Math.abs(((a+b+c)/3)-a);
			int varB = Math.abs(((a+b+c)/3)-b);
			int varC = Math.abs(((a+b+c)/3)-c);
			
			if(varA > 2 || varB > 2 || varC > 2) {
				//linha longa
				return tipos.NAOTRIANGULO.value();
			} else if (a + b == c || a + c == b || b + c ==a) {
				//linha sequencial
				return tipos.NAOTRIANGULO.value();
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

	public static int identificaTriangulo(double d, double e, double f) {
		return tipos.INVALIDO.value();
	}
}
