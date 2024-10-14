import java.util.Scanner;

public class bai7_ptBacNhat {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap he so a va b: ");
          float a = sc.nextFloat();
          float b = sc.nextFloat();
          System.out.printf("Phuong trinh la %.1fX + %.1f = 0\n", a, b);
          if (a == 0 && b != 0)
               System.out.println("Phuong trinh vo nghiem");
          else if (a == 0 && b == 0)
               System.out.println("Phuong trinh co vo so nghiem");
          else
               System.out.printf("Phuong trinh co nghien duy nhat X = %.2f", b / a);
     }
}
