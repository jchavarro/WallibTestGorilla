package willab.test.facade;

import willab.test.facade.shapes.ShapeMaker;

/**
 * Main class.
 */
public class FacadeDemo {

    /**
     * Main class of willab.test.facade.shapes.
     * @param args arrayArgs.
     */
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
