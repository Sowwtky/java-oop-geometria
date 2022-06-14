package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//chiamo la classe scanner e rettangolo
		Scanner scan = new Scanner(System.in);
		Rettangolo ret = new Rettangolo();
		
		//chiedo i valori all'utente
		System.out.print("Inserire l'altezza in centimetri: ");
		ret.altezza = scan.nextInt();
		System.out.print("Inserire la base in centimetri: ");
		ret.base = scan.nextInt();
		
		//stampo a schermo area e perimetro calcolati in base ai valori inseriti
		System.out.println("Per il rettangolo di altezza " + ret.altezza + " cm e base " + ret.base + " cm");
		System.out.println("L'area é: " + ret.area() + " cm");
		System.out.println("Il perimetro é: " + ret.perimetro() + " cm");
		
		//chiudo scanner
		scan.close();
	}

}
