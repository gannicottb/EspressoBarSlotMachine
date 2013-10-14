package com.gannicott.espressobarslotmachine;

import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	SlotMachine machine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        machine = new SlotMachine();
        Map<String, Integer> results = machine.pull();
        
//      results.get("left") = the value that left landed on
//		results.get("middle") = the value that middle landed on
//		results.get("right") = the value that right landed on
//		results.get("prize") = the prize that the user won
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
