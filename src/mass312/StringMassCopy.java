
package mass312;

public class StringMassCopy {
    
    public static void main(String[] args) {
        String[] strMass={" 1 "," 2 "," 3 "," 4 "," 5 "};
        String[] strMassCopy = strMass;
        for(int i = 0; i < strMass.length; i++){
            System.out.print(strMass[i]);   
        }
        System.out.println();
        strMassCopy[2]= " Три ";
        System.out.println("strMass[2]=" + strMass[2] + " strMassCopy[2]=" + strMassCopy[2]);
        for(int i = 0; i < strMass.length; i++){
            System.out.print(strMassCopy[i]);   
        }
        System.out.println();
        String[] strMassCopy1 = new String[strMass.length];
        System.arraycopy(strMass, 0, strMassCopy1, 0, strMass.length);
        strMassCopy1[2] = " ТРИ ";
        System.out.println("strMass[2]=" + strMass[2] + " strMassCopy1[2]=" + strMassCopy1[2]);
    }
}
