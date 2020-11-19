package com.practices.EncapsulationPractices;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }
    public void fillUp(int tonerRefill) {
        if (this.tonerLevel + tonerRefill <= 100) {
            this.tonerLevel += tonerRefill;
            System.out.println("Toner successfully refilled. Toner level is " + tonerLevel);
        } else {
            System.out.println("Failed to refill. Your toner level is still " + tonerLevel);
        }
    }
    public void printerUpdate() {
        if (this.tonerLevel <= 20) {
            System.out.println("Current tuner level is low. Please refill with amount of " + (100 - this.tonerLevel) + " toner");
            System.out.println(this.pagesPrinted + " pages are printed so far");
        } else {
            System.out.println("Current tuner level is: " + this.tonerLevel);
            System.out.println(this.pagesPrinted + " pages are printed so far");
        }
    }
    public void printingPages(int numberOfPages) {
        if (this.isDuplex) {
            this.pagesPrinted += (numberOfPages + (numberOfPages % 2)) / 2;
            this.tonerLevel -= (numberOfPages + (numberOfPages % 2)) / 2;
        } else {
            this.pagesPrinted += numberOfPages;
            this.tonerLevel -= numberOfPages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
