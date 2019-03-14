
package mass312;

public class Boolean {
    
    public static void main(String[] args) {
        boolean[] array=new boolean[100];
        for(int i=0; i<array.length; i=i+2){
            array[i]=true;
        }
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
