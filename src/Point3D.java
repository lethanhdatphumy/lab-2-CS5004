public class Point3D {
  private int x, y, z;

  /*
   ** A no-parameter constructor (aka the "default" constructor). This should set the values of x, y, and z to zero (0).
   */
  public Point3D() {
    this.x = 0;
    this.y = 0;
    this.z = 0;
  }

  /*
   ** A constructor that takes 3 integers, representing x, y, z in that order
   */
  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /*
   ** A "copy constructor" that takes a Point3D as its only parameter
   */
  public Point3D(Point3D point3D) {
    this.x = point3D.x;
    this.y = point3D.y;
    this.z = point3D.z;
  }

  /*
   ** Getter method for x
   */
  public Integer getX() {
    return x;
  }

  /*
   ** Getter method for y
   */
  public Integer getY() {
    return y;
  }

  /*
   ** Getter method for z
   */
  public Integer getZ() {
    return z;
  }

  /*
   ** The method for calculating distance to another 3D vector
   */
  public double distanceTo(Point3D other) {
    double dx = this.x - other.x;
    double dy = this.y - other.y;
    double dz = this.z - other.z;
    return Math.sqrt(dx * dx + dy * dy + dz * dz);
  }

  /*
   ** An equals method that allows us to compare a Point3D instance to another Point3D object. Using hashCode.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;

    Point3D other = (Point3D) obj;
    return this.x == other.x && this.y == other.y && this.z == other.z;
  }
}
