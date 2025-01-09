import java.util.ArrayList;

public class Array_Leaders {

    public static ArrayList<Integer> leaders(int[] arr) {

        ArrayList<Integer> ls = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();
        int rightMostValue = 0;
        int maxValue = 0;
        int key = 0;
        int newKey = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            rightMostValue = arr[i];

            if (rightMostValue >= maxValue) {
                maxValue = rightMostValue;
                key++;
            }

            if (newKey != key) {
                ls.add(maxValue);
                newKey = key;
            }

        }

        for (int i = 0; i < ls.size(); i++) {
            ls2.add(ls.get(ls.size() - i - 1));
        }
        return ls2;
    }

    public static void main(String[] args) {

        int[] arr = {30, 10, 10, 5};
        ArrayList<Integer> ls = leaders(arr);
        System.out.println(ls);
    }
}
