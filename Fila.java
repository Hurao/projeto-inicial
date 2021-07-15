public class Fila {
    private int[] dados;
    private int primeiro;
    private int ultimo;
    private int contador;
    private int capacidade;

    public Fila () {
        this(10);
    }
    public Fila (int capacidade) {
        this.capacidade = capacidade;
        dados = new int[this.capacidade];
    }
    public boolean estaVazia() {
        return this.contador == 0;
    }
    public boolean estaCheia() {
        return this.contador == this.capacidade;
    }
    private int proximaPosicao (int posicao) {
        return (posicao + 1) % this.capacidade;
    }
    public void insere (int i) {
        this.dados[this.ultimo] = i;
        this.ultimo = proximaPosicao(this.ultimo);
        this.contador++;
    }
    public int remove () {
        int aux = this.dados[this.primeiro];
        this.primeiro = proximaPosicao(this.primeiro);
        this.contador--;
        return aux;
    }
    public int consultaPrimeiro() {
        return this.dados[this.primeiro];
    }
    public int tamanho () {
        return this.contador;
    }
    @Override
    public String toString () {
        String aux = "fila: ";
        if (this.estaVazia())
            aux = aux + "vazia";
        else {
            int i=this.primeiro;
            do {
                aux = aux + this.dados[i] + " ";
                i=proximaPosicao(i);
            } while (i!=this.ultimo);
        }       
        return aux;
    }
    public String stringVetor() {
        String vetor = "";
        if (this.estaVazia()){
            for (int i=0; i<this.capacidade; i++)
                vetor = vetor + "_ ";
        }
        else if (this.estaCheia()){
            for (int i=0; i<this.capacidade; i++)
                vetor = vetor + this.dados[i] + " ";
        }
        else if (this.primeiro < this.ultimo) {
            for (int i=0; i<this.primeiro; i++)
                vetor = vetor + "_ ";
            for (int i=this.primeiro; i<this.ultimo; i++)
                vetor = vetor + this.dados[i] + " ";
            for (int i=this.ultimo; i<this.capacidade; i++)
                vetor = vetor + "_ ";
        }
        else {
            for (int i=0; i<this.ultimo; i++)
                vetor = vetor + this.dados[i] + " ";
            for (int i=this.ultimo; i<this.primeiro; i++)
                vetor = vetor + "_ ";
            for (int i=this.primeiro; i<this.capacidade; i++)
                vetor = vetor + this.dados[i] + " ";
        }
        return vetor;
    }
}