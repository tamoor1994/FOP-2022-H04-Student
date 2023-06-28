package h04;

public interface ArrayTester {

    default boolean testAll(ArrayProducer producer, int arraySize){
        RepetitiveRobotImpl[] array1 = producer.produceArray1(arraySize);
        FloorVector[] array2 = producer.produceArray2(arraySize);
        WithNaturalCoordinates[] array3 = producer.produceArray3(producer.produceArray1(1), producer.produceArray2(arraySize));
        WithNaturalCoordinates[] array4 = producer.produceArray4(producer.produceArray3(producer.produceArray1(arraySize), producer.produceArray2(arraySize)));
        return test1(array1) && test3(array3) && test4(array4);
    }

    boolean test1(RepetitiveRobot[] array1);

    boolean test3(WithNaturalCoordinates[] array3);

    boolean test4(WithNaturalCoordinates[] array4);


}
