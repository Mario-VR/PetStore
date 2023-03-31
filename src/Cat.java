public class Cat extends Pets {
    private String color;

    public Cat(String species, String name, int age, String vaccines, String color) {
        super(species, name, age, vaccines);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;


    }


    public String toString() {
        String texto = "El: " + this.getSpecies() + "\nCon nombre: " + this.getName() + "\ny edad de: " + this.getAge() + " años" + "\ncon No. de vacunas: " + this.getVaccines() + "\nEsta listo para su adopcion/compra";
        return texto;
    }
}
