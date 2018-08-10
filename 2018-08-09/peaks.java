class peaks {
    public static void main(String[] args) {
        // System.out.println(countPeaks(new int[] {1, 0, 2, 0, 3, 0, 4}));
        // System.out.println("----------------");
        // System.out.println(countPeaks(new int[] {1, 1, 1, 3, 1, 1, 1}));

        System.out.println(tallestPeaks(new int[] { 3, 0, 6, 4, 5, 1 }));
    }

    public static int countPeaks(int[] ar) {
        int peaks = 0;

        for (int i = 1; i < ar.length - 1; i++) {
            if (ar[i] > ar[i - 1] && ar[i] > ar[i + 1]) {
                peaks++;
                System.out.println("DEBUG " + ar[i]);
            }
        }

        if (ar[0] > ar[1])
            peaks++;
        if (ar[ar.length - 1] > ar[ar.length - 2])
            peaks++;

        return peaks;
    }

    public static int tallestPeaks2(int[] ar) {
        int max = 0;

        for (int i = 0; i < ar.length; i++) {
            int h1 = -999;
            int h2 = -999;

            if (i == 0) {
                h1 = 1000;
            } else {
                h1 = ar[i] - ar[i - 1];
            }

            if (i == ar.length - 1) {
                h2 = 1000;
            } else {
                h2 = ar[i] - ar[i + 1];
            }

            if (h1 <= 0 || h2 <= 0) {
                // not a peak
                continue;
            }

            int height = Math.min(h1, h2);
            System.out.println(height + " @ " + ar[i]);

            if (height > max) {
                max = height;
            }

        }

        return max;
    }

    public static int tallestPeaks(int[] ar) {
        int max = 0;

        for (int i = 0; i < ar.length; i++) {
            if (i == 0) {
                if (ar[i] > ar[i + 1]) {
                    int height = ar[i] - ar[i + 1];
                    if (height > max)
                        max = height;
                }
            } else if (i == ar.length - 1) {
                if (ar[i] > ar[i - 1]) {
                    int height = ar[i] - ar[i - 1];
                    if (height > max)
                        max = height;
                }
            } else {
                if (ar[i] > ar[i + 1] && ar[i] > ar[i - 1]) {
                    int height1 = ar[i] - ar[i + 1];
                    int height2 = ar[i] - ar[i - 1];

                    int height;
                    if (height1 > height2) {
                        height = height2;
                    } else {
                        height = height1;
                    }

                    if (height > max)
                        max = height;
                }
            }
        }

        return max;
    }
}