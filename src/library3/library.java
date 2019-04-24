
package library3;

import java.util.Scanner;

public class library {
    
    public static void main(String[] args) {
        
        book[] bookArray = {new book()};
        book[] authorArray = {new book()};
        book[] IDArray = {new book()};
        book[] genreArray = {new book()};
        reader[] readerArray = {new reader()};
        worker[] workerArray = {new worker()};
        
        System.out.println("---Работники---");
        System.out.println("Имя - " + workerArray[0].getWorker0()[0] + "; Фамилия - " + workerArray[0].getWorker0()[1] + "; Возраст - " + workerArray[0].getWorker0()[2]
                + "; Пол - " + workerArray[0].getWorker0()[3] + "; ID - " + workerArray[0].getWorker0()[4]);
        System.out.println("Имя - " + workerArray[0].getWorker1()[0] + "; Фамилия - " + workerArray[0].getWorker1()[1] + "; Возраст - " + workerArray[0].getWorker1()[2]
                + "; Пол - " + workerArray[0].getWorker1()[3] + "; ID - " + workerArray[0].getWorker1()[4]);
        System.out.println("Имя - " + workerArray[0].getWorker2()[0] + "; Фамилия - " + workerArray[0].getWorker2()[1] + "; Возраст - " + workerArray[0].getWorker2()[2]
                + "; Пол - " + workerArray[0].getWorker2()[3] + "; ID - " + workerArray[0].getWorker2()[4]);
        System.out.println("Имя - " + workerArray[0].getWorker3()[0] + "; Фамилия - " + workerArray[0].getWorker3()[1] + "; Возраст - " + workerArray[0].getWorker3()[2]
                + "; Пол - " + workerArray[0].getWorker3()[3] + "; ID - " + workerArray[0].getWorker3()[4]);
        System.out.println("Имя - " + workerArray[0].getWorker4()[0] + "; Фамилия - " + workerArray[0].getWorker4()[1] + "; Возраст - " + workerArray[0].getWorker4()[2]
                + "; Пол - " + workerArray[0].getWorker4()[3] + "; ID - " + workerArray[0].getWorker4()[4]);
        
        System.out.println("");
        
        System.out.println("---Книги---");
        System.out.println("Книга - " + bookArray[0].getBook()[0] + "; Автор - " + bookArray[0].getAuthor()[0] + "; ID - " + bookArray[0].getID()[0] + "; Жанр - " + bookArray[0].getGenre()[3]);
        System.out.println("Книга - " + bookArray[0].getBook()[1] + "; Автор - " + bookArray[0].getAuthor()[1] + "; ID - " + bookArray[0].getID()[1] + "; Жанр - " + bookArray[0].getGenre()[1]);
        System.out.println("Книга - " + bookArray[0].getBook()[2] + "; Автор - " + bookArray[0].getAuthor()[2] + "; ID - " + bookArray[0].getID()[2] + "; Жанр - " + bookArray[0].getGenre()[2]);
        System.out.println("Книга - " + bookArray[0].getBook()[3] + "; Автор - " + bookArray[0].getAuthor()[3] + "; ID - " + bookArray[0].getID()[3] + "; Жанр - " + bookArray[0].getGenre()[0]);
        System.out.println("Книга - " + bookArray[0].getBook()[4] + "; Автор - " + bookArray[0].getAuthor()[4] + "; ID - " + bookArray[0].getID()[4] + "; Жанр - " + bookArray[0].getGenre()[0]);

        System.out.println("");
        
        System.out.println("---Читатели---");
        System.out.println("Имя - " + readerArray[0].getReader0()[0] + "; Фамилия - " + readerArray[0].getReader0()[1] + "; Возраст - " + readerArray[0].getReader0()[2]
                + "; Пол - " + readerArray[0].getReader0()[3] + "; ID - " + readerArray[0].getReader0()[4]);
        System.out.println("Имя - " + readerArray[0].getReader1()[0] + "; Фамилия - " + readerArray[0].getReader1()[1] + "; Возраст - " + readerArray[0].getReader1()[2]
                + "; Пол - " + readerArray[0].getReader1()[3] + "; ID - " + readerArray[0].getReader1()[4]);
        System.out.println("Имя - " + readerArray[0].getReader2()[0] + "; Фамилия - " + readerArray[0].getReader2()[1] + "; Возраст - " + readerArray[0].getReader2()[2]
                + "; Пол - " + readerArray[0].getReader2()[3] + "; ID - " + readerArray[0].getReader2()[4]);
        System.out.println("Имя - " + readerArray[0].getReader3()[0] + "; Фамилия - " + readerArray[0].getReader3()[1] + "; Возраст - " + readerArray[0].getReader3()[2]
                + "; Пол - " + readerArray[0].getReader3()[3] + "; ID - " + readerArray[0].getReader3()[4]);
        System.out.println("Имя - " + readerArray[0].getReader4()[0] + "; Фамилия - " + readerArray[0].getReader4()[1] + "; Возраст - " + readerArray[0].getReader4()[2]
                + "; Пол - " + readerArray[0].getReader4()[3] + "; ID - " + readerArray[0].getReader4()[4]);
        
        System.out.println("");
        
        System.out.println(readerArray[0].getReader0()[0] + " " + readerArray[0].getReader0()[1] + "(ID-" + readerArray[0].getReader0()[4] + ") Взял книгу " + bookArray[0].getBook()[0]
                + "(ID-" + bookArray[0].getID()[0] + ") На прокат у " + workerArray[0].getWorker0()[0] + " " + workerArray[0].getWorker0()[1] + "(ID-" + workerArray[0].getWorker0()[4] + ")");
        System.out.println(readerArray[0].getReader1()[0] + " " + readerArray[0].getReader1()[1] + "(ID-" + readerArray[0].getReader1()[4] + ") Взял книгу " + bookArray[0].getBook()[1]
                + "(ID-" + bookArray[0].getID()[1] + ") На прокат у " + workerArray[0].getWorker1()[0] + " " + workerArray[0].getWorker1()[1] + "(ID-" + workerArray[0].getWorker1()[4] + ")");
        System.out.println(readerArray[0].getReader2()[0] + " " + readerArray[0].getReader2()[1] + "(ID-" + readerArray[0].getReader2()[4] + ") Взял книгу " + bookArray[0].getBook()[2]
                + "(ID-" + bookArray[0].getID()[2] + ") На прокат у " + workerArray[0].getWorker2()[0] + " " + workerArray[0].getWorker2()[1] + "(ID-" + workerArray[0].getWorker2()[4] + ")");
        System.out.println(readerArray[0].getReader3()[0] + " " + readerArray[0].getReader3()[1] + "(ID-" + readerArray[0].getReader3()[4] + ") Взял книгу " + bookArray[0].getBook()[3]
                + "(ID-" + bookArray[0].getID()[3] + ") На прокат у " + workerArray[0].getWorker3()[0] + " " + workerArray[0].getWorker3()[1] + "(ID-" + workerArray[0].getWorker3()[4] + ")");
        System.out.println(readerArray[0].getReader4()[0] + " " + readerArray[0].getReader4()[1] + "(ID-" + readerArray[0].getReader4()[4] + ") Взял книгу " + bookArray[0].getBook()[4]
                + "(ID-" + bookArray[0].getID()[4] + ") На прокат у " + workerArray[0].getWorker4()[0] + " " + workerArray[0].getWorker4()[1] + "(ID-" + workerArray[0].getWorker4()[4] + ")");
        
        System.out.println("");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи кого хотите найти");
        System.out.println("Работники (27523/25917/81433/25315/82942)");
        System.out.println("Книги (10122/88327/64044/21119/36900)");
        switch(scan.nextInt()){
            case (27523):
                System.out.println("Имя - " + workerArray[0].getWorker0()[0] + "; Фамилия - " + workerArray[0].getWorker0()[1] + "; Возраст - " + workerArray[0].getWorker0()[2]
                + "; Пол - " + workerArray[0].getWorker0()[3]);
                break;
            case (25917):
                System.out.println("Имя - " + workerArray[0].getWorker1()[0] + "; Фамилия - " + workerArray[0].getWorker1()[1] + "; Возраст - " + workerArray[0].getWorker1()[2]
                + "; Пол - " + workerArray[0].getWorker1()[3]);
                break;
            case (81433):
                System.out.println("Имя - " + workerArray[0].getWorker2()[0] + "; Фамилия - " + workerArray[0].getWorker2()[1] + "; Возраст - " + workerArray[0].getWorker2()[2]
                + "; Пол - " + workerArray[0].getWorker2()[3]);
                break;
            case (25315):
                System.out.println("Имя - " + workerArray[0].getWorker3()[0] + "; Фамилия - " + workerArray[0].getWorker3()[1] + "; Возраст - " + workerArray[0].getWorker3()[2]
                + "; Пол - " + workerArray[0].getWorker3()[3]);
                break;
            case (82942):
                System.out.println("Имя - " + workerArray[0].getWorker4()[0] + "; Фамилия - " + workerArray[0].getWorker4()[1] + "; Возраст - " + workerArray[0].getWorker4()[2]
                + "; Пол - " + workerArray[0].getWorker4()[3]);
            case (10122):
                System.out.println("Книга - " + bookArray[0].getBook()[0] + "; Автор - " + bookArray[0].getAuthor()[0] + "; Жанр - " + bookArray[0].getGenre()[3]);
                break;
            case (88327):
                System.out.println("Книга - " + bookArray[0].getBook()[1] + "; Автор - " + bookArray[0].getAuthor()[1] + "; Жанр - " + bookArray[0].getGenre()[1]);
                break;
            case (64044):
                System.out.println("Книга - " + bookArray[0].getBook()[2] + "; Автор - " + bookArray[0].getAuthor()[2] + "; Жанр - " + bookArray[0].getGenre()[2]);
                break;
            case (21119):
                System.out.println("Книга - " + bookArray[0].getBook()[3] + "; Автор - " + bookArray[0].getAuthor()[3] + "; Жанр - " + bookArray[0].getGenre()[0]);
                break;
            case (36900):
                System.out.println("Книга - " + bookArray[0].getBook()[4] + "; Автор - " + bookArray[0].getAuthor()[4] + "; Жанр - " + bookArray[0].getGenre()[0]);
                break;
            default:
                System.out.println("Вы ошиблись, перезапустите программу и попробуйте снова");
                break;
        }
        
    }
}
