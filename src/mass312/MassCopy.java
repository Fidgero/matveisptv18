
package mass312;

public class MassCopy {
    public static void main(String[] args) {
        int[] mass={5,6,1,7,2};
        int[] massCopy=mass;
        massCopy[2]=10;
        System.out.println("mass[2]=" + mass[2] + " massCopy[2]=" + massCopy[2]);
        int[] massCopy1 = new int[mass.length];
        System.arraycopy(mass, 0, massCopy1, 0, mass.length);
        massCopy1[2] = 100;
        System.out.println("mass[2]=" + mass[2] + " massCopy1[2]=" + massCopy1[2]);
    }
}
