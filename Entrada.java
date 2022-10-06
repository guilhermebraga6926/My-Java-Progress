import java.util.Scanner;
import java.util.Calendar;

public class Entrada {

    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
            int idade;
            int ano_atual;
            int ano_nascimento;
            
            //pergunta a idade e armazena 
            System.out.println("Digite sua idade:");
            
            idade = entrada.nextInt(); // Lê a idade
            
            //Cria um objeto do tipo calendario e armazena o ano atual

            Calendar calendario = Calendar.getInstance(); ano_atual= calendario.get(Calendar.YEAR);

            ano_nascimento = ano_atual - idade ;

            
            //Imprime na tela o ano que a pessoa nasceu
            System.out.printf("Voce nasceu em " + ano_nascimento + "\n");
        }
    
    
    }
}
