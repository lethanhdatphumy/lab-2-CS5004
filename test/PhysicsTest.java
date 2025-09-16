import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/** Unit tests for the {@link Physics} class. */
class PhysicsTest {

  /** Tests velocity calculation with valid input. */
  @Test
  void testVelocityNormal() {
    Point3D p1 = new Point3D(0, 0, 0);
    Point3D p2 = new Point3D(3, 4, 0);
    double velocity = Physics.velocity(p1, p2, 5.0);
    assertEquals(1.0, velocity, 1e-9); // distance is 5, time is 5
  }

  /** Tests velocity throws IllegalArgumentException for zero elapsed time. */
  @Test
  void testVelocityZeroElapsedTime() {
    Point3D p1 = new Point3D(0, 0, 0);
    Point3D p2 = new Point3D(1, 1, 1);
    assertThrows(IllegalArgumentException.class, () -> Physics.velocity(p1, p2, 0));
  }

  /** Tests velocity throws IllegalArgumentException for negative elapsed time. */
  @Test
  void testVelocityNegativeElapsedTime() {
    Point3D p1 = new Point3D(0, 0, 0);
    Point3D p2 = new Point3D(1, 1, 1);
    assertThrows(IllegalArgumentException.class, () -> Physics.velocity(p1, p2, -2));
  }

  /** Tests velocity throws IllegalArgumentException if first point is null. */
  @Test
  void testVelocityNullFirstPoint() {
    Point3D p2 = new Point3D(1, 1, 1);
    assertThrows(IllegalArgumentException.class, () -> Physics.velocity(null, p2, 1));
  }

  /** Tests velocity throws IllegalArgumentException if second point is null. */
  @Test
  void testVelocityNullSecondPoint() {
    Point3D p1 = new Point3D(1, 1, 1);
    assertThrows(IllegalArgumentException.class, () -> Physics.velocity(p1, null, 1));
  }
}
