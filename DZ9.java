import java.util.Arrays;
import java.util.Scanner;

public class DZ9 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Введите целое число: ");
        DZ9 obj = new DZ9();

        int makeSquare = scan.nextInt();
        System.out.print("Квадрат числа " + makeSquare + " равен " + obj.makeSquare(makeSquare));

        System.out.print("\n2. Введите радиус цилиндра: ");
        double r = scan.nextDouble();
        System.out.print("Введите высоту цилиндра: ");
        double h = scan.nextByte();
        scan.nextLine();

        System.out.println("Обьём цилиндра с радиусом " + r + " и высотой " + h + " равен: " + obj.getCylinderVolume(r,h));

        int[] mass = {10,20,30,40,50};
        System.out.println("3. Массив чисел: " + Arrays.toString(mass));
        System.out.println("Сумма всех элементов массива равна: " + obj.getMassSum(mass));


        System.out.print("4.Введите ряд слов: " );
        String kk = scan.nextLine();
        System.out.println("Ряд слов в обратном порядке: " + obj.getReverse(kk) );

        System.out.print("5. Введите число a: ");
        int a = scan.nextInt();
        System.out.print("Введите число b: " );
        int b = scan.nextInt();
        System.out.println("Результат " + a + "^" + b + " равен: " + obj.getDegree(a,b));

        System.out.print("6. Введите целое число n: ");
        int c = scan.nextInt();
        System.out.print("Введите текст: ");
        String ck = scan.nextLine();
        ck = scan.nextLine();

        System.out.println(obj.getLine(c,ck));


    }

    public int makeSquare(int a){
        a *= a;
        return a;
    }

    public double getCylinderVolume(double r, double h){
        return Math.PI * r * r * h;
    }

    public int getMassSum(int[] mass){
        int sum = 0;
        for (int k : mass) {
            sum += k;
        }
        return sum;
    }

    public String getReverse(String s){
        StringBuilder c = new StringBuilder(s);
        c.reverse();
        return c.toString();
    }

    public int getDegree(int a, int b){
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        return res;
    }

    public String getLine(int c, String ck){

        String res = "";
        for (int i = 0; i < c; i++) {
            res += ck + "\n";
        }
        return res;
    }


}
