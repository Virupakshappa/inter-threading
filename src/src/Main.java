public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Q q = new Q();
        new Producer(q);
        new Consumer(q);


    }
}