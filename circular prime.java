import java.io.*;
class circular
{
public int prime(int n)
{
int i,ctr=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
ctr++;
}
if(ctr==2)
return(1);
else
return(0);
}
public static void main(String args[])throws Exception
{
int i,n,x,c=0,a,r,b,f=1;
circular obj = new circular();
DataInputStream in = new DataInputStream(System.in);
System.out.println("Enter the no");
n=Integer.parseInt(in.readLine());
x=n;
while(x>0)
{
a=x%10;
x=x/10;
c++;
}
//System.out.print(c+" ");
r=obj.prime(n);
if(r==1)
{
	System.out.print(n+" ");
	for(i=1;i<c;i++)
	{
		
		a=n%(int)(Math.pow(10,c-1));
		b=n/(int)(Math.pow(10,c-1));
		x=a*10+b;
		r=obj.prime(x);
		if(r==0)
		{
			f=0;
			break;
		}
		else{
			n=x;
			System.out.print(x+" ");}
	}
}
else
f=0;
if(f==1)
System.out.println("circular prime");
else
System.out.println("nooo");
}
}
