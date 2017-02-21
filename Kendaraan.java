package Latihan;

/*
 * Nama : Edvina Mustika
 * NPM  : 1441912
 * Ket  : Tugas Uts Java
 */

import java.util.*;

class Kendaraan {
	String startMobil() {
		return "Kendaraan Di starter";
	}

	int percepatan(int n) {

		return n * 10;
	}

	String remMobil() {
		return "Kendaraan di rem";
	}
}

public class Mobil {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Kendaraan k = new Kendaraan();
		int pil = 0;
		String start = "";
		int gigi = 0;
		int percepatan = 0;

		System.out.println("----------------------");
		System.out.println("1. Start Mobil");
		System.out.println("2. Ganti Gigi");
		System.out.println("3. Gas Mobil");
		System.out.println("4. Rem Mobil");
		System.out.println("5. Stop Mobil");
		System.out.println("-----------------------");
		

		try {
			while (pil != 5) {
				System.out.print("Pilih Menu :");
				pil = scanner.nextInt();
				switch (pil) {
				case 1:
					start = k.startMobil();
					System.out.println(start);
					break;
				case 2:
					System.out.print("pilih Gigi : ");
					gigi = scanner.nextInt();
					percepatan = k.percepatan(gigi);
					System.out.println("Percepatan :" + percepatan + " km/jam^2");
					break;

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}

	}
}
