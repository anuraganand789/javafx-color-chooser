public class ColorChooser extends javafx.application.Application{
    
    @Override
    public void start(final javafx.stage.Stage stage){
	stage.setTitle("Color Chooser");
	try{
	    stage.setScene(new javafx.scene.Scene(javafx.fxml.FXMLLoader.load(getClass().getResource("fxml/color-chooser.fxml"))));
	}catch(final java.io.IOException ex){
	    ex.printStackTrace();
	}
	stage.show();
    }

    public static void main(final String ... args){
        launch(args);
    }
}
