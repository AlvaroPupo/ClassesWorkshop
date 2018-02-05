public class Pet {

    private String ownerName;
    private String petName;
    private String homeAddress;
    private int age;
    private char gender;

    public Pet(String ownerName, String petName, String homeAddress, int age, char gender) {
        this.ownerName = ownerName;
        this.petName = petName;
        this.homeAddress = homeAddress;
        this.age = age;
        this.gender = gender;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    protected String makeSound() {

        return "Pets make no sound.";
    }


    Add CommentCo}