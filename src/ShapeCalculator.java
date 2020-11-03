public class ShapeCalculator implements Calc2D, Calc3D {

    @Override
    public double calculateArea(Circle circle) {
        return Shape.PI * Math.pow(circle.getR(), 2);
    }

    @Override
    public double calculateArea(Rectangle rectangle) {
        return rectangle.getA() + rectangle.getB();
    }

    @Override
    public double lineLength(Line2D line) {
        return Math.sqrt(Math.pow((line.getX2() - line.getX1()), 2) + Math.pow((line.getY2() - line.getY1()), 2));
    }

    @Override
    public double ballVolume(Ball ball) {
        return Shape.BA * Shape.PI * Math.pow(ball.getR(), 3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getA(), 3);
    }
}
