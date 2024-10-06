package InheritanceInterface;

interface Instrument {
    void play();
}

class Guitar implements Instrument {
    public void play() {
        System.out.println("Playing guitar");
    }
}

class Interface12 {
    public static void main(String[] args) {
        Instrument instrument = new Guitar();
        instrument.play();
    }
}

