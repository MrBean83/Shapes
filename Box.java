/**
 * Created by Henroid83 on 2/24/15.
 */
import java.text.DecimalFormat;

public class Box {
    private double length;
    private double width;
    private double height;

    // constructors
    public Box()
    {
        length  = 1;
        width   = 1;
        height  = 1;
    }

    public Box(double x)
    {
        length = x;
        width  = x;
        height  = x;
    }

    public Box(double l, double w, double h)
    {
        length = l;
        width  = w;
        height  = h;
    }

    // setters
    public void setLength(double l)
    {
        length = l;
    }

    public void setWidth(double w)
    {
        width = w;
    }

    public void setHeight(double h)
    {
        height = h;
    }

    // getters
    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    // other methods
    public double calcArea()		// area = 2 * l * w + 2 * l * h + 2 * w * h
    {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    public double calcVolume()	// volume   =  l * w * h
    {
        return length * width * height;
    }

    // display method

    /*
    blank line
    ***** Box *****
    length			nnnn.nn
    width			nnnn.nn
    height			nnnn.nn
    surface area		nnnn.nn
    volume		nnnn.nn
    blank line
     */

    public void display()
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        System.out.println();
        System.out.println("***** Box *****");
        System.out.println("length\t\t" + df.format(getLength()));
        System.out.println("width\t\t" + df.format(getWidth()));
        System.out.println("height\t\t" + df.format(getHeight()));
        System.out.println("surface area\t\t" + df.format(calcArea()));
        System.out.println("volume\t\t" + df.format(calcVolume()));
        System.out.println();
    }
}
