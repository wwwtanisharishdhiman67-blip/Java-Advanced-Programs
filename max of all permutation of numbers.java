import java.util.*;
import java.lang.*;

class n1
{








public static void main(String args[])throws Exception
{
int n[]=new int[4];
int xx[]=new int[100];
int i,j,k,l,sum=0,max=0,r,m,x=0,f=3;
int a,b,c,d,z=0,id=0;
String s="";
Scanner sc = new Scanner(System.in);
for(i=0;i<4;i++)
{
n[i]=sc.nextInt();
}
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
for(k=0;k<4;k++)
{
for(l=0;l<4;l++)
{

  if(i!=j && j!=k && k!=l && i!=k && j!=l && i!=l)
  {
      a=n[i];b=n[j];c=n[k];d=n[l];
      x=a*1000+b*100+c*10+d;
      xx[z++]=x;
  }
}
}
}
}



for(i=0;i<z;i++)
{
m=xx[i];

f=3;
sum=0;


while(m>0)
{
r=m%10;
m=m/10;
sum=sum+(int)r*f;
f--;
}
if(sum>max){
max=sum;
id=xx[i];
}
}
System.out.println(max+"\t"+id);



for(i=0;i<z;i++)
System.out.println(xx[i]);




}
}

















