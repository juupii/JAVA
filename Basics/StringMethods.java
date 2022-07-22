public class StringMethods {
    public static void main(String[] args) {
        String name = "Roshan"; // strings are immutable and cannott be changed.
        int value = name.length();
        System.out.println(value);

        String lString = name.toLowerCase();
        System.out.println(lString);

        String uString = name.toUpperCase();
        System.out.println(uString);

        String nontrimmedString = "            Roshan         ";
        System.out.println(nontrimmedString);
        String trimmedString = nontrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(3)); //substring return a new string fromm the given index number
        System.out.println(name.substring(2, 6));

        System.out.println(name.replace('s', 'o')); //replace a char with new one
        System.out.println(name.replace("shan", "sun"));

        System.out.println(name.startsWith("Ro"));
        System.out.println(name.endsWith("an"));

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("sh"));
        System.out.println(name.indexOf('h'));
 /* 
        String modifiedName ="Rososhan";
        System.out.println(modifiedName.indexOf("os"));
        System.out.println(modifiedName.indexOf("os", 3));
        // if the string doesnot match then it will return -1.
        System.out.println(modifiedName.lastIndexOf("os"));
        System.out.println(modifiedName.lastIndexOf("os", 1));
      */
      System.out.println(name.equals("Roshan"));
      System.out.println(name.equalsIgnoreCase("roshan"));
    }
}
