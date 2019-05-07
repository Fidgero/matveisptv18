
package scheme;

import java.util.Scanner;

public class scheme2 {
    
    public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
        System.out.println("Выберите жанр (1 - МмоРпг, 2 - Шутер, 3 - Стратегия");
        switch (scn.nextInt()){
            case (1):
                System.out.println("World of WarCraft, Neverwinter, Black Desert");
                break;
            case (2):
                System.out.println("Counter-Strike Global Offensive, Warface, Warframe");
                break;
            case (3):
                System.out.println("Dota 2, Albion Online, Cossacks");
                break;
            default:
                System.out.println("Вы допустили ошибку перезапустите программу и попробуйте снова");
                break;
        }
            
    }
}
