package dreamsuite;
import dreamsuite.insert.Administrasi;
import dreamsuite.insert.Fasilitas;
import dreamsuite.insert.InsertPemesanan;
import dreamsuite.insert.InsertTransaksi;
import dreamsuite.insert.Keuangan;
import dreamsuite.insert.Laporan;
import dreamsuite.insert.Staf;
import dreamsuite.insert.admin;
import dreamsuite.insert.insertkamar;
import dreamsuite.insert.inserttamu1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("----------------------------------------------");
            System.out.println("                Dream Suite                   ");
            System.out.println("----------------------------------------------");
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Data Admin");
            System.out.println("2. Tampilkan Jadwal Admin");
            System.out.println("3. Tampilkan Data Staf");
            System.out.println("4. Tampilkan Data Admin Mengakses Laporan");
            System.out.println("5. Tampilkan Data Kamar");
            System.out.println("6. Tampilkan Data Fasilitas");
            System.out.println("7. Tampilkan Data Tamu");
            System.out.println("8. Tampilkan Data Pemesanan");
            System.out.println("9. Tampikan Data Special Request Pemesanan");
            System.out.println("10. Tampilkan Data Transaksi");
            System.out.println("11. Tampilkan Data Kamar Memiliki Fasilitas");
            System.out.println("12.Tampilkan Data Laporan");
            System.out.println("13. Tampilkan Data Laporan Administrasi");
            System.out.println("14. Tampilkan Data Laporan Keuangan");
            System.out.println("15. Tambah Data Admin");
            System.out.println("16. Tambah Data Staf");
            System.out.println("17. Tambah Data Fasilitas");
            System.out.println("18. Tambah Data Tamu");
            System.out.println("19. Tambah Data Pemesanan");
            System.out.println("20. Tambah Data Kamar");
            System.out.println("21. Tambah Data Transaksi");
            System.out.println("22. Tambah Data Laporan");
            System.out.println("23. Tambah Data Laporan Keuangan");
            System.out.println("24. Tambah Data Laporan Administrasi");
            System.out.println("25. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Data Admin:");
                    ViewDataAdmin.view();
                    break;
                case 2:
                    System.out.println("Data Jadwal Admin:");
                    ViewDataJadwalAdmin.view();
                    break;
                case 3:
                    System.out.println("Data Staf:");
                    ViewDataStaf.view();
                    break;
                case 4 :
                    System.out.println("Data Admin Mengakses Laporan:");
                    ViewDataAdminMengaksesLaporan.view();
                    break;
                case 5 :
                    System.out.println("Data Kamar:");
                    ViewDataKamar.view();
                    break;
                case 6 :
                    System.out.println("Data Fasilitas:");
                    ViewDataFasilitas.view();
                    break;
                case 7 :
                    System.out.println("Data Tamu:");
                    ViewDataTamu.view();
                    break;
                case 8 :
                    System.out.println("Data Pemesanan:");
                    ViewDataPemesanan.view();
                    break;
                case 9 :
                    System.out.println("Data Special Request Pemesanan");
                    ViewDataSpecialRequest.view();
                    break;
                case 10 :
                    System.out.println("Data Transaksi:");
                    ViewDataTransaksi.view();
                    break;
                case 11 :
                    System.out.println("Data Kamar Memiliki Fasilitas:");
                    ViewDataKamarMemilikiFasilitas.view();
                    break;
                case 12 :
                    System.out.println("Data Laporan:");
                    ViewDataLaporan.view();
                    break;
                case 13 :
                    System.out.println("Data Laporan Administrasi:");
                    ViewDataAdministrasi.view();
                    break;
                case 14 :
                    System.out.println("Data Laporan Keuangan:");
                    ViewDataKeuangan.view();
                    break;
                case 15 :
                    System.out.println("Tambah Data Admin:");
                    admin insertAdmin = new admin();
                    insertAdmin.setVisible(true);
                    break;
                case 16 :
                    System.out.println("Tambah Data Staf:");
                    Staf insertStaf = new Staf();
                    insertStaf.setVisible(true);
                    break;
                case 17 :
                    System.out.println("Tambah Data Fasilitas:");
                    Fasilitas insertFasilitas = new Fasilitas();
                    insertFasilitas.setVisible(true);
                    break;
                case 18 :
                    System.out.println("Tambah Data Tamu");
                    inserttamu1 inserttamu = new inserttamu1();
                    inserttamu.setVisible(true);
                    break;
                case 19 :
                    System.out.println("Tambah Data Pemesanan:");
                    InsertPemesanan insertpemesanan = new InsertPemesanan();
                    insertpemesanan.setVisible(true);
                    break;
                case 20 :
                    System.out.println("Tambah Data Kamar:");
                    insertkamar insertkamarr = new insertkamar();
                    insertkamarr.setVisible(true);
                    break;
                case 21 :
                    System.out.println("Tambah Data Transaksi:");
                    InsertTransaksi inserttransaksi = new InsertTransaksi();
                    inserttransaksi.setVisible(true);
                    break;
                case 22 :
                    System.out.println("Tambah Data Laporan:");
                    Laporan insertlaporan = new Laporan();
                    insertlaporan.setVisible(true);
                    break;
                case 23 :
                    System.out.println("Tambah Data Laporan Keuangan:");
                    Keuangan insertkeuangan = new Keuangan();
                    insertkeuangan.setVisible(true);
                    break;
                case 24 :
                    System.out.println("Tambah Data Laporan Administrasi:");
                    Administrasi insertadministrasi = new Administrasi();
                    insertadministrasi.setVisible(true);
                    break;
                case 25 :
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                    break;
            }
        } while (choice != 25);
        
        scanner.close();
    }
}
