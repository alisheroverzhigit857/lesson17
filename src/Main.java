import task.Employee;
import task.Person;

public class Main {
    public static void main(String[] args) {
 //TODO lesson 16-sabakta
      /*  Food food = new Plov("Plov","Kyrgyz","Rt mai","Daamduu",250);
        food.cook();
        food.eating();
        System.out.println(food);*/
//TODO lesson16 task
        Person person = new Employee("Malik","M",0);
        Person person1 = new Employee("Erzhigit","M",1);
        Person[] people = {person,person1};
        for (Person pe:people ) {
            System.out.println(pe);
        }
        person.work();
        person1.work();
    }
}