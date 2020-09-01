public class Circle {
    private double radius;
    private String center;

    public void setRadius(double r)
    {this.radius=r;}

    public double getRadius ()
    {return radius;}

    public void setCenter(String x,String y)
    {String n= ",";
    this.center=x+n+y;}

    public String getCenter ()
    {return center;}

    public double computeArea ()
    {
        double A= 3.1415 * (radius*radius);
        return A;
    }
}
