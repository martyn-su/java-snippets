
// A snippet that demonstrates using an integer array as a return type of a method and a parameter to a method
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        ArrMeth am = new ArrMeth();

        int[] arr2 = {155,77,88,99,523};
        am.firstElement(arr2);

        int[] arrReturned = am.returnArray();
        System.out.println("The first array looks something like this: "+Arrays.toString(arrReturned));
    }
}


 class ArrMeth {
    public void firstElement(int[] x){
        System.out.println("The first item in the Array 2 is: "+x[0]);
    }

    public int[] returnArray(){
        int[] rA = new int[4];
        for(int i =1; i<rA.length; i++){
            rA[i]=i*5;
        }
        return rA;
    }
 }