
public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDupla ld = new ListaDupla();

        System.out.println(ld);
        ld.insereNumaPosicao(2, 3);
        System.out.println(ld);

        ld.insereInicio(7);
        ld.insereInicio(7);
        ld.insereInicio(5);
        ld.insereInicio(7);
        ld.insereInicio(9);
        System.out.println(ld);
        ld.insereNumaPosicao(2, 5);
        System.out.println(ld);

    }
}
