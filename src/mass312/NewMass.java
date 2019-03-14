
package mass312;

public class NewMass {
    public static void main(String[] args) {
        String[] s={" Каждый "," Охотник "," Жилает "," Знать "," Где "," Седит "," Фазан "}; 
        for(int i=0; i<s.length; i++){
            System.out.print(s[i]);
        }
        int n=s.length;
        System.out.println(" ");
        String temp;
        for(int i = 0; i < n/2; i++){
            temp = s[n-i-1];
            s[n-i-1] = s[i];
            s[i] = temp;
        }
        for(int i = 0; i < s.length; i++){
            System.out.print(s[i]);
        }
    }
}
