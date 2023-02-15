public class Plov extends Food{

    @Override
    public void cook() {
        System.out.println("Plov will ready in  90 min ");
    }

    public Plov(String name, String cuisine, String smell, String tast, int calories) {
        super(name, cuisine, smell, tast, calories);
    }
}
