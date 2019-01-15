public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void saveTheCity() {
        System.out.println("I, " + name + ", will save the city!");
    }
}
