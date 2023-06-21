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
        return false;
    }

    @Override
    public boolean test4(WithNaturalCoordinates[] array4) {
        return false;
    }
}
