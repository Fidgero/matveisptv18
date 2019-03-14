
package mass312;

public class Stroka2 {
    
    public static void main(String[] args) {
        String slovo=new String("java");
        String txt="Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";
        String[]words=txt.split("\\W+");
        System.out.printf("Слов в тексте = %d%n", words.length);
        for(String w: words){
            System.out.print(w+"; ");
        }
        System.out.println("\n---------------------");
        System.out.printf("Используем equelsIgnoreCase(%s,%s)=%s%n", slovo, words[0], slovo.equalsIgnoreCase(words[0]));
        System.out.printf("Используем compareTo(%s,%s)=%s%n", slovo, words[0], slovo.compareTo(words[0]));
    }
}
