import java.util.Scanner;
class P14
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Character:");
char c=sc.next().charAt(0);
switch(c)
{
case'a':
case'e':
case'i':
case'o':
case'u':
case'A':
case'E':
case'I':
case'O':
case'U':
System.out.println(c+"is vowel");
break;
default:
System.out.println(c+"is not vowel");
}
}
}
