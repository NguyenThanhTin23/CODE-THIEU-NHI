import java.util.Scanner;

public class bai4_dienTichTamGiac {

     public static boolean kiemTraHopLe(float a, float b, float c) {
          return (a + b > c) && (a + c > b) && (b + c > a);
     }

     public static String loaiTamGiac(float a, float b, float c) {
          if (!kiemTraHopLe(a, b, c))
               return "Khong phai tam giac";
          if (a == b && b == c)
               return "Tam giac deu";
          if (a == b || b == c || a == c)
               return "Tam giac can";
          if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
               return "Tam giac vuong";
          return "Tam giac thuong";
     }

     public static double dienTich(float a, float b, float c) {
          float p = (a + b + c) / 2;
          double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
          return S;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap do dai 3 canh tam giac: ");
          float a = sc.nextFloat();
          float b = sc.nextFloat();
          float c = sc.nextFloat();
          if (loaiTamGiac(a, b, c) != "Khong phai tam giac") {
               System.out.println(loaiTamGiac(a, b, c));
               System.out.printf("Dien tich tam giac la %.2f", dienTich(a, b, c));
          } else
               System.out.println(loaiTamGiac(a, b, c));
     }
}