public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // "se ser BO aqui vc tá ciente" -> casting
        float pi = 3.14F; // float tem q por F e long tem que por L se não ele tenta outro tipo de
                          // variável

        final double VALOR_DE_PI = 3.14; // esse "final cria uma constante, então não dá mais pra mudar o valor" ->
                                         // convenção: caixa alta
        System.out.println(salarioMinimo + numeroCurto + numeroCurto2);
        System.out.println(pi + VALOR_DE_PI);
    }
}
