public class Factorial {

    /**
     * finds factorial for all positive integers
     *
     * @param i - input int
     * @return long factorial value
     */
    public long findFactorial(int i) {
        if (i <= 1) return 1;
        else return (i * findFactorial(i - 1));
    }
}
