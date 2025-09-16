package distance;

/**
 * The distance.Main class demonstrates the usage of distance.Point3D and distance.Physics classes. It calculates the
 * displacement and velocity between two 3D points.
 */
public class Main {
  /**
   * The entry point of the application.
   *
   * @param args the command-line arguments
   */
  public static void main(String[] args) {
    try {
      Point3D one = new Point3D();
      Point3D two = new Point3D(1, 2, 3);
      System.out.println("Displacement = " + one.distanceTo(two));
      double velocity = Physics.velocity(one, two, 5);
      System.out.println("Prof. Keith is on the move! His Velocity = " + velocity);
      velocity = Physics.velocity(one, two, 0);
      System.out.println("Velocity =" + velocity);
    } catch (IllegalArgumentException e) {
      System.out.println("Encountered an error: " + e.getMessage());
    }
  }
}
