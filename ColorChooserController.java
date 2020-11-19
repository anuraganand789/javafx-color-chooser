import static javafx.scene.paint.Color.rgb;

import javafx.fxml.FXML;

public class ColorChooserController extends ColorChooserControls{

    private int 
               red   = 0,
               green = 0,
               blue  = 0;

    private double 
                  alpha = 1.0;

    @FXML
    void initialize() {

         redTextField .textProperty() .bind(   redSlider .valueProperty() .asString("%.0f") );
        blueTextField .textProperty() .bind(  blueSlider .valueProperty() .asString("%.0f") );
       alphaTextField .textProperty() .bind( alphaSlider .valueProperty() .asString("%.2f") );
       greenTextField .textProperty() .bind( greenSlider .valueProperty() .asString("%.0f") );

        redSlider   
       .valueProperty()
       .addListener(
                    (observableValue, oldValue, newValue) 
                     -> {
			   colorRectangle.setFill(rgb((red = newValue.intValue()), green, blue, alpha));
		        }
		   );

        greenSlider
       .valueProperty()
       .addListener(
                    (observableValue, oldValue, newValue)
                     -> {
		            colorRectangle.setFill(rgb(red, (green = newValue.intValue()), blue, alpha)); 
			}
		   );

        blueSlider
       .valueProperty()
       .addListener(
                    (observableValue, oldValue, newValue)
                     -> {
		            colorRectangle.setFill(rgb(red, green, (blue = newValue.intValue()), alpha)); 
			}
		   );

        alphaSlider
       .valueProperty()
       .addListener(
                    (observableValue, oldValue, newValue)
		     -> {
			    colorRectangle.setFill(rgb(red, green, blue, (alpha = newValue.doubleValue())));
		        }
		   );
    }

}

