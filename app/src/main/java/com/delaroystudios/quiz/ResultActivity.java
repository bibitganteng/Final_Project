package com.delaroystudios.quiz;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.TextView;

import com.delaroystudios.quiz.R;

public class ResultActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);

		RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1); 
		bar.setNumStars(5);
		bar.setStepSize(0.5f);

		TextView t=(TextView)findViewById(R.id.textResult);

		Bundle b = getIntent().getExtras();
		int score= b.getInt("score");

		bar.setRating(score);
		switch (score)
		{
			case 0: t.setText("Score Anda 0%, terus belajar");
				break;
		case 1: t.setText("Score Anda 20%, belajar lebih baik");
			break;
		case 2: t.setText("Skor Anda 40%, tetap semangat");
		break;
		case 3: t.setText("Skor Anda 60%, lumayan");
			break;
		case 4:t.setText("Skor Anda 80% tingkatkan terus bosku");
		break;
		case 5:t.setText(" wow Skor Anda 100%, mantab mamang");
		break;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		getMenuInflater().inflate(R.menu.activity_result, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Intent settingsIntent = new Intent(this, QuizActivity.class);
			startActivity(settingsIntent);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
