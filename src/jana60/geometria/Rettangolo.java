package jana60.geometria;

public class Rettangolo {
	//attributi base e altezza
	int base;
	int altezza;
	
	//metodo per calcolare l'area
	int area() {
		int calcArea = base * altezza;
		return calcArea; 
	}
	
	//metodo per calcolare il perimetro
	int perimetro() {
		int calcPerimetro = 2 * (base + altezza);
		return calcPerimetro;
	}
}
