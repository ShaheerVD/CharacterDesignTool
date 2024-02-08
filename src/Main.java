import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {

        //Will implement Gui at later stage
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the character generator");
        System.out.println("1.Generate");
        System.out.println("Input Any other number to exit\n");

        if(input.nextInt()==1){
            // Generate a random character
            Character character = generateCharacter();

            // Display the character details
            System.out.println("Generated Character:");
            System.out.println("Gender: " + character.getGender());
            System.out.println("Age: " + character.getAge());
            System.out.println("Body Type: " + character.getBodyType());
            System.out.println("Hairstyle: " + character.getHair());
            System.out.println("Clothing Style: " + character.getClothes());
            System.out.println("Occupation: " + character.getOccupation());
            System.out.println("Weapon Type: " + character.getWeapon());
            System.out.println("Theme: " + character.getTheme());
        }else {
           System.exit(0);
        }




    }

    //Generate Character
    private static Character generateCharacter(){
        // Select random options for each parameter
        String gender = getRandomOption(CharacterParameters.GENDERS);
        String age = getRandomOption(CharacterParameters.AGE);
        String body = getRandomOption(CharacterParameters.BODY);
        String hair = getRandomOption(CharacterParameters.HAIR);
        String clothes = getRandomOption(CharacterParameters.CLOTHES);
        String occupation = getRandomOption(CharacterParameters.OCCUPATION);
        String weapon = getRandomOption(CharacterParameters.WEAPON);
        String theme = getRandomOption(CharacterParameters.THEME);

        return new Character(gender,age,body,hair,clothes,weapon,occupation,theme);
    }


    //Generate random index and return it
    private static String getRandomOption(String[] option){
        int index = random.nextInt(option.length);
        return option[index];
    }
}
