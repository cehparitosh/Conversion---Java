import java.util.*;
public class Octal2Decimal{

//method definition to convert octal numbers into decimal

public static int getDecimal(int octal){
int decimal = 0;
//Declaring variable to use in power
int ct = 0;
while(true){
if(octal == 0){
break;
} else {
int temp = octal % 10;
decimal += temp*Math.pow(8, ct); //
octal = octal/10;
ct++;
}
}
return decimal;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter an octal number:");
int num=sc.nextInt();
Octal2Decimal od=new Octal2Decimal();

System.out.println("Decimal of given octal is: "+ od.getDecimal(num));
}
}