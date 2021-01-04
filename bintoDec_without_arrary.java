import java.util.Scanner;
class bintoDec_without_arrary
{
public static void main(String args[])
{
int n, a, count0 = 0, count1=0;
String s = "";
Scanner sc = new Scanner(System.in);
System.out.println("Enter decimal number ");
n = sc.nextInt();
while(n>0)
{
a = n%2;
if(a == 1)
{
count1++;
}
else
count0++;
s = s+" "+a;
n = n/2;

}
System.out.println("Binary number: "+s);
System.out.println("No. of 1s: "+count1);
System.out.println("No. of 0 s: "+count0);
}
}