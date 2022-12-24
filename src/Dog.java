public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name ='" + name + '\'' +
                ", weight =" + weight +
                '}';
    }
}
