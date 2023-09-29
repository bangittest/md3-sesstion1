//import java.util.Scanner;
//
//public class hello {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("hay nhap can nang");
//        int weight = scanner.nextInt();
//        // tach cac hang tram, hang chuc, hang don vi
//        int hundred = weight / 100;
//        int rawDec = (weight % 100);
//        int dec = rawDec / 10;
//        int i = weight % 10;
//
//        String hundredStr = "";
//        switch (hundred) {
//            case 1:
//                hundredStr = " one hundred ";
//                break;
//            case 2:
//                hundredStr = " two hundred ";
//                break;
//            case 3:
//                hundredStr = " three hundred ";
//                break;
//            case 4:
//                hundredStr = " four hundred ";
//                break;
//            case 5:
//                hundredStr = " five hundred ";
//                break;
//            case 6:
//                hundredStr = " six hundred ";
//                break;
//            case 7:
//                hundredStr = " seven hundred ";
//                break;
//            case 8:
//                hundredStr = " eight hundred ";
//                break;
//            case 9:
//                hundredStr = " nine hundred ";
//                break;
//            default:
//                break;
//        }
//        String decStr = "";
//        if (rawDec > 10 && rawDec < 20) {
//            switch (rawDec) {
//                case 11:
//                    decStr = "elevent ";
//                    break;
//                case 12:
//                    decStr = "twelve ";
//                    break;
//                case 13:
//                    decStr = "thirteen ";
//                    break;
//                case 14:
//                    decStr = "fouthteen ";
//                    break;
//                case 15:
//                    decStr = "fiveteen ";
//                    break;
//                case 16:
//                    decStr = "sixteen ";
//                    break;
//                case 17:
//                    decStr = "seventeen ";
//                    break;
//                case 18:
//                    decStr = "eightteen ";
//                    break;
//                case 19:
//                    decStr = "nineeen ";
//                    break;
//                default:
//                    break;
//            }
//            System.out.println(" so can nang cua ban la: " + hundredStr + " and " + decStr);
//            System.exit(1);
//        }
//
//        switch (dec) {
//            case 2:
//                decStr = " twenty ";
//                break;
//            case 3:decStr = " thirty ";
//                break;
//            case 4:
//                decStr = " forty ";
//                break;
//            case 5:
//                decStr = " fivety ";
//                break;
//            case 6:
//                decStr = " sixty ";
//                break;
//            case 7:
//                decStr = " seventy ";
//                break;
//            case 8:
//                decStr = " eighty ";
//                break;
//            case 9:
//                decStr = " ninety ";
//                break;
//        }
//
//        String iStr = "";
//        switch (i) {
//            case 1:
//                iStr = "one ";
//                break;
//            case 2:
//                iStr = "two ";
//                break;
//            case 3:
//                iStr = "three ";
//                break;
//            case 4:
//                iStr = "four ";
//                break;
//            case 5:
//                iStr = "five ";
//                break;
//            case 6:
//                iStr = "six ";
//                break;
//            case 7:
//                iStr = "sevent ";
//                break;
//            case 8:
//                iStr = "eight ";
//                break;
//            case 9:
//                iStr = "nine ";
//                break;
//            default:
//                break;
//        }
//        if (rawDec != 0){
//            hundredStr += " and ";
//        }
//        System.out.println(" so can nang cua ban la: " + hundredStr + decStr + iStr);
//    }
// }



import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhap so ban muon doc");
            int number = scanner.nextInt();
            if ((docHangTram(number) != "err") && (docHangChuc(number) != "err") && (docHangDV(number)) != "err") {
                System.out.println(docHangTram(number) + " " + docHangChuc(number) + " " + docHangDV(number));
            } else {
                System.out.println("Nhập sai mời nhập lại");
            }
        }
    }

    public static String docHangDV(int number) {
        int num = number%10;
        switch (num) {
            case 0:return "";
            case 1:
                return "mốt";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "tư";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            default:
                return "err";
        }
    }
    public static String docHangChuc(int number) {
        int num = number%100/10;
        switch (num) {
            case 0:return "";
            case 1:
                return "mười";
            case 2:
                return "hai mươi";
            case 3:
                return "ba mươi";
            case 4:
                return "bốn mươi";
            case 5:
                return "năm mươi";
            case 6:
                return "sáu mươi";
            case 7:
                return "bảy mươi";
            case 8:
                return "tám mươi";
            case 9:
                return "chín mươi";
            default:
                return "err";
        }
    }
    public static String docHangTram(int number) {
        int num = number/100;
        switch (num) {
            case 0:return "";
            case 1:
                return "Một trăm";
            case 2:
                return "hai trăm";
            case 3:
                return "ba trăm";
            case 4:
                return "bốn trăm";
            case 5:
                return "năm trăm";
            case 6:
                return "sáu trăm";
            case 7:
                return "bảy trăm";
            case 8:
                return "tám trăm";
            case 9:
                return "chín trăm";
            default:
                return "err";
        }
    }
}
