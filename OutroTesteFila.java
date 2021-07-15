import java.util.Random;

public class OutroTesteFila {
    public static void main(String[] args) {
        Fila f = new Fila(8);
        Random gerador = new Random();
        do {
            if (gerador.nextInt(2)==0) {
                if (!f.estaCheia()) {
                    f.insere(gerador.nextInt(10));
                    System.out.println("insercao");
                }
                else {
                    System.out.println("cheia");
                }
            }
            else {
                if (!f.estaVazia()) {
                    System.out.println(f.remove() + " saiu");
                }
            }
            System.out.print(f.stringVetor() + " | ");
            System.out.println(f);
        } while (!f.estaVazia());
    }
}
