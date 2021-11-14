public class fillMatrix {

    public static int[][] fillMatrix(int row, int colomn) {
        int[][] matrix = new int[row][colomn];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }
}