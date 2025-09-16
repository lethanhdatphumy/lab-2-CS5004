/**
 * Represents a point in 3-dimensional space with integer coordinates.
 * Provides constructors, getters, distance calculation, and equality check.
 */
public class Point3D {
  private final int x;
  private final int y;
  private final int z;

  /**
   * Constructs a Point3D at the origin (0, 0, 0).
   */
  public Point3D() {
    this.x = 0;
    this.y = 0;
    this.z = 0;
  }

  /**
   * Constructs a Point3D with the specified coordinates.
   *
   * @param x the x-coordinate
   * @param y the y-coordinate
   * @param z the z-coordinate
   */
  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Constructs a Point3D by copying another Point3D.
   *
   * @param point3D the Point3D to copy
   */
  public Point3D(Point3D point3D) {
    this.x = point3D.x;
    this.y = point3D.y;
    this.z = point3D.z;
  }

  /**
   * Returns the x-coordinate of this point.
   *
   * @return the x-coordinate
   */
  public Integer getX() {
    return x;
  }

  /**
   * Returns the y-coordinate of this point.
   *
   * @return the y-coordinate
   */
  public Integer getY() {
    return y;
  }

  /**
   * Returns the z-coordinate of this point.
   *
   * @return the z-coordinate
   */
  public Integer getZ() {
    return z;
  }

  /**
   * Calculates the Euclidean distance from this point to another Point3D.
   *
   * @param other the other Point3D
   * @return the distance between the two points
   */
  public double distanceTo(Point3D other) {
    double dx = this.x - other.x;
    double dy = this.y - other.y;
    double dz = this.z - other.z;
    return Math.sqrt(dx * dx + dy * dy + dz * dz);
  }

  /**
   * Checks if this Point3D is equal to another object.
   *
   * @param obj the object to compare
   * @return true if the object is a Point3D with the same coordinates, false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;

    Point3D other = (Point3D) obj;
    return this.x == other.x && this.y == other.y && this.z == other.z;
  }
}
