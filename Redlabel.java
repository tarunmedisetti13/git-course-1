class Redlabel {
    static int pos = -1;

    public static void main(String[] args) {
        System.out.println("Sample program");
    }

    static void add(int ele) {
        int[] arr = new int[5];
        if (pos == arr.length - 1) {
            System.exit(0);
        }
        arr[++pos] = ele;
    }
}