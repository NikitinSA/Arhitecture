package solidprincipe4;

public class Main {
    public static void main(String[] args) {
        Working human = new HumanWorker();
        Eating humanEating = new HumanWorker();
        Working robot = new RobotWorker();

        human.work(); // Output: Человек работает
        humanEating.eat(); // Output: Человек ест
        robot.work(); // Output: Робот работает
    }
}