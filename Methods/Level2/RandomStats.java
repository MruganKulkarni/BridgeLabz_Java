package Methods.Level2;

class P13_RandomStats {

    public static int generateRandom(int min, int max) {

        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static double calculateAverage(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static int findMin(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generateRandom(10, 99);
        }

        System.out.println("Average = " + calculateAverage(numbers));
        System.out.println("Minimum = " + findMin(numbers));
        System.out.println("Maximum = " + findMax(numbers));
    }
}
