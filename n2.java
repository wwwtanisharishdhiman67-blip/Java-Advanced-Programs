import java.util.*;
import java.lang.*;

class n2
{








public static void main(String args[])throws Exception
{
int n[]=new int[4];
int xx[]=new int[100];
int i,j,l,sum=0,max=0,r,m,x=0,f=3,t;
int a,b,d,z=0,id=0;
String s="";
Scanner sc = new Scanner(System.in);
for(i=0;i<4;i++)
{
n[i]=sc.nextInt();
}

//rotating the array
int c=0;
while(c<4)
{
t=n[0];
for(j=0;j<3;j++)
n[j]=n[j+1];
n[3]=t;
int k=3;
for(i=0;i<4;i++)
{
x+=n[i]*(int)Math.pow(10,k--);
}
xx[c]=x;
//System.out.println(x+" ");
x=0;
c++;
}







for(i=0;i<c;i++)
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



for(i=0;i<c;i++)
System.out.println(xx[i]);




}
}

















