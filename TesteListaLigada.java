public class TesteListaLigada {
    public static void main(String[] args) {
        ListaLigada l = new ListaLigada();

        System.out.println("valor da referencia primeiro: " + l.getPrimeiro());
        System.out.println("valor do teste primeiro==null: " + (l.getPrimeiro() == null));

        System.out.println("teste de vazia: " + l.estaVazia());
        System.out.println(l);

        l.insereInicio(2);
        l.insereInicio(4);
        l.insereInicio(1);
        System.out.println(l);

        if (!l.estaVazia()) {
            System.out.println(l.removeInicio() + " saiu do começo da lista");
            System.out.println(l);
        }

        l.insereFim(10);
        l.insereFim(20);
        System.out.println(l);

        if (!l.estaVazia()) {
            System.out.println(l.removeFim() + " saiu do final da lista");
            System.out.println(l);
        }
    }
}
