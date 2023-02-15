public abstract class Food {
    private String name;
    private String cuisine;
    private String smell;
    private String tast;
    private int calories;

    public abstract  void cook () ;

    public final  void eating () {
        System.out.println("Food eating time ");
    }

    public  static  void waiting () {
        System.out.println("Waiting time ");
    }

    public Food (String name, String cuisine, String smell, String tast, int calories){
        this.name=name;
        this.cuisine=cuisine;
        this.smell=smell;
        this.tast=tast;
        this.calories=calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getTast() {
        return tast;
    }

    public void setTast(String tast) {
        this.tast = tast;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", smell='" + smell + '\'' +
                ", tast='" + tast + '\'' +
                ", calories=" + calories +
                '}';
    }
}
