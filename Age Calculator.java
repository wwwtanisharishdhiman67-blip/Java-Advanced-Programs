import java.io.*;
class tt
{

public int check(int d,int m,int y)
{
int f=0;

if(y%4==0&&m==2&&d<=29)
f=1;
if(y%4!=0&&m==2&&d<=28)
f=1;
if((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&d<=31)
f=1;
if((m==4||m==6||m==9||m==11)&&d<=30)
f=1;
return(f);
}
public int count(int d,int i,int y)
{
int w=0,m,nd=0;
//for ()
for(m=1;m<i;m++)
{
if(y%4==0&&m==2)
nd=nd+29;
if(y%4!=0&&m==2)
nd=nd+28;
if(m==1||m==3||m==5||m==7||m==8||m==10)
nd=nd+31;
if(m==4||m==6||m==9||m==11)
nd=nd+30;
}
nd=nd+d;

return(nd);
}
public int cout(int d,int i,int y)
{
int w=0,m,nd=0;
//for ()
for(m=1;m<i;m++)
{
if(y%4==0&&m==2)
nd=nd+29;
if(y%4!=0&&m==2)
nd=nd+28;
if(m==1||m==3||m==5||m==7||m==8||m==10)
nd=nd+31;
if(m==4||m==6||m==9||m==11)
nd=nd+30;
}
nd=nd+d;
if(y%4==0)
return(366-nd);
else
return(365-nd);
}



public static void main(String args[])throws Exception
{
int i,b=0,c=0,n=0,nd=0,a,d1,m1,y1,d2,m2,y2,r,s;
DataInputStream in = new DataInputStream(System.in);
System.out.println("Enter the 1st date");
d1=Integer.parseInt(in.readLine());
m1=Integer.parseInt(in.readLine());
y1=Integer.parseInt(in.readLine());
System.out.println("Enter 2nd date");
d2=Integer.parseInt(in.readLine());
m2=Integer.parseInt(in.readLine());
y2=Integer.parseInt(in.readLine());
tt obj = new tt();
int p=obj.check(d1,m1,y1);
int q=obj.check(d2,m2,y2);
//System.out.println(p);
if(p==1&&q==1)
{
a=obj.cout(d1,m1,y1);
System.out.print(" valid");

for(i=y1+1;i<y2;i++)
{
if(i%4==0)
nd=nd+366;
else
nd=nd+365;
}
if(y1!=y2){
b=obj.count(d2,m2,y2);
System.out.print(a+nd+b);
}
else{
r=obj.count(d1,m1,y1);
s=obj.count(d2,m2,y2);
c=Math.abs(r-s);
System.out.print(c);
}
//n=a+nd+c;

}




}

}

