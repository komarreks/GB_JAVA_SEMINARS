package seminar01;

public class Part02 {
    public static void main(String[] args) {
        int max = 0;
        int[] bynaryArray = genBynaryArray();
        int countOnes = 0;

        for (int i : bynaryArray){
            if (i == 1){
                countOnes++;
                if (countOnes > max){max = countOnes;}
            }else {
                countOnes = 0;
            }
        }

        System.out.println("Максимальное количество подряд идущих единиц: " + max);
    }

    public static int[] genBynaryArray(){
        return new int[]{0,1,1,1,0,0,1,1,1,1,0,1};
    }
}
