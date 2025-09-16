import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import distance.Point3D;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the {@link Point3D} class. Tests constructors, getters, distance calculation, and
 * equality.
 */
class Point3DTest {
  private Point3D defaultPoint;
  private Point3D paramPoint;
  private Point3D copyPoint;

  /** Sets up test fixtures before each test. */
  @BeforeEach
  void setUp() {
    defaultPoint = new Point3D();
    paramPoint = new Point3D(1, 2, 3);
    copyPoint = new Point3D(paramPoint);
  }

  /** Tests the default constructor initializes coordinates to zero. */
  @Test
  void testDefaultConstructor() {
    assertEquals(0, defaultPoint.getX());
    assertEquals(0, defaultPoint.getY());
    assertEquals(0, defaultPoint.getZ());
  }

  /** Tests the parameterized constructor initializes coordinates correctly. */
  @Test
  void testParamConstructor() {
    assertEquals(1, paramPoint.getX());
    assertEquals(2, paramPoint.getY());
    assertEquals(3, paramPoint.getZ());
  }

  /** Tests the copy constructor creates an identical point. */
  @Test
  void testCopyConstructor() {
    assertEquals(paramPoint.getX(), copyPoint.getX());
    assertEquals(paramPoint.getY(), copyPoint.getY());
    assertEquals(paramPoint.getZ(), copyPoint.getZ());
  }

  /** Tests the getX method. */
  @Test
  void getX() {
    assertEquals(1, paramPoint.getX());
  }

  /** Tests the getY method. */
  @Test
  void getY() {
    assertEquals(2, paramPoint.getY());
  }

  /** Tests the getZ method. */
  @Test
  void getZ() {
    assertEquals(3, paramPoint.getZ());
  }

  /** Tests the distanceTo method for correct distance calculation. */
  @Test
  void distanceTo() {
    Point3D p1 = new Point3D(0, 0, 0);
    Point3D p2 = new Point3D(3, 4, 12);
    assertEquals(13.0, p1.distanceTo(p2), 1e-9);
    assertEquals(0.0, p1.distanceTo(p1), 1e-9);
  }

  /** Tests the equals method for correct equality checks. */
  @Test
  void testEquals() {
    Point3D a = new Point3D(1, 2, 3);
    Point3D b = new Point3D(1, 2, 3);
    Point3D c = new Point3D(3, 2, 1);
    assertEquals(a, b);
    assertNotEquals(a, c);
    assertNotEquals(null, a);
    assertEquals(a, a);
  }
}
