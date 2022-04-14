import java.util.Scanner;

public class personal_Method {
    public static void main(String[] args) {
//        Input Scanner class
        Scanner sc = new Scanner(System.in);
        char choice;
//  Do repeatation
        do{
            //        Block 1
            String baris1 = "   Belajar Deret Aritmatika, Geometri dan menghitung Faktorial";
            String baris2 = "Masukan banyak angka yang mau di cetak [2..10] : ";
            String baris3 = "Masukan beda masing-masing angka [2..9] : ";
            //        Printout Baris
            System.out.println(baris1);
            System.out.print(baris2);
            int banyakAngka = sc.nextInt();
            System.out.print(baris3);
            int bedaAngka = sc.nextInt();

            //        Block 2
            String deret1 = "Deret Aritmatika : ";
            String deret2 = "Deret Geometri : ";
            String deret3 = "Faktorial dari " + banyakAngka + " : ";

            //  Deret Aritmatika
            System.out.print(deret1 + "\n");
            for (int i = 1; i <= banyakAngka * bedaAngka; i = i + bedaAngka) {
                System.out.print(i + " ");
            }

            //  Deret Geometri
            System.out.print("\n" + deret2 + "\n");
            int a = 1, total = 0;
            for(int i = 1; i <= banyakAngka; i++){
                System.out.print(a + total);
                a = a * 2;
                if (i<banyakAngka){
                    System.out.print(" ");
                } else{
                    System.out.print("");
                }
            }

            //  Deret Faktorial
            System.out.print("\n" + deret3 + "\n");
            for (int i = banyakAngka; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println("= " + factorial(banyakAngka));
            
            //  Repeatation
            System.out.println("Anda mau ulang [Y/N] : ");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y') ;
                sc.close();
                }
    public static int factorial(int n){
        if (n==1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
}
