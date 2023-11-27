package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataLaporan{
    public static void view () {
        try {
        	Connection kon = getKoneksi();
        	Statement s = kon.createStatement();
        	String query = "SELECT * FROM laporan";
        	ResultSet r = s.executeQuery(query);

        	// Header tabel
        	System.out.println("-------------------------------------------------------");
        	System.out.printf("| %-15s | %-15s | %-15s |\n", "No Laporan", "Rentang Waktu", "Jenis Laporan");
        	System.out.println("-------------------------------------------------------");

        	// Data dalam tabel
        	while (r.next()){
                    int nolaporan = r.getInt("no_laporan");
                    String waktu = r.getString("rentang_waktu");
                    String jenis = r.getString("jenis_laporan");
                    System.out.printf("| %-15d | %-15s | %-15s |\n", nolaporan,  waktu, jenis);
        	}

        	System.out.println("-------------------------------------------------------");
    	} catch (Exception e) {
        	System.out.println("Error koneksi database: " + e.getMessage());
    	}
    }
}