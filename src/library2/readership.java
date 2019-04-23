
package library2;

public class readership {
    
    public static void main(String[] args) {
        book[] bookArray = {new book()};
        book[] authorArray = {new book()};
        book[] genreArray = {new book()};
        reader[] reader1Array = {new reader()};
        
        System.out.println(reader1Array[0].getReader1()[0] + "; " + reader1Array[0].getReader1()[1] + "; " + reader1Array[0].getReader1()[2] + "; " + reader1Array[0].getReader1()[3]);
        System.out.println(reader1Array[0].getReader2()[0] + "; " + reader1Array[0].getReader2()[1] + "; " + reader1Array[0].getReader2()[2] + "; " + reader1Array[0].getReader2()[3]);
        System.out.println(reader1Array[0].getReader3()[0] + "; " + reader1Array[0].getReader3()[1] + "; " + reader1Array[0].getReader3()[2] + "; " + reader1Array[0].getReader3()[3]);
        System.out.println(reader1Array[0].getReader4()[0] + "; " + reader1Array[0].getReader4()[1] + "; " + reader1Array[0].getReader4()[2] + "; " + reader1Array[0].getReader4()[3]);
        System.out.println(reader1Array[0].getReader5()[0] + "; " + reader1Array[0].getReader5()[1] + "; " + reader1Array[0].getReader5()[2] + "; " + reader1Array[0].getReader5()[3]);
        
        System.out.println("");
        
        System.out.println("Книга - " + bookArray[0].getBook()[4] + "; Автор - " + bookArray[0].getAuthor()[4] + "; Жанр - " + bookArray[0].getGenre()[0]);
        System.out.println("Книга - " + bookArray[0].getBook()[1] + "; Автор - " + bookArray[0].getAuthor()[1] + "; Жанр - " + bookArray[0].getGenre()[1]);
        System.out.println("Книга - " + bookArray[0].getBook()[2] + "; Автор - " + bookArray[0].getAuthor()[2] + "; Жанр - " + bookArray[0].getGenre()[2]);
        System.out.println("Книга - " + bookArray[0].getBook()[0] + "; Автор - " + bookArray[0].getAuthor()[0] + "; Жанр - " + bookArray[0].getGenre()[3]);
        System.out.println("Книга - " + bookArray[0].getBook()[3] + "; Автор - " + bookArray[0].getAuthor()[3] + "; Жанр - " + bookArray[0].getGenre()[0]);
        
        System.out.println("");
        System.out.println("Распределение книг по предпочтения читателей");
        System.out.println("");
        
        System.out.println("Книга - " + bookArray[0].getBook()[4] + " -> " + reader1Array[0].getReader2()[0] + "; " + reader1Array[0].getReader4()[0]);
        System.out.println("Книга - " + bookArray[0].getBook()[0] + " -> " + reader1Array[0].getReader1()[0]);
        System.out.println("Книга - " + bookArray[0].getBook()[3] + " -> " + reader1Array[0].getReader4()[0] + "; " + reader1Array[0].getReader2()[0]);
        System.out.println("Книга - " + bookArray[0].getBook()[2] + " -> " + reader1Array[0].getReader5()[0]);
        System.out.println("Книга - " + bookArray[0].getBook()[1] + " -> " + reader1Array[0].getReader3()[0]);
        
    }
}
