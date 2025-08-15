package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        System.out.println(first > second && first > third ? first : second > first && second > third ? second : third > first && third > second ? third : first);



        /*if (first > second && first > third){
            System.out.println(first);
        } else if (second > first && second > third) {
            System.out.println(second);
        } else if (third > first && third > second) {
            System.out.println(third);
        }*/
    }
}
