public class simpleVinograda {

    public static int[][] simpleVinograda(int[][] firstMatrix, int[][] secondMatrix){
        int [][] third;
        if(firstMatrix[0].length == secondMatrix.length ) {
            third = new int[firstMatrix.length][secondMatrix[0].length];
            int[] mulH = new int[firstMatrix.length];
            for(int i =0; i< firstMatrix.length; i++){
                for (int k = 0; k<(firstMatrix[0].length)/2; k++){
                    mulH[i]+=firstMatrix[i][2*k]*firstMatrix[i][2*k+1];
                }
            }
            int[] mulj = new int[secondMatrix[0].length];
            for(int j =0; j< secondMatrix[0].length; j++){//each column
                for (int k = 0; k<(secondMatrix.length)/2; k++){
                    mulj[j]+=secondMatrix[2*k][j]*secondMatrix[2*k+1][j];
                }
            }
            //заполнение матрицы 3

            for(int i = 0; i<firstMatrix.length; i++){
                for (int j = 0; j<secondMatrix[0].length; j++){
                    third[i][j] = -mulH[i]-mulj[j];
                    if(firstMatrix[0].length%2 ==1){
                        third[i][j] +=  firstMatrix[i][firstMatrix[0].length-1] *
                                secondMatrix[firstMatrix[0].length-1][j];
                    }
                    for (int k = 0; k< firstMatrix[0].length/2; k++){
                        third[i][j]+=(firstMatrix[i][2*k]+secondMatrix[2*k+1][j])*(firstMatrix[i][2*k+1]+secondMatrix[2*k][j]);
                    }

                }
            }
            return third;
        }
        return new int[0][0];
    }
}