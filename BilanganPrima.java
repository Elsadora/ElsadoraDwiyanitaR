import java.util.*;

public class BilanganPrima {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int angka;
        int cek = 0;

        System.out.println("==============================================");
        System.out.println("|   PROGRAM JAVA MENENTUKAN BILANGAN PRIMA   |");
        System.out.println("==============================================");
        System.out.print("Masukkan angka yang ingin anda cek: ");
        angka = input.nextInt();

        for (int i=2; i<=angka; i++){
            if (angka%i==0){
                cek++;
                }
            }
            if (cek==1){
                System.out.println("\n" + angka + " adalah bilangan prima");
                System.out.println("----------------------------------------------");
            }else {
                System.out.println("\n" + angka + " adalah bukan bilangan prima");
                System.out.println("----------------------------------------------");
            }
    input.close();   
    }
}
