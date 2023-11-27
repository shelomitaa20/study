package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataAdmin {
    public static void view () {
        try {
            Connection kon = getKoneksi();
            Statement s = kon.createStatement();
            String query = "SELECT * FROM admin";
            ResultSet r = s.executeQuery(query);

            System.out.println("----------------------------------------------------------------------------------------");
            System.out.printf("| %-10s | %-20s | %-30s | %-15s |\n", "ID Admin", "Nama Admin", "Alamat Admin", "No. Telp Admin");
            System.out.println("----------------------------------------------------------------------------------------");

            while (r.next()){
                int id = r.getInt("id_admin");
                String nama = r.getString("nama_admin");
                String alamat = r.getString("alamat_admin");
                String notelp = r.getString("no_telp_admin");
                System.out.printf("| %-10d | %-20s | %-30s | %-15s |\n", id, nama, alamat, notelp);
            }

            System.out.println("----------------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Error koneksi database: " + e.getMessage());
        }
   }
}
