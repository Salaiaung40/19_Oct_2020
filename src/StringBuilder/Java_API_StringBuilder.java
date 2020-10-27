package StringBuilder;

public class Java_API_StringBuilder {
    public static void main(String[] args) {
        StringBuilder string1 = new StringBuilder("This is my First string line.");
        StringBuilder string2 = new StringBuilder("This is my Second string line.");
        // printing the lines
        System.out.println(string1);
        System.out.println(string2);

        string1.append("Line of the day!");
        System.out.println(string1);

        System.out.println(string2.reverse());
        System.out.println("Without calling reverse feature: " + string2);

        System.out.println(string1.toString().replace(" ", ""));
        System.out.println(string1.toString().toLowerCase().replace("t", "tt"));
        System.out.println(string2.reverse().toString().toLowerCase().replace("t", "tt"));

// remove all the spaces.
        System.out.println(string1.replace( 0, string1.length() -1,string1.toString().replaceAll(" " , "")));
// replace t with tt
        String toModifine = string2.toString()
                .toLowerCase()
                .replaceAll("t", "tt");
        string2.replace(0, string2.length(), toModifine);

        System.out.println(toModifine );

    }
}
