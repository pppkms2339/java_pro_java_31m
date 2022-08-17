public class Trumpet implements MusicalInstrument {

    private double diameter;

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Trumpet plays with diameter " + diameter);
    }

}
