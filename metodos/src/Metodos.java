public class Metodos {
    public static void main(String[] args) throws Exception {
        // verbos
        // camelCase
        // não existe o conceito de métodos globais
    }

    public double somar(int num1, int num2) {
        // Lógica - Finalidade do método
        return num1 + num2;
    }

    public void imprimir(String texto) {
        // Aqui não precisa do return, pois não será retornado nenhum resultado
    }

    public double dividir(int dividendo, int divisor) throws Exception {
        return dividendo / divisor;
    }

    private void metodoPrivado() {
        // Esse método não pode ser visto por outras classes
    }
}
