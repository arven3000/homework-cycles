package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {

        /*Task 1*/
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (i = 10; i > 0; --i) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        /*Task 2*/
        int friday = 3;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        System.out.println();

        /*Task 3*/
        int currentYear = 2022;
        int after100Years = currentYear + 100;
        int before200Years = currentYear - 200;
        for (int j = 0; j < after100Years; j += 79) {
            if (j < before200Years) {
                continue;
            }
            System.out.println(j);
        }
    }
}
