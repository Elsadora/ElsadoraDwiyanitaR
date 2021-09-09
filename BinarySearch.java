import java.util.*;

public class BinarySearch {
    public static void main(String args[]){
        int a, awal, akhir, tengah, jumlah, cari, array[];

        Scanner input = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("|   PROGRAM BINARY SEARCH   |");
        System.out.println("=============================");
        System.out.print("Masukkan jumlah angka: ");
        jumlah = input.nextInt();
        array = new int[jumlah];

        System.out.println("---------------------------------------");
        System.out.println("Masukkan " + jumlah + " list angka anda dibawah ini: ");

        for (a=0; a<jumlah; a++)
            array[a] = input.nextInt();
        System.out.println("---------------------------------------");
        System.out.print("Masukkan nilai yang ingin ditemukan: ");
        cari = input.nextInt();
        System.out.println("---------------------------------------");

        awal = 0;
        akhir = jumlah-1;
        tengah = (awal + akhir)/2;

        while(awal <= akhir){
            if(array[tengah] < cari)
                awal = tengah + 1;
            else if (array[tengah] == cari){
                System.out.println("Angka " + cari + " ditemukan berada di urutan ke-" + (tengah + 1) + "\n");
                break;
            }
            else 
                akhir = tengah - 1;
            tengah = (awal + akhir)/2;
        }
        if (awal > akhir)
            System.out.println("Angka " + cari + " tidak dapat ditemukan atau tidak ada dalam list yang anda masukkan.\n");
    
    input.close();
    }
}
