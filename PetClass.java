/**
 * Programmer: J. Ohara
 * Date: 3.31.2021
 * Purpose: Pet class defininition
 */

package PetClass;

public class PetClass {
    
    //All instace variables
    private String name;
    private int age;
    private double weight;
    private String type;

    //First constructor with no parameters
    public PetClass() {
       
    }

    //Second constructor with parameters
    public PetClass(String theName, int theAge, double theWeight, String theType) {

        //Assigning all instance variables
        name = theName;
        age = theAge;
        weight = theWeight;
        type = theType;

    }

    //name getter method
    public String getName(){

        //returning the name
        return name;
    }

    //age getter method
    public int getAge(){

        //returning the age
        return age;
    }

    //weight getter method
    public double getWeight(){

        //returning the weight
        return weight;
    }

    //type getter method
    public String getType(){

        //returning the type
        return type;
    }

    //name setter method
    public void setName(String theName) {

        //assigning new name
        name = theName;
    }

    //age setter method
    public void setAge(int theAge) {

        //assigning new age
        age = theAge;
    }

    //weight setter method
    public void setWeight(double theWeight) {

        //assigning new weight
        weight = theWeight;
    }

    //type setter method
    public void setType(String theType) {

        //assigning new type
        type = theType;
    }

    //toString method
    public String toString() {

        //returning info about animal
        return "Name: " + name + " Age: " + age + " Weight: " + weight + " Type: " + type;
    }

    //speak method
    public String speak() {

        //initializing temp variable for return statement
        String temp = "";

        //if & else if statements to determine the animal type and the noise they should make
        if (type == "cat") {

            temp = "meow";
        }
        else if (type == "dog") {
            
            temp = "woof";
        }
        else if (type == "lizard") {

            temp = "SSSSSSSS";
        }
        else if (type == "cow") {

            temp = "Moooo";
        }

        return temp;
    }
}
