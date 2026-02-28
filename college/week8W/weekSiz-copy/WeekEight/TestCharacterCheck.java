package WeekEight;

class CharacterCheck {

    static void checkVowel(char ch) {
        if ("AEIOUaeiou".indexOf(ch) != -1)
            System.out.println(ch + " is a Vowel");
        else
            System.out.println(ch + " is a Consonant");
    }
}

public class TestCharacterCheck {
    public static void main(String[] args) {
        CharacterCheck.checkVowel('a');
    }
}