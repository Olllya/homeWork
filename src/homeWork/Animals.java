package homeWork;

public abstract class Animals
{
    protected String name;
    protected int metresRun;
    protected double metresJump;
    protected int metresSwim;

    Animals(String name, int metresRun, int metresSwim, double metresJump)
    {
        this.name = name;
        this.metresRun = metresRun;
        this.metresJump = metresJump;
        this.metresSwim = metresSwim;
    }

    abstract void run();
    abstract void swim();
    abstract void jump();

}
