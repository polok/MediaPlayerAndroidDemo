package pl.polak.mediaplayer.demo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import pl.polak.mediaplayer.demo.video.VideoPlayerActivity;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button buttonVideoSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonVideoSample = (Button) findViewById(R.id.buttonVideoSample);
        buttonVideoSample.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.buttonVideoSample) {
            String videoUrl = "";
            Intent intent = new Intent(this, VideoPlayerActivity.class);
            intent.putExtra(VideoPlayerActivity.VIDEO_URL_KEY, videoUrl);
            startActivity(intent);
        }
    }

}
