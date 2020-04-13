class Example{

    public static void main(String[] args){
        // user objects 
       User u1 = new User("O'Brien",32);
       u1.printUser();

       // create another user --> 2 users

       //using constructor
       Animal a1 = new Animal("Baby", "Shark"); //create object
       a1.printAnimal(); // Print the obj

       // create another animal
       Animal a2 = new Animal("Baby", "Kangaroo");
       //print the animal //
       a2.printAnimal();

     
       Student s1= new Student("Dominique",27,8);
        s1.printStudent();

        Student s2= new Student("Gareth",34,8);
        s2.printStudent();

        // create another student
        //print the second student

        a1.attack(s1);

        a2.attack(s2);
    
    }
    
}

