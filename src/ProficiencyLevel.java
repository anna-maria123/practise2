public class ProficiencyLevel extends Language {
    String namePerson;
    int yearsOfExperience;


    public ProficiencyLevel(String name, int yearCreated, String developer, String namePerson, int yearsOfExperience) {
        super(name, yearCreated, developer);
        this.namePerson = namePerson;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getProficiencyLevel() {
        if (this.yearsOfExperience >= 5) {
            return "Professional";
        } else {
            return this.yearsOfExperience >= 2 ? "Intermediate" : "Beginner";
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Person's name: " + namePerson);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Proficiency Level: " + getProficiencyLevel());
    }

    @Override
    public void rating() {
        // super.rating();
        System.out.println("This language 14 in the rating");
    }
}



