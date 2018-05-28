import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RectangleTest {

    @Test
    public void returnPerimeterOfRectangle() {
        Rectangle rectangle = new Rectangle(2.0 , 4.0);

        assertEquals(12.0,rectangle.calculatePerimeter(), 0);
    }
}
