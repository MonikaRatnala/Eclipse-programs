package Programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno, String name, int age){
	this.rollno=rollno;
	this.name=name;
	this.age=age;
}
}


public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Student> al = new ArrayList<Student>();
    Student s1 = new Student(101,"Monika",22);
    Student s2 = new Student(102,"Indu",22);
    al.add(s1);
    al.add(s2);
    try {
    FileOutputStream fos=new FileOutputStream("file");  
    ObjectOutputStream oos=new ObjectOutputStream(fos);  
    oos.writeObject(al);  
    fos.close();  
    oos.close();  
     
    FileInputStream fis=new FileInputStream("file");  
    ObjectInputStream ois=new ObjectInputStream(fis);  
    ArrayList  list=(ArrayList)ois.readObject();  
  System.out.println(list);    
}
    catch(Exception e)  
{  
    System.out.println(e);  
}  
    
    
    
    
    
    Iterator itr = al.iterator();
    while(itr.hasNext())
    {
    	Student st=(Student)itr.next();  
        System.out.println(st.rollno+" "+st.name+" "+st.age);
    }
    
    
	}

}
