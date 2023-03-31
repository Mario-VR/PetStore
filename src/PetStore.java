public class PetStore {
    public static void main(String[] args) {
        Dog Dog1 = new Dog("Canino", "Firulais", 2, "Todas", "Labrador");
        System.out.println("Nombre del perro: " + Dog1.getName() + "\nRaza: " + Dog1.getBreed() + "\nEdad: " + Dog1.getAge() + "\nVacunas: " + Dog1.getVaccines());

        Cat Cat1 = new Cat("Felino", "Pelusa", 3,"Todas" ,"White");
        System.out.println("\nNombre del gato: " + Cat1.getName() + "\nColor: " + Cat1.getColor() + "\nEdad:" + Cat1.getAge() + "\nVacunas: " + Cat1.getVaccines());

        //con sobrecarga de metodos//
        System.out.println("\nMetodo toString() de Dog1: \n" + Dog1.toString());
        System.out.println("\nMetodo toString() de Cat1: \n" + Cat1.toString());

    }




}

