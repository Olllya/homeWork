package homeWork;

public class Plate
{
    protected int food;
    public  Plate (int food)
    {
        this.food = food;
    }
    public void showInfo()
    {
        System.out.println("plate: " + food);
    }
    public void decreaseFood(int a)
    {
        food -= a;
    }
}

