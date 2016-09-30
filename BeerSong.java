/**
 *
 * @author Andrew Edillo <andrew.edillo@gmail.com>
 * Main function calls Ninety_Nine_Bottles_of_Beer() function to print the
 * "99 Bottles of Beer" song. Through this exercise, you will enhance your java
 * programming skills further including GIT version control and problem solving. 
 * Assume that your console is a wall where the song will be written once your 
 * code compiles and executes.
 */
public class BeerSong {

    public static void main(String[] args) {
        System.out.println(Ninety_Nine_Bottles_of_Beer());
    }
    
    public static String Ninety_Nine_Bottles_of_Beer() {
        String str1 = "";
        for (int i = 99; i >= 0; i--) {
            int j = i - 1;
            if (i == 2) {
                str1 += "2 bottles of beer on the wall, 2 bottles of beer,\n"
                        + "Take one down, pass it around, 1 bottle of beer on the wall.\n";
            } else if (i == 1) {
                str1 += "1 bottle of beer on the wall, 1 bottle of beer,\n"
                        + "Take one down, pass it around, no more bottles of beer on the wall.\n";
            } else if (i == 0) {
                str1 += "The end!";
            } else {
                str1 += i + " bottles of beer on the wall, " + i + " bottles of beer,\n"
                        + "Take one down, pass it around, " + j + " bottles of beer on the wall.\n";
            }
        }
        return str1;
    }
    
}
