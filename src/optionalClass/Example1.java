package optionalClass;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String...args)
    {
            // Creating the optional variables
            Optional<String> var1 = Optional.of("String");
            Optional<String> var2 = Optional.empty();
            // Retrieving the value from Optional Variable
            System.out.println(var1.get());
//            System.out.println(var2.get());
        // handling the presence and absence of values from Optional Variable
        if(var2.isPresent())
        {
            System.out.println("Value is prsent");
        }else{
            System.out.println("Value if absent");
        }
    }
}
