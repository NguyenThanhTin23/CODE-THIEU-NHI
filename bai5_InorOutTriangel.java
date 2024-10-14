import java.util.Scanner;

public class bai5_InorOutTriangel {

     public static double area(double x1, double y1, double x2,
               double y2, double x3, double y3) {
          return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
     }

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Nhập tọa độ đỉnh A:");
          double Ax = scanner.nextDouble();
          double Ay = scanner.nextDouble();

          System.out.print("Nhập tọa độ đỉnh B:");
          double Bx = scanner.nextDouble();
          double By = scanner.nextDouble();

          System.out.print("Nhập tọa độ đỉnh C:");
          double Cx = scanner.nextDouble();
          double Cy = scanner.nextDouble();

          System.out.print("Nhập tọa độ điểm M:");
          double Mx = scanner.nextDouble();
          double My = scanner.nextDouble();

          double areaABC = area(Ax, Ay, Bx, By, Cx, Cy);
          double areaABM = area(Ax, Ay, Bx, By, Mx, My);
          double areaBCM = area(Bx, By, Cx, Cy, Mx, My);
          double areaCAM = area(Cx, Cy, Ax, Ay, Mx, My);

          double tongDienTich = areaABM + areaBCM + areaCAM;

          // Kiểm tra vị trí của điểm M
          if (tongDienTich == areaABC) {
               if (areaABM == 0 || areaBCM == 0 || areaCAM == 0)
                    System.out.println("Điểm M nằm trên cạnh tam giác ABC.");
               else
                    System.out.println("Điểm M nằm trong tam giác ABC.");
          } else
               System.out.println("Điểm M nằm ngoài tam giác ABC.");
     }
}
