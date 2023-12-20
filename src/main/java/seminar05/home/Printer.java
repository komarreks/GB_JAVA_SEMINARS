package seminar05.home;

import java.util.Arrays;
import java.util.TreeMap;

class HeapSort {
    private static TreeMap<Integer, Integer> heapTree = new TreeMap<>();
    public static void buildTree(int[] tree, int sortLength) {
        for (int item: tree){
            if (heapTree.containsKey(item)){
                heapTree.put(item, heapTree.get(item)+1);
            }else {
                heapTree.put(item,1);
            }
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        buildTree(sortArray, sortLength);
        int index = 0;
        for (int key : heapTree.keySet()){
            int value = heapTree.get(key);

            for (int i = 1; i <= value; i++) {
                sortArray[index] = key;
                index++;
            }
        }
    }
}

// Не удаляйте и не меняйте метод Main!
public class Printer {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}