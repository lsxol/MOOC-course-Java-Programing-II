package buttonandtextfield;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class ButtonAndTextFieldApplication extends Application{
    
    @Override
    public void start(Stage stage) throws Exception {
        TextField text = new TextField("Tu można wpisywać rzeczy");
        text.setLayoutX(300);
        text.setMaxSize(5000, 5000);
        Button button = new Button("kliknij cioto");
        FlowPane flow = new FlowPane();
        flow.getChildren().add(button);
        flow.getChildren().add(text);
        
        Scene view = new Scene(flow);
        stage.setScene(view);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    

}
