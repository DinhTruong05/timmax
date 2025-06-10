import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập độ dài mảng : ");
        int row = sc.nextInt();

        int[] arr = new int[row];

        System.out.println(" nhập các giá tr cho mảng ");
        for (int i = 0; i < row; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < row; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("giá trị nhỏ nhất trong mảng là " + min + " ");
    }
}