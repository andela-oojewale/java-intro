package helloworld;
import java.util.Arrays;


public class ReversedArray {

    public static int[] reverse(int[] list) {
        int l = list.length -1;
        for (int i = 0; i < l; i++, l--){
            int temp = list[i];
            list[i] = list[l];
            list[l] = temp;
        }
        return list;
    }

    public static void main(String[] args) {
        int [] myList = reverse(new int[] {1,2,3,4,5});
        System.out.println(Arrays.toString(myList));
    }
}
