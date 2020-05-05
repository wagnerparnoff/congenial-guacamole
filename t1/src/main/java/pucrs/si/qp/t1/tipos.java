package pucrs.si.qp.t1;

/**
 * 
 * @author Pedro Sasso, Wagner Parnoff
 *
 */
public enum tipos {
	EQUILATERO(1), ESCALENO(2), ISOSCELES(3), INVALIDO(4), NAOTRIANGULO(5);
	private final int value;

	tipos(int v) {
		this.value = v;
	}

	public int value() {
		return value;
	}
}