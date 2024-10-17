package com.dmdev.oop.lesson11;

public abstract class Computer implements Printable {

    private Ram ram;
    private Ssd ssd;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public abstract void load();

    @Override
    public void print() {
        System.out.println("Ssd " + ssd.getValue() + ", Ram " + ram.getValue());
    }

    public Ram getRam() {
        return ram;
    }

    public Ssd getSsd() {
        return ssd;
    }
}
