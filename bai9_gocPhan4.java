import java.util.Scanner;

public class bai9_gocPhan4 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Nhập số đo x của góc (phút): ");
          double gocPhut = sc.nextDouble();

          double gocDo = gocPhut / 60.0;
          int gocVuong = (int) Math.ceil(gocDo / 90) % 4;
          double cosValue = Math.cos(Math.toRadians(gocDo));

          System.out.println("x thuộc góc vuông thứ " + gocVuong);
          System.out.println("cos(x) = " + cosValue);
     }
}
