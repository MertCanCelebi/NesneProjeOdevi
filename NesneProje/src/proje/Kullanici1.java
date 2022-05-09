package proje;

public class Kullanici1 implements IObserver {
	  @Override
	    public void guncelle(String mesaj) {
	        System.out.println("1. kullaniciya giden mesaj:"+ mesaj);
	    }
}
