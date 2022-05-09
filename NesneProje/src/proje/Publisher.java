package proje;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject {
	 private List<IObserver> kullanicilar = new ArrayList<>();
	    @Override
	    public void ekle(IObserver kullanici) {
	    	kullanicilar.add(kullanici);
	    }
	    @Override
	    public void sil(IObserver kullanici) {
	    	kullanicilar.remove(kullanici);
	    }
	    @Override
	    public void mesajVer(String mesaj) {
	        for(IObserver kullanici: kullanicilar) {
	        	kullanici.guncelle(mesaj);
	        }
	    }

}
