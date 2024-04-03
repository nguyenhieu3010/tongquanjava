import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class index1 {
    //bài 4
//    public static void main(String [] args){
//        Scanner input = new Scanner(System.in);
//        int number1,number2,S;
//        System.out.println("nhập cạnh a : ");
//        number1 = input.nextInt();
//        System.out.println("nhập cạnh b :");
//        number2 = input.nextInt();
//        S = number1 * number2 ;
//        System.out.println(" diện tích hình chữ nhật là : " + S);
//    }
    //bài 5
//    public static void main (String[] args){
//        Scanner input = new Scanner(System.in);
//        double number1, number2,S;
//        System.out.println("nhập cạnh a : ");
//        number1 = input.nextDouble();
//        System.out.println("nhập cạnh b : ");
//        number2 = input.nextDouble();
//        S = (number1*number2) * 1/2;
//        System.out.println("diện tích tam giác vuông : " + S);
//    }
    //bài 6
//    public static void main (String[]args){
//        Scanner input = new Scanner(System.in);
//        double number1,number2,x;
//        System.out.println("nhập số a");
//        number1= input.nextDouble();
//        System.out.println("nhập số b");
//        number2 = input.nextDouble();
//        if (number1 == 0 && number2 == 0){
//            System.out.println("phương trình vô số nghiệm");
//        } else if (number1 ==0 && number2 !=  0 ){
//            System.out.println("phương trình vô nghiệm");
//        } else if (number1 !=0){
//            x = -number2/number1;
//            System.out.println("pt có nghiệm là : " + x);
//        }
//    }
    //bài 7
//    public static void main (String[]args){
//        Scanner input = new Scanner(System.in);
//        double a , b ,c ,denta ,x1,x2;
//        System.out.println("nhâ số a");
//        a = input.nextDouble();
//        System.out.println("nhap số b");
//        b = input.nextDouble();
//        System.out.println("nhập số c");
//        c = input.nextDouble();
//        denta = b*b - 4 * a * c;
//        if (denta < 0 ){
//            System.out.println("phương trình vô nghệm");
//        }  else if ( denta == 0) {
//            System.out.println("phương trính có hai nghiệm kép");
//            double X=-b/2 *a;
//            System.out.println(X);
//        }  else if (denta > 0){
//            System.out.println("phuong trình có 2 nghiệm riêng biet");
//            x1 = -b + Math.sqrt(denta)/2 *a;
//            System.out.println("nghiệm x1 = " + x1);
//            x2 = b + Math.sqrt(denta)/2 *a;
//            System.out.println("nghiệm x2 = " + x2);
//        }
//    }
    //bài 8
//    public static void main (String[]args){
////        Scanner input = new Scanner(System.in);
////        int number;
////        System.out.println("nhập số tuổi");
////        number = input.nextInt();
////        if (number > 0 && number < 120){
////            System.out.println("số tuổi của một người");
////        }else {
////            System.out.println("không phair số tuổi ");
////        }
////    }
    // bài 9
//    public static void main (String[]args){
//        Scanner input = new Scanner(System.in);
//        int a, b,c;
//        System.out.println("nhập so a");
//        a = input.nextInt();
//        System.out.println("nhập so b");
//        b = input.nextInt();
//        System.out.println("nhập so c");
//        c = input.nextInt();
//        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b){
//            System.out.println("a,b,c là cạnh của một tam giác ");
//        }else {
//            System.out.println("a,b,c không phải là cạnh của một tam giác");
//        }
//    }
    //bài 9
//    public static void main (String[]args){
//        Scanner input  = new Scanner(System.in);
//        int number , X;
//        System.out.println("nhập số điện");
//        number = input.nextInt();
//        if (number >0 && number < 50){
//            X= number * 1678;
//            System.out.println("gí tền điện là : " + X);
//        }else if (number > 50 && number < 500){
//            X= number * 1734;
//            System.out.println("gí tền điện là : " + X);
//                }
//    }
    //bài 10
    public static void main (String[]args){
        Scanner input  = new Scanner(System.in);
        double number , X ;
        System.out.println("nhập số tiền thu nhập");
        number = input.nextDouble();
        if (number >0 && number < 60){
            X= number * 0.5;
            System.out.println("thuế thu nhập  là : " + X);
        }else if (number > 50 ){
            X= number * 1.2;
            System.out.println("thuế thuu nhập là : " + X);
               }
   }
    }
//Bài 4: Tính diện tích hình  chữ nhật khi 502 cạnh a, b.
//Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
//        Bài 6: Giải phương trình bậc 1.
//Bài 7: Giải phương trình bậc 2.
//Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không.
//Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
//Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác.
//Điều kiện để a,b,c là cạnh của một tam giác là:
//a,b,c > 0
//a + b > c
//b + c > a
//a + c > b
//Bài 10: Viết chương trình tính giá điện.
//Bài 11: Viết chương trình tính thuế thu nhập cá nhân.