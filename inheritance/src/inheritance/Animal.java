package inheritance;

public class Animal {

    private int brain;
    private int body;
    private int size;
    private  int weight;
    private String name;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void eat(){

        System.out.println("Animal eat methods called");

    }

    public void move(){

    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
