package h04;

public class FloorVector implements WithNaturalCoordinates {

    private double x;
    private double y;
    private double z;

    private Axis firstAxis;
    private Axis secondAxis;

    /**
     * Constructor of the class FloorVector
     * @param x gets the value of the attribute x
     */
    public FloorVector(double x) {
        this.x = x;
        this.y = 3.14;
        this.z = 2.71;
    }

    /**
     * @return x-coordinate
     */
    public double getRealX() {
        return x;
    }

    /**
     * @return y-coordinate
     */
    public double getRealY() {
        return y;
    }

    /**
     * @return z-coordinate
     */
    public double getRealZ() {
        return z;
    }

    /**
     * represents the x value
     * @param x equals the attribute x
     */
    public void setRealX(double x) {
        this.x = x;
    }

    /**
     * represents the y value
     * @param y equals the attribute y
     */
    public void setRealY(double y) {
        this.y = y;
    }

    /**
     * represents the z value
     * @param z equals the attribute z
     */
    public void setRealZ(double z) {
        this.z = z;
    }

    @Override
    public int getX() {
        return Math.abs(getValueOfAxis(firstAxis));
    }

    @Override
    public int getY() {
        return Math.abs(getValueOfAxis(secondAxis));
    }

    @Override
    public void setX(int x) {
        setValueForAxis(firstAxis, x);
    }

    @Override
    public void setY(int y) {
        setValueForAxis(secondAxis, y);
    }

    /**
     * @return the attribute firstAxis
     */
    public Axis getFirstAxis() {
        return firstAxis;
    }

    /**
     * @return the attribute secondAxis
     */
    public Axis getSecondAxis() {
        return secondAxis;
    }

    /**
     * sets the attribute firstAxis to
     * @param firstAxis
     */
    public void setFirstAxis(Axis firstAxis) {
        this.firstAxis = firstAxis;
    }

    /**
     * sets the attribute secondAxis to
     * @param secondAxis
     */
    public void setSecondAxis(Axis secondAxis) {
        this.secondAxis = secondAxis;
    }

    private void setValueForAxis(Axis axis, int value) {
        switch (axis) {
            case X:
                x = value;
                break;
            case Y:
                y = value;
                break;
            case Z:
                z = value;
                break;
            default:
                throw new IllegalArgumentException("Fehler!");
        }
    }

    private int getValueOfAxis(Axis axis) {
        switch (axis) {
            case X:
                return (int) x;
            case Y:
                return (int) y;
            case Z:
                return (int) z;
            default:
                throw new IllegalArgumentException("Fehler!!");
        }
    }
}
