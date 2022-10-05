import java.util.Scanner;

public class KeyboardApp{

    public static void main(String[] args){

        //exibe uma mensagem

        System.out.println("Digite seu nome: ");

        //Lê uma variavel do tipo string com a Classe Scanner

        try (Scanner scanner = new Scanner(System.in)) {
            String inputstring  = scanner.nextLine();


            //imprime na tela a mensagem que foi digitada no teclado;

            System.out.println(inputstring);
        }


        // recebe do teclado uma string com a Classe Scanner atraves do metodo next

        

    }






}








