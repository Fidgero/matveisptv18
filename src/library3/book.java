
package library3;

public class book {
    
    private String[] book={"Головоломка", "Анна Каренина", "Грозовой перевал", "Властелин Колец", "Волкодав"};

    public String[] getBook() {
        return book;
    }

    public void setBook(String[] book) {
        this.book = book;
    }
    
    private String[] ID={"10122", "88327", "64044", "21119", "36900"}; 

    public String[] getID() {
        return ID;
    }

    public void setID(String[] ID) {
        this.ID = ID;
    }
    
    private String[] author={"Франк Тилье", "Лев Николаевич Толстой", "Эмилия Бронте", "Джон Толкин", "Мария Семёнова"}; 

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }
    
    private String[] genre={"Фентези", "Драма", "Роман", "Триллер"};

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }
    
}
