package com.superisuer.sao;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
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
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends Activity {
	
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
				try {
					Runtime.getRuntime().exec("su");
				} catch (Exception s) {
					finishAffinity();
				}
				try { 
					Runtime.getRuntime().exec("setprop ro.HOME_APP_ADJ 1");
					Runtime.getRuntime().exec("setprop ro.media.enc.jpeg.quality 100");
					Runtime.getRuntime().exec("setprop ro.camcorder.videoModes true");
					Runtime.getRuntime().exec("setprop media.stagefright.enable-player true");
					Runtime.getRuntime().exec("setprop media.stagefright.enable-meta true");
					Runtime.getRuntime().exec("setprop media.stagefright.enable-scan true");
					Runtime.getRuntime().exec("setprop media.stagefright.enable-http true");
					Runtime.getRuntime().exec("setprop media.stagefright.enable-rtsp true");
					Runtime.getRuntime().exec("setprop media.stagefright.enable-record false");
					Runtime.getRuntime().exec("setprop profiler.force_disable_err_rpt 1");
					Runtime.getRuntime().exec("setprop profiler.force_disable_ulog 1");
					Runtime.getRuntime().exec("setprop net.tcp.buffersize.default 4096,87380,256960, 4096, 16384,256960");
					Runtime.getRuntime().exec("setprop net.tcp.buffersize.wifi 4096,87380,256960,409 6,163 84,256960");
					Runtime.getRuntime().exec("setprop net.tcp.buffersize.umts 4096,8 7380,256960,4096,163 84,256960");
					Runtime.getRuntime().exec("setprop net.tcp.buffersize.gprs 4096,8 7380,256960,4096,163 84,256960");
					Runtime.getRuntime().exec("setprop net.tcp.buffersize.edge 4096,8 7380,256960,4096,163 84,256960");
					Runtime.getRuntime().exec("setprop ro.ril.hep 0");
					Runtime.getRuntime().exec("setprop ro.ril.hsxpa 2");
					Runtime.getRuntime().exec("setprop ro.ril.enable.dtm 1");
					Runtime.getRuntime().exec("setprop ro.ril.hsdpa.category 8");
					Runtime.getRuntime().exec("setprop ro.ril.enable.a53 1");
					Runtime.getRuntime().exec("setprop ro.ril.enable.3g.prefix 1");
					Runtime.getRuntime().exec("setprop ro.ril.htcmaskw1.bitmask 4294967295");
					Runtime.getRuntime().exec("setprop ro.ril.htcmaskw1 14449");
					Runtime.getRuntime().exec("setprop ro.ril.hsupa.category 6");
					Runtime.getRuntime().exec("setprop ro.telephony.call_ring.delay 0");
					Runtime.getRuntime().exec("setprop ring.delay 0");
					Runtime.getRuntime().exec("setprop persist.telephony.support.ipv6 1");
					Runtime.getRuntime().exec("setprop persist.telephony.support.ipv4 1");
					Runtime.getRuntime().exec("setprop ro.lge.proximity.delay 25");
					Runtime.getRuntime().exec("setprop mot.proximity.delay 25");
					Runtime.getRuntime().exec("setprop windowsmgr.max_events_per_sec 150");
					Runtime.getRuntime().exec("setprop ro.min_pointer_dur 8 ro.max.fling_velocity 12000");
					Runtime.getRuntime().exec("setprop ro.min.fling_velocity 8000");
					Runtime.getRuntime().exec("setprop persist.cust.tel.eons 1");
					Runtime.getRuntime().exec("setprop ro.ril.enable.amr.wideband 1");
					Runtime.getRuntime().exec("setprop ro.config.hw_fast_dormancy 1");
					Runtime.getRuntime().exec("setprop ro.config.hw_quickpoweron true");
					Runtime.getRuntime().exec("setprop ro.kernel.android.checkjni 0");
					Runtime.getRuntime().exec("setprop ro.kernel.checkjni 0");
					Runtime.getRuntime().exec("setprop dalvik.vm.checkjni false");
					Runtime.getRuntime().exec("setprop dalvik.vm.dexopt-data-only 1");
					Runtime.getRuntime().exec("setprop dalvik.vm.heapstartsize 5m");
					Runtime.getRuntime().exec("setprop dalvik.vm.heapgrowthlimit 48m");
					Runtime.getRuntime().exec("setprop dalvik.vm.heapsize 64m");
					Runtime.getRuntime().exec("setprop dalvik.vm.verify-bytecode false");
					Runtime.getRuntime().exec("setprop dalvik.vm.execution-mode int:jit");
					Runtime.getRuntime().exec("setprop dalvik.vm.lockprof.threshold 250");
					Runtime.getRuntime().exec("setprop dalvik.vm.dexopt-flags m v,o y");
					Runtime.getRuntime().exec("setprop dalvik.vm.stack-trace-file /data/anr/traces.txt");
					Runtime.getRuntime().exec("setprop dalvik.vm.jmiopts forcecopy");
					Runtime.getRuntime().exec("setprop persist.sys.use_dithering 1");
					Runtime.getRuntime().exec("setprop persist.adb.notify 0");
					Runtime.getRuntime().exec("setprop persist.android.strictmode 0");
					Runtime.getRuntime().exec("setprop wifi.supplicant_scan_interval 180");
					Runtime.getRuntime().exec("setprop debug.performance.tuning 1");
				} catch (Exception e) {}
				SketchwareUtil.showMessage(getApplicationContext(), "Restart your phone to apply changes.");
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
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_black.ttf"), 1);
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
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}