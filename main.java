package test;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
	
		/*
		
		boolean dogruMU = false;
		double sayi1 = 10.5;
		int sayi = 21;
		String mesaj = "Öğrenci sayısı: ";
		System.out.println("Merhaba");
		
		System.out.println( mesaj +sayi);  
		
		if (sayi < 20) {
			
			System.out.println("Sayı 20 den küçüktür.");
			
		}
		else {
			
			System.out.println("Bu sayı 20 den büyüktür.");
		}
		
		
		String[] ogrenciler = {"Safa","Zeliha","Mehmet"};
		
		for (String ogrenci: ogrenciler) {  //foreach döngüsü gibi bir şey
			
			System.out.println(ogrenci);
		}
		
		*/
		
		/*
		
		String mesaj = "Bugün hava çok güzel.";
		
		
		System.out.println(mesaj.concat("Zaa")); // cümle sonuna zaa ekler.
		System.out.println(mesaj.startsWith("B")); // b ile başlıyorsa true değeri döner
		System.out.println(mesaj.indexOf("a")); // kaçıncı elemanda a var
		System.out.println(mesaj.replace(" ", "-")); // boşlukları '-' ile doldurur.
		System.out.println(mesaj.substring(2,4)); // 2. indeksten itibaren stringi keser. 4. indekse kadar devam eder.
		
		
		for (String kelime : mesaj.split(" ")) {  // kelimeleri aralarındaki boşluğa göre ayırır.
			
			System.out.println(kelime);
			
		}
		System.out.println(mesaj.toLowerCase()); // küçük harfe çevirir.
		System.out.println(mesaj.toUpperCase()); // büyük harfe çevirir.
		
		System.out.println(mesaj.trim()); // aralardaki boşlukları siler.
	
		*/
		
		
		
		/*
		
		int number = 6;
		
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number) {
			System.out.println("Sayı mükemmeldir.");
		}
		else if (total != number) {
			System.out.println("Sayı mükemmel değil.");
		}
		
		
		
		
		int sayilar[] = new int[] {1,2,5,9,7,6};
		int aranacak = 4;
		boolean bulundu = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				bulundu = true;
				break;
				
			}
			else if (sayi != aranacak) {
				bulundu = false;
			}
				
			
		}
		
		if (bulundu) {
			System.out.println("Sayı bulundu!");
			
		}
		else {
			System.out.println("Sayı yok");
		}
		
		*/
		
		
		
		
		
		/*
		sayiBulmaca(1);
		
		System.out.println("Toplam: "+topla(2,3,6));
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		

	}
	
	public static void sayiBulmaca(int aranacak) {
		int sayilar[] = new int[] {1,2,5,9,7,6};
		
		boolean bulundu = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				bulundu = true;
				break;
				
			}
			else if (sayi != aranacak) {
				bulundu = false;
			}
				
			
		}
		
		if (bulundu) {
			System.out.println("Sayı bulundu!");
			
		}
		else {
			System.out.println("Sayı yok");
		}
		
	}
	
	
	public static int topla(int... sayilar) {  // fonksiyonu böyle yazmak istediğimiz kadar parametre verebiliyoruz demek.
		int toplam = 0;
		
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		
		return toplam;
	}
	
	*/
	

		
		
		/*
		
		CustomerManager customerManager = new CustomerManager(); 
		
		product pr = new product(); // ister parametresiz constructor kullan 
		product pr1 = new product(2,"CocoPops",18.5); // ister parametreli constructor kullan.
		pr.setId(1);
		pr.setName("Nutella");
		pr.setPrice(32.5);
		
		
		customerManager.add(pr);
		customerManager.add(pr1);
		System.out.println(pr.getCode()); 
		System.out.println(pr1.getCode()); 
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Girmek istediğiniz mesaj: ");
		String a = sc.nextLine();
		
		System.out.println(a);
		
		

	}
}





