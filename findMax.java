import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số hàng và cột từ người dùng
        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();

        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        // Khởi tạo ma trận với kích thước cụ thể
        double[][] matrix = new double[rows][cols];

        System.out.println("Nhập các phần tử cho ma trận (" + rows + "x" + cols + "):");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print("matrix[" + row + "][" + col + "] = ");
                matrix[row][col] = sc.nextDouble();
            }
        }

        // Tìm phần tử lớn nhất trong ma trận
        double max = matrix[0][0];
        int maxRow = 0, maxCol = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        System.out.println("Phần tử lớn nhất là " + max + " tại vị trí [" + maxRow + "][" + maxCol + "]");
    }
}
