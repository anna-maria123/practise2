public class Language {
    String name;
     int yearCreated;
     String developer;

    public Language(String name, int yearCreated, String developer) {
        this.name = name;
        this.yearCreated = yearCreated;
        this.developer = developer;
    }



    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Year created: " + this.yearCreated);
        System.out.println("Developer: " + this.developer);
    }
    public void rating(){
        System.out.println("This language 4 in the rating");
    }
}
