// [3 2] * [2 4] = [3 4] строка стоблец

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        correctInput.correctInput();
        int[][] firstMatrix = fillMatrix.fillMatrix(correctInput.row1, correctInput.colomn1);
        int[][] secondMatrix = fillMatrix.fillMatrix(correctInput.row2, correctInput.colomn2);
        int choice = 0;
        while (true) {
            System.out.println("1 ====> Show both matrices ");
            System.out.println("2 ====> Multiply ");
            System.out.println("3 ====> Show Vinograda ");
            System.out.println("4 ====> Show improved Vinograda ");
            System.out.println("5 ====> Time measurement ");
            System.out.println("6 ====> Exit ");
            choice = correctInput.scanner.nextInt();
            if (choice == 1 )
            {
                showMatrix.showMatrix(firstMatrix);
                System.out.println(" ");
                showMatrix.showMatrix(secondMatrix);
            }
            else if (choice == 2 ){
                int[][] result = multiPlyingMatrix.multiPlyingMatrix(firstMatrix, secondMatrix);
                showMatrix.showMatrix(result);
            }
            else if (choice == 3 ){
                int[][] result = simpleVinograda.simpleVinograda(firstMatrix, secondMatrix);
                showMatrix.showMatrix(result);
            }

            else if (choice == 4 ){
                int[][] result = ImprovedVinograda.improvedVinograda(firstMatrix, secondMatrix);
                showMatrix.showMatrix(result);
            }
            else if (choice == 5 ){
                try {
                    time.timeMeasurementAndWritingFile(firstMatrix, secondMatrix);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            else if (choice == 6){
                return;
            }
        }
    }



/*
        public static void time (){

        multiPlyingMatrix();
*/
}
