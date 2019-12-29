package yirmibir;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Delayed;



public class MainClass {
	public static void main(String[] args) {
	int desteboyutu = 52;
	int oyuncu_eli = 0;
	int kasa_eli = 0;
	int secim;
	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();
	ArrayList<Kart> Deste = new ArrayList();
	Kart kart;
	
	//deste olusturuyorum
	for(int i = 0;i<13;i++) {
		kart = new Kart();
		if(i == 0) {
			kart.setDeger(11);
			kart.setIsim("Maca");
			kart.setRenkli("As");
			
		}
		if(i>0 && i<10) {
			kart.setDeger(i + 1);
			kart.setIsim("Maca");
			kart.setRenkli("-");
			
		}
		if(i == 10) {
			kart.setDeger(10);
			kart.setIsim("Maca");
			kart.setRenkli("Vale");
			
		}
		if(i == 11) {
			kart.setDeger(10);
			kart.setIsim("Maca");
			kart.setRenkli("Kýz");
			
		}
		if(i == 12) {
			kart.setDeger(10);
			kart.setIsim("Maca");
			kart.setRenkli("Papaz");
			
		}
		Deste.add(kart);
	}
	
	
	for(int i = 13;i<26;i++) {
		kart = new Kart();
		if(i%13== 0) {
			kart.setDeger(11);
			kart.setIsim("Karo");
			kart.setRenkli("As");
			
		}
		if(i%13>0 && i%13<10) {
			kart.setDeger(i%13 + 1);
			kart.setIsim("Karo");
			kart.setRenkli("-");
			
		}
		if(i%13 == 10) {
			kart.setDeger(10);
			kart.setIsim("Karo");
			kart.setRenkli("Vale");
			
		}
		if(i%13 == 11) {
			kart.setDeger(10);
			kart.setIsim("Karo");
			kart.setRenkli("Kýz");
			
		}
		if(i%13 == 12) {
			kart.setDeger(10);
			kart.setIsim("Karo");
			kart.setRenkli("Papaz");
			
		}
		Deste.add(kart);
	}
	for(int i = 26;i<39;i++) {
		kart = new Kart();
		if(i%13 == 0) {
			kart.setDeger(11);
			kart.setIsim("Kupa");
			kart.setRenkli("As");
			
		}
		if(i%13>0 && i%13<10) {
			kart.setDeger(i%13 + 1);
			kart.setIsim("Kupa");
			kart.setRenkli("-");
			
		}
		if(i%13 == 10) {
			kart.setDeger(10);
			kart.setIsim("Kupa");
			kart.setRenkli("Vale");
			
		}
		if(i%13 == 11) {
			kart.setDeger(10);
			kart.setIsim("Kupa");
			kart.setRenkli("Kýz");
			
		}
		if(i%13 == 12) {
			kart.setDeger(10);
			kart.setIsim("Kupa");
			kart.setRenkli("Papaz");
			
		}
		Deste.add(kart);
	}
	
	for(int i = 39;i<52;i++) {
		kart = new Kart();
		if(i %13== 0) {
			kart.setDeger(11);
			kart.setIsim("Sinek");
			kart.setRenkli("As");
			
		}
		if(i%13 >0 && i%13<10) {
			kart.setDeger(i%13 +1);
			kart.setIsim("Sinek");
			kart.setRenkli("-");
			
		}
		if(i%13 == 10) {
			kart.setDeger(10);
			kart.setIsim("Sinek");
			kart.setRenkli("Vale");
			
		}
		if(i%13 == 11) {
			kart.setDeger(10);
			kart.setIsim("Sinek");
			kart.setRenkli("Kýz");
			
		}
		if(i%13 == 12) {
			kart.setDeger(10);
			kart.setIsim("Sinek");
			kart.setRenkli("Papaz");
			
		}
		Deste.add(kart);
	}
	
	// Deste olusturuldu içerisine random sayilar atandý
	
	while(1 == 1) {
		oyuncu_eli = 0;
		kasa_eli = 0;
		for(int i = 0;i<2;i++) {
			int krt = rnd.nextInt()%desteboyutu;
			if(krt <0) {
				krt = krt*(-1);
			}
			System.out.println(Deste.get(krt).getIsim() + " " + Deste.get(krt).getRenkli() + " " + Deste.get(krt).getDeger());
			oyuncu_eli = oyuncu_eli + Deste.get(krt).getDeger();
			Deste.remove(krt);
			desteboyutu--;
		}
		System.out.println("Elinizin Degeri : " + oyuncu_eli);
		
		for(int i = 0;i<2;i++) {
			int krt = rnd.nextInt()%desteboyutu;
			if(krt <0) {
				krt = krt*(-1);
			}
			System.out.println(Deste.get(krt).getIsim() + " " + Deste.get(krt).getRenkli() + " " + Deste.get(krt).getDeger());
			kasa_eli = kasa_eli + Deste.get(krt).getDeger();
			desteboyutu--;
			Deste.remove(krt);
		}
	
		System.out.println("Kasanin Degeri : " + kasa_eli);
		
		if(oyuncu_eli == 21) {
			System.out.println("kazandiniz...");
			continue;
		}
		if(kasa_eli == 21) {
			System.out.println("kaybettiniz...");
			continue;
		}
		while(1 == 1) {
		if(oyuncu_eli >21) {
			System.out.println("Kaybettiniz...");
			break;
		}
		System.out.println("1->Kart cek");
		System.out.println("2->Dur");
		System.out.println("Seciminiz : ");
		secim = sc.nextInt();
		switch(secim) {
		case 1:
			int krt = rnd.nextInt()%desteboyutu;
			if(krt<0) {
				krt = krt*(-1);
			}
			System.out.println(Deste.get(krt).getIsim() + " " + Deste.get(krt).getRenkli() + " " + Deste.get(krt).getDeger());
			oyuncu_eli = oyuncu_eli + Deste.get(krt).getDeger();
			desteboyutu--;
			Deste.remove(krt);
			System.out.println("Oyuncunun toplam eli : " + oyuncu_eli);
			System.out.println("Kasanin Degeri : " + kasa_eli);
			break;
		case 2:
			if(kasa_eli > oyuncu_eli && kasa_eli < 22) {
				System.out.println("Kaybettiniz...");
				break;
			}
			while(kasa_eli < oyuncu_eli) {
			 krt = rnd.nextInt()%desteboyutu;
			 if(krt<0) {
					krt = krt*(-1);
				}	
			 System.out.println(Deste.get(krt).getIsim() + " " + Deste.get(krt).getRenkli() + " " + Deste.get(krt).getDeger());
				kasa_eli = kasa_eli + Deste.get(krt).getDeger();
				desteboyutu--;
				Deste.remove(krt);
				System.out.println("Toplam degeriniz : " + oyuncu_eli);
				System.out.println("Kasanýn toplam degeri : " + kasa_eli);
				if(kasa_eli > 21) {
					System.out.println("kazandiniz");
					break;
				}
				if(kasa_eli > oyuncu_eli)
				{
					System.out.println("Kaybettiniz...");
					break;
				}
			}
			
			break;
			default :
				System.out.println("Hatali giris yaptiniz...");
		}
		
		break;
	}
		}
		
 }
	
}
