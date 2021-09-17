package dan_1_domaci;

import java.util.Scanner;

public class Domaci_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DodatniFunkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima ->
//		Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
//		i poziva i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a
//		druga vraca najveci od unetih brojeva.

		Scanner skener = new Scanner(System.in);
		System.out.println("unesite tri broja: ");
		int prviBroj = skener.nextInt();
		int drugiBroj = skener.nextInt();
		int treciBroj = skener.nextInt();

		int zbir = metodZbir(prviBroj, drugiBroj, treciBroj);
		int najveciBr = metodVeciBroj(prviBroj, drugiBroj, treciBroj);
		System.out.println("zbir je " + zbir);
		System.out.println("najeci br je " + najveciBr);

	}

	public static int metodVeciBroj(int broj1, int broj2, int broj3) {
		int brojMax = Integer.MIN_VALUE;
		if (broj1 > brojMax) {
			brojMax = broj1;
		}
		if (broj2 > brojMax) {
			brojMax = broj2;
		}
		if (broj3 > brojMax) {
			brojMax = broj3;
		}
		return brojMax;
	}

	public static int metodZbir(int broj1, int broj2, int broj3) {
		int zbir = broj1 + broj2 + broj3;
		return zbir;

	}

}
