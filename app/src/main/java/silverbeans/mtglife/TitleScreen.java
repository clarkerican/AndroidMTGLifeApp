package silverbeans.mtglife;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class TitleScreen extends ActionBarActivity {

    Button btnLC, btnPT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        //ImageView image = (ImageView) findViewById(R.id.logo);

        btnLC = (Button) findViewById(R.id.buttonLifeCounter);
        btnPT = (Button) findViewById(R.id.buttonPriceTools);

        btnLC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(v.getContext(), LCLoginAct.class);
               // startActivity(intent);
            }
        });

        btnPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(v.getContext(), PCStart.class);
               // startActivity(intent);
            }
        });


    }

}