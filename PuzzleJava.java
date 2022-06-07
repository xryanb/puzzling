import java.util.Random;
import java.util.ArrayList;


public class PuzzleJava {
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer>therolls = new ArrayList<Integer>();
        Random randMachine = new Random();
        int randomNum=20;
        for(int i =1; i <= 10; i++){
            therolls.add(randMachine.nextInt(randomNum));
        }
        return therolls;
    }

    public String getRandomLetter(){
        Random randMachine = new Random();
        String alphabetSorted[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] randomLetter=new String[alphabetSorted.length];
        for(int i=0; i < randomLetter.length; i++){
            randomLetter[i]=alphabetSorted[i];
        }
        return randomLetter[randMachine.nextInt(randomLetter.length)];
    }

    public String generatePassword(){
        String password= "";

        for(int i=0; i < 8; i++){
            password=password + getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String>newPassword=new ArrayList<String>();
        for(int i =0; i< length; i++){
            newPassword.add(getRandomLetter());
        }
        return newPassword;
    }
}
