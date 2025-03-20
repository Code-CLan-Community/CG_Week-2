class Cat extends Animal {
    @Override
    void makeSound(String name,int age){
        this.name = name;
        this.age = age;
        System.out.print("Meow Meow...  ");
        System.out.println("Name: " + name + " " + "Age: " + age);
    }
}
