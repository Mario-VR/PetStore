public class Dog extends Pets {
    private String breed;

    public Dog(String species, String name, int age, String vaccines, String breed) {
        super(species, name, age, vaccines);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString(){
        String texto = "El:" + this.getSpecies() + "\nCon nombre: " + this.getName() + "\ny edad de: " + this.getAge() + " años" + "\ncon No. de vacunas: " + this.getVaccines() + "\nEsta listo para su adopcion/compra";
  return texto;
    }
}
