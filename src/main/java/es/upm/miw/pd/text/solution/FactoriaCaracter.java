package es.upm.miw.pd.text.solution;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	private final Map<Character, Caracter> coleccionCaracteres = new HashMap<Character, Caracter>();
	private static FactoriaCaracter factoriaCaracter = new FactoriaCaracter();

	private FactoriaCaracter() {

	}

	public static FactoriaCaracter getFactoria() {
		return FactoriaCaracter.factoriaCaracter;
	}

	public Caracter get(char key) {
		if (this.coleccionCaracteres.containsKey(key))
			return this.coleccionCaracteres.get(key);
		else {
			Caracter caracter = new Caracter(key);
			this.coleccionCaracteres.put(key, caracter);
			return caracter;
		}
	}

}
