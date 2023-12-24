abstract class Game
{
    abstract void play();
}
class Cricket extends Game
{
    void play()
    {
        System.out.println("Tennis is outdoor game.");
    }
}
class Tennis extends Cricket
{
    void play()
    {
        System.out.println("Cricket is outdoor game");
    }
}
class Abstract_class
{
    public static void main(String[] args) {
        Cricket c=new Cricket();
        Tennis t=new Tennis();
        c.play();
        //Game g=new Game();
        //g.play();
        //t.play();
    }
}