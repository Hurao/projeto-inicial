public class ListaLigada {
    private No primeiro;
    //construtor padrão escrito explicitamente para clareza do código
    public ListaLigada() {
        primeiro = null;
    }
    //getter e setter construídos para fins didáticos
    public No getPrimeiro() {
        return this.primeiro;
    }
    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }
    public boolean estaVazia() {
        return this.primeiro == null;
    }
    public void insereInicio (int i) {
        No novo = new No(i);
        if (!this.estaVazia()) {
            novo.setProximo(primeiro);
        }
        this.setPrimeiro(novo);
    }
    public int removeInicio() {
        int i = this.primeiro.getInfo();
        setPrimeiro(primeiro.getProximo());
        return i;
    }
    public int removeFim() {
        int i;
        if (getPrimeiro().getProximo() == null) { //a lista tem só um elemento
            i = primeiro.getInfo();
            setPrimeiro(null);
        }
        else { //tem pelo menos 2 elementos
            No aux = primeiro;
            while (aux.getProximo().getProximo() != null) {//percorre até o penúltimo
                aux = aux.getProximo();
            }
            i = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return i;
    }
    public void insereFim(int i) {
        No novo = new No(i);
        if (this.estaVazia()) {
            setPrimeiro(novo);
        }
        else {
            No aux = this.primeiro;
            while (aux.getProximo() != null) { //percorre a lista até o último
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }
    @Override
    public String toString (){
        String s = "Lista: [";
        if (this.estaVazia()) {
            s = s + "vazia";
        }
        else {
            No aux = this.primeiro;
            while (aux != null) {  //percorre a lista até o final meeeessssmo
                s = s + aux + " -> ";
                aux = aux.getProximo();
            }
        }
        s = s + "//]";
        return s;
    }
}
