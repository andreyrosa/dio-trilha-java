package ExercicioDIO;

public class PetMachine {
    // Variavies criadas
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;



    // Funcoes
    public void takeShower(){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para inciar o banho");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void addWater(){
        if(water == 30){
            System.out.println("A capacidade de Agua da maquina esta no maximo");
            return;
        }
        water+=2;
    }
    public void addShampoo(){
        if(shampoo == 10){
            System.out.println("A capacidade de Shampoo da maquina esta no maximo");
            return;
        }
        shampoo+=2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessário limpá-la!");
            return;
        }
        if(hasPet()){
            System.out.println("O pet " + this.pet.getName() + " Esta na maquina nesse momento!");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina!");
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " Foi tirado da máquina!");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa!");
    }

}
