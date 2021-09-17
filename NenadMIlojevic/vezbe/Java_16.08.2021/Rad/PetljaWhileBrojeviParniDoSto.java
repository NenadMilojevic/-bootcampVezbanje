package PetljaWhile;

public class PetljaWhileBrojeviParniDoSto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		ZADATAK
//		Ispisi sve parne brojeve do 100.
//		

		int iterator = 1;

		while (iterator < 100) {

			if (iterator % 3 == 0 && iterator % 2 == 1) {

				System.out.println(iterator + " je neparni broj i deljiva sa tri ");

			}
			iterator++;

		}

	}

}
