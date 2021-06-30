package austincunningham;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FizzBuzz {

    @ConfigProperty(defaultValue = "100", name = "application.maxNumber")
    int maxNumber;

    public void execute(){
        for (int i=1; i <= maxNumber; i++){
            String result = "";
            result+=(i%3)==0?"Fizz":"";
            result+=(i%5)==0?"Buzz":"";
            System.out.println(!result.isEmpty() ? result: i);
        }
    }
}
