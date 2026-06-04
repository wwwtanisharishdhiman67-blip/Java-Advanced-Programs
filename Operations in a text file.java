import java.io.*;
class Record
{
public static void main(String args []) throws Exception
{
String pnr,trn,tnam,name,doj,cno;
int ch;
FileWriter fw = new FileWriter("ticket.txt");
PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
DataInputStream in = new DataInputStream (System.in);

do
{
System.out.println("Enter the pnr no  train no   train name   name of Passenger    date of journey    and    coach no");
pnr=in.readLine();
trn=in.readLine();
tnam=in.readLine();
name=in.readLine();
doj=in.readLine();
cno=in.readLine();
pw.println(pnr);
pw.println(trn);
pw.println(tnam);
pw.println(name);
pw.println(doj);
pw.println(cno);

System.out.println("1 continue 0 exit");
ch = Integer.parseInt(in.readLine());
}
while(ch==1);

fw.close();
pw.close();

FileReader fr = new FileReader("ticket.txt");
BufferedReader br = new BufferedReader(fr);

System.out.println("Enter the pnr no to be searched");
String tar= in.readLine();

int f=0;
while((pnr=br.readLine())!="")
{
trn=br.readLine();
tnam=br.readLine();
name=br.readLine();
doj=br.readLine();
cno=br.readLine();

if(tar.equalsIgnoreCase(pnr))
{
f=1;
break;
}
}
System.out.println(pnr +" "+trn+" "+tnam+" "+name+" "+doj+" "+cno);

fr.close();
br.close();

}

}
