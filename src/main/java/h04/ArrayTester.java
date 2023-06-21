package h04;

public interface ArrayTester {

    default boolean testAll(ArrayProducer producer, int arraySize){
        //TODO: H3.3
    }

    boolean test1(RepetitiveRobot[] array1);

    boolean test3(WithNaturalCoordinates[] array3);

    boolean test4(WithNaturalCoordinates[] array4);


}
