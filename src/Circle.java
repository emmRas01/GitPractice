public class Circle
{
    public int radius = 12;

    public String getArea() //areal = r^2 * pi
    {
        double area = Math.PI * radius * radius;
        return "is: " + area;
    }

    public String getName()
    {
        return "Circle ";
    }
}
