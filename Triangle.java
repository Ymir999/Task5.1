package Task6;

public class Triangle extends GeomFigure{
    int AB,BC,AC;


    public Triangle(int a, int b, int c) {
        AB = a;
        BC = b;
        AC = c;
    }

    @Override
    public int GetPerimeter() {
        int Perimeter = 0;
        if(AB != BC && AB < AC && BC <   AC && AB+BC > AC) {
            Perimeter = AB + BC + AC;
        }
        return Perimeter;
    }

    public double GetHeightTriangle()
    {
        double height;
        int semiP;
        semiP = GetPerimeter() / 2;
        height = (2 * Math.sqrt(semiP * (semiP - AB) * (semiP - BC) * (semiP - AC))) / AC;

        return Math.round(height);
    }

    @Override
    public double GetArea() {
        double Area = 0;
        Area = (AC * GetHeightTriangle())/ 2;
        return Area;
    }
}
