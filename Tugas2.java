import java.util.Scanner;

public class Tugas2 {
    static String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    static int[][] nilaiMahasiswa = new int[5][7]; 

 
    public static void inputNilai() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < namaMahasiswa.length; i++) { 
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i]);


            for (int j = 0; j < nilaiMahasiswa[0].length; j++) { 
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = sc.nextInt();
            }   
        }
        sc.close();
    }
    public static void tampilkanNilai() {
        System.out.println("\nData Nilai Mahasiswa:");

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print(namaMahasiswa[i] + " : ");

            for (int j = 0; j < nilaiMahasiswa[0].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void nilaiTertinggiPerMinggu() {
        System.out.println("\nNilai tertinggi di setiap minggu:");
        for ( int minggu = 0; minggu < 7; minggu++) {
            int nilaiTertinggi = 0;
            for (int mahasiswa = 0; mahasiswa < namaMahasiswa.length; mahasiswa++) {
                if (nilaiMahasiswa[mahasiswa][minggu] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[mahasiswa][minggu];
                }
            }
            System.out.println("Minggu ke-" + (minggu + 1) + ": " + nilaiTertinggi);
        }
    }
    public static void mahasiswaNilaiTertinggi() {
        int nilaiTertinggi = 0;
        String namaMahasiswaTertinggi = "";
        int mingguTertinggi = 0;

        for (int i = 0; i < namaMahasiswa.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    namaMahasiswaTertinggi = namaMahasiswa[i];
                    mingguTertinggi = j + 1;
                }
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi:");
        System.out.println("Nama: " + namaMahasiswaTertinggi);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Minggu ke-" + mingguTertinggi);
    }

    public static void main(String[] args) {
        inputNilai();

        tampilkanNilai();

        nilaiTertinggiPerMinggu();

        mahasiswaNilaiTertinggi();
    }
}
