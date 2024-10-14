import java.util.Scanner;

public class bai6_SXTang {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap 3 so:  ");
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int tmp;
          // Bien doi sao cho a>b>c
          if (a < b) {
               tmp = a;
               a = b;
               b = tmp;
          }
          if (b < c) {
               tmp = b;
               b = c;
               c = tmp;
          }
          if (a < c) {
               tmp = a;
               a = c;
               c = tmp;
          }
          System.out.printf("Ket qua la %d %d %d", c, b, a);
     }
}
