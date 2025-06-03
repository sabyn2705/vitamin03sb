
import java.util.Scanner;

public class hinhchunhat {
    public static void main(String[] args) {
        System.out.println("Nhap hinh chu nhat: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu dai: ");
        int width = sc.nextInt();
        System.out.print("Chieu rong: ");
        int height = sc.nextInt();

        System.out.println("Chu Vi: =" + ((width+height)*2));
        System.out.println("Dien Tich: =" + (width*height));
    }
}