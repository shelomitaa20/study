package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataPemesanan {
    public static void view () {
        try {
            Connection kon = getKoneksi();
            Statement s = kon.createStatement();
            String query = "SELECT * FROM pemesanan";
            ResultSet r = s.executeQuery(query);

            System.out.println("----------------------------------------------------------------------------------------");
            System.out.printf("| %-12s | %-10s | %-13s | %-18s | %-18s | %-15s | %-10s | %-12s | %-12s |\n", 
                    "NO Reservasi", "Tipe Kamar", "Jumlah Kamar", "Tanggal Check In", "Tanggal Check Out",
                    "Jumlah Penginap", "ID Admin", "NO KTP Tamu", "No Laporan");
            System.out.println("----------------------------------------------------------------------------------------");

            while (r.next()) {
                int id = r.getInt("no_reservasi");
                String tipe = r.getString("tipe_kamar_dipesan");
                int jumlah = r.getInt("jumlah_kamar_dipesan");
                String checkin = r.getString("tanggal_check_in");
                String checkout = r.getString("tanggal_check_out");
                int penginap = r.getInt("jumlah_penginap");
                int idAdmin = r.getInt("id_admin");
                String ktp = r.getString("no_ktp_tamu");
                int laporan = r.getInt("no_laporan");
                System.out.printf("| %-12s | %-10s | %-13s | %-18s | %-18s | %-15s | %-10s | %-12s | %-12s |\n", 
                        id, tipe, jumlah, checkin, checkout, penginap, idAdmin, ktp, laporan);
            }

            System.out.println("----------------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Error koneksi database: " + e.getMessage());
        }
    }
}