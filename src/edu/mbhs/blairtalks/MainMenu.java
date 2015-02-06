package edu.mbhs.blairtalks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainMenu extends Activity {

	// Index for the icons of teachers
	private int[] imageId = {
			R.drawable.duval_small, R.drawable.dvorsky_small,
			R.drawable.fowler_small, R.drawable.giles_small,
			R.drawable.ostrander_small, R.drawable.pham_small,
			R.drawable.piper_small, R.drawable.rose_small,
			R.drawable.schafer_small, R.drawable.stein_small,
			R.drawable.street_small, R.drawable.rosestache_small
	};
	
	GridView gv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		gv = (GridView) findViewById(R.id.namesGridView);
		ImageGrid adapter = new ImageGrid(this, imageId);
		gv.setAdapter(adapter);
		gv.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				Intent i = new Intent(MainMenu.this, SoundPlayer.class);
				i.putExtra("POSITION_CLICKED", position);
				startActivity(i);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

}
