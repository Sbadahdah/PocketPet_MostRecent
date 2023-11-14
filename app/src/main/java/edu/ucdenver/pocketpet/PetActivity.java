package edu.ucdenver.pocketpet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.ucdenver.pocketpet.databinding.PetBinding;

//add music
public class PetActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pet);
//        binding = PetBinding.inflate(getLayoutInflater());
//        View view = binding.getRoot();
//

    }

    public void onHomeClick(View view) {
        Intent homeIntent = new Intent(this, MainActivity.class);
        startActivity(homeIntent);
    }
    //Add hunger bar
    //Need something to set the picture to pet once egg cracks
    //When certain time passes egg cracks -> pet spawns
    //Something to keep track of health
    //Something to keep track of happiness -> if that reaches 0 decrease health
    //Something decreases health and happiness depending on the time passed
    //Something to add to health and happiness depending on the button pressed
    //Something to send user back home if home button is pressed
    //Figure out how to respawn egg when pet dies

}
