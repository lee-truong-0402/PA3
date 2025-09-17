/**
 * Rectangle.java represents a stand rectangle shape, with a length, width, and area
 * all as a float.
 *
 * @invariant  length > 0 AND width > 0 AND area > 0 AND area = length * width
 */
public class Rectangle
{
    private float length;
    private float width;
    private float area;

    /**
     *parameterized constructor for rectangles.
     *
     * @param aLength length of the rectangle
     * @param aWidth width of the rectangle
     *
     * @pre aLength > 0 AND aWidth > 0
     *
     * @post length = aLength AND width = aWidth AND area = length * width
     */

    public Rectangle(float aLength, float aWidth){
        this.length = aLength;
        this.width = aWidth;
        this.area = this.length * this.width;
    }

    /**
     * standard getter for length
     *
     * @return the length of the rectangle
     *
     * @pre none
     *
     * @post getLength = length AND length = #length AND width = #width AND area = #area
     */

    public float getLength(){
        return length;
    }


    public void setLength(float aLength) {
        this.length = aLength;
        this.updateArea();
    }


    public float getWidth(){
        return this.width;
    }


    public void setWidth(float aWidth){
        this.width = aWidth;
        this.updateArea();
    }


    public void updateArea() {
        this.area = this.length * this.width;
    }


    public float getArea() {
        return this.area;
    }

    /**
     * Override of java.lang.Object used to compare an object to this rectangle. Rectangles
     * are equivalent if their dimensions are equal.
     *
     * @param obj the object to compare to this rectangle
     *
     * @return true or false depending on if obj has equal to this
     *
     * @pre none
     *
     * @post equals = true IFF obj is a rectangle AND and this share the same sizes for length
     * and width, false OW AND length = #length AND width = #width AND area = #area
     */

    public boolean equals(Object obj)
    {
        if(obj instanceof Rectangle rect)
            return (this.length == rect.length && this.width == rect.width);
        else
            return false;
    }


    public String toString() {
        return ("length = " + this.length + "  width = " + this.width + "  area = " + this.area);
    }

}
