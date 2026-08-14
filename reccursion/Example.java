class Example {
    static int recurse(int n) {
        if(n == 0) return 1;

        return recurse(n-1);
    }

    public static void main(String[] args) {
        System.out.println(recurse(10));
    }
}