
package notasalunos;
import java.util.Scanner;
public class Notasalunos {
      static int lereescrever (int x){
          Scanner LerS= new Scanner(System.in);
          System.out.print("Digite a nota do aluno");
        x = LerS.nextInt();
              return x;}
    public static void main(String[] args)throws Exception 
    { int x = 0;
        int [] Armario = new int[26];
        for(int aluno=1;aluno<26;aluno++)
         Armario [aluno] = lereescrever(x);
        for (int aluno= 1;aluno < 26;aluno++ )
        System.out.println(aluno +"-"+ Armario [aluno]);
        
}}
