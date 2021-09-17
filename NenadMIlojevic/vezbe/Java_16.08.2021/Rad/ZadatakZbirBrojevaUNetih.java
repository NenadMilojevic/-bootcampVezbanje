package PetljaWhile;

import java.util.Scanner;

public class ZadatakZbirBrojevaUNetih {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Nadji zbir svih brojeva izmedju dva proizvoljna uneta broja

		Scanner skener = new Scanner(System.in);

		System.out.println("Unestite dva broja");

		int prvi = skener.nextInt();
		int drugi = skener.nextInt();
		int zbir = 0;

		if (prvi == drugi) {

			System.out.println("brojevi su jednaki ");
		}
		if (prvi < drugi) {

			while (prvi < drugi) {
				zbir = zbir + prvi;
				prvi++;

				System.out.println("prvi je " + prvi);
				System.out.println("zbir je " + zbir);

			}

		} else if (prvi > drugi) {

			while (prvi > drugi) {

				zbir = zbir + drugi;

				drugi++;
				System.out.println("prvi je " + drugi);
				System.out.println("zbir je " + zbir);

			}

		}

	}

}
