import java.io.*;
import java.util.*;
class trial
{
public static void main(String args[])throws Exception
{
String name="" ,fname="" ,add="";
int i; 

FileWriter fw = new FileWriter("emp.txt");
PrintWriter pw= new PrintWriter(new BufferedWriter(fw));
Scanner sc = new Scanner(System.in);
for(i=1;i<=3;i++)
{
System.out.println("Enter name fname address");
name=sc.nextLine();
fname=sc.nextLine();
add=sc.nextLine();
pw.println(name);
pw.println(fname);
pw.println(add);
}
fw.close();
pw.close();

}

}

