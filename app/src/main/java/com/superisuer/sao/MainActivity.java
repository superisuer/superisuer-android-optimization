package com.superisuer.sao;

import android.animation.*;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private TextView textview1;
	private TextView textview2;
	private TextView textview10;
	private LinearLayout linear3;
	private LinearLayout linear6;
	private LinearLayout linear8;
	private LinearLayout linear5;
	private LinearLayout linear4;
	private TextView textview3;
	private TextView textview5;
	private TextView textview4;
	private TextView textview6;
	private LinearLayout linear7;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	
	private Intent i = new Intent();
	private AlertDialog.Builder d;
	private TimerTask t;
	private ObjectAnimator ob = new ObjectAnimator();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview10 = findViewById(R.id.textview10);
		linear3 = findViewById(R.id.linear3);
		linear6 = findViewById(R.id.linear6);
		linear8 = findViewById(R.id.linear8);
		linear5 = findViewById(R.id.linear5);
		linear4 = findViewById(R.id.linear4);
		textview3 = findViewById(R.id.textview3);
		textview5 = findViewById(R.id.textview5);
		textview4 = findViewById(R.id.textview4);
		textview6 = findViewById(R.id.textview6);
		linear7 = findViewById(R.id.linear7);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		d = new AlertDialog.Builder(this);
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview2.setText("before gta 6☠️");
			}
		});
		
		textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://t.me/superifiles"));
				startActivity(i);
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ob.setTarget(linear8);
				ob.setPropertyName("alpha");
				ob.setFloatValues((float)(1), (float)(0.5d));
				ob.setDuration((int)(100));
				ob.start();
				ob.setTarget(linear8);
				ob.setPropertyName("alpha");
				ob.setFloatValues((float)(0.5d), (float)(1));
				ob.setDuration((int)(100));
				ob.start();
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								i.setClass(getApplicationContext(), ProcessingActivity.class);
								startActivity(i);
							}
						});
					}
				};
				_timer.schedule(t, (int)(388));
			}
		});
	}
	
	private void initializeLogic() {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 1);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 1);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 1);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 1);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/light.ttf"), 0);
		textview10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_black.ttf"), 1);
		linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFF5F5F5));
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFF5F5F5));
		linear7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFF5F5F5));
		linear8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFF5F5F5));
	}
	
	@Override
	public void onStart() {
		super.onStart();
		try {
			
			Runtime.getRuntime().exec("su"); 
			
			 
			
		} catch (Exception e ) {
			
			SketchwareUtil.showMessage(getApplicationContext(), "You require superuser rights to perform optimizations.");
			
		}
	}
}