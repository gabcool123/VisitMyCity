package visitmycityandroid.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import visitmycityandroid.app.R;

public abstract class VisitMyCityActivity extends Activity{

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_addLocation :
                Intent intentAdd = new Intent(this, AddLocationActivity.class);
                startActivity(intentAdd);
            case R.id.action_searchLocation :
                Intent intentSearch = new Intent(this, SearchLocationActivity.class);
                startActivity(intentSearch);
            case R.id.action_closerLocation :
                Intent intentCloser = new Intent(this, CloserLocationActivity.class);
                startActivity(intentCloser);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
