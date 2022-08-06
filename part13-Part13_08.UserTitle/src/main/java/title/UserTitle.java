package title;

import static com.sun.javafx.application.ParametersImpl.getParameters;
import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application {

    @Override
    public void start(Stage window){
        Parameters params = getParameters();
        String organization = params.getNamed().get("organization");
        String course = params.getNamed().get("course");
        
        window.setTitle(organization + " Title " + course);
        window.show();
    }
    
}
