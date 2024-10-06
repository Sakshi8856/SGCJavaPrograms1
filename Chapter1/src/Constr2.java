public class Constr2 {
    int id;
    String name;

    public Constr2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        // Creating objects with id and name
        Constr2 s1 = new Constr2(1, "Sakshi");
        Constr2 s2 = new Constr2(2, "Rani");
        s1.display();
        s2.display();
    }
}
