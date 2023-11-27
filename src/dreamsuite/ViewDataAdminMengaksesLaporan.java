package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataAdminMengaksesLaporan {
    public static void view() {
        try {
            Connection kon = getKoneksi();
            Statement s = kon.createStatement();
            String query = "SELECT * FROM adminmengakseslaporan";
            ResultSet r = s.executeQuery(query);

            System.out.println("---------------------------");
            System.out.printf("| %-10s | %-10s |\n", "ID Admin", "ID Laporan");
            System.out.println("---------------------------");

            while (r.next()) {
                int idadmin = r.getInt("id_admin");
                int nolaporan = r.getInt("no_laporan");
                System.out.printf("| %-10d | %-10d |\n", idadmin, nolaporan);
            }

            System.out.println("---------------------------");
        } catch (Exception e) {
            System.out.println("Error koneksi database: " + e.getMessage());
        }
    }
}
