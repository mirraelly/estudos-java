public class PilhaSimples {

    public static void main(String[] args) {
        simularPilha();
    }

    public static void simularPilha() {
        int capacidade = 3;
        int[] pilha = new int[capacidade];
        int topo = -1;

        // Empilhe: 5
        if (topo == capacidade - 1) {
            System.out.println("Pilha cheia!");
        } else {
            pilha[++topo] = 5;
            System.out.println("Empilhado: 5");
        }

        // Empilhe: 8
        if (topo == capacidade - 1) {
            System.out.println("Pilha cheia!");
        } else {
            pilha[++topo] = 8;
            System.out.println("Empilhado: 8");
        }

        // Empilhe: 4
        if (topo == capacidade - 1) {
            System.out.println("Pilha cheia!");
        } else {
            pilha[++topo] = 4;
            System.out.println("Empilhado: 4");
        }

        // Empilhe: 7
        if (topo == capacidade - 1) {
            System.out.println("Pilha cheia!");
        } else {
            pilha[++topo] = 7;
            System.out.println("Empilhado: 7");
        }

        // Desempilhe duas vezes
        if (topo == -1) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Desempilhado: " + pilha[topo--]);
        }

        if (topo == -1) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Desempilhado: " + pilha[topo--]);
        }

        // Consulte o topo
        if (topo == -1) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Topo: " + pilha[topo]);
        }

        // Desempilhe mais duas vezes
        if (topo == -1) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Desempilhado: " + pilha[topo--]);
        }

        if (topo == -1) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Desempilhado: " + pilha[topo--]);
        }
    }
}
