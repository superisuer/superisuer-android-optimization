package com.superisuer.sao;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;
import android.content.Context;
import com.google.android.material.radiobutton.MaterialRadioButton;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.net.URISyntaxException;
import java.net.URI;
import java.io.File;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import android.view.LayoutInflater;
import android.widget.AutoCompleteTextView;
import com.google.android.material.color.DynamicColors;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {
	
	private double navnum = 0;
	
	private LinearLayout linear1;
	private LinearLayout linear5;
	private TextView textview1;
	private LinearLayout linear2;
	private LinearLayout linear6;
	private LinearLayout linear3;
	private TextView textview3;
	private LinearLayout linear4;
	private ImageView imageview1;
	private TextView textview2;
	private Button button11;
	private LinearLayout linear7;
	private TextView textview5;
	private LinearLayout linear8;
	private ImageView imageview2;
	private TextView textview4;
	private Button button12;
	private BottomNavigationView bottomnavigation1;
	
	private AlertDialog.Builder amr;
	private Intent i = new Intent();
	private SharedPreferences s;
	private Intent g = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear5 = findViewById(R.id.linear5);
		textview1 = findViewById(R.id.textview1);
		linear2 = findViewById(R.id.linear2);
		linear6 = findViewById(R.id.linear6);
		linear3 = findViewById(R.id.linear3);
		textview3 = findViewById(R.id.textview3);
		linear4 = findViewById(R.id.linear4);
		imageview1 = findViewById(R.id.imageview1);
		textview2 = findViewById(R.id.textview2);
		button11 = findViewById(R.id.button11);
		linear7 = findViewById(R.id.linear7);
		textview5 = findViewById(R.id.textview5);
		linear8 = findViewById(R.id.linear8);
		imageview2 = findViewById(R.id.imageview2);
		textview4 = findViewById(R.id.textview4);
		button12 = findViewById(R.id.button12);
		bottomnavigation1 = findViewById(R.id.bottomnavigation1);
		amr = new AlertDialog.Builder(this);
		s = getSharedPreferences("props", Activity.MODE_PRIVATE);
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (navnum == 0) {
					MaterialAlertDialogBuilder amr = new MaterialAlertDialogBuilder(HomeActivity.this);
					
					amr.setTitle("Недоступно");
					amr.setMessage("Будет доуступно с версии 3.3.");
					amr.setPositiveButton("Понятно", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					amr.create().show();
				}
				if (navnum == 1) {
					
				}
				if (navnum == 2) {
					MaterialAlertDialogBuilder amr = new MaterialAlertDialogBuilder(HomeActivity.this);
					
					amr.setTitle("Выберите способ");
					amr.setMessage("Выбранный вариант зависит от работы оптимизации. На нынешнее время, доступ к оптимизации через Shizuku временно не предоставляется.");
					amr.setPositiveButton("Root", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							s.edit().putString("access", "Root").commit();
							textview3.setText("Выбран доступ через ".concat(s.getString("access", "").concat(". Выбранный вариант зависит от работы оптимизации.")));
						}
					});
					amr.setNeutralButton("Shizuku", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							s.edit().putString("access", "Shizuku").commit();
							textview3.setText("Выбран доступ через ".concat(s.getString("access", "").concat(". Выбранный вариант зависит от работы оптимизации.")));
						}
					});
					amr.setIcon(R.drawable.passkey);
					amr.create().show();
				}
			}
		});
		
		button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (navnum == 0) {
					i.setClass(getApplicationContext(), ProcessingActivity.class);
					startActivity(i);
				}
				if (navnum == 1) {
					MaterialAlertDialogBuilder amr = new MaterialAlertDialogBuilder(HomeActivity.this);
					
					amr.setTitle("Прочие твики");
					amr.setMessage("Нет доступных твиков для применения.");
					amr.setPositiveButton("Понятно", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					amr.create().show();
				}
				if (navnum == 2) {
					MaterialAlertDialogBuilder amr = new MaterialAlertDialogBuilder(HomeActivity.this);
					
					amr.setTitle("Больше");
					
					amr.setMessage("SAOptimization v3.2, 31 окт. 2024 г.\nБлагодарности: saivan4ick.");
					amr.setPositiveButton("GitHub", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							g.setAction(Intent.ACTION_VIEW);
							g.setData(Uri.parse("https://github.com/superisuer/superisuer-android-optimization"));
							startActivity(g);
						}
					});
					amr.setNeutralButton("4PDA", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							g.setAction(Intent.ACTION_VIEW);
							g.setData(Uri.parse("https://4pda.to/forum/index.php?showtopic=1096757&view=findpost&p=133108178"));
							startActivity(g);
						}
					});
					amr.create().show();
				}
			}
		});
		
		bottomnavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(MenuItem item) {
				final int _itemId = item.getItemId();
				if (_itemId == 0) {
					navnum = 0;
					textview1.setText("Главная");
					textview2.setText("Фоновая оптимизация");
					textview3.setText("Когда включено, приложение оптимизирует систему в фоновом режиме. Рекомендуется отключать эту функцию для энергосбережения.");
					button11.setText("Включить");
					textview4.setText("Ручная оптимизация");
					textview5.setText("Единоразовая оптимизация устройства.");
					button12.setText("Запустить");
					imageview1.setImageResource(R.drawable.bgopt);
					imageview2.setImageResource(R.drawable.tag);
					button11.setVisibility(View.VISIBLE);
					textview5.setVisibility(View.VISIBLE);
					textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesans_regular.ttf"), 0);
				}
				if (_itemId == 1) {
					navnum = 1;
					textview1.setText("Прочее");
					textview2.setText("Об устройстве");
					textview3.setText("Производитель: ".concat(Build.BRAND.concat("\nМодель: ".concat(Build.MANUFACTURER.concat(" ".concat(Build.MODEL)).concat("\nВерсия Android: ".concat(Build.VERSION.RELEASE.concat(" (SDK ".concat(Build.VERSION.SDK.concat(")\nПодпись: ".concat(Build.FINGERPRINT))))))))));
					button11.setText("Включить");
					textview4.setText("Прочие твики");
					textview5.setText("Единоразовая оптимизация устройства.");
					button12.setText("Просмотреть");
					imageview1.setImageResource(R.drawable.device);
					imageview2.setImageResource(R.drawable.tweaks);
					button11.setVisibility(View.GONE);
					textview5.setVisibility(View.GONE);
					textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sourcecodepro.ttf"), 0);
				}
				if (_itemId == 2) {
					navnum = 2;
					textview1.setText("Настройки");
					textview2.setText("Права доступа");
					textview3.setText("Выбран доступ через ".concat(s.getString("access", "").concat(". Выбранный вариант зависит от работы оптимизации.")));
					button11.setText("Выбрать");
					textview4.setText("О приложении");
					textview5.setText("SAOptimization - это приложение для оптимизации устройств на базе ОС Android, чтобы увеличить производительность и энергосбережение.");
					button12.setText("Больше");
					imageview1.setImageResource(R.drawable.passkey);
					imageview2.setImageResource(R.drawable.tag);
					button11.setVisibility(View.VISIBLE);
					textview5.setVisibility(View.VISIBLE);
					textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesans_regular.ttf"), 0);
				}
				return true;
			}
		});
	}
	
	private void initializeLogic() {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesans_regular.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesans_regular.ttf"), 0);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesans_regular.ttf"), 0);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesans_regular.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesans_regular.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesans_regular.ttf"), 0);
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)45, (int)4, 0xFFE0E0E0, Color.TRANSPARENT));
		linear6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)45, (int)4, 0xFFE0E0E0, Color.TRANSPARENT));
		imageview1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)99, 0xFFEDE7F6));
		imageview2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)99, 0xFFEDE7F6));
		bottomnavigation1.getMenu().add(0, 0, 0, "Главная").setIcon(R.drawable.home);
		bottomnavigation1.getMenu().add(0, 1, 0, "Прочее").setIcon(R.drawable.tweaks);
		bottomnavigation1.getMenu().add(0, 2, 0, "Настройки").setIcon(R.drawable.settings);
		// Material Drower
		_DrowerHandler();
		//the Dynamic Colors added files in Menu/Java files/
		
		
		//!!! Pleas Dont Rename Java Files !!!
		try {
			
			Runtime.getRuntime().exec("su"); 
			
			s.edit().putString("access", "Root").commit();
			
		} catch (Exception e ) {
			
			s.edit().putString("access", "ничего").commit();
			
		}
	}
	
	public void _DrowerHandler() {
		
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