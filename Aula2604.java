public class Aula2604 {
    public static int conta_frequencia(int v[], int n, int valor) {

        int i;

        int cont = 0;

        for (i = 0; i < n; i++) {

            if (v[i] == valor)

                cont++;

        }
        return cont;

    }/*
      * Este metodo percorre um vetor, e caso ache nele um resultado igual ao valor,
      * adiciona um ao contador para mostrar o quanto aquele numero aparece em
      * determinado vetor
      */

    public static int recursivo_conta_frequencia(int[] v, int i, int valor, int cont) {

        if (valor == v[i])
            cont++;
        if (i != 0)
            return recursivo_conta_frequencia(v, i - 1, valor, cont);
        else
            return cont;
    }

    public static void main(String[] args) {
        int n = 10;
        int cont = 0;
        int i;
        int j = 0;
        int[] v = new int[n];
        int valor = 5;
        for (i = 0; i < 10; i++) {

            v[i] = j;
            j++;
            System.out.print(v[i] + " ");
        }
        v[3] = 5;
        System.out.println(v[3]);
        i--;
        recursivo_conta_frequencia(v, i, valor, cont);
        System.out.println("\n" + recursivo_conta_frequencia(v, i, valor, cont));
    }
}