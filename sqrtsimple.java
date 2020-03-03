import java.util.*;
class sqrtsimple
{
public static void main(String[] args)
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
double ans=Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a))+1;
System.out.println(ans);
}
}
