package proje;

public interface ISubject {
	  	public void ekle(IObserver observer);
	    public void sil(IObserver observer);
	    public void mesajVer(String mesaj);

}
