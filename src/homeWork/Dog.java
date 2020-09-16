package homeWork;

public class Dog extends Animals
{
    Dog(String name, int metresRun, int metresSwim, double metresJump)
    {
        super(name, metresRun, metresSwim, metresJump);
    }

    void run()
    {
        System.out.println(name + " can run " + metresRun + " metres");
    }

    void swim()
    {
        System.out.println(name + " can swim " + metresSwim + " metres");
    }

    void jump()
    {
        System.out.println(name + " can jump up to " + metresJump + " metres");
    }
}
