import java.util.Scanner;
public class madLibs{
    public static void main(String[] args)
    {
        //String lib = "In class, we found a <noun> on top of the desk. It <verb> off the table which made all of the students <adjective>.";
        //String lib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        /* Here we create what the prompt of the mad libs says so that we can 
        just replace the noun, verb, and adjective out once needed. */
        String lib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        
        // Now we create the scanner which allows us to type in the console when you do the code sc.nextLine
        Scanner sc = new Scanner(System.in);
     
        /* We created a variable of first, to show when the noun, verb, ect. starts. As well as a variable for last when
        the word ends*/
        int first = lib.indexOf("<");
        int last = lib.indexOf(">");
        // Created a new variable to show when the word inside the arrows starts and ends.
        String partOfSpeech = lib.substring(first + 1,last);
        // We then printed a prompt to the participant to type what the partOfSpeech that the lib asked for.
        System.out.println("Type a " + partOfSpeech + ": ");
        
        // Now we created a new String which scans for the Users word for the part of speach.
        String userPartOfSpeech = sc.nextLine();
        // Then we made a substring to the main lib, that starts from the beginning of the Lib to the first arrow.
        String finalLib = lib.substring(0,first) + userPartOfSpeech;

        // Since the first and last int was already created, now we want to find the first partOfSpeech.
        first = lib.indexOf("<", last);
        // Now we want to bring all the text up until we get to the next first <.
        finalLib += lib.substring(last + 1,first);
        last = lib.indexOf(">", first);
        partOfSpeech = lib.substring(first + 1,last);
        // We then printed a prompt to the participant to type what the partOfSpeech that the lib asked for
        System.out.println("Type a " + partOfSpeech + ": ");
        // Now we scan for the Users input for the part of speach.
        userPartOfSpeech = sc.nextLine();
        finalLib += userPartOfSpeech;
        

        
        // We now created where the next first and last is going to be.
        first = lib.indexOf("<", last);
        finalLib += lib.substring(last + 1,first);
        last = lib.indexOf(">", first);
        // Now the rest of the Lib will print out.
        partOfSpeech = lib.substring(first + 1,last);
        // We then printed a prompt to the participant to type what the partOfSpeech that the lib asked for
        System.out.println("Type a " + partOfSpeech + ": ");
        // Now we scan for the Users input for the part of speach.
        userPartOfSpeech = sc.nextLine();
        finalLib += userPartOfSpeech + lib.substring(last + 1);
        // Lastly the full Mad Lib prints out with Userinputs and results.
        System.out.println(finalLib);
    }
}
