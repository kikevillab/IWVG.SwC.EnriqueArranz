package iwvg.swc.enriquearranz;

public class User {
    private int number;
    
    private int age;
    
    private String name;

    private String familyName;

    private String format(String string) {
        string = string.trim();
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public User(int number,int age, String name, String familyName) {
        this.number = number;
        this.age = age; 
        this.name = this.format(name);
        this.familyName = this.format(familyName);
    }

    public int getNumber() {
        return this.number;
    }
    
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return this.familyName.substring(0, 1) + this.name.substring(0, 1) + this.number;
    }
    
    public String getTag(){
		return this.initials();  	
    }
}
