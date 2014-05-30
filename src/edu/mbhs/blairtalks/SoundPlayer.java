package edu.mbhs.blairtalks;


import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class SoundPlayer extends Activity {
	
	private ImageView play = null;
	boolean isPlaying = false;
	MediaPlayer mp = null;
	MediaPlayer mp2=null;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sound_player);
		play = (ImageView) (findViewById(R.id.playImage));
		getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_LIST); 
		SpinnerAdapter teacher = ArrayAdapter.createFromResource(this, R.array.teachers, android.R.layout.simple_spinner_dropdown_item);
		mp = MediaPlayer.create(SoundPlayer.this,  R.raw.duval);
		mp2=MediaPlayer.create(SoundPlayer.this, R.raw.rose);
		getActionBar().setListNavigationCallbacks(teacher, new ActionBar.OnNavigationListener() {
			
			public boolean onNavigationItemSelected(int itemPosition, long itemId) {
				switch(itemPosition) {
				case 0:
					mp.setLooping(false);
					mp2.setLooping(false);
					mp = MediaPlayer.create(SoundPlayer.this, R.raw.duval);
					play.setImageResource(R.drawable.duval);
					
					break;
				case 1:
					mp.setLooping(false);
					mp2.setLooping(false);
					mp = MediaPlayer.create(SoundPlayer.this, R.raw.dvorsky); 
					play.setImageResource(R.drawable.dvorsky);
				
					break;
				case 2:
					mp.setLooping(false);
					mp2.setLooping(false);
					mp = MediaPlayer.create(SoundPlayer.this, R.raw.fowler); 
					play.setImageResource(R.drawable.fowler);
					break;
				case 3:
					mp.setLooping(false);
					mp2.setLooping(false);
					mp = MediaPlayer.create(SoundPlayer.this, R.raw.giles); 
					play.setImageResource(R.drawable.giles);
					break;
				case 4:
					mp.setLooping(false);
					mp2.setLooping(false);
					mp = MediaPlayer.create(SoundPlayer.this, R.raw.ostrander); 
					play.setImageResource(R.drawable.ostrander);
					break;
				case 5:
					mp.setLooping(false);
					mp2.setLooping(false);
					mp = MediaPlayer.create(SoundPlayer.this, R.raw.pham); 
					play.setImageResource(R.drawable.pham);
					break;
				case 6:
					mp.setLooping(false);
					mp2.setLooping(false);
					mp = MediaPlayer.create(SoundPlayer.this, R.raw.piper); 
					play.setImageResource(R.drawable.piper);
					break;
				case 7:
					mp.setLooping(false);
					mp2.setLooping(false);
					mp = MediaPlayer.create(SoundPlayer.this, R.raw.rose);
					
					play.setImageResource(R.drawable.rose);
					break;
				case 8:
					mp.setLooping(false);
					mp2.setLooping(false);
					mp = MediaPlayer.create(SoundPlayer.this, R.raw.schafer); 
					play.setImageResource(R.drawable.schafer);
					break;
				case 9:
					mp.setLooping(false);
					mp2.setLooping(false);
					mp = MediaPlayer.create(SoundPlayer.this, R.raw.stein); 
					play.setImageResource(R.drawable.stein);
					break;
				case 10:
					mp.setLooping(false);
					mp2.setLooping(false);
					mp = MediaPlayer.create(SoundPlayer.this, R.raw.street);
					play.setImageResource(R.drawable.street);
					break;
				case 11:
				//mp.setLooping(true);
					play.setImageResource(R.drawable.rosestachecopy);
				mp2 = MediaPlayer.create(SoundPlayer.this, R.raw.rose);
				mp2.start();
				mp2.setLooping(true);
				mp = MediaPlayer.create(SoundPlayer.this, R.raw.pham);
				mp.start();
				mp.setLooping(true);
				}
				return true;
			}
			
		});
	//	mp.setOnCompletionListener(new OnCompletionListener() {
			
			//public void onCompletion(MediaPlayer mp) {
		//		isPlaying = false;
		//	}
			
		//});
		play.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//mp.setLooping(true);
				mp.seekTo(0);
				mp.start();	
			//	isPlaying = true;
			}
			
		});	
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sound_player, menu);
		return true;
	}

}
