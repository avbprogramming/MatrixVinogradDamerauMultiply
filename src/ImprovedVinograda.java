public class ImprovedVinograda {
    public static int[][] improvedVinograda(int[][] firstMatrix, int[][] secondMatrix){
        int [][] thirdMatrix;
        if(firstMatrix[0].length == secondMatrix.length ) {
            thirdMatrix = new int[firstMatrix.length][secondMatrix[0].length];
            int[] mulH = new int[firstMatrix.length];
            for(int i =0; i< firstMatrix.length; i++){
                for (int k = 1; k<firstMatrix[0].length; k+=2){
                    mulH[i]-=firstMatrix[i][k-1]*firstMatrix[i][k];
                }
            }
            int[] mulj = new int[secondMatrix[0].length];
            for(int j =0; j< secondMatrix[0].length; j++){
                for (int k = 1; k<secondMatrix[0].length; k+=2){
                    mulj[j]-=secondMatrix[k-1][j]*secondMatrix[k][j];
                }
            }
            //заполнение матрицы 3

            for(int i = 0; i<firstMatrix.length; i++){
                for (int j = 0; j<secondMatrix[0].length; j++){
                    thirdMatrix[i][j] = mulH[i]+mulj[j];
                    if(firstMatrix[0].length%2 ==1){
                        thirdMatrix[i][j] +=  firstMatrix[i][firstMatrix[0].length-1] *
                                secondMatrix[firstMatrix[0].length-1][j];
                    }
                    for (int k = 1; k< secondMatrix.length; k+=2){
                        thirdMatrix[i][j]+=(firstMatrix[i][k-1]+secondMatrix[k][j])*(firstMatrix[i][k]+secondMatrix[k-1][j]);
                    }

                }
            }
            return thirdMatrix;
        }
        return new int[0][0];
    }
}