public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

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
        return super.lineLength(line);
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
