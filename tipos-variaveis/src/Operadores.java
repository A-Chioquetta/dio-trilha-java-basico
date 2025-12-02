public class Operadores {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "veradeiro" : "falso";
        // é igual a isso:
        // if(a==b)
        // resultado = "verdadeiro";
        // else
        // resultado = "falso";

        System.out.println(resultado);

        String nomeUm = "Alessandra";
        String nomeDois = new String("Alessandra");

        System.out.println(nomeUm.equals(nomeDois)); // quando vai usar objectos usa esse equals

        // Operadores lógicos:
        // && -> E
        // || -> OU
    }
}
