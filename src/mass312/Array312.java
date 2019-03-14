
package mass312;
import java.util.Arrays;
public class Array312 {
    
    public static void main(String[] args) {
        int[] num = new int[10];
        Arrays.fill(num,5);
        Arrays.fill(num, 0, 4, 25);
        System.out.println(Arrays.toString(num));
        int[]numCoppy=Arrays.copyOf(num,num.length);
        Arrays.sort(numCoppy);
        System.out.println("soting: " + Arrays.toString(numCoppy));
        System.out.println("Равен ли массив 'num' массиву 'numCoppy'? " + Arrays.equals(num, numCoppy));
    }
}
