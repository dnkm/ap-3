class warmup {
    public static void main(String[] args) {
        int ar[] = { 0, 1, 2, 3, 0, 0, 1, 2 };
        print(spreadZero(ar));
    }

    public static void print(int[] ar) {
        for (int value : ar) {
            System.out.print(value + " , ");
        }
        System.out.println();
    }

    // [1,2,3,4] --> [1,2,3,4]
    public static int[] clone(int[] ar) {
        int[] clone = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {
            clone[i] = ar[i];
        }

        return clone;
    }

    // [1,2,3,4] --> [1, 3]
    public static int[] filterEven(int[] ar) {
        int count = 0;

        for (int value : ar) {
            if (value % 2 != 0)
                count++;
        }

        int[] clone = new int[count];
        int nextIndex = 0;

        for (int value : ar) {
            if (value % 2 != 0) {
                clone[nextIndex] = value;
                nextIndex++;
            }
        }

        return clone;
    }

    // in [0, 1, 2, 3, 0, 0, 1, 2]
    // out [0, 0, 2, 0, 0, 0, 0, 2]
    public static int[] spreadZero(int[] ar) {
        // option 1
        for (int i = 1; i < ar.length - 1; i++) {

        }

        // options2
        for (int i = 0; i < ar.length; i++) {
            if (i==0) {

            }
            else if (i==ar.length-1){

            }
            else {

            }
        }

        return null;
    }
}