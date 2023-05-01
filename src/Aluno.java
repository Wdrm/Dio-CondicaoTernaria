import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int nota;
        System.out.println("Informe Nota do Aluno:\n");
        nota = sc.nextInt();
        String resultado = nota >=7 ? "Aprovado!" : nota >=5 && nota<7 ? "Recuperação":  "reprovado";
        System.out.println(resultado);






        //todo: Antes de refatorar ficaria neste formato
     //   if (nota>= 7){
         //   System.out.println("Aprovado!");
     //   } else if (nota >=5 && nota<7){
          //  System.out.printf("Recuperação!");
       // }else{
          //  System.out.println("Reprovado!");
        }
    }
}