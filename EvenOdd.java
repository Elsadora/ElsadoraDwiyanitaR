//import java.util.Arrays;
public class EvenOdd {
    public static void main(String[]args){
    int ListAngka[]={1, 2, 3, 123124235, 5, 1, 7, 4};
    
    System.out.println("======================================================");
    System.out.println("|   PROGRAM JAVA MENAMPILKAN BILANGAN GANJIL/GENAP   |");
    System.out.println("======================================================");

    System.out.println("Yang termasuk bilangan genap adalah: ");
    for(int i=0; i < ListAngka.length; i++){
        if (ListAngka[i]% 2 == 0){
            System.out.println(ListAngka[i]);
        }
    }
    System.out.println("\n");
    System.out.println("Yang termasuk bilangan ganjil adalah: ");
    for(int i=0; i < ListAngka.length; i++){
        if(ListAngka[i] % 2 != 0){
            System.out.println(ListAngka[i]);
        }
    }
    System.out.println("\n");
    }
}

