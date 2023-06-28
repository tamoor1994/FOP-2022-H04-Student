package h04;

public class ArrayTesterImpl implements ArrayTester {

    @Override
    public boolean test1(RepetitiveRobot[] array1) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].getPutCoinRepetitions() != i)
                return false;
        }
        return true;
    }

    @Override
    public boolean test3(WithNaturalCoordinates[] array3) {
        for (int i = 0; i < array3.length; i++) {
            if (array3[2 * i].getX() != 2 * i || array3[2 * i].getY() != i) {
                return false;
            }
            if (array3[2 * i].getX() != getValueOfAxis(Axis.values()[i % 3], i) || array3[2 * i].getY() != getValueOfAxis(Axis.values()[(i % 3) % 3], i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean test4(WithNaturalCoordinates[] array4) {
        for (int i = 0; i < array4.length; i++) {
            if (array4[2 * i + 1].getX() != 2 * i || array4[2 * i + 1].getY() != i) {
                return false;
            }
            if (array4[2 * i].getX() != getValueOfAxis(Axis.values()[i % 3], i) || array4[2 * i].getY() != getValueOfAxis(Axis.values()[(i % 3) % 3], i)) {
                return false;
            }
        }
        return true;
    }

    private int getValueOfAxis(Axis axis, int index) {
        switch (axis) {
            case X:
                return 3 * index;
            case Y:
                return 4 * index;
            case Z:
                return 5 * index;
            default:
                throw new IllegalArgumentException("Fehler!!");
        }
    }
}
