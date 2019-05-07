
package scheme;

import java.util.Scanner;

public class scheme3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Овсянку? (1 - Да, 2 - Нет)");
        switch (scn.nextInt()) {
            case 2:
                System.out.println("Яичницу? (3 - Да, 4 - Нет)");
                break;
            case 1:
                System.out.println("Взять чашку молока, молоко и овсянку");
                System.exit(1);
                break;
                default:
                    System.out.println("Введите то число которое вам задали");
        }
        Scanner scan=new Scanner(System.in);
            switch (scan.nextInt()) {
            case 3:
                System.out.println("Готовим яичницу, Завтракаем.");
                break;
            case 4:
                System.out.println("Взять чашку молока, молоко и овсянку");
                break;
    }   
}
}