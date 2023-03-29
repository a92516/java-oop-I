import java.util.Scanner;

class animal{
    String name;
    double height;
    int weight;
    int speed;
    
    public animal(String name, double height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }
    
    public void show() {
        System.out.printf(" 項目姓名: %s 身高(公尺): %.1f 體重(公斤): %d 速度(公尺/分鐘): %d " ,name,height,weight,speed);
        System.out.println();
    }
    
    public double distance(double x, double y) {
        return x*y*speed;
    }

    public double distance(double x){
        return x*speed;
    }

}
public class A1103307_0324_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        animal animal1,animal2,animal3,animal4;
        
        animal1=new animal("雪寶",1.1,52,100);
         animal2=new animal("驢子",1.5,99,200);
         animal3=new animal("安那",1.7,48,120);
         animal4=new animal("愛沙",1.7,50,120);
        
         animal [] animals={animal1,animal2,animal3,animal4};

        for (animal each : animals){
            each.show();
        }
        System.out.println();

        for (animal each : animals){
            System.out.printf("請輸入%s的跑步時間 (單位:分鐘): ", each.name);
            double x = input.nextDouble();
            System.out.printf("請輸入%s的加速度 (若無則輸入0):", each.name);
            double y = input.nextDouble();
            System.out.println();

            if(y == 0){
                double distance = each.distance(x);
                System.out.printf("%s所跑的距離為: %.0f 公尺\n", each.name, distance);
                System.out.println();
            }
            else{
                double distance = each.distance(x, y);
                System.out.printf("%s所跑的距離為: %.0f 公尺\n", each.name, distance);
                System.out.println();
            }
        }
        input.close();

        }
}
