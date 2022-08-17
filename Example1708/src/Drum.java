public class Drum implements MusicalInstrument {

    private double dimension;

    public Drum(double dimension) {
        this.dimension = dimension;
    }

    @Override
    public void play() {
        System.out.println("Drum plays with dimension " + dimension);
    }

}
