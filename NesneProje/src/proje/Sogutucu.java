package proje;

public class Sogutucu {
	private final Iekran ekran;
	private final ItusTakimi tusTakimi;
	private final IagArayuzu agArayuz;
	private final Iveritabani veritaban;
	public Sogutucu() {
		ekran=new ekran();
		tusTakimi=new tusTakimi();
		agArayuz=new agArayuzu();
		veritaban=new veritabani();
	}
	
	public void basla() {
		int sayi=0;
		while(sayi!=3) {
			ekran.mesajGoster("Lutfen adinizi giriniz...");		
			String isim= tusTakimi.veriAl();						
			boolean dogruMu=veritaban.kullaniciDogrula(isim);
			if(dogruMu) {
				ekran.mesajGoster("Kullanici Adiniz Dogru. Lutfen Sifrenizi Giriniz");
				String sifre =tusTakimi.veriAl();
				boolean dogruMu2=veritaban.sifreDogrula(isim,sifre);
				if(dogruMu2) {
					ekran.mesajGoster("Kullanici Girisiniz Basarili");
					islemSecimi();	
					break;
				}
				else {
					ekran.mesajGoster("Sifreniz Yanlis");
					sayi++;
				}
				
			}
			else {
				ekran.mesajGoster("Kullanici Adiniz Yanlis");	
				sayi++;
			}	
		}
		System.exit(0);
	}
	private String anaMenuyuGoster()
	{
		ekran.mesajGoster("**********************************************");
		ekran.mesajGoster("Ana Menu");
		ekran.mesajGoster("1-Sicaklik Goruntule");
		ekran.mesajGoster("2-Sogutucu Ac");
		ekran.mesajGoster("3-Sogutucu Kapa");
		ekran.mesajGoster("4-Cikis");
		ekran.mesajGoster("Seciminiz:");
		ekran.mesajGoster("**********************************************");
		return tusTakimi.veriAl();
	}
	private void islemSecimi(){
		String secim;
		 do{
		 	secim=anaMenuyuGoster();
		 	
			switch (secim) {
				case "1":
					agArayuz.sicaklikOku();
					break;
				case "2":
					agArayuz.sogutucuAc();
					break;
				case "3":
					agArayuz.sogutucuKapat();
					break;

				case "4":
					
					System.exit(0);
					break;
				default:
					ekran.mesajGoster("1-4 arasinda bir sayi girmelisiniz");
			}
		}while(secim!="4");
	}
}
