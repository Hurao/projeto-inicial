
public class TestePilha {
    public static void main(String[] args) {
        Pilha p1 = new Pilha();

        System.out.println("p1: " + p1);

        p1.push(10);
        p1.push(20);
        p1.push(30);

        System.out.println("p1: " + p1);

        int i = 1;
        while (true) {
            p1.push(i++);
            System.out.println(i);
        }
    }
}
