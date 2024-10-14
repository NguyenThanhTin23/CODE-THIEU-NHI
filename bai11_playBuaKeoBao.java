import java.util.Scanner;

public class bai11_playBuaKeoBao {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          char input;
          int inputC;
          int human = 0, computer = 0;
          do {
               System.out.println("=====BUA_KEO_BAO================");
               System.out.println("-Nhap B de ra BUA");
               System.out.println("-Nhap b de ra BAO");
               System.out.println("-Nhap k de ra KEO");
               System.out.println("-Nhap 0 de thoat!!!");
               System.out.print("Nhap lua chon cua ban: ");
               input = sc.next().charAt(0);
               inputC = (int) (Math.random() * 3) + 1;
               if (inputC == 1)
                    System.out.println("May ra Keo");
               else if (inputC == 2)
                    System.out.println("May ra Bua");
               else
                    System.out.println("May ra bao");
               /*
                * 1.Keo
                * 2.Bua
                * 3.Bao
                */
               switch (input) {
                    case 'B':
                         if (inputC == 1) {
                              human++;
                         }
                         if (inputC == 3) {
                              computer++;
                         }
                         break;
                    case 'b':
                         if (inputC == 1) {
                              computer++;
                         }
                         if (inputC == 2) {
                              human++;
                         }
                         break;
                    case 'k':
                         if (inputC == 2) {
                              computer++;
                         }
                         if (inputC == 3) {
                              human++;
                         }
                         break;
                    case '0':
                         System.out.println("Thoat chuong trinh!!!");

               }
               System.out.println("Ty so Human - Computer: " + human + " - " + computer);

          } while (input != '0');
     }
}
