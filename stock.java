import java.util.*;
class stock
{
public static void main(String args[])throws Exception
{

int n[]=new int[7];
int i,j,max=1,t,id=0;

Scanner sc = new Scanner(System.in);

for(i=0;i<7;i++)
n[i]=sc.nextInt();

for(i=0;i<7;i++)
{
for(j=i;j<7;j++)
{
t=n[j]-n[i];
if(t>max){
max=t;
id=j;
}
}
}


System.out.println("the max diff is " + max + "and increased price is " +n[id]);
}

}



