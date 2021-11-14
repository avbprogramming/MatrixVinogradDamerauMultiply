public class multiPlyingMatrix {

    public static int[][] multiPlyingMatrix(int[][] first, int[][] second){
        int[][] third = new int[first.length][second[0].length];
        //  int o = second.length;
        for(int i=0; i< first.length; i++){
            for(int u=0 ; u < second[0].length; u++) {
                for(int j=0 ; j < second.length;j++){
                    third[i][u]+=first[i][j]*second[j][u];
                }
            }
        }
        return third;
    }
}