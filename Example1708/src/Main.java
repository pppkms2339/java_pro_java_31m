public class Main {

    public static void main(String[] args) {
        Drum drum = new Drum(12.1);
        MusicalInstrument guitar = new Guitar(7);
        MusicalInstrument[] instruments = {drum, guitar, new Trumpet(5.0)};
        for (MusicalInstrument instrument : instruments) {
            instrument.play();
        }
        System.out.println(MusicalInstrument.KEY);
    }

}
