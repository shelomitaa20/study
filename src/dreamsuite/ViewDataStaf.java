package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataStaf {
    public static void view() {
        try {
            Connection kon = getKoneksi();
            Statement s = kon.createStatement();
            String query = "SELECT * FROM staf";
            ResultSet r = s.executeQuery(query);

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("| %-10s | %-20s | %-30s | %-15s | %-20s | %-15s | %-10s |\n", "ID Staf", "Nama Staf", "Alamat Staf", "No. Telp Staf", "Jabatan Staf", "Status Staf", "ID Admin");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");

            while (r.next()) {
                int idstaf = r.getInt("id_staf");
                String nama = r.getString("nama_staf");
                String notelp = r.getString("no_telp_staf");
                String alamat = r.getString("alamat_staf");
                String jabatan = r.getString("jabatan_staf");
                String status = r.getString("status_staf");
                int idadmin = r.getInt("id_admin");
                System.out.printf("| %-10d | %-20s | %-30s | %-15s | %-20s | %-15s | %-10d |\n", idstaf, nama, alamat, notelp, jabatan, status, idadmin);
            }

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Error koneksi database: " + e.getMessage());
        }
    }
}
