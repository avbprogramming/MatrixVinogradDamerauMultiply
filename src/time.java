import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class time {

    public static long timeMeasurementAndWritingFile(int[][] firstMatrix, int[][] secondMatrix) throws IOException {
        int count = 10;

        long multiPlayingMatrixStartTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            multiPlyingMatrix.multiPlyingMatrix(firstMatrix, secondMatrix);
        }
        long multiPlayingMatrixFinalTime = ((System.nanoTime() - multiPlayingMatrixStartTime) / count);

        long simpleVinogradaStartTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            simpleVinograda.simpleVinograda(firstMatrix, secondMatrix);
        }
        long simpleVinogradaFinalTime = ((System.nanoTime() - simpleVinogradaStartTime) / count);

        long ImprovedVinogradaStartTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            ImprovedVinograda.improvedVinograda(firstMatrix, secondMatrix);
        }
        long improvedVinogradaFinalTime = ((System.nanoTime() - ImprovedVinogradaStartTime) / count);

        System.out.println("Количество запусков :" + count);
        System.out.println("Обычное перемножение матриц. Среднее время выполнения: " + multiPlayingMatrixFinalTime);
        System.out.println("Перемножение матриц методом Виноградова. Среднее время выполнения: " + simpleVinogradaFinalTime);
        System.out.println("Перемножение матриц улучшеным методом Виноградова. Среднее время выполнения: " + improvedVinogradaFinalTime);
        System.out.println("Данные записаны в файл file.txt ");


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));
//    bufferedWriter.write("Расстояние преобразования слов: " + LevenshteinMemory.computeLevenshteinDistanceDP(s1, s2));
        //   bufferedWriter.newLine();
        bufferedWriter.write("Обычное перемножение матриц. Среднее время выполнения: " + multiPlayingMatrixFinalTime);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.write("Перемножение матриц методом Виноградова. Среднее время выполнения: " + simpleVinogradaFinalTime);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.write("Перемножение матриц улучшеным методом Виноградова. Среднее время выполнения: " + improvedVinogradaFinalTime);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();

        return 0;
    }

}