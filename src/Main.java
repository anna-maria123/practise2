public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Language programmingJava = new Language("  Java ", 1995, "  Oracle Corporation");
        programmingJava.displayInfo();
        programmingJava.rating();
        ProficiencyLevel proficiencyLevel = new ProficiencyLevel("C",1972,"Dennis MacAlistair Ritchie","Anna",5);
        proficiencyLevel.displayInfo();
        proficiencyLevel.rating();



    }
}