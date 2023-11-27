package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataTamu {
     public static void view () {
         try {
        	Connection kon = getKoneksi();
        	Statement s = kon.createStatement();
        	String query = "SELECT * FROM tamu";
        	ResultSet r = s.executeQuery(query);

        	// Header tabel
        	System.out.println("--------------------------------------------------------------------------------------------------------------");
        	System.out.printf("| %-15s | %-20s | %-30s | %-20s |%-10s |\n", "No KTP Tamu", "No Telp Tamu", "Nama Tamu", "Email Tamu", "ID Admin");
        	System.out.println("--------------------------------------------------------------------------------------------------------------");

        	// Data dalam tabel
        	while (r.next()){
            	String noktp = r.getString("no_ktp_tamu");
            	String notelp = r.getString("nomor_telp_tamu");
            	String nama = r.getString("nama_tamu");
            	String email = r.getString("email_tamu");
            	int idadmin = r.getInt("id_admin");
            	System.out.printf("| %-15s | %-20s | %-30s | %-20s |%-10s |\n", noktp,  notelp, nama,email, idadmin);
        	}
        	System.out.println("--------------------------------------------------------------------------------------------------------------");
    	} 
        catch (Exception e) {
        	System.out.println("Error koneksi database: " + e.getMessage());
    	}
     }
}
