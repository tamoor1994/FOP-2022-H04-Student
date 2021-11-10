package h04;

public interface ArrayProducer {
  RobotWithNaturalCoordinatesAndClockDirection[] produceArray1(int arraySize);
  RealValuedPoint3D[] produceArray2(int arraySize);
  WithNaturalCoordinates[] produceArray3(RobotWithNaturalCoordinatesAndClockDirection[] array1, RealValuedPoint3D[] array2);
  WithClockDirection[] produceArray4(RobotWithNaturalCoordinatesAndClockDirection[] array1);
}
