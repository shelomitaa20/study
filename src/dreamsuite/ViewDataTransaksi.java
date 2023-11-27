package dreamsuite;

import static dreamsuite.koneksi.getKoneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewDataTransaksi {
    public static void view () {
        try {
            Connection kon = getKoneksi();
            Statement s = kon.createStatement();
            String query = "SELECT * FROM transaksi";
            ResultSet r = s.executeQuery(query);
            
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.printf("| %-12s | %-15s | %-15s | %-18s | %-18s | %-10s | %-10s | %-10s | \n", 
                    "NO Transaksi","Tanggal Transaksi", "Jenis Transaksi", "Metode Transaksi", "Status Transaksi",
                        "ID Admin", "NO Laporan", "NO Reservasi");
            System.out.println("----------------------------------------------------------------------------------------");

            while (r.next()) {
                int no = r.getInt("no_transaksi");
                String tanggal = r.getString("tanggal_transaksi");
                String jenis = r.getString("jenis_transaksi");
                String metode = r.getString("metode_transaksi");
                String status = r.getString("status_transaksi");
                int idAdmin = r.getInt("id_admin");
                int noLaporan = r.getInt("no_laporan");
                int noReservasi = r.getInt("no_reservasi");
                System.out.printf("| %-12s | %-15s | %-15s | %-18s | %-18s | %-10s | %-10s | %-10s|\n", 
                        no, tanggal, jenis, metode, status, idAdmin, noLaporan, noReservasi);
            }

            System.out.println("----------------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Error koneksi database: " + e.getMessage());
        }
    }
}