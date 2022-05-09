package proje;

public class eyleyici implements Ieyleyici  {
		private final Iekran ekran;
		public eyleyici() {
			ekran=new ekran();
		}
		
		public void sogutucuAc() {
			 ekran.mesajGoster("Sogutucuyu Actiniz!!!");		 
	    }	  
	    public void sogutucuKapat() {
	    	 ekran.mesajGoster("Sogutucuyu Kapattiniz!!!");

	    }
}
