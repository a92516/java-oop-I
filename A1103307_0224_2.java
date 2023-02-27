import java.util.Scanner;
public class A1103307_0224_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入攝氏溫度：");
       
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " 度攝氏溫度為 " + fahrenheit + " 度華氏溫度");
    }
    
}
