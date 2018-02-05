package com.company;

public class Cat extends Pet {

    private boolean likesCatnip;
    private boolean usesLitterbox;
    private String furType;

    public Cat(String ownerName, String petName, String homeAddress, int age, char gender, boolean likesCatnip, boolean usesLitterbox, String furType) {

        super(ownerName, petName, homeAddress, age, gender);

        this.likesCatnip = likesCatnip;
        this.usesLitterbox = usesLitterbox;
        this.furType = furType;
    }


    public boolean isLikesCatnip() {
        return likesCatnip;
    }

    public void setLikesCatnip(boolean likesCatnip) {
        this.likesCatnip = likesCatnip;
    }

    public boolean isUsesLitterbox() {
        return usesLitterbox;
    }

    public void setUsesLitterbox(boolean usesLitterbox) {
        this.usesLitterbox = usesLitterbox;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    @Override
    protected String makeSound() {
        return "MEOWWWWWW!!!!!!!!";
    }
    public String catto() {
        int catAge;
        switch (super.getAge()) {
            case 1: catAge = 19;
            break;
            case 2: catAge = 24;
            break;
            case 3: catAge = (super.getAge() - 2) * 4 + 24;
            break;
            default:catAge = 0;
            break;
        }
        return super.getPetName() + " is " + super.getAge() + " in human years and " + catAge + " in cat years.";
    }
    @Override
    public String getPetName() {
        return getPetName();
    }
}
