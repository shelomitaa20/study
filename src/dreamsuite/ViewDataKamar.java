package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataKamar {
    public static void view () {
        try {
            Connection kon = getKoneksi();
            Statement s = kon.createStatement();
            String query = "SELECT * FROM kamar";
            ResultSet r = s.executeQuery(query);

            // Header tabel
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("| %-10s | %-20s | %-30s | %-20s |%-30s |%-15s |%-10s |\n", "No Kamar", "Harga Kamar", "Status Ketersediaan Kamar", "Kapasitas Kamar", "Tipe Keseluruhan Kamar", "ID Admin", "No Reservasi");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");

            // Data dalam tabel
            while (r.next()){
            	int no = r.getInt("no_kamar");
            	int harga = r.getInt("harga_kamar");
            	String status = r.getString("status_ketersediaan_kamar");
            	int kapasitas = r.getInt("kapasitas_kamar");
            	String tipe = r.getString("tipe_keseluruhan_kamar");
            	int id = r.getInt("id_admin");
            	int reservasi = r.getInt("no_reservasi");
            	System.out.printf("| %-10d | %-20s | %-30s | %-20s |%-30s |%-15s |%-15s |\n", no, harga, status, kapasitas, tipe, id, reservasi);
            }

            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
    	} catch (Exception e) {
        	System.out.println("Error koneksi database: " + e.getMessage());
    	}
    }
}
