// [3 2] * [2 4] = [3 4] строка стоблец
import java.util.Scanner;

public class correctInput {
    static Scanner scanner = new Scanner(System.in);
    static int row1, row2, colomn1, colomn2;
    public static boolean correctInput(){
        while (true)
        {
            System.out.println("Кол-во строк в первой матрице ");
            row1 = scanner.nextInt();
            System.out.println(" Кол-во столбцов в первой матрице  ");
            colomn1 = scanner.nextInt();
            System.out.println("Кол-во строк во второй матрице (должно совпадать с кол-вом столбцов в первой");
            row2 = scanner.nextInt();
            System.out.println(" Кол-во стобцов во второй матрице");
            colomn2 = scanner.nextInt();
            if ( colomn1 == row2){
                return true;
            }
            else {
                System.out.println("Введите корректное число строк во второй матрице ");
            }
        }
    }
}