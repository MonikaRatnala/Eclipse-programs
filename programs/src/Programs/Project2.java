package Programs;
import java.io.*;
public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		class InputStreamExample {    
		  public static void main(String args[])throws Exception{    
		   FileInputStream input1=new FileInputStream("c:\\testin.txt");    
		   FileInputStream input2=new FileInputStream("c:\\testout.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();    
		  }    
		}    
	}

}
