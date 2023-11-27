package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataFasilitas {
    public static void view () {
         try {
        	Connection kon = getKoneksi();
        	Statement s = kon.createStatement();
        	String query = "SELECT * FROM fasilitas";
        	ResultSet r = s.executeQuery(query);

        	// Header tabel
        	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        	System.out.printf("| %-10s | %-20s | %-30s | %-20s |%-30s |%-25s |%-10s |\n", "No Kamar", "ID Fasilitas", "Nama Fasilitas", "Jam Operasional", "Deskripsi Fasilitas", "Gambar Fasilitas", "ID Admin");
        	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        	// Data dalam tabel
        	while (r.next()){
            	int no = r.getInt("no_kamar");
            	int idfasilitas = r.getInt("id_fasilitas");
            	String nama = r.getString("nama_fasilitas");
            	String jam = r.getString("jam_operasional");
            	String deskripsi = r.getString("deskripsi_fasilitas");
            	String gambar = r.getString("gambar_fasilitas");
            	int idadmin = r.getInt("id_admin");
            	System.out.printf("| %-10d | %-20s | %-30s | %-20s |%-30s |%-25s |%-10s |\n", no, idfasilitas, nama,jam, deskripsi, gambar, idadmin);
        	}

        	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    	} catch (Exception e) {
        	System.out.println("Error koneksi database: " + e.getMessage());
    	}
    }
}
