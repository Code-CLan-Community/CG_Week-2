class Animal{
    //
    String name; 
    int age;

    void makeSound(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Each Animal has diffrent sound");
        System.out.println("Name: " + this.name + " " + "Age: " + this.age);
    }
}
