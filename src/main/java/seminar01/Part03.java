package seminar01;
/*
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
*/

public class Part03 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;

        int lastPosition = nums.length-1;

        for (int i = 0; i < nums.length && i < lastPosition; i++){
            if (nums[i] == val){
                boolean lastPositionNotEqualsVal = false;
                while (!lastPositionNotEqualsVal){
                    if (nums[lastPosition] == val){
                        lastPosition--;
                    }else{
                        lastPositionNotEqualsVal = true;
                    }
                }

                int bufer = nums[i];
                nums[i] = nums[lastPosition];
                nums[lastPosition] = bufer;

                lastPosition--;
            }
        }
        for (int i : nums){
            System.out.print(i + " ");
        }
    }
}
