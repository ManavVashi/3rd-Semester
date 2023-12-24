interface Colorable
{
    void howToColor();
}
// class GeometricObject
// {

// }
class Square implements Colorable
{ 
    void howToColor()
    {
        System.out.println("Color all four sides");
    }
}