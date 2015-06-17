/**
 * Created by Henroid83 on 2/24/15.
 */
import java.text.DecimalFormat;

public class Cone {
    private double radius;
    private double height;

    // constructors
    public Cone()
    {
        radius = 1;
        height = 1;
    }

    public Cone(double r, double h)
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
    double calcArea()			// area = (π * R) * [sqrt(R² + H²)]  + π * R2
    {
        return Math.PI * radius * (Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2))) + Math.PI * Math.pow(radius,2);
    }

    double calcCircumference()	// circumference = PI * 2 * r
    {
        return Math.PI * 2 * radius;
    }

    double calcVolume()		// volume = 1 / 3 * h * (PI * r * r)
    {
        return (1.0/3.0) * height * (Math.PI * Math.pow(radius, 2));
    }

    // display method

    /*
    blank line
    ***** Cone *****
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
        System.out.println("***** Cone *****");
        System.out.println("radius\t\t" + df.format(getRadius()));
        System.out.println("height\t\t" + df.format(getHeight()));
        System.out.println("surface area\t\t" + df.format(calcArea()));
        System.out.println("circumference\t\t" + df.format(calcCircumference()));
        System.out.println("volume\t\t" + df.format(calcVolume()));
        System.out.println();
    }
}
