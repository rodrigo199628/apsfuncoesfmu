package com.fmu.aps_matematica;

/**
* Função 15: y = 9x -7
*/
public class Main {
    static java.util.Scanner scan = new java.util.Scanner(System.in); //Inícia scan de leitura do teclado

    public static void main(String args[]) {

        MenuOptions option;
        do { // Início do laço de repetição do while
            System.out.println("Cálculo de y na função y = 9x -7.  Favor digitar o valor de x."); //Pergunta para o usuário o valor da variável independente x

            double x = scan.nextDouble(); // Solicita a digitação no teclado e guarda o valor na variável double x

            double y = (9 * x) - 7; // Executa o calculo da função e guarda o resultado na variável y

            System.out.format("Se x = %.2f o valor de y é %.2f.%n", x, y); // Apresenta o resultado para o usuário

            option = getMenuOption(); // Chama o método getMenuOption
            
        } while (option == MenuOptions.CALC); // Fim do laço de repetição do while

        scan.close(); // Fechamento da variável de entrada scan
        
        System.out.format("%nPrograma encerrado.%n"); // Informa fim da execução
    }

    private static MenuOptions getMenuOption() { // Declaração do método de Menu
        int opt = -1; // Declaração da variável de controle int opt
        do { // Início do laço de repetição do while
            System.out.format("%n+---------------------------+%n"); // Menu personalizado perguntando ação ao usuário
            System.out.println("| O que deseja fazer?       |");
            System.out.println("|                           |");
            System.out.println("| 1 - Calcular outro numero |");
            System.out.println("| 2 - Sair                  |");
            System.out.println("|                           |");
            System.out.println("| Digite uma opcao          |");
            System.out.println("+---------------------------+"); 
            opt = scan.nextInt(); // Variável de controle opt recebe o valor digitado pelo usuário
            
        } while (opt != 1 && opt != 2); // Mantem o do while até que a tecla correta seja pressionada

        switch (opt) { // Início do switch para verificar caso a tecla seja pressionada qual ação tomar
            case 1:
                return MenuOptions.CALC; //Retorna para início do calculo
            default:
                return MenuOptions.EXIT; // Determina o fim da execução
        }
    }
}
enum MenuOptions { //  ENUM conjunto de valores constantes pré-definidos CALC e EXIT
    CALC,
    EXIT
}