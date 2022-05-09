package proje;


public class agArayuzu implements IagArayuzu {

	Ieyleyici eylem=new eyleyici();
	
	  private IsicaklikAlgilayici sicaklik;
	    public agArayuzu(){
	    	sicaklik=sicaklikAlgilayici.getInstance(new Publisher());
	    	sicaklik.kullaniciEkle(new Kullanici1());
	    	sicaklik.kullaniciEkle(new Kullanici2());
	    }
	public void sicaklikOku() {
		sicaklik.sicaklikOku();
  }

  
    public void sogutucuAc() {
        eylem.sogutucuAc();
    }

    
    public void sogutucuKapat() {
        eylem.sogutucuKapat();
    }

}
