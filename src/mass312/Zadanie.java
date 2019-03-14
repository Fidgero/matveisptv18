
package mass312;

import java.awt.PageAttributes;

public class Zadanie {
    
    public static void main(String[] args) {
        String txt="cъешь ещё этих фпанцузких булок и галет, да выпей же чаю с молоком, как и я.";
        String[] s={"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
        char[] result=txt.toCharArray();
        for(int i=0; i<result.length; i++)
            System.out.print("Элимент ["+i+"]:"+result[i]);
        //System.out.println("\n"+txt.compareTo(s[0]));
    }
}

