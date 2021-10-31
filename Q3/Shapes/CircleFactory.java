package Shapes;

import java.util.Scanner;

public class CircleFactory implements ShapeFactory {

  @Override
  public Shape createShape(Scanner sc) {
    PointFactory pf = new PointFactory();
    Point p = pf.createPoint(sc);
    System.out.print("Enter radius: ");
    int r = sc.nextInt();
    return new Circle(r, p);
  }

}
