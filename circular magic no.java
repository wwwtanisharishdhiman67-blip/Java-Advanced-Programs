import java.io.*;
class cmag
{
public int comp(int n)
{
int i,ctr=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
ctr++;
}
if(ctr>2)
return(1);
else 
return(0);
}
public static void main(String args[])throws Exception
{
int m,n,r,sum=0,p,i,k,x=0;
DataInputStream in = new DataInputStream(System.in);
cmag obj = new cmag();
System.out.println("Enter the range");
m=Integer.parseInt(in.readLine());
n=Integer.parseInt(in.readLine());
for(i=m;i<=n;i++)
{
p=obj.comp(i);

k=i;
sum=0;
while(k>0)
{
sum=0;
while(k>0)
{
r=k%10;
k=k/10;
sum=sum+r;
}
if(sum>9)
k=sum;
}
if(sum==1&&p==1){
x++;
System.out.println(i+" ");
}
}
System.out.println(x+" is the frequency");
}
}









