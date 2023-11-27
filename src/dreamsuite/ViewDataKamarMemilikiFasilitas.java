package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataKamarMemilikiFasilitas{
    public static void view () {
        try {
        	Connection kon = getKoneksi();
        	Statement s = kon.createStatement();
        	String query = "SELECT * FROM kamarmemilikifasilitas";
        	ResultSet r = s.executeQuery(query);

        	// Header tabel
        	System.out.println("-----------------------------");
        	System.out.printf("| %-10s | %-10s |\n", "No Kamar", "ID Fasilitas");
        	System.out.println("-----------------------------");

        	// Data dalam tabel
        	while (r.next()){
            	int nokamar = r.getInt("no_kamar");
            	int idfasilitas = r.getInt("id_fasilitas");
            	System.out.printf("| %-10d | %-10s |\n", nokamar,  idfasilitas);
        	}

        	System.out.println("-----------------------------");
    	} catch (Exception e) {
        	System.out.println("Error koneksi database: " + e.getMessage());
    	}
    }
}