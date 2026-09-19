//подключаем библиотеки для ввода и вывода данных с клавиатуры
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //объявляем объект класса Scanner для ввода данных
        Scanner in = new Scanner(System.in);
        //объявляем объект класса PrintStream для вывода данных
        PrintStream out = System.out;

        //вводим с клавиатуры значение X - расстояние между домино
        int X = in.nextInt();
        //n - счётчик упавших домино
        int n = 0;

        //задаем флаговую переменную f логическим типом данных boolean
        //если условие хоть один раз нарушится (f = false), то перестаем увеличивать n
        boolean f = true;

        //задаем цикл от 0 до 4, чтобы 5 раз ввести переменные,
        //на 1 шаге i = 0 и так далее до 4 включительно
        for (int i = 0; i<5; i+=1){
            int dom = in.nextInt();
            if (dom>=X && f){
                n+=1;
            }else{
                f = false;
            }
        }
        //выводим кол-во упавших домино
        out.println(n);
    }
}
