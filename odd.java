import java.util.*;
class odd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int n=0;
for(int i=0;i<s.length();i++)
{
if(((s.charAt(i)-'0')&1)==1)
{
n++;
}

}
System.out.println(n);
}
}
