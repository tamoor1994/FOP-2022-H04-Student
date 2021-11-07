package h04;
import fopbot.*;

public class CorrectnessCheck {

  final int BASIC_ARRAY_SIZE;


  public CorrectnessCheck(final int BASIC_ARRAY_SIZE) {
    this.BASIC_ARRAY_SIZE = BASIC_ARRAY_SIZE;
  }

  public void run() {
    init();
    System.out.println("1. Überprüfung: " + check1());
    swap();
    System.out.println("2. Überprüfung: " + check2());
    System.out.println("3. Überprüfung: " + check3());
  }


  private void init() {
    //TODO
  }

  private boolean check1() {
    //TODO
    throw new UnsupportedOperationException("Noch nicht implementiert");
  }

  private void swap() {
    //TODO
  }

  private boolean check2() {
    //TODO
    throw new UnsupportedOperationException("Noch nicht implementiert");
  }

  private boolean check3() {
    //TODO
    throw new UnsupportedOperationException("Noch nicht implementiert");
  }

}
