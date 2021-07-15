
public class TesteNoDuplo {
    public static void main(String[] args) {
        NoDuplo n1 = new NoDuplo(1);
        NoDuplo n2 = new NoDuplo(2);

        System.out.println("n1:" + n1);
        System.out.println("n2:" + n2);

        n1.setProximo(n2);
        n2.setAnterior(n1);

        System.out.println("proximo do n1: " + n1.getProximo());
        System.out.println("anterior do n2: " + n2.getAnterior());
    }
}
