package Programs;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;  
class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class LinkedListExample {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<Book> list=new LinkedList<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3); 
    try  
    {  
        //Serialization  
        FileOutputStream fos=new FileOutputStream("file");  
        ObjectOutputStream oos=new ObjectOutputStream(fos);  
        oos.writeObject(list);  
        fos.close();  
        oos.close();  
        //Deserialization  
        FileInputStream fis=new FileInputStream("file");  
        ObjectInputStream ois=new ObjectInputStream(fis);  
      ArrayList  list1 = (ArrayList)ois.readObject();  
      System.out.println(list1);    
    }catch(Exception e)  
    {  
        System.out.println(e);  
    }  
    //Traversing list  
    for(Book b:list){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  
