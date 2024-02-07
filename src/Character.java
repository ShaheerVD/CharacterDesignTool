public class Character {

    //Attributes
    private String gender;
    private String age;

    private String bodyType;
    private String hair;
    private String clothes;
    private String weapon;
    private String Occupation;

    //Constructor
    public Character(String gender, String age, String bodyType, String hair, String clothes, String weapon, String occupation) {
        this.gender = gender;
        this.age = age;
        this.bodyType = bodyType;
        this.hair = hair;
        this.clothes = clothes;
        this.weapon = weapon;
        Occupation = occupation;
    }

    //Getters and Setters
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }
}
