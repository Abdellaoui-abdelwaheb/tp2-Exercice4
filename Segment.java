public class Segment {
    private int extr1;
    private int extr2;

    public Segment(int extr1, int extr2) {
        this.extr1 = extr1;
        this.extr2 = extr2;
    }
    public int longueur() {
        return Math.abs(extr2 - extr1);
    }


    public boolean contient(int point) {
        return (point >= Math.min(extr1, extr2) && point <= Math.max(extr1, extr2));
    }


    public String toString() {
        return "segment (" + Math.min(extr1, extr2) + ", " + Math.max(extr1, extr2) + ")";
    }
}
