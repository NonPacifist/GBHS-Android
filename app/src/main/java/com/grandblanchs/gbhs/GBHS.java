package com.grandblanchs.gbhs;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;


public class GBHS extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        System.out.println("onCreateOptionsMenu");
        getMenuInflater().inflate(R.menu.gbh, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        System.out.println("onOptionsItemSelected");
        int id = item.getItemId();
        if (id == R.id.news) {
            System.out.println("Giving you the news");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
