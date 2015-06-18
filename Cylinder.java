/**
 * Created by Henry Nichols on 2/24/15.
 */
import java.text.DecimalFormat;

public class Cylinder {
    private double radius;
    private double height;

    // constructors
    public Cylinder()
    {
        radius = 1;
        height = 1;
    }

    public Cylinder(double r, double h)
    {
        radius = r;
        height = h;
    }

    // setters
    public void setRadius(double r)
    {
        radius = r;
    }

    public void setHeight(double h)
    {
        height = h;
    }

    // getters
    public double getRadius()
    {
        return radius;
    }

    public double getHeight()
    {
        return height;
    }

    // other methods
    public double calcArea()		  // area = 2 * (PI * r * r) + (PI * 2 * r) * h
    {
        return 2 * (Math.PI * Math.pow(radius, 2)) + (Math.PI * 2 * radius) * height;
    }

    public double calcCircumference()	  // circumference = PI * 2 * r
    {
        return Math.PI * 2 * radius;
    }

    public double calcVolume()		  // volume = h * (PI * r * r)
    {
        return height * (Math.PI * Math.pow(radius, 2));
    }

    // display method

    /*
    blank line
    ***** Cylinder *****
    radius			nnnn.nn
    height			nnnn.nn
    surface area		nnnn.nn
    circumference	nnnn.nn
    volume		nnnn.nn
    blank line
     */

    public void display()
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        System.out.println();
        System.out.println("***** Cylinder *****");
        System.out.println("radius\t\t" + df.format(getRadius()));
        System.out.println("height\t\t" + df.format(getHeight()));
        System.out.println("surface area\t\t" + df.format(calcArea()));
        System.out.println("circumference\t\t" + df.format(calcCircumference()));
        System.out.println("volume\t\t" + df.format(calcVolume()));
        System.out.println();
    }
}
