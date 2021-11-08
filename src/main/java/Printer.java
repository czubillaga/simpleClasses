public class Printer {

    private int pagesLeft;
    private double tonerVolume;

    public Printer(int pagesLeft, double tonerVolume) {
        this.pagesLeft = pagesLeft;
        this.tonerVolume = tonerVolume;
    }

    public void print(int pages, int copies) {
        int pagesToPrint = pages * copies;
        if(pagesToPrint <= this.pagesLeft && pagesToPrint < this.tonerVolume) {
            this.pagesLeft -= pagesToPrint;
            this.tonerVolume -= pagesToPrint;
        }
    }

    public int getPagesLeft() {
        return this.pagesLeft;
    }

    public double getTonerVolume() {
        return  this.tonerVolume;
    }
}
