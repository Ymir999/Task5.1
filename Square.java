package Task6;

public class Square extends GeomFigure
{
     int length;
     int width;


    public Square(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public int GetPerimeter()
    {
        int Perimeter = 0;
        if (length == width)
        {
            Perimeter = 4 * length;
        }
        return Perimeter;
    }

    @Override
    public double GetArea()
    {
        int Area = 0;
        if (length == width)
        {
            Area  = length * width;
        }
        return Area;
    }
}
