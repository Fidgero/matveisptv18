
package mass312;

public class Stroka1 {
    
    public static void main(String[] args) {
        char[] chars={'Г', 'р', 'у', 'п', 'п', 'а', ' ', 'S', 'P', 'T', 'V', '1', '8'};
        String s0="Строки";
        System.out.println("Строка s0 до copyValueOf: "+s0);
        s0=s0.copyValueOf(chars);
        System.out.println("Строка s0 после copyValueOf "+s0);
        System.out.println();
        String s1=s0.copyValueOf(chars);
        String s2=s0.copyValueOf(chars, 2, 7);
        System.out.println("Строка без смешения: "+s1);
        System.out.println("Строка со смешением в 2 и длиной 7: "+s2);
    }
}
