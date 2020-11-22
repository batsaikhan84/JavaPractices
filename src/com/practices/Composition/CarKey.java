package com.practices.Composition;

public class CarKey {
    private String style;
    private boolean isRemote;

    public CarKey(String style, boolean isRemote) {
        this.style = style;
        this.isRemote = isRemote;
    }
    public void start() {
        System.out.println("Car is starting remotely");
    }
    public String getStyle() {
        return style;
    }

    public boolean isRemote() {
        return isRemote;
    }
}
