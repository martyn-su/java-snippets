
import java.util.Arrays;
import java.util.Random;

public class RandGens {
    public static void main(String[] args) {
        int[] listRan1 = new int[3];
        // add mandatory numbers into a sublist 2, 22, 39
        listRan1[0] = 2;
        listRan1[1] = 22;
        listRan1[2] = 39;

        int[] listRan = new int[7];
        int counter = 1;

        Random rand = new Random();
        int newNum = rand.nextInt(50) + 1;
        for (int j = 0; j < listRan.length && counter < 7; j++) {
            for (int i : listRan) {
                newNum = rand.nextInt(10) + 1;
                if (newNum == listRan[i] || newNum == 2 || newNum == 22 || newNum == 39) {
                    break; // get out of the this loop, number is already in the list
                } else {
                    listRan[i] = newNum;
                    counter = counter + 1; // increase counter as we successfully added a number to the list
                    if (counter == 7) {
                        break;
                    }
                }
                break;
            }
        }
        String combined = (Arrays.toString(listRan1) + Arrays.toString(listRan));
        System.out.println(combined);
    }
}
