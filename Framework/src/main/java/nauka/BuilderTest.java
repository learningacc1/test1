package nauka;

public class BuilderTest {

    public static void main(String[] args) {

        BuilderImplementation builderImplementation = new BuilderImplementation.Builder("Emil", "Wydra").Adress("").Age(12).build();

    }
}
