package java_homework;
import java.util.Scanner;
public class A1103307_0421_2 {
    public static void main(String[] args){
        
        
        System.out.print("請輸入日期，格式為:YYYY/MM/DD 或是 MM/DD/YYYY:");
        Scanner input = new Scanner(System.in);
        String date = input.next();

        if(date.matches("[0-9]{1,4}[/]{1}[0-1]{0,1}[0-9]{1}[/]{1}[0-3]{0,1}[0-9]{1}")){   
            System.out.println("輸入正確，您輸入的日期為:"+date);
        }else if(date.matches("[0-1]{0,1}[0-9]{1}[/]{1}[0-3]{0,1}[0-9]{1}[/][0-9]{1,4}")){  
            System.out.println("輸入正確，您輸入的日期為:"+date);
        }else{
            System.out.println("輸入錯誤");
        }
    }
    
}
