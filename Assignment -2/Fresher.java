package Assignment2;

public class Fresher {
    int id;
    String name;

    void setData(int i, String n) {
        id = i;
        name = n;
    }
// Object Initialization using Methods
class Main {
    public static void main(String[] args) {
        Fresher f = new Fresher();
        f.setData(103, "Hari");

        // Output
        System.out.println("ID: " + f.id);
        System.out.println("Name: " + f.name);
    }
}
