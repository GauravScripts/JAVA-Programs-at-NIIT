class FactOFN {
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fact(--num);
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

}