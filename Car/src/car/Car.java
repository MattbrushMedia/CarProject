
package car;

/*
 * @author Mattbrush
 */

public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    
    
    public void printVariables() {
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Min Speed : " + minSpeed);
        System.out.println("Weight : " + weight);
        System.out.println("Turned On : " + isTheCarOn);
        System.out.println("Condition : " + condition);
        System.out.println("Name : " + nameOfCar);
        System.out.println("How many people in car : " + numberOfPeopleInCar);
    };


    public void wreckCar(){
        condition = 'C';
    }
    
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed+1;
    }
    
    public void getIn(){
        numberOfPeopleInCar++;
    }
    
    public void getOut(){
        numberOfPeopleInCar--;
    }
    
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }
    
    public double howManyMileTillOutOfGas(){
        return currentFuel * mpg;
    }
    
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        Car birthdayPresent = new Car(500, 5000.545, true);
        System.out.println("Birthday Car V1");
        birthdayPresent.printVariables();
        
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles Left : "+ birthdayPresent.howManyMileTillOutOfGas());
        System.out.println("Max Miles : "+ birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday Car V2");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday Car V3");
        birthdayPresent.printVariables();
        
        
        /*
        System.out.println("Christmas Car");
        Car christmasPresent = new Car(550, 2000, false);
        christmasPresent.printVariables();*/
    }
    
}
