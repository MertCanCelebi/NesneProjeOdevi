package proje;

public class Kullanici2 implements IObserver{
	@Override
    public void guncelle(String mesaj) {
        System.out.println("2. kullaniciya giden mesaj:" + mesaj);
    }
}
