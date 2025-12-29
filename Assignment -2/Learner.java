package Assignment2;

public class Learner {
    int id;
    String name;

    Learner(int i, String n) {
        id = i;
        name = n;
    }
}
class Main {
    public static void main(String[] args) {
        Learner l1 = new Learner(101, "Ram");
        Learner l2 = new Learner(102, "Gita");

        System.out.println(l1.id + " " + l1.name);
        System.out.println(l2.id + " " + l2.name);
    }
}
