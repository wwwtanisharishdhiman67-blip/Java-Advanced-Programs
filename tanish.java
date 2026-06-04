import java.io.*;
class tanish
{
public static void main(String args[])throws Exception
{
int n,m,r,f=0,ctr=0,k,i,d;
DataInputStream in = new DataInputStream(System.in);
n=Integer.parseInt(in.readLine());
m=Integer.parseInt(in.readLine());
for (i=n;i<=m;i++)
{
f=0;
for(d=0;d<=9;d++)
{
k=i;ctr=0;
while(k>0)
{
r=k%10;
k=k/10;
if(r==d)
ctr++;
}
if(ctr>1)
f=1;
}
if(f==0)
System.out.println(i+" ");
}
}

}