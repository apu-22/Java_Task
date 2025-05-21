package Interface_in_java;

interface Language {
    // default method
    default void getVersion() {
        System.out.println("Current version is 1.0");
    }
}

// Class that implements the interface
class JavaLanguage implements Language {
    // No need to override getVersion() unless customization is needed
}

public class Default_M_I{
    public static void main(String[] args) {
        JavaLanguage lang = new JavaLanguage();
        lang.getVersion();  // Output: Current version is 1.0
    }
}
