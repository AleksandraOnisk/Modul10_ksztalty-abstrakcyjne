public class ShapeCalculatorTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        Circle circle = new Circle(5);
        Line2D line = new Line2D(5.2, 5.2, 5.2, 5.2);
        Ball ball = new Ball(5);
        Cube cube = new Cube(5);

        ShapeCalculator calculator = new ShapeCalculator();
        System.out.println(rectangle.toString() + " ma pole " + calculator.calculateArea(rectangle));
        System.out.println(circle.toString() + " ma pole " + calculator.calculateArea(circle));
        System.out.println(line.toString() + " ma długość " + calculator.lineLength(line));
        System.out.println(ball.toString() + " ma objętość " + calculator.ballVolume(ball));
        System.out.println(cube.toString() + " ma objętość " + calculator.cubeVolume(cube));
    }
}
