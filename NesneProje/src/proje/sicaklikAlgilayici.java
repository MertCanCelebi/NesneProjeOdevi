package proje;

import java.util.Random;

public class sicaklikAlgilayici implements IsicaklikAlgilayici {	
	  
	    Random rand = new Random();
	    private static sicaklikAlgilayici instance;
	    private ISubject publisher;
	    public sicaklikAlgilayici(ISubject publisher){
	        this.publisher=publisher;
	    }
	    public static sicaklikAlgilayici getInstance(ISubject publisher){
	        if(instance==null){
	            instance=new sicaklikAlgilayici(publisher);
	        }
	        return instance;
	    }
	    @Override
	    public void kullaniciEkle(IObserver abone){
	        publisher.ekle(abone);
	    }
	    @Override
	    public void sicaklikOku() {
	        int rand_int = rand.nextInt(-10,70);
	        System.out.print("Sicaklik: ");
	        System.out.println(rand_int);
	        if(rand_int>=35){
	           
	            publisher.mesajVer("Sicaklik 35 derecenin uzerine cikti, sogutucuyu aciniz!!!.");
	        }
	        
	    }
}
