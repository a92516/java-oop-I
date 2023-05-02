package java_homework;
import java.util.Scanner;

public class A1103307_0421_1 {
    public static void main(String[] args){
        
        
        System.out.print("請輸入正確格式的電子郵件信箱，只能輸入小寫英文字母:");
        Scanner input = new Scanner(System.in);
        String email = input.next();

    
        if(email.matches("[a-z]{1,20}[0-9]{0,20}[@]{1}[a-z0-9.]{0,30}[.]{1}[a-z]{0,20}")){
            System.out.println("輸入正確");
        }else{
            System.out.println("輸入錯誤");
        }
    }
    
}
