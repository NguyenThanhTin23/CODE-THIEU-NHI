import java.util.Scanner;

public class bai2_tinhKhoangCach {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Nhap toa do A : ");
          float xA = sc.nextFloat();
          float yA = sc.nextFloat();

          System.out.print("Nhap toa do B: ");
          float xB = sc.nextFloat();
          float yB = sc.nextFloat();

          System.out.printf("Khoang cach la: %.2f",
                    Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2)));
     }
}