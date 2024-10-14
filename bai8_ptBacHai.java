import java.util.Scanner;

public class bai8_ptBacHai {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Nhập hệ số a: ");
          double a = sc.nextDouble();
          System.out.print("Nhập hệ số b: ");
          double b = sc.nextDouble();
          System.out.print("Nhập hệ số c: ");
          double c = sc.nextDouble();

          if (a == 0) {
               if (b != 0) {
                    double x = -c / b;
                    System.out.println("Phương trình bậc nhất có nghiệm: x = " + x);
               } else if (c == 0)
                    System.out.println("Phương trình có vô số nghiệm.");
               else
                    System.out.println("Phương trình vô nghiệm.");

          } else {
               double delta = b * b - 4 * a * c;
               double x1, x2;

               if (delta > 0) {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
               } else if (delta == 0) {
                    x1 = -b / (2 * a);
                    System.out.println("Phương trình có nghiệm kép: x = " + x1);
               } else
                    System.out.println("Phương trình vô nghiệm.");
          }
     }
}
