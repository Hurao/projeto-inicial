
public class ListaDupla {
    private NoDuplo primeiro;
    private int count;

    // vamos usar somente o construtor padrão, que "zera" todos os atributos

    public NoDuplo getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoDuplo primeiro) {
        this.primeiro = primeiro;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public void insereInicio(int i) {
        NoDuplo novo = new NoDuplo(i);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
            novo.setAnterior(primeiro.getAnterior());
            novo.getAnterior().setProximo(novo);
            novo.getProximo().setAnterior(novo);
        }
        this.setPrimeiro(novo);
        this.setCount(count + 1);
    }

    public void insereFim(int i) {
        NoDuplo novo = new NoDuplo(i);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
            novo.setAnterior(primeiro.getAnterior());
            novo.getAnterior().setProximo(novo);
            novo.getProximo().setAnterior(novo);
        } else {
            this.setPrimeiro(novo);
        }
        this.setCount(count + 1);
    }

    public int removeInicio() {
        int i = primeiro.getInfo();
        if (count == 1) {
            setPrimeiro(null);
        } else {
            primeiro.getAnterior().setProximo(primeiro.getProximo());
            primeiro.getProximo().setAnterior(primeiro.getAnterior());
            setPrimeiro(primeiro.getProximo());
        }
        setCount(count - 1);
        return i;
    }

    public int removeFim() {
        NoDuplo ultimo = primeiro.getAnterior();
        int i = ultimo.getInfo();
        if (count == 1) {
            setPrimeiro(null);
        } else {
            ultimo.getAnterior().setProximo(ultimo.getProximo());
            ultimo.getProximo().setAnterior(ultimo.getAnterior());
        }
        setCount(count - 1);
        return i;
    }

    @Override
    public String toString() {
        String s = "Lista: ";
        if (estaVazia()) {
            s += "vazia";
        } else {
            NoDuplo aux = primeiro;
            do {
                s += aux + " -> ";
                aux = aux.getProximo();
            } while (aux != primeiro);
            s += "//";
        }
        return s;
    }

    public boolean estaNaLista(int i) {
        // verificar se o inteiro i esta lista

        if (estaVazia())
            return false;
        for (int j = 0; j < count; j++) {
            if (i == primeiro.getInfo())
                return true;
            else
                primeiro.getProximo();
        }
        return false;

    }

    public int quantosNaLista(int i) {
        // conta quantas vezes i aparece na lista
        int aux = 0;
        if (estaVazia())
            return 0;
        for (int h = 0; h < count; h++) {
            if (i == primeiro.getInfo())
                aux++;
            setPrimeiro(primeiro.getProximo());
        }
        return aux;
    }

    public int posicaoQueEstaLista(int i) {
        // devolve a posição da primeira ocorrencia de i na lista ou -1, se não estiver
        if (estaVazia())
            return -1;
        for (int k = 1; k <= count; k++) {
            if (i == primeiro.getInfo()) {
                return k;
            }
            setPrimeiro(primeiro.getProximo());
        }
        return -1;
    }

    public int tamanhoDaLista() {
        // o tamanho da lista

        return count;
    }

    public boolean removeElemento(int i) {
        // remover a primeira ocorrência de i na lista, retornando sucesso (true) ou
        // fracasso (false)

        if (estaVazia())
            return false;
        for (int k = 1; k <= count; k++) {
            if (i != primeiro.getInfo()) {

                setPrimeiro(primeiro.getProximo());
            } else {
                primeiro.getAnterior().setProximo(primeiro.getProximo());
                primeiro.getProximo().setAnterior(primeiro.getAnterior());
                setPrimeiro(primeiro.getProximo());
                setCount(count - 1);
                return true;

            }

        }
        return false;

    }

    public void insereNumaPosicao(int i, int pos) {
        // inserir o elemento i na posição pos
        NoDuplo novo = new NoDuplo(i);
        if (estaVazia()) {
            this.setPrimeiro(novo);
            this.setCount(count + 1);
        } else {
            for (int p = 0; p < count; p++) {
                if (p != pos - 1) {
                    setPrimeiro(primeiro.getProximo());
                } else {

                    novo.setProximo(primeiro);
                    novo.setAnterior(primeiro.getAnterior());
                    novo.getAnterior().setProximo(novo);
                    novo.getProximo().setAnterior(novo);
                    setCount(count + 1);
                }
            }
        }
    }
}
