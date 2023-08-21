import java.util.Scanner;
public class Twodarray {
    public  static void main(String args[]){
        int row=4;
        int column=3;
        int arr[][]=new int[4][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }  
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

    }
    
    
}
