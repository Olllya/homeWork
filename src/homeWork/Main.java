package homeWork;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here




        Animals[] animals = getAnimals();
        for (int i = 0; i < animals.length; i++)
        {
            animals[i].run();
            animals[i].swim();
            animals[i].jump();

            System.out.println("Введи сколько ты хочешь, чтобы пробежала " + animals[0].name);
            Scanner scanner = new Scanner(System.in);

            int runFromUser = scanner.nextInt();
            if (runFromUser <= animals[0].metresRun)
            {
                System.out.println(animals[0].name + " бежит!!!");
            }
            else
            {
                System.out.println(animals[0].name + " не может столько пробежать((");
            }



            System.out.println("Введи сколько ты хочешь, чтобы пробежала " + animals[1].name);
            Scanner scanner1 = new Scanner(System.in);
            int runFromUser1 = scanner1.nextInt();
            if (runFromUser1 <= animals[1].metresRun)
            {
                System.out.println(animals[1].name + " бежит!!!");
            }
            else
            {
                System.out.println(animals[1].name + " не может столько пробежать((");
            }

            System.out.println("Введи сколько ты хочешь, чтобы пробежала " + animals[2].name);
            int runFromUser3 = scanner1.nextInt();
            if (runFromUser3 <= animals[2].metresRun)
            {
                System.out.println(animals[2].name + " бежит!!!");
            }
            else
            {
                System.out.println(animals[2].name + " не может столько пробежать((");
            }

            System.out.println("Введи сколько ты хочешь, чтобы пробежала " + animals[3].name);
            int runFromUser4 = scanner.nextInt();
            if (runFromUser4 <= animals[3].metresRun)
            {
                System.out.println(animals[3].name + " бежит!!!");
            }
            else
            {
                System.out.println(animals[3].name + " не может столько пробежать((");
            }

            System.out.println("Введи сколько ты хочешь, чтобы прыгнул " + animals[0].name);
            int jumpFromUser1 = scanner1.nextInt();
            if (jumpFromUser1 <= animals[0].metresJump)
            {
                System.out.println(animals[0].name + " прыгнул!!!");
            }
            else
            {
                System.out.println(animals[0].name + " не может прыгнуть так высоко((");
            }

            System.out.println("Введи сколько ты хочешь, чтобы прыгнул " + animals[1].name);
            int jumpFromUser2 = scanner1.nextInt();
            if (jumpFromUser2 <= animals[1].metresJump)
            {
                System.out.println(animals[1].name + " прыгнул!!!");
            }
            else
            {
                System.out.println(animals[1].name + " не может прыгнуть так высоко((");
            }

            System.out.println("Введи сколько ты хочешь, чтобы прыгнул " + animals[2].name);
            int jumpFromUser3 = scanner1.nextInt();
            if (jumpFromUser3 <= animals[2].metresJump)
            {
                System.out.println(animals[2].name + " прыгнул!!!");
            }
            else
            {
                System.out.println(animals[2].name + " не может прыгнуть так высоко((");
            }

            System.out.println("Введи сколько ты хочешь, чтобы прыгнул " + animals[3].name);
            int jumpFromUser4 = scanner1.nextInt();
            if (jumpFromUser4 <= animals[3].metresJump)
            {
                System.out.println(animals[3].name + " прыгнул!!!");
            }
            else
            {
                System.out.println(animals[3].name + " не может прыгнуть так высоко((");
            }

            System.out.println("Введи сколько ты хочешь, чтобы проплыл " + animals[0].name);
            int swimFromUser1 = scanner1.nextInt();
            if (swimFromUser1 <= animals[0].metresJump)
            {
                System.out.println(animals[0].name + " плывет!!!");
            }
            else
            {
                System.out.println(animals[0].name + " не может столько проплыть((");
            }

            System.out.println("Введи сколько ты хочешь, чтобы проплыл " + animals[1].name);
            int swimFromUser2 = scanner1.nextInt();
            if (swimFromUser2 <= animals[1].metresJump)
            {
                System.out.println(animals[1].name + " плывет!!!");
            }
            else
            {
                System.out.println(animals[1].name + " не может столько проплыть((");
            }

            System.out.println("Введи сколько ты хочешь, чтобы проплыл " + animals[2].name);
            int swimFromUser3 = scanner1.nextInt();
            if (swimFromUser3 <= animals[2].metresJump)
            {
                System.out.println(animals[2].name + " плывет!!!");
            }
            else
            {
                System.out.println(animals[2].name + " не может столько проплыть((");
            }

            System.out.println("Введи сколько ты хочешь, чтобы проплыл " + animals[3].name);
            int swimFromUser4 = scanner1.nextInt();
            if (swimFromUser4 <= animals[3].metresJump)
            {
                System.out.println(animals[3].name + " плывет!!!");
            }
            else
            {
                System.out.println(animals[3].name + " не может столько проплыть((");
            }
            break;



        }


    }

    static Animals[] getAnimals()
    {
        Animals cat1 = new Cat("Ronya", 250, 0, 3);
        Animals cat2 = new Cat("Snikers", 200, 0, 2);
        Animals dog1 = new Dog("Mufik", 600, 10, 0.5);
        Animals dog2 = new Dog("Mufusail", 400, 20, 0.3);

        Animals[] animals = {cat1, cat2, dog1, dog2};
        return animals;
    }

}
