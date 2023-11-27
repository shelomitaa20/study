package dreamsuite;
import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataJadwalAdmin {
    public static void view () {
        try {
            Connection kon = getKoneksi();
            Statement s = kon.createStatement();
            String query = "SELECT * FROM jadwaladmin";
            ResultSet r = s.executeQuery(query);

            System.out.println("-------------------------------------");
            System.out.printf("| %-10s | %-20s |\n", "ID Admin", "Jadwal Admin");
            System.out.println("-------------------------------------");

            while (r.next()){
                int id = r.getInt("id_admin");
                String jadwal = r.getString("jadwal_admin");
                System.out.printf("| %-10d | %-20s |\n", id, jadwal);
            }

            System.out.println("-------------------------------------");
        } catch (Exception e) {
            System.out.println("Error koneksi database: " + e.getMessage());
        }
    }
}
