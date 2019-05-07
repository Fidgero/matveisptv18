
package scheme;

public class scheme1 {
    
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 6;
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
        do{
            x++;
        } while (x<60);
        System.out.print("x=" + x + ", ");
        do{
            y++;
        } while (y<60);
        System.out.print("y=" + y + ", ");
        do{
            z++;
        } while (z<60);
        System.out.println("z=" + z);
        int i = 0;
        i=(x+y)/z;
        System.out.println("Твоя оценка за год " + i);
    }
}
