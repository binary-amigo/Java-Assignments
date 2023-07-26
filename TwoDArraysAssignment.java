
public class TwoDArraysAssignment {

    //Find count
    public static int count(int arr[][],int key){
        int count=0;
        for(int i=0;i<arr.length;++i){
            for(int j=0;j<arr[0].length;++j){
                if(arr[i][j]==key)
                    count++;
            }
        }
        return count;
    }

    //Sum of elements in row

    public static int rowSum(int num[][]){
        int sum=0;
            for(int j=0;j<num[0].length;++j){
                sum+=num[1][j];
            }
            return sum;
    }

    //Transpose of matrix

    public static void transpose(int matrix[][],int transmatrix[][]){
        for(int i=0;i<matrix.length;++i){
            for(int j=0;j<matrix[0].length;++j){
                if(i!=j){
                    transmatrix[j][i]=matrix[i][j];
                }
                else
                    transmatrix[i][j]=matrix[i][j];
            }
        }
    }

    //Display Matrix

    public static void display(int arr[][]){
        for(int i=0;i<arr.length;++i)
        {
            for(int j=0;j<arr[0].length;++j){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int array [][]={{4,7,8},{8,8,7}};
        int num [][]={{1,4,9},{11,4,3},{2,2,3}};
        int matrix [][]={{1,4,9},{8,8,7}};
        int transmatrix [][]=new int  [matrix[0].length][matrix.length];
        System.out.println(count(array, 7));
        System.out.println(rowSum(num));
        transpose(matrix,transmatrix);
        display(transmatrix);
    }
}
