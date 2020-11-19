import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ColorChooser extends Application{
    
    @Override
    public void start(final Stage stage){
	stage.setTitle("Color Chooser");
	try{
	    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("fxml/color-chooser.fxml"))));
	}catch(final IOException ex){
	    ex.printStackTrace();
	}
	stage.show();
    }

    public static void main(final String ... args){
        launch(args);
    }
}
