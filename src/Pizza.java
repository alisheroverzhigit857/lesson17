public abstract class Pizza extends Food {
    @Override
    public void cook() {
        System.out.println("Pizza will be ready in 5 minutes ");
    }

    public Pizza(String name, String cuisine, String smell, String tast, int calories) {
        super(name, cuisine, smell, tast, calories);
    }
}
