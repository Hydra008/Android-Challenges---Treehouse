import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaunchActivity extends AppCompatActivity {
    
    public Button launchButton;
    public int fuelLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    
        // fuelLevel is set elsewhere.
        // Code ommitted for brevity!

        launchButton = (Button)findViewById(R.id.launchButton);
        launchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                Intent intent = new Intent(LaunchActivity.this, FlightActivity.class);
                intent.putExtra("FUEL_LEVEL",fuelLevel);
                startActivity(intent);
            }
        });
    }
}
