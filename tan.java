import java.util.*;
class tan
{

int i,j,m,p=0,sum=0,r,n;

public int pf(int i)
{
p=0;
for(j=2;j<=i;j++)
{
if(i%j==0)
{
m=j;
while(m>0)
{
r=m%10;
m=m/10;
p=p+r;

}
i=i/j;
j--;

}
}
return(p);
}



public int ss(int n)
{
sum=0;
n=i;
while(n>0)
{
r=n%10;
n=n/10;
sum=sum+r;
}
return(sum);

}
public void dis()
{
int k,l;
for(i=2;i<=666;i++)
{
k=pf(i);
l=ss(i);
if(k==l)
System.out.print(i+", ");
}
}
public static void main(String args[])throws Exception
{
tan obj = new tan();
obj.dis();
}
}
