public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing(String singing) {
        System.out.println("  I'm sing " + singing);
    }

    public void playGuitar(String playGuitar) {
        System.out.println("  I'm play guitar " + playGuitar);
    }

    @Override
    public String toString() {
        return "Singer" +
                "\n  Name: " + getName() +
                "\n  Designation: " + getDesignation() +
                "\n  Band name: " + getBandName();
    }
}
