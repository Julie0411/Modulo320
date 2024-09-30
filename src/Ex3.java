public class Ex3 {

    public static void main (String[] args) {

        int[] list = new int[10];
        list = createArray(list);
        printArray(list);
        System.out.println();
        list = shuffleArray(list);
        printArray(list);
        System.out.println();
        list = createCasualArray(list, 1000);
        printArray(list);

    }

    public static int[] createCasualArray(int[] arr, int max) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * max);
        }

        return arr;

    }

    public static int[] createArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        return arr;

    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] shuffleArray(int[] arr) {

        for (int i = 0; i < 100; i++) {
            int random = Math.round((int) (Math.random() * (arr.length)));
            int random1 = Math.round((int) (Math.random() * (arr.length)));
            int temp = arr[random];
            arr[random] = arr[random1];
            arr[random1] = temp;
        }

        return arr;

    }

}