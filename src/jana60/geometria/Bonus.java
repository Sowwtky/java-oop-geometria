package jana60.geometria;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		
				//chiamo la classe scanner e rettangolo
				Scanner scan = new Scanner(System.in);
				Rettangolo ret = new Rettangolo();
				
				//creo una variabile in cui stanziare l'area maggiore
				int areaMaggiore = 0;
				
				//chiedo per 5 volte l'altezza e la base all'utente
				for (int i = 1; i < 6; i++) {
					//chiedo i valori all'utente
					System.out.print("Inserire l'altezza in centimetri del rettangolo n." + i + ": ");
					ret.altezza = scan.nextInt();
					System.out.print("Inserire la base in centimetri: del rettangolo n." + i + ": ");
					ret.base = scan.nextInt();
					
					/*
					 * ad ogni ripetizione, se l'area del rettangolo corrente é maggiore 
					 * di quella salvata nella variabile areaMaggiore, la sovrascrivo
					*/
					
					if (ret.area() >= areaMaggiore) {
						areaMaggiore = ret.area();
					}
				}
				
				//stampo a schermo l'area maggiore
				System.out.println("L'area del rettangolo maggiore é: " + areaMaggiore);
				
				//chiudo scanner
				scan.close();
				
	}

}
