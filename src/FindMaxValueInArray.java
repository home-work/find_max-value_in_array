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
            System.out.println("Nhập vào số thứ " + (i + 1));
            money[i] = scanner.nextInt();
        }
        System.out.println("Danh sách vừa nhập:");
        for (int i = 0; i < money.length; i++) {
            System.out.printf(money[i] + "\t");
        }
        int max = money[0];
        int index = 0;
        for (int i = 0; i < money.length; i++) {
            if (max < money[i]) {
                max = money[i];
                index = i + 1;
            }
        }
        System.out.println("");
        System.out.println("Giá trị lớn nhất trong mảng là: " + max + " và đứng ở vị trí thứ: " + index);
    }
}
