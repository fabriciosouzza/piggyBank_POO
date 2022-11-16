import java.util.ArrayList;
public class Cofrinho{
    private ArrayList<Moeda> conjuntoMoedas = new ArrayList<Moeda>();

    public void adicionar(int coinType, double coinValue){

        switch (coinType) {

            case 1:
                conjuntoMoedas.add(new Real(coinValue));
                break;
            case 2:
                conjuntoMoedas.add(new Dolar(coinValue));
                break;
            case 3:
                conjuntoMoedas.add(new Euro(coinValue));
                break;
        }
    }

    public void remover(int coinType, double coinValue) {
        for (Moeda atualMoeda : conjuntoMoedas) {


            String tipo = String.valueOf(atualMoeda.getClass());
            double valor = atualMoeda.info();
            
            switch (coinType) {
                case 1:
                    if (tipo.equals("class Real") && valor == coinValue) {
                        conjuntoMoedas.remove(atualMoeda);
                    }
                    break;
                    
                case 2:
                    if (tipo.equals("class Dolar") && valor == coinValue) {
                        conjuntoMoedas.remove(atualMoeda);
                    }
                    break;
                case 3:
                    if (tipo.equals("class Euro") && valor == coinValue) {
                        conjuntoMoedas.remove(atualMoeda);
                    }
                    break;
                }
            }
        }


    public void listagemMoedas() {

        if(conjuntoMoedas.size() == 0){
            System.out.println("O cofrinho está vazio");
            System.out.println();

        } else {
            for (Moeda moedaAtual : conjuntoMoedas) {
                System.out.println("Moeda: ");
                System.out.println(moedaAtual.getClass());
                System.out.println(moedaAtual.info());
            }
            System.out.println();
        }
    }

    public void totalConvertido() {

        if(conjuntoMoedas.size() == 0){
            System.out.println("O cofrinho está vazio");
            System.out.println();

        } else {
            double soma = 0;
            for (Moeda moedaAtual : conjuntoMoedas) {
                soma += moedaAtual.converter();
            }
            System.out.println("Total convertido é de: R$" + soma);
            System.out.println();
        }
    }
}