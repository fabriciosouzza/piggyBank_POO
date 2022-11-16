import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Cofrinho Cofrinho = new Cofrinho();

         while (true) {
            System.out.println("Cofrinho de Moedas");
            System.out.println("1 - Adicionar moedas.");
            System.out.println("2 - Remover moedas.");
            System.out.println("3 - Listar moedas.");
            System.out.println("4 - Converter moedas.");
            System.out.println("0 - Sair.");

            Scanner scanTypeTecladoMenu = new Scanner(System.in);
            int tecladoMenu = scanTypeTecladoMenu.nextInt();
            System.out.println();

            switch (tecladoMenu) {

                case 0: 
                    System.out.println("Execução encerrada");
                    break;

                case 1: 
                    int controle = 1;
                    while (controle > 0) {
                        System.out.println("Adicionar moedas");
                        System.out.println("Informe a moeda: 1 - Real, 2 - Dolar, 3 - Euro");
                        System.out.println("Ou 0 para Cancelar");

                        Scanner scanTypeTecladoTipo = new Scanner(System.in);
                        int tecladoTipo = scanTypeTecladoTipo.nextInt();
                        System.out.println();

                        switch (tecladoTipo) {
                            case 0:
                                controle = 0;
                                break;
                                
                            case 1:
                            case 2:
                            case 3:
                                System.out.println("Informe o valor");
                                System.out.println("Ou 0 para Cancelar");

                                Scanner scanTypeTecladoValor = new Scanner(System.in);
                                double TecladoValor = scanTypeTecladoValor.nextDouble();
                                System.out.println();

                                if (TecladoValor == 0.0) {
                                    break;

                                } else if (TecladoValor < 0.0) {
                                    System.out.println("Informe um valor correto");
                                    System.out.println();
                                } else {
                                    Cofrinho.adicionar(tecladoTipo, TecladoValor);
                                    System.out.println();
                                    break;
                                };

                                break;

                            default:
                                System.out.println("Informe um valor correto");
                                System.out.println();
                                break;

                        };

                    }
                    break;
                case 2:
                    int control = 1;
                    while (control > 0) {
                        System.out.println("Retirar moedas");
                        System.out.println("Informe a moeda: 1 - Real, 2 - Dolar, 3 - Euro");
                        System.out.println("Ou 0 para Cancelar");

                        Scanner scanTypeTecladoTipo = new Scanner(System.in);
                        int tecladoTipo = scanTypeTecladoTipo.nextInt();
                        System.out.println();

                        switch (tecladoTipo) {
                            case 0:
                                control = 0;
                                break;
                                
                            case 1:
                            case 2:
                            case 3:
                                System.out.println("Informe o valor");
                                System.out.println("Ou 0 para Cancelar");

                                Scanner scanTypeTecladoValor = new Scanner(System.in);
                                double TecladoValor = scanTypeTecladoValor.nextDouble();
                                System.out.println();

                                if (TecladoValor == 0.0) {
                                    break;

                                } else if (TecladoValor < 0.0) {
                                    System.out.println("Informe um valor correto");
                                    System.out.println();
                                } else {
                                    Cofrinho.remover(tecladoTipo, TecladoValor);
                                    System.out.println();
                                    break;
                                };

                            default:
                                System.out.println("Informe um valor correto");
                                System.out.println();
                                break;

                        };

                    }
                    break;

                case 3: 
                    System.out.println("Listar todas as moedas");
                    Cofrinho.listagemMoedas();
                    break;

                case 4:
                    Cofrinho.totalConvertido();
                    break;

                default:
                    System.out.println("Informe um valor correto");
                    System.out.println();
                    break;
            }
        }
    }
}