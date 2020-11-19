package com.practices.EncapsulationPractices;

public class Main {
    public static void main(String[] args) {
        Printer brother2700 = new Printer(100, 0, false);
        System.out.println("Number of pages printed: " + brother2700.getPagesPrinted());
        System.out.println("Current toner level: " + brother2700.getTonerLevel());

        brother2700.printingPages(85);
        brother2700.printerUpdate();
        brother2700.fillUp(80);
        brother2700.printerUpdate();
    }

}
