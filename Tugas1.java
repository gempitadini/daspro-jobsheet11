import java.util.Scanner;

public class Tugas1 {    
    static int hitungVolume (int sisi) {
        int Volume = sisi*sisi*sisi;
        return Volume;
    }  
    static int hitungLuasPermukaan (int sisi) {
        int LuasPermukaan = 6*(sisi*sisi);
        return LuasPermukaan;
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi, Vol, L;

        System.out.println("Masukkan sisi");
        sisi = input.nextInt();

        Vol = hitungVolume(sisi);
        System.out.println("Volume kubus adalah " +Vol);
        L = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah " +L);

        input.close();
    }
}
