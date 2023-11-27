package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataSpecialRequest {
    public static void view () {
        try {
            Connection kon = getKoneksi();
            Statement s = kon.createStatement();
            String query = "SELECT * FROM specialrequest";
            ResultSet r = s.executeQuery(query);

            System.out.println("----------------------------------------------------------------------------------------");
            System.out.printf("| %-12s | %-15s |\n", "NO Reservasi", "Special Request" );
            System.out.println("----------------------------------------------------------------------------------------");

            while (r.next()) {
                int id = r.getInt("no_reservasi");
                String specialrequest = r.getString("special_request");
                System.out.printf("| %-12s | %-15s |\n", id, specialrequest);
            }

            System.out.println("----------------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Error koneksi database: " + e.getMessage());
        }
    }
}