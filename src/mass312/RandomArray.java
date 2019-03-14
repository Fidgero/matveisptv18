
package mass312;

import java.util.Random;

public class RandomArray {
    
    public static void main(String[] args) {
        
        Random rnd=new Random();
        int[] array2=new int[10];
        for(int i=0; i<array2.length; i++){
            array2[i]=rnd.nextInt(100)+1;
            System.out.printf(array2[i]+" ");
        }
        System.out.println();
        int max=array2[1];
        for(int i=0; i<array2.length; i++){
            if(array2[i]>max){
                max=array2[i];
            }
        }
        System.out.println("Max "+max);
    }
}
