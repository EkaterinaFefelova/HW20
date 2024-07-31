public class Main {
    public static void main(String[] args) {
        Flute flute = new Flute();
        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        Musician musician = new Musician();

        musician.perform(flute);
        musician.perform(guitar);
        musician.perform(piano);
    }
}
