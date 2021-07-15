public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(5);
        System.out.println(no1);
        No no2 = new No(12);
        System.out.println(no2);
        no1.setProximo(no2);
        System.out.println(no1.getProximo());
        System.out.println(no2.getProximo());
        System.out.println(no1.getProximo().getInfo());
        // System.out.println(no2.getProximo().getInfo()); nullPointerException
    }
}
