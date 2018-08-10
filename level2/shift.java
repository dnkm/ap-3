class shift {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5 };
        print(ar);

        ar = doShift2(ar, 2);
        print(ar);
    }

    public static void doShift(int[] ar) {
        int last = ar[ar.length - 1];

        for (int i = ar.length - 2; i >= 0; i--)
            ar[i + 1] = ar[i];

        ar[0] = last;
    }

    public static int[] doShift2(int[] ar, int n) {
        int[] clone = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {
            clone[ (i+n) % ar.length ] = ar[i];
        }

        return clone;
    }

    public static void print(int[] ar) {
        System.out.print("[ ");
        for (int val : ar) {
            System.out.print(val + ", ");
        }
        System.out.println("]");
    }
}