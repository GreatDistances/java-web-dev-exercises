package org.launchcode.java.demos.lsn6inheritance.technology;

public class Computer extends AbstractEntity {

    // INSTANCE VARIABLES
    private String name;
    private int memory;
    private double weight;
    private int idNumber = newIdNumber();

    // CONSTRUCTOR


    public Computer() {
    }

    public Computer(String name, int memory, double weight){
        this.name = name;
        this.memory = memory;
        this.weight = weight;
        this.idNumber = idNumber;
        }

        // GETTERS AND SETTERS
        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
        public int getMemory () {
            return memory;
        }
        public void setMemory ( int memory){
            this.memory = memory;
        }
        public double getWeight () {
            return weight;
        }
        public void setWeight ( double weight){
            this.weight = weight;
        }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", memory=" + memory +
                ", weight=" + weight +
                "}, idNumber=" + idNumber; // + super.toString();
    }
}