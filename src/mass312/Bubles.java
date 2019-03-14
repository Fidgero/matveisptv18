
package mass312;

import java.util.Arrays;

public class Bubles {
    
    public static void main(String[] args) {
        int[] num={11,3,14,16,7};
        System.out.println("Исход "+Arrays.toString(num));
        System.out.println();
        boolean bool=false;
        int buf;
        while(!bool){
            bool = true;
            for(int i=0; i < num.length - 1; i++){
                if(num[i]>num[i+1]){
                    bool = false;
                    buf = num[i];
                    num[i]=num[i+1];
                    num[i+1]=buf;
                }
                System.out.println("Виток "+Arrays.toString(num)+" - "+i);
            }
            System.out.println(Arrays.toString(num));
            System.out.println();
        }
        System.out.println("Ответ "+Arrays.toString(num));
    }
    
}
