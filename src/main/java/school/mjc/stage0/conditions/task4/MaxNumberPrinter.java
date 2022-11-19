package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maxNumber = first >= second ? first : second;
        maxNumber = maxNumber >= third ? maxNumber : third;
    }
}
