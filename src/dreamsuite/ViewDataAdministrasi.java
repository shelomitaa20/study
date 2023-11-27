package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataAdministrasi {
    public static void view () {
        try {
        	Connection kon = getKoneksi();
        	Statement s = kon.createStatement();
        	String query = "SELECT * FROM administrasi";
        	ResultSet r = s.executeQuery(query);

        	// Header tabel
        	System.out.println("---------------------------------------");
        	System.out.printf("| %-10s | %-10s |\n", "No Laporan", "Jumlah Pemesanan Kamar");
        	System.out.println("---------------------------------------");

        	// Data dalam tabel
        	while (r.next()){
            	int nolaporan = r.getInt("no_laporan");
            	int jumlah = r.getInt("jumlah_pemesanan_kamar");
            	System.out.printf("| %-10d | %-10s |\n", nolaporan,  jumlah);
        	}

        	System.out.println("---------------------------------------");
    	} catch (Exception e) {
        	System.out.println("Error koneksi database: " + e.getMessage());
    	}
    }
}