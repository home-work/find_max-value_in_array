import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập vào kích thước của mảng:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích thước tối đa của mảng là 20");
            }
        } while (size > 20);
        int[] money = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào số tiền của tỷ phú thứ " + (i + 1));
            money[i] = scanner.nextInt();
        }
    }
}
