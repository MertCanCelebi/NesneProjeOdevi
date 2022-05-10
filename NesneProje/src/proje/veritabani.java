package proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class veritabani implements Iveritabani {
	private Connection baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nesneProje",
                    "postgres", "mert1903");
        }
        catch (Exception e) {
            System.out.println("Bağlantı girişimi başarısız!");
            e.printStackTrace();
        }
        return conn;
    }
	public boolean kullaniciDogrula(String isim) {
					      	     
	        Connection conn=this.baglan();

	        try
	        {

	            String sql= "SELECT count(İd) as sayi  FROM \"Kullanicilar\" WHERE \"KullaniciAdi\"="+"'"+ isim+"'";

	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(sql);

	            conn.close();	
	            
	            while(rs.next())
	            {
	              
	                if(rs.getInt("sayi")==1) {
	                	
	                	return true;
	                	
	                }
	                
	            }

	            rs.close();
	            stmt.close();
	            
	            return false;
	        }
	        catch (Exception e) {
	            e.printStackTrace();	            
	            return false;
	        }
     
	    }
	public boolean sifreDogrula(String isim,String sifre) {
			        Connection conn=this.baglan();
	        try
	        {

	            String sql= "SELECT count(İd) as sayi FROM \"Kullanicilar\" WHERE \"Sifre\"="+"'"+ sifre+"'"+"and \"KullaniciAdi\"="+"'"+isim+"'";

	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(sql);
	            
	            
	            
	            conn.close();	        
	            while(rs.next())
	            {
	              
	                if(rs.getInt("sayi")==1) {
	                	System.out.println("Sifre dogrulandi");
	                	return true;
	                	
	                }
	                
	            }
	            rs.close();
	            stmt.close();
	            return false;
	            
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	}
	
}

