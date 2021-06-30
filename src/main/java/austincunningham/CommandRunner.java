package austincunningham;

import org.jboss.logging.Logger;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import javax.inject.Inject;



@QuarkusMain
public class CommandRunner implements QuarkusApplication {

    private final FizzBuzz fizzBuzz;
    private static final Logger LOG = Logger.getLogger(CommandRunner.class);

    @Inject
    public CommandRunner(FizzBuzz fizzBuzz){
        super();
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public int run(String... args) throws Exception {
        LOG.debug("Starting application");
        fizzBuzz.execute();
        return 0;
    }
}