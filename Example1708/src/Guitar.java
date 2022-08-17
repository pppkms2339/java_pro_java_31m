public class Guitar implements MusicalInstrument {

    private int stringCount;

    public Guitar(int stringCount) {
        this.stringCount = stringCount;
    }

    @Override
    public void play() {
        System.out.println("Guitar plays with string count " + stringCount);
    }

}
