package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


// END SOLUTION
public class VocabularyPracticeApplication extends Application{
    private Dictionary dictionary;
    
    @Override
    public void init() throws Exception{
        this.dictionary = new Dictionary();
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        AddingView addingView = new AddingView(this.dictionary);
        PracticeView practiceView = new PracticeView(this.dictionary);
        
        BorderPane layout = new BorderPane();
        
        
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20,20,20,20));
        menu.setSpacing(10);
        Button add = new Button("Add words");
        Button learn = new Button("Practice");
        menu.getChildren().addAll(add, learn);
        layout.setTop(menu);
        
        add.setOnMouseClicked((event) -> {
            layout.setCenter(addingView.getView());
        });
        learn.setOnMouseClicked((event) -> {
            layout.setCenter(practiceView.getView());
        });
        
        layout.setCenter(practiceView.getView());
        
        Scene view = new Scene(layout, 400, 400);
        
        stage.setScene(view);
        stage.show();
        
        
        
    }

    public static void main(String[] args) {
        
        try{
            launch(VocabularyPracticeApplication.class);
        }catch(Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
        
    }

    
}
