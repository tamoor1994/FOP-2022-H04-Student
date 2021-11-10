package h04;
import fopbot.*;

public class CorrectnessCheck {

  ArrayProducer producer;
  ArrayTester tester;
  int arraySize;


  public CorrectnessCheck(ArrayProducer producer, ArrayTester tester, int arraySize) {
    this.producer = producer;
    this.tester = tester;
    this.arraySize = arraySize;
  }

  public void run() {
    RobotWithNaturalCoordinatesAndClockDirection[] array1 =  producer.produceArray1(arraySize);
    RealValuedPoint3D[] array2 = producer.produceArray2(arraySize);
    WithNaturalCoordinates[] array3 =  producer.produceArray3(array1, array2);
    WithClockDirection[] array4 = producer.produceArray4(array1);

    System.out.println("Test 1: " + (tester.test1(array3) ? "Working" : "Error"));
    array3 = tester.swap(array3);
    System.out.println("Test 2: " + (tester.test2(array3) ? "Working" : "Error"));
    System.out.println("Test 3: " + (tester.test3(array4) ? "Working" : "Error"));
  }







}
