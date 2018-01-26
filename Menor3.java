
package Menor3;
import java.util.Scanner;
public class Menor3{
    static int Menorde3 (int X,int Y,int Z)
    {if(X>Y)
        X=Y;
     if(X>Z)
        X=Z;
     return X;}
    public static void main(String[] args)throws Exception{ 
int X,Y,Z;
Scanner LerS = new Scanner(System.in);
System.out.print("Digite o primeiro numero");
X= LerS.nextInt();
System.out.print("Digite osegundo numero");
Y= LerS.nextInt();
System.out.print("Digite o vaqlor(Z)");
Z=LerS.nextInt();
System.out.println("Maior ="+ Menorde3 (X,Y,Z));}}