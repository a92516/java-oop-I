import java.util.Scanner;
public class A1103307_0317_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入n的值: ");
        int n = input.nextInt();
        System.out.printf("請輸入m的值: ");
        int m = input.nextInt();
        int[][] data = new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                data[i][j] = (i+1) * (j+1);
                }
            }
        for (int[] row : data) {
            for (int value : row) {
                
                System.out.printf("%3s*%s=%3s ",row[0],value/row[0],value);
                
                }
                System.out.println();
            }

        

        }
    }





    
