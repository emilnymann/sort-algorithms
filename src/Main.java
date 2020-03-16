import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static ArrayList<Integer> data = new ArrayList<>(10);

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int rnd = ThreadLocalRandom.current().nextInt(0, 100 + 1);
            data.add(rnd);
        }

        System.out.println("Unsorted data:");
        System.out.println(data);
        bubbleSort();
        System.out.println("Sorted data with bubble sort:");
        System.out.println(data);

    }

    static void bubbleSort() {
        int sortMin = 0;

        for (int i = data.size() - 1; i >= sortMin; i--) {

            if (i == sortMin) {
                System.out.println("Reached minimum, marking as sorted and starting over.");
                sortMin++;
                i = data.size();
                continue;
            }

            if (data.get(i) < data.get(i - 1)) {
                System.out.println(data.get(i) + " is smaller than " + data.get(i - 1) + "... Swapping.");
                int temp = data.get(i);
                data.set(i, data.get(i - 1));
                data.set(i - 1, temp);
            } else {
                System.out.println(data.get(i) + " is larger than " + data.get(i - 1) + "... Moving on.");
            }
        }
    }
}
