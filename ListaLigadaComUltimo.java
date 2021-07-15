public class ListaLigadaComUltimo extends ListaLigada {
    private No ultimo;

    public ListaLigadaComUltimo() {
        super();
        this.ultimo = null;
    }
    public No getUltimo () {
        return this.ultimo;
    }
    public void setUltimo (No no) {
        this.ultimo = no;
    }
    @Override
    public void insereInicio (int i) {
        No novo = new No(i);
        if (this.estaVazia())
            setUltimo(novo);
        else
            novo.setProximo(getPrimeiro());
        setPrimeiro(novo);
    }
    @Override
    public void insereFim (int i) {
        No novo = new No(i);
        if (estaVazia())
            setPrimeiro(novo);
        else
            ultimo.setProximo(novo);
        setUltimo(novo);
    }
    @Override
    public int removeInicio() {
        int i = getPrimeiro().getInfo();
        setPrimeiro(getPrimeiro().getProximo());
        if (estaVazia()) {
            setUltimo(null);
        }
        return i;
    }
    @Override 
    public int removeFim() {
        int i = this.ultimo.getInfo();
        if (this.getPrimeiro() == this.ultimo) { //tem um único elemento
            this.setPrimeiro(null);
            this.ultimo = null;
        }
        else {
            No aux = this.getPrimeiro();
            while (aux.getProximo() != this.ultimo) { //percorre até o penúltimo
                aux = aux.getProximo();
            }
            aux.setProximo(null);
            this.ultimo = aux;
        }
        return i;
    }
}
