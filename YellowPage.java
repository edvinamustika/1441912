package Latihan;
/*
 * Nama : Edvina Mustika
 * NPM  : 1441912
 * Ket  : Tugas Uts Java
 */
import java.util.*;
class Detail{
	private String nama;
	private String alamat;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
}
class Proses{
	ArrayList<Detail> list = new ArrayList<Detail>();
	Scanner scan = new Scanner(System.in);
	public void run(){
		int choise = 0;
		System.out.println("Menu Buku Alamat");
		System.out.println("------------------");
		System.out.println("1. Insert Data");
		System.out.println("2. Update Data");
		System.out.println("3. Delete Data");
		System.out.println("4. View All Data");
		System.out.println("------------------");
		System.out.print("Choise :");
			choise = scan.nextInt();
		while(choise >=4){
			
		}
	}
}
public class YellowPages {
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Detail> list = new ArrayList<Detail>();
		String pil = "";
		
		while (pil.equalsIgnoreCase("")){
			Detail d = new Detail();
			System.out.print("Choise :");
			pil = scan.nextLine();
			//input
			System.out.print("Data 1 :");
				d.setNama(scan.nextLine());
			System.out.print("Data 2 :");
				d.setAlamat(scan.nextLine());
			list.add(d);	
			
			for(Detail i : list){
				System.out.print(i.getNama()+" ");
				System.out.println(i.getAlamat());
			}
		}
	}
}
