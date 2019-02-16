package nareshit.com.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by nareshit on 6/8/2017.
 */

public class ActivityLifecycle extends Activity {

    private static final String TAG = "Activity Life cycle";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.e(TAG, "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy called");
    }
}
