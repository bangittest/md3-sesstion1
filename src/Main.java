//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//       Scanner scanner=new Scanner(System.in);
//        System.out.println("moiw ban nhap ten");
//        String name =scanner.nextLine();
//        System.out.println("hello:"+name);
//
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int a=10;
//        int b=5;
//        double c=a+b;
//        System.out.println(a+"+"+b+"="+c);
//    }
//}


//public  class Main {
//    public static void main(String[] args) {
//        int[] numbers=new  int[100];
//        numbers[0]=1;
//        numbers[1]=2;
//        numbers[2]=3;
//        int thirdElement=numbers[2];
//        System.out.println(thirdElement);
//
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        int number=6;
//        if (number % 2==0 && number%3==0){
//            System.out.println(number+"neu chia het cho 2 va 3");
//        }
//    }
//}



//import java.util.Scanner;
//
//public  class Main {
//    public static void main(String[] args) {
//        int rate=23000;
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("nhap so tien muon doi");
//        double usd =scanner.nextDouble();
//        double vnd =usd*rate;
//        System.out.println(vnd);
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("nhap so ban muon nhap");
//        int number=scanner.nextInt();
//        switch (number){
//            case 10:
//                System.out.println("so muoi");
//                break;
//            case 11:
//                System.out.println("so muoi mot");
//                break;
//            case 12:
//                System.out.println("so muoi hai");
//                break;
//            case 13:
//                System.out.println("so muoi ba");
//                break;
//            case 14:
//                System.out.println("so muoi bon");
//                break;
//            case 15:
//                System.out.println("so muoi nam");
//                break;
//            case 16:
//                System.out.println("so muoi sau");
//                break;
//            case 17:
//                System.out.println("so muoi bay");
//                break;
//            case 18:
//                System.out.println("so muoi tam");
//                break;
//            case 19:
//                System.out.println("so muoi chin");
//                break;
//            case 20:
//                System.out.println("so hai muoi");
//                break;
//            default:
//                System.out.println("qua pham vi");
//                break;
//
//        }
//    }
//}


//bt4

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("nhap so a");
//        int a=scanner.nextInt();
//        System.out.println("nhap so b");
//        int b=scanner.nextInt();
//        ChuViDientich(a,b);
//
//    }
//
//    public static void ChuViDientich(double a,double b){
//    if (a>=0&&b>=0){
//        System.out.println("chu vi:"+(a+b)*2);
//        System.out.println("dien tich:"+(a*b));
//    }
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("nhap diem mon Toan");
//        double a=scanner.nextDouble();
//        System.out.println("nhap diem mon Ly");
//        double b=scanner.nextDouble();
//        System.out.println("nhap diem mon hoa");
//        double c=scanner.nextDouble();
//        System.out.println("nhao diem mon van");
//        double d=scanner.nextDouble();
//        double trungbinh=(a+b+c+d)/4;
//        Xeploai(trungbinh);
//    }
//
//    public static void Xeploai(double a) {
//        if (a <5){
//            System.out.println("xep loai yeu");
//        } else if (a<6.5) {
//            System.out.println("xep loai trung binh");
//
//        } else if (a<8) {
//            System.out.println("xep loai kha");
//        } else if (a<9) {
//            System.out.println("Xep loai gioi");
//        } else {
//            System.out.println("xuat xac");
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int number=6;
//        if (number % 2==0 && number%3==0){
//            System.out.println(number+"neu chia het cho 2 va 3");
//        }
//    }
//}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so can kiem tra");
        int a=scanner.nextInt();
        number(a);
    }

    public static void number (int a) {
        if (a%3==0 &&a %5==0){
            System.out.println("chia het cho ca 3 va 5");
        } else if (a%3==0) {
            System.out.println("chia het cho 3");
        } else if (a%5==0) {
            System.out.println("chia het cho 5");
        }else {
            System.out.println("khong chia het cho ca 3 va 5");
        }
    }
}






