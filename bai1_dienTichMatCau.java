
/**
 * bai1_dienTichMatCau
 */
import java.util.Scanner;

public class bai1_dienTichMatCau {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap dien tich mat cau: ");
          double dienTich = sc.nextDouble();
          double banKinh = Math.sqrt(dienTich / (4 * Math.PI));
          System.out.printf("The tich mat cau la %.2f",
                    (4 * Math.PI * Math.pow(banKinh, 3)) / 3);

     }
}