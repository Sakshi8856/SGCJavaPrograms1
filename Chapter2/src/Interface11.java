package InheritanceInterface;

interface Marker {}

class MarkerImpl implements Marker {
    void display() {
        System.out.println("This class implements a marker interface");
    }
}

class Interface11 {
    public static void main(String[] args) {
        MarkerImpl obj = new MarkerImpl();
        if (obj instanceof Marker) {
            obj.display();
        }
    }
}

