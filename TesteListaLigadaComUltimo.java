public class TesteListaLigadaComUltimo {
    public static void main(String[] args) {
        ListaLigadaComUltimo llu = new ListaLigadaComUltimo();

        llu.insereInicio(3);
        llu.insereInicio(5);
        llu.insereInicio(7);
        System.out.println(llu);

        llu.insereFim(2);
        llu.insereFim(4);
        llu.insereFim(6);
        System.out.println(llu);

        if (!llu.estaVazia()) {
            System.out.println(llu.removeInicio() + " saiu do inicio");
            System.out.println(llu);
        }

        if (!llu.estaVazia()) {
            System.out.println(llu.removeFim() + " saiu do fim");
            System.out.println(llu);
        }
    }
}
