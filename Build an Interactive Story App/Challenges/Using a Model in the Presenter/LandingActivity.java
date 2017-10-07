import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LandingActivity extends AppCompatActivity {
    
    public Button thrustButton;
    public TextView typeLabel;
    public EditText passengersField;
    
    public Spaceship spaceship;
  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    
        thrustButton = (Button)findViewById(R.id.thrustButton);
        typeLabel = (TextView)findViewById(R.id.typeTextView);
        passengersField = (EditText)findViewById(R.id.passengersEditText);
      
        // Add your code here!
         spaceship = new Spaceship("FIREFLY");
         typeLabel.setText(spaceship.getShipType());
         passengersField.setText(Integer.toString(spaceship.getNumPassengers()));
    }
}
