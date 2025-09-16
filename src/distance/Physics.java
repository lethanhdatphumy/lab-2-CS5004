package distance;

/**
 * Utility class for physics-related calculations involving distance.Point3D objects.
 */
public class Physics {

  /**
   * Calculates the average velocity between two distance.Point3D objects over a given time period.
   * Average velocity = distance / time
   *
   * @param one The first distance.Point3D position
   * @param two The second distance.Point3D position
   * @param elapsedTime The time elapsed between the two positions
   * @return The average velocity (unitless)
   * @throws IllegalArgumentException if elapsedTime is zero or negative, or if points are null
   */
  public static double velocity(Point3D one, Point3D two, double elapsedTime) {
    // Validate input parameters
    if (one == null || two == null) {
      throw new IllegalArgumentException("distance.Point3D objects cannot be null");
    }

    if (elapsedTime <= 0) {
      throw new IllegalArgumentException("Elapsed time must be positive and greater than zero");
    }

    // Calculate distance between the two points
    double distance = one.distanceTo(two);

    // Calculate and return average velocity
    return distance / elapsedTime;
  }
}
