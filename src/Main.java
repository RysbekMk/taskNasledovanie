public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Rysbek", "beckend", "Google");

        System.out.println(programmer);
        programmer.eat("plov");
        programmer.walk("with my friends");
        programmer.learn("java");
        programmer.coding("java");

        Dancer dancer = new Dancer("Atai","dancer","Adem");
        System.out.println("\n"+dancer);
        dancer.eat("burgers");
        dancer.walk("the streets of NY");
        dancer.learn("english");
        dancer.dancing("robo-dance");

        Singer singer = new Singer("Jax","singer","02.14");
        System.out.println("\n"+singer);
        singer.eat("beshbarmak");
        singer.walk("in Bishkek");
        singer.learn("guitar");
        singer.playGuitar("sometimes");
        singer.singing("the best");
    }
}