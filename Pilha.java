public class Pilha {
    private No primeiro;

    // construtor padrão escrito explicitamente para clareza do código
    public Pilha() {
        primeiro = null;
    }

    // getter e setter construídos para fins didáticos
    public No getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public void push(int i) {
        No novo = new No(i);
        if (!this.estaVazia()) {
            novo.setProximo(primeiro);
        }
        this.setPrimeiro(novo);
    }

    public int pop() {
        int i = this.primeiro.getInfo();
        setPrimeiro(primeiro.getProximo());
        return i;
    }

    @Override
    public String toString() {
        String s = "Pilha: [";
        if (this.estaVazia()) {
            s = s + "vazia";
        } else {
            No aux = this.primeiro;
            while (aux != null) { // percorre a lista até o final meeeessssmo

                s = s + aux + "->";
                aux = aux.getProximo();
            }
        }
        s = s + "]";
        return s;
    }
}
