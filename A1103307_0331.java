import java.util.Scanner;

class animal{
    String name;
    double height;
    int weight;
    int speed;

    animal(String name,double height,int weight,int speed){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

     void show() {
        System.out.printf("項目姓名: %s 身高(公尺): %.1f 體重(公斤): %d 速度(公尺/分鐘): %d " ,name,height,weight,speed);
        System.out.println();
    }

    public double distance(double x, double y) {
        return x*y*speed;
    }

    public double distance(double x){
        return x*speed;
    }


    public static void showinfo(){
        System.out.printf("歡迎進入冰雪奇緣系統\n\n");
    }
}

class human extends animal{
    String gender;

    human(String name,double height,int weight,int speed,String gender){
        super(name, height, weight, speed);
        this.gender = gender;
    }

    void show(){
        super.show();
        System.out.printf("性別：%s\n",gender);
        System.out.println();
    }
}

class snow extends human{
    String freeze;

    snow(String name,double height,int weight,int speed,String gender,String freeze){
        super(name, height, weight, speed, gender);
        this.freeze = freeze;
    }

    void show(){
        super.show();
        System.out.printf("冰凍技能：%s\n",freeze);
    }

   public double distance(double x, double y) {
        return x*y*speed*2;
    }

    public double distance(double x){
        return x*speed*2;
    }

    
}

public class A1103307_0331{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        animal.showinfo();
        animal animal1 = new animal("雪寶",1.1,52,100);
        animal animal2 = new animal("驢子",1.5,99,200);
        animal human1 = new human("阿克",1.9,80,150,"男");
        animal human2 = new human("漢斯",1.8,78,130,"男");
        animal human3 = new human("安那",1.7,48,120,"女");
        animal snow1 = new snow("愛沙",1.7,50,120,"女","Yes");
        animal [] animals={animal1,animal2,human1,human2,human3,snow1};
       
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

        