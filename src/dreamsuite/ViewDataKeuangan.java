package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataKeuangan {
    public static void view () {
        try {
        	Connection kon = getKoneksi();
        	Statement s = kon.createStatement();
        	String query = "SELECT * FROM keuangan";
        	ResultSet r = s.executeQuery(query);

        	// Header tabel
        	System.out.println("------------------------------------------------------------");
        	System.out.printf("| %-10s | %-20s | %-20s |\n", "No Laporan", "Pendapatan Kotor", "Pendapatan Bersih");
        	System.out.println("------------------------------------------------------------");

        	// Data dalam tabel
        	while (r.next()){
            	int nolaporan = r.getInt("no_laporan");
            	int kotor = r.getInt("pendapatan_kotor");
            	int bersih = r.getInt("pendapatan_bersih");
            	System.out.printf("| %-10d | %-20s | %-20s |\n", nolaporan,  kotor, bersih);
        	}

        	System.out.println("------------------------------------------------------------");
    	} catch (Exception e) {
        	System.out.println("Error koneksi database: " + e.getMessage());
    	}
    }
}