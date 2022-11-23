import java.util.ArrayList;

public class setMatrixZero {
    public int[][] setZeroes(int[][] matrix) {
        ArrayList<Integer[]> zeros=new ArrayList<Integer[]>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    zeros.add(new Integer[]{i,j});
                }
            }
        }
        for(int i=0;i<zeros.size();i++){
            Integer[] zero=zeros.get(i);
            for(int j=0;j<matrix[zero[0]].length;j++){
                matrix[zero[0]][j]=0;
            }
            for(int j=0;j<matrix.length;j++){
                matrix[j][zero[1]]=0;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrixZero s=new setMatrixZero();
        s.setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
