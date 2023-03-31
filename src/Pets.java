public class Pets {
    private String species;
    private String name;
    private int age;

    private String vaccines;

    public  Pets(){

    }

    // Constructor de la clase
    public Pets(String species, String name, int age, String vaccines) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.vaccines = vaccines;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVaccines() {
        return vaccines;
    }

    public void setVaccines(String vaccines) {
        this.vaccines = vaccines;
    }
}
