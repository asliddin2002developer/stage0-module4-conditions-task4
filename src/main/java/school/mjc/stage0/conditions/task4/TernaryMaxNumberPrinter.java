package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maxNumber = first >= second ? first : second;
        maxNumber = maxNumber >= third ? maxNumber : third;
        System.out.println(maxNumber);
    }
}
