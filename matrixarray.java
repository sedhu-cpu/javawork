public class matrixarray {
    public static void main(String[] args) {
        int[][] Number = {{1,2,3,4,5} , {6,7,8} , {9,10}};
        for(int i = 0 ; i < Number.length ; i++)
        {   
            for(int j = 0 ; j < Number[i].length ; j++)
            {
              System.out.print(Number[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
