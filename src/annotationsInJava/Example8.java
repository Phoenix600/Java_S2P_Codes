package annotationsInJava;

/**
 * Creating the user defined annotation
 * Inside annotation we define the members or simply the
 * elements of the annotation
 */
@interface Data{
    String name();
    String project();
    String date();
    float verison();

}

@Data(name="Pranay",project = "MyProject",date="12/12/12",verison = 1)
public class Example8 {
    @Data(name="Pranay",project = "MyMain",date="12/12/12",verison = 1)
    public static void main(String[] args) {

    }
}
