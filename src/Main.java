import java.util.Scanner;

public class Main {

    public static void t1(int a, int b) {
         /*
            1.2.14. Напишите программу, которая получает два положительных числа в аргументах
            командной строки и выводит tr u e , если одно из этих чисел нацело делится
            на другое.
        */
        boolean bol = ( a % b == 0);
        System.out.println(bol);
    }
    public static void t2(int a, int b, int c) {
        /*
            1.2.15. Напишите программу, которая получает три положительных числа в аргументах командной строки и выводит f a ls e , если одно из них больше или равно
            сумме других, или t r u e в противном случае. (Примечание: программа проверяет,
            могут ли числа представлять длины сторон некоторого треугольника.)
         */
        boolean bol = (a > b + c || b > a + c || c > a + b);
        System.out.println(bol);
    }

    public static void t3(int a, int b, int c) {
        /*
        1.3.1. Напишите программу, которая получает три целых числа как аргументы
            командной строки и выводит сообщение " e q u a l" , если все три числа равны, или
            "n o t e q u a l" в противном случае.
         */
        if(a == b && b == c && a == c){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    public static void t4(double a, double b) {
        /*
            1.3.4. Напишите фрагмент кода, который выводит сообщение " t r u e ",
            если переменные х и у типа d o u b le лежат строго в диапазоне
             от 0 до 1, или " f a ls e " в противном случае.
        */
        if(a <= 1.0 && a >= 0.0 && b <= 1.0 && b >= 0.0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static void t5() {
        /*
            1.3.9. Напишите программу с одним циклом f o r и одной командой i f ,
            которая выводит целые числа от 1000 до 2000, по 5 чисел на строку. Подсказка: используйте
            оператор %
        */
        for(int i=1000; i<=2000;i++) {
            if (i % 10 == 5) {
                System.out.println(i + " ");

            } else {
                System.out.print(i + " ");
            }
        }
    }
    public static void t6(int i) {
        /*
            1.3.16. Напишите программу, которая получает целое число п как аргумент
            командной строки и выводит все положительные степени 2, меньшие или равные п.
            Убедитесь в том, что ваша программа правильно работает для всех значений п.
        */
        int pow = 2;
        do{
            System.out.println(pow + " ");
            pow +=pow;
        } while(pow<=i);
        System.out.println("end");
    }
    public static void t7(long k) {
        /*
         Напишите программу PowersOf К, которая получает целое число к как
        аргумент командной строки и выводит все положительные степени к из типа данных
        1.3. Условные переходы и циклы 103
        Java long. Примечание: наибольшее значение типа long задается константой Long.
        MAX_VALUE.
        */
        long res = 1;
        System.out.println(k);
        while(true){
            if(res > Long.MAX_VALUE / k){
                break;
            }
            res *=k;
            System.out.println(res);
        }
    }

    public static void t8(int count) {
        /*
             1.4.4. Напишите фрагмент кода, который переставляет в обратном порядке значения
             в одномерном строковом массиве. Не создавайте другой массив для хранения
             результатов. Подсказка: воспользуйтесь кодом, приведенным в тексте,
             для перестановки значений двух элементов.
     */
        int[] numbers = new int[count];
        int l = numbers.length - 1;
        int c = 0;
        for(int i = 0; i < count; i++){
            numbers[i] = i;
            if(i==(count-1)){
                System.out.println(numbers[i]);
            }else{
                System.out.print(numbers[i]);
            }
        }
        while(c < l){
            int temp = numbers[c];
            numbers[c]= numbers[l];
            numbers[l] = temp;
            l--;
            c++;
        }
        for(int i = 0; i < count; i++){
            System.out.print(numbers[i]);

        }
    }
    public static int max3(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static double max3(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void t9() {
        /*
            2.1.1. Напишите статический метод тахЗ(), который получает три аргумента типа
            int и возвращает значение наибольшего из них. Добавьте перегруженную функцию,
            которая делает то же самое для трех значений double.
        */
        int tr1 = max3(5, 9, 8);
        System.out.println(tr1);
        double tr2 = max3(3.1, 5.4, 1.2);
        System.out.println(tr2);
    }

    public static boolean eq (int a){
        return a % 2 != 0;
    }
    public static void t10() {
        int a = 2;
        boolean res = eq(a);
        System.out.println(res); //false
    }
    public static boolean eq1 (int[] n1, int[] n2){
        if (n1.length != n2.length){
            return false;
        }
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] != n2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void t11() {
        /*
            Напишите статический метод e q (), который получает в аргументах два
            массива с элементами in t. Метод должен возвращать tru e , если массивы имеют
            одинаковую длину, а все соответствующие пары элементов равны, или fa ls e в противном случае.
     */
        int[] n1 = {1, 2, 3};
        int[] n2 = {1, 2, 3, 4};
        boolean res = eq1(n1, n2);
        System.out.println(res);
    }
    public static boolean eq2 (double a, double b, double c){
        if (a > b + c || b > a + c || c > a + b){
            return false;
        }
        return true;
    }

    public static void t12() {
        /*
            Напишите статический метод a re T ria n g u la r(), который получает три аргумента
            типа double и возвращает true, если они могут быть сторонами треугольника
            (то есть ни одно из значений не больше суммы двух других). См. упражнение 1.2.15.
     */
        double a = 4.2;
        double b = 3.2;
        double c = 2.2;
        boolean res = eq2(a, b ,c);
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();
        switch (task){
            case 1:
                System.out.println("Введите 2 числа");
                t1(scanner.nextInt(), scanner.nextInt());
                break;
            case 2:
                System.out.println("Введите 3 числа");
                t2(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                break;
            case 3:
                System.out.println("Введите 3 числа");
                t3(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                break;
            case 4:
                System.out.println("Введите 2 числа");
                t4(scanner.nextDouble(), scanner.nextDouble());
                break;
            case 5:
                t5();
                break;
            case 6:
                System.out.println("Введите 1 число");
                t6(scanner.nextInt());
                break;
            case 7:
                System.out.println("Введите 1 число");
                t7(scanner.nextLong());
                break;
            case 8:
                System.out.println("Введите 1 число");
                t8(scanner.nextInt());
                break;
            case 9:
                t9();
                break;
            case 10:
                t10();
                break;
            case 11:
                t11();
                break;
            case 12:
                t12();
                break;


        }
    }
}