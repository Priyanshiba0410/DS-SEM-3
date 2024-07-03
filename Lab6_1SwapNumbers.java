class Lab6_1SwapNumbers {
    static void swapValuesWithoutUsingThirdVariable(int m, int n) {
        m = m - n;
        n = m + n;
        m = n - m;
        System.out.println("Swapped values: m = " + m + ", n = " + n);
    }
    public static void main(String[] args) {
        int m = 9, n = 5;
        swapValuesWithoutUsingThirdVariable(m, n);
    }
}

