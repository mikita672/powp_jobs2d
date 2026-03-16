package edu.kis.powp.jobs2d.features;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.ILine;

public class CustomLine implements ILine {
    private int startX, startY, endX, endY;
    private Color color;
    private float thickness;
    private boolean dotted;

    public CustomLine(Color color, float thickness, boolean dotted) {
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public float getThickness() {
        return thickness;
    }

    @Override
    public boolean isDotted() {
        return dotted;
    }

    @Override
    public int getStartCoordinateX() {
        return startX;
    }

    @Override
    public int getEndCoordinateX() {
        return endX;
    }

    public int getStartCoordinateY() {
        return startY;
    }

    public int getEndCoordinateY() {
        return endY;
    }

    public void setStartCoordinates(final int x, final int y) {
        this.startX = x;
        this.startY = y;
    }

    public void setEndCoordinates(final int x, final int y) {
        this.endX = x;
        this.endY = y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
