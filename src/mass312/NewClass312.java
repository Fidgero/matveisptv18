
package mass312;

public class NewClass312 {
    
    public static void main(String[] args) {
        int[] array2=new int[10];
        array2[0]=1;
        array2[1]=2;
        array2[2]=3;
        array2[3]=4;
        array2[4]=5;
        array2[5]=6;
        array2[6]=7;
        array2[7]=8;
        array2[8]=9;
        array2[9]=10;
        int sum=0;
        for(int i=0; i<array2.length; i++){
            sum+=array2[i];
        }
        for(int i=0; i<array2.length; i++){
            System.out.println(array2[i]);
        }
        System.out.println("Sum "+sum);
    }
}
