package task;

public class Employee extends Person {
    private int id;

    @Override
    public void work() {
        if (1==id) {
            System.out.println("Zhumush kylbait ");
        }else {
            System.out.println("Zhumush kylat ");
        }
    }

    public Employee(String name, String gender,int id) {
        super(name, gender);
        this.id= id;
    }

}
