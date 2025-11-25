public class Circle
{
    public int radius = 12;

    public String getArea() //areal = r^2 * pi
    {
        double area = Math.PI * radius * radius;
        return "Area of a Circle is: " + area;
    }

    public String getName()
    {
        return "Circle: ";
    }
}
