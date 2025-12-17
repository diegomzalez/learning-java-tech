public class CString {
    public static void main(String[] args) {
        String inmutableString = "An inmutable string";
        StringBuffer mutableString = new StringBuffer("A mutable string");
        System.out.println(mutableString);
        byte num = 10;
        System.out.println("There are " + num + " characters in the file.");
        String testString = "Hello, World!";
        int lengthTest = testString.length();
        System.out.println(lengthTest);
    }
}
