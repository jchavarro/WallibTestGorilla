package willab.test.facade.shapes;

/**
 * Shapemaker to any shape
 */
public class ShapeMaker {

    /**
     * Draw a circle shape.
     */
    public void drawCircle () {
        Circle circle = new Circle();
        circle.draw();
    }

    /**
     * Draw a rectangle shape.
     */
    public void drawRectangle () {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }

    /**
     * Draw a square shape.
     */
    public void drawSquare () {
        Square square = new Square();
        square.draw();
    }
}
