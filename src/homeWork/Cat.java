package homeWork;

public class Cat
{
    protected String name;
    protected int appetite;
    protected boolean satiety;
    public Cat (String name, int appetite, boolean satiety)
    {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate plate)
    {
        plate.decreaseFood(appetite);
    }
    public boolean isSatiety(int restAppetite)
    {
        return (restAppetite == 0);
    }
    public void whatSatiety(int whatAppetite)
    {
        System.out.println("satiety:" + isSatiety(whatAppetite));
    }
    public void decreaseAppetite(int b)
    {
        appetite -= b;
    }
}