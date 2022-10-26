public class CaracteresRomains {
    public static CaracteresRomains X = new CaracteresRomains(10, "X");
    public static CaracteresRomains V = new CaracteresRomains(5, "V");

    public static CaracteresRomains XV = new CaracteresRomains(15, "XV");
    public static CaracteresRomains Zero = new CaracteresRomains(0, "");

    private final int valeur;
    private final String representation;

    private CaracteresRomains(int valeur, String representation){
        this.valeur = valeur;
        this.representation = representation;
    }

    public String ReprésenterSuiteNombre(int nombreAReprésenter)
    {
        return this.representation + "I".repeat(nombreAReprésenter - this.valeur);
    }
}
