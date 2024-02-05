package edu.cnm.deepdive.tallycounter.controller;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import edu.cnm.deepdive.tallycounter.R;
import edu.cnm.deepdive.tallycounter.databinding.ActivityMainBinding;
import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = MainActivity.class.getSimpleName();
  private int counter;
  private ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d(TAG, "MainActivity::onCreate");
    binding = ActivityMainBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());
    if (savedInstanceState != null) {
      setCounter(savedInstanceState.getInt("counter", 0));
    } else {
      setCounter(0);
    }
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    Log.d(TAG, "MainActivity::onRestart");
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.d(TAG, "MainActivity::onStart");
  }

  @Override
  protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    Log.d(TAG, "MainActivity::onRestoreInstanceState");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.d(TAG, "MainActivity::onResume");
  }

  @Override
  protected void onPause() {
    Log.d(TAG, "MainActivity::onPause");
    super.onPause();
  }

  @Override
  protected void onStop() {
    Log.d(TAG, "MainActivity::onStop");
    super.onStop();
  }

  @Override
  protected void onSaveInstanceState(@NonNull @NotNull Bundle outState) {
    super.onSaveInstanceState(outState);
    Log.d(TAG, "MainActivity::onSaveInstanceState");
    outState.putInt("counter", counter);
  }

  @Override
  protected void onDestroy() {
    Log.d(TAG, "MainActivity::onDestroy");
    super.onDestroy();
  }

  public void handleIncrement(View v) {
    setCounter(counter + 1);
  }

  private void setCounter(int counter) {
  this.counter = counter;
  binding.tally.setText(String.valueOf(counter));
  }


}