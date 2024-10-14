import java.util.Scanner;

public class bai3_InOrOutCircle {

     public static double khoangCach(float xA, float yA, float xB, float yB) {
          return Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap toa do tam duong tron : ");
          float xC = sc.nextFloat();
          float yC = sc.nextFloat();
          System.out.print("Nhap ban kinh R: ");
          float r = sc.nextFloat();
          System.out.print("Nhap toa do diem M : ");
          float xM = sc.nextFloat();
          float yM = sc.nextFloat();

          if (khoangCach(xC, yC, xM, yM) > r)
               System.out.println("M nam ngoai duong tron");
          else if (khoangCach(xC, yC, xM, yM) == r)
               System.out.println("M nam tren duong tron");
          else
               System.out.println("M nam trong duong tron");
     }
}
