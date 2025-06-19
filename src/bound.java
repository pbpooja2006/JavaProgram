import java.util.Scanner;
public class bound
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int[][] arr=new int[size][size];
		for(int i=0;i<size;i++){
		    for(int j=0;j<size;j++){
		     arr[i][j]=sc.nextInt();
		    }
		}//int i can always taken as int i if declared with datatypes
		for (int i = 0; i < size; i++) {
            System.out.print(arr[0][i] + " ");
        }
        for (int i = 1; i < size; i++) {
            System.out.print(arr[i][size- 1] + " ");
        }
        for (int i = size - 2; i >= 0; i--) {
            System.out.print(arr[size - 1][i] + " ");
        }
        for (int i = size - 2; i > 0; i--) {
            System.out.print(arr[i][0] + " ");
        }
	}
}