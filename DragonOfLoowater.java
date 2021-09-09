import java.util.Arrays;
import java.util.*;

public class DragonOfLoowater {
    public static void main(String args []){
        int[] list = null;
        Scanner sr = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("|   PROGRAM JAVA DRAGON OF LOOWATER    |");
        System.out.println("========================================");
        System.out.print("Masukkan Jumlah Ksatria: ");
        
        int knight = sr.nextInt();
        list = new int[knight];

        System.out.println("Masukkan Tinggi Ksatria: ");
        for (int i = 0; i < (knight - 1); i++)
            list[i] = sr.nextInt();
        
        int knights = sr.nextInt();
        Arrays.sort(list);

        int[] ini = null;
        System.out.print("Masukkan Jumlah Naga: ");
        int dragon = sr.nextInt();
        ini = new int[dragon];

        System.out.println("Masukkan Diameter Naga: ");
        for (int j = 0; j < (dragon - 1); j ++)
            list[j] = sr.nextInt();

        int dragons = sr.nextInt();
        Arrays.sort(ini);

        int indexnaga = 0;
        int power = 0;

        for(int a : ini){
            if(indexnaga < ini.length){
                if(a >= ini[indexnaga]){
                    power += a; indexnaga++;
                }
            }
        }
        if (indexnaga == ini.length){
            System.out.println("Minimum Power: " + power);
        }else{
            System.out.println("Knight Fall");
        }
    }
}
