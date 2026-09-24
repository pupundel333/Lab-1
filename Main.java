//подключаем библиотеки для ввода и вывода данных с клавиатуры
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //объявляем объект класса Scanner для ввода данных
        Scanner in = new Scanner(System.in);
        //объявляем объект класса PrintStream для вывода данных, чтобы не писать каждый раз System.out
        PrintStream out = System.out;

        //вводим с клавиатуры значение X - расстояние между домино
        int X = in.nextInt();

        //длина первой домино("текущей")
        int currentDom = in.nextInt();

        //задаем флаговую переменную areAllPreviousFallen логическим типом данных boolean
        //если условие хоть один раз нарушится (areAllPreviousFallen = false), то перестаем увеличивать n
        boolean areAllPreviousFallen = true;

        //n - счётчик упавших домино, изначально = 1,
        // т.к первая домино в любом случае падает
        int n = 1;

        //задаем цикл от 0 до 4, чтобы 4 раз ввести переменные, т.к длину первой домино ввели уже до этого
        //на 1 шаге i = 0 и так далее до 3 включительно, то есть всего 4 повторения
        for (int i = 0; i<4; i+=1){
            int nextDom = in.nextInt();
            //если текущая домино сможет "дотянуться" до следующей, при этом до этого все домино упали,
            //то тогда присваиваем значение следующей домино текущей, и для него уже проверяем дальше
            //пишем areAllPreviousFallen, а не areAllPreviousFallen == true, т.к. условие и так проверится
            if (currentDom>=X && areAllPreviousFallen){
                n+=1;
                currentDom = nextDom;
            }else{
                areAllPreviousFallen = false;
            }
        }
        //выводим кол-во упавших домино
        out.println(n);
    }
}
