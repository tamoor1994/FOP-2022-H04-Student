package h04;

public class ArrayProducerImpl implements ArrayProducer {

    @Override
    public RepetitiveRobotImpl[] produceArray1(int arraySize) {
        RepetitiveRobotImpl[] repetitiveRobots = new RepetitiveRobotImpl[arraySize];
        for (int i = 0; i < arraySize; i++) {
            RepetitiveRobotImpl robot = new RepetitiveRobotImpl(0);
            robot.setY(1);
            robot.setX(2 * i);
            robot.putCoin(i);

            repetitiveRobots[i] = robot;
        }

        return repetitiveRobots;
    }

    @Override
    public FloorVector[] produceArray2(int arraySize) {
        FloorVector[] floorVectors = new FloorVector[arraySize];
        for (int i = 0; i < arraySize; i++) {
            FloorVector vector = new FloorVector(3 * i + 0.1);
            vector.setRealX(3 * i + 0.1);
            vector.setRealY(4 * i + 0.2);
            vector.setRealZ(5 * i + 0.3);

            vector.setFirstAxis(Axis.values()[i % 3]);
            vector.setSecondAxis(Axis.values()[(i + 1) % 3]);

            floorVectors[i] = vector;
        }

        return floorVectors;
    }

    @Override
    public WithNaturalCoordinates[] produceArray3(RepetitiveRobotImpl[] array1, FloorVector[] array2) {
        WithNaturalCoordinates[] array3 = new WithNaturalCoordinates[2 * array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[2 * i] = array1[i];
            array3[2 * i + 1] = array2[i];
        }

        return array3;
    }

    @Override
    public WithNaturalCoordinates[] produceArray4(WithNaturalCoordinates[] array) {
        WithNaturalCoordinates[] array4 = new WithNaturalCoordinates[array.length];
        for (int i = 0; i < array.length; i++) {
            array4[2 * i + 1] = array[2 * i];
            array4[2 * i] = array[2 * i + 1];
        }

        return array4;
    }
}
