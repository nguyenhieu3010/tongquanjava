import java.util.Scanner;

public class index {
//bài 1
//        public static void main( String [] args){
//            System.out.println("welcomme to java");
//            Scanner input = new Scanner(System.in);
//            int a = 10;
//            int b = 3 ;
//            if (a % b == 0){
//                System.out.println("a chia hêt cho b");
//            }else {
//                System.out.println("a không chia hết cho b");
//            }
//
//        }
//Bài 2
//    public static void main(String [] args){
//        System.out.println("chào mừng bạn tới lop 10");
//        Scanner input = new Scanner(System.in);
//        int age = input.nextInt();
//        if (age > 15){
//            System.out.println("bạn đun điều kiện");
//        }else {
//            System.out.println("bạn không đủ đieu kien");
//        }
//    }
//bài 3
//public static void main(String [] args) {
//    System.out.println("nhập vào bảng ");
//    Scanner input = new Scanner(System.in);
//    int number = input.nextInt();
//    if (number > 0){
//        System.out.println("số do lớn hơn 0");
//    } else {
//        System.out.println("số đó bé hơn 0");
//    }
//}
// bài 4
//public static void main(String [] args) {
//    System.out.println("nhập vào bảng ");
//    Scanner input = new Scanner(System.in);
//    int number1 = input.nextInt();
//    int number2 = input.nextInt();
//    int number3 = input.nextInt();
//    if (number1 > number2 && number1>number3){
//        System.out.println("số lớn nhâất " + number1 );
//    } else if (number2 > number1 && number2>number3){
//        System.out.println("số lớn nhât" + number2 );
//    }else {
//        System.out.println("số lớn nhất" + number3 );
//    }
//}
//bài 5
//public static void main(String [] args) {
//    System.out.println("nhập vào bảng ");
//   Scanner input = new Scanner(System.in);
//   double number1 , number2 , tb;
//    System.out.println("điẻm giữa kỳ");
//    number1 = input.nextDouble();
//    System.out.println("điểm cuối kì");
//    number2 = input.nextDouble();
//    tb = (number1 + number2)/2;
//    if(tb>8.0){
//        System.out.println("bạn đạt học lực tốt");
//    }else if(tb<7.9 && tb > 6.5) {
//        System.out.println("ban ạt học lực khá");
//    }else if(tb > 5.0 && tb < 6.4){
//        System.out.println("bạn đạt học lực trung bình");
//    }else {
//        System.out.println("bạn học sinh yếu");
//    }
//
//}
    //bài 6
//public static void main(String [] args) {
//    System.out.println("nhập vào bảng ");
//    Scanner input = new Scanner(System.in);
//    double number;
//    System.out.println("doanh thu mỗi đơn");
//    number = input.nextDouble();
//    if (number < 2000000 && number > 0){
//        double tienHoahong = number * 0.03;
//        System.out.println("tiền hoa hồng " + tienHoahong);
//    }else if (number > 2000000 && number < 5000000){
//        double tienHoahong = number * 0.05;
//        System.out.println("tiền hoa hồng " + tienHoahong);
//    }else if(number>5000000){
//        double tienHoahong = number * 0.1;
//        System.out.println("tiền hoa hồng " + tienHoahong);
//    }
//}
    // bài 7
//    public static void main(String[]args){
//        System.out.println("nhập vaog bảng");
//        Scanner input = new Scanner(System.in);
//        double number;
//        System.out.println("nhập thời gian gọi");
//        number = input.nextDouble();
//        if(number < 60 ){
//            double tien = number * 80;
//            System.out.println("tiền cước " + tien);
//        }else if(number >60 && number < 120){
//            double tien = number * 70;
//            System.out.println("tiền cước " + tien);
//        }else if(number >60 && number < 120) {
//            double tien = number * 55;
//            System.out.println("tièn cước " + tien);
//        }
//        }
    // bài 8
//            public static void main(String[]args){
//                System.out.println("nhập vào so");
//                Scanner input = new Scanner(System.in);
//                double number , F ;
//                System.out.println("nhập độ C");
//                number = input.nextDouble();
//                F = number * 9/5 + 32 ;
//                System.out.println(" độ f la " + F);
//            }
    // bài 9
//            public static void main(String[]args){
//                System.out.println("nhập thông số");
//                Scanner input = new Scanner(System.in);
//                double number , Ft;
//                System.out.println("nhập số m");
//                number = input.nextDouble();
//                Ft = number * 3.2808;
//                System.out.println("Ft = " + Ft );
//            }
    // bài 10
    public static void main(String[]args){
        System.out.println("nập số cạnh");
        Scanner input = new Scanner(System.in);
        int number , S;
        System.out.println("đọ dài của cạnh");
        number = input.nextInt();
        S = number * number;
        System.out.println("diện tích hình vuông là " + S);
    }

    }


//    Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
//    Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện
//    vào học lớp 10.
//    Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho
//    người dùng biết số đó là lớn hay nhỏ hơn 0
//    Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
//    Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra,
//    điểm thi giữa kỳ, điểm thi cuối kỳ
//    Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
//    Bài 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho
//    Bài 8: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
//    Bài 9: Chuyển từ mét sang feet: ft =m * 3.2808
//    Bài 10: Tính diện tích hình vuông khi biết cạnh a.
