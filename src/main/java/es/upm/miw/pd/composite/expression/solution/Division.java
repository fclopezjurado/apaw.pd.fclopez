package es.upm.miw.pd.composite.expression.solution;

public class Division extends Operacion {

	public Division(Expresion operando1, Expresion operando2) {
		super(operando1, operando2);
	}

	@Override
	public float operar() {
		return this.getOperando1().operar() / this.getOperando2().operar();
	}
	
	@Override
	public String toString() {
		return "(" + this.getOperando1().toString() + "/" + this.getOperando2().toString() + ")";
	}

}
