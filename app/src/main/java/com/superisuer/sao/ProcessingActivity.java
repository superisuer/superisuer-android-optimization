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

public class ProcessingActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private TextView textview1;
	private TextView textview2;
	
	private AlertDialog.Builder d;
	private TimerTask t;
	private Intent i = new Intent();
	private ObjectAnimator ob = new ObjectAnimator();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.processing);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		d = new AlertDialog.Builder(this);
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ob.setTarget(linear3);
				ob.setPropertyName("alpha");
				ob.setFloatValues((float)(1), (float)(0.5d));
				ob.setDuration((int)(100));
				ob.start();
				ob.setTarget(linear3);
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
								t.cancel();
								finish();
							}
						});
					}
				};
				_timer.schedule(t, (int)(300));
			}
		});
	}
	
	private void initializeLogic() {
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFEEEEEE));
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sourcecodepro.ttf"), 0);
		d.setMessage("OPTIONALLY. To continue, you need to download and install the Magisk module. If you do not have it downloaded, then click \"Download\".");
		d.setPositiveButton("Download", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://github.com/araafroyall/Systemless-build.prop/releases/download/v1.6.2/Systemless.Buildprop-v1.6.2.zip"));
				startActivity(i);
				try{
					d.setTitle("Can we do this?");
					d.setMessage("Make sure you have Magisk or KernelSU. Continue?");
					d.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							finish();
						}
					});
					d.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							t = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											textview1.setText(textview1.getText().toString().concat("> Waiting for the system to respond.\n> Build.prop tweaks:\n> Communication has been accelerated.\n> Improved performance."));
											try { 
												Runtime.getRuntime().exec("su -c setprop ro.HOME_APP_ADJ 1");
												Runtime.getRuntime().exec("su -c setprop ro.media.enc.jpeg.quality 100");
												Runtime.getRuntime().exec("su -c setprop ro.camcorder.videoModes true");
												Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-player true");
												Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-meta true");
												Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-scan true");
												Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-http true");
												Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-rtsp true");
												Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-record false");
												Runtime.getRuntime().exec("su -c setprop profiler.force_disable_err_rpt 1");
												Runtime.getRuntime().exec("su -c setprop profiler.force_disable_ulog 1");
												Runtime.getRuntime().exec("su -c setprop net.tcp.buffersize.default 4096,87380,256960, 4096, 16384,256960");
												Runtime.getRuntime().exec("su -c setprop net.tcp.buffersize.wifi 4096,87380,256960,409 6,163 84,256960");
												Runtime.getRuntime().exec("su -c setprop net.tcp.buffersize.umts 4096,8 7380,256960,4096,163 84,256960");
												Runtime.getRuntime().exec("su -c setprop net.tcp.buffersize.gprs 4096,8 7380,256960,4096,163 84,256960");
												Runtime.getRuntime().exec("su -c setprop net.tcp.buffersize.edge 4096,8 7380,256960,4096,163 84,256960");
												Runtime.getRuntime().exec("su -c setprop ro.ril.hep 0");
												Runtime.getRuntime().exec("su -c setprop ro.ril.hsxpa 2");
												Runtime.getRuntime().exec("su -c setprop ro.ril.enable.dtm 1");
												Runtime.getRuntime().exec("su -c setprop ro.ril.hsdpa.category 8");
												Runtime.getRuntime().exec("su -c setprop ro.ril.enable.a53 1");
												Runtime.getRuntime().exec("su -c setprop ro.ril.enable.3g.prefix 1");
												Runtime.getRuntime().exec("su -c setprop ro.ril.htcmaskw1.bitmask 4294967295");
												Runtime.getRuntime().exec("su -c setprop ro.ril.htcmaskw1 14449");
												Runtime.getRuntime().exec("su -c setprop ro.ril.hsupa.category 6");
												Runtime.getRuntime().exec("su -c setprop ro.telephony.call_ring.delay 0");
												Runtime.getRuntime().exec("su -c setprop ring.delay 0");
												Runtime.getRuntime().exec("su -c setprop persist.telephony.support.ipv6 1");
												Runtime.getRuntime().exec("su -c setprop persist.telephony.support.ipv4 1");
												Runtime.getRuntime().exec("su -c setprop ro.lge.proximity.delay 25");
												Runtime.getRuntime().exec("su -c setprop mot.proximity.delay 25");
												Runtime.getRuntime().exec("su -c setprop windowsmgr.max_events_per_sec 150");
												Runtime.getRuntime().exec("su -c setprop ro.min_pointer_dur 8 ro.max.fling_velocity 12000");
												Runtime.getRuntime().exec("su -c setprop ro.min.fling_velocity 8000");
												Runtime.getRuntime().exec("su -c setprop persist.cust.tel.eons 1");
												Runtime.getRuntime().exec("su -c setprop ro.ril.enable.amr.wideband 1");
												Runtime.getRuntime().exec("su -c setprop ro.config.hw_fast_dormancy 1");
												Runtime.getRuntime().exec("su -c setprop ro.config.hw_quickpoweron true");
												Runtime.getRuntime().exec("su -c setprop ro.kernel.android.checkjni 0");
												Runtime.getRuntime().exec("su -c setprop ro.kernel.checkjni 0");
												Runtime.getRuntime().exec("su -c setprop dalvik.vm.checkjni false");
												Runtime.getRuntime().exec("su -c setprop dalvik.vm.dexopt-data-only 1");
												Runtime.getRuntime().exec("su -c setprop dalvik.vm.heapstartsize 5m");
												Runtime.getRuntime().exec("su -c setprop dalvik.vm.heapgrowthlimit 48m");
												Runtime.getRuntime().exec("su -c setprop dalvik.vm.heapsize 64m");
												Runtime.getRuntime().exec("su -c setprop dalvik.vm.verify-bytecode false");
												Runtime.getRuntime().exec("su -c setprop dalvik.vm.execution-mode int:jit");
												Runtime.getRuntime().exec("su -c setprop dalvik.vm.lockprof.threshold 250");
												Runtime.getRuntime().exec("su -c setprop dalvik.vm.dexopt-flags m v,o y");
												Runtime.getRuntime().exec("su -c setprop dalvik.vm.stack-trace-file /data/anr/traces.txt");
												Runtime.getRuntime().exec("su -c setprop dalvik.vm.jmiopts forcecopy");
												Runtime.getRuntime().exec("su -c setprop persist.sys.use_dithering 1");
												Runtime.getRuntime().exec("su -c setprop persist.adb.notify 0");
												Runtime.getRuntime().exec("su -c setprop persist.android.strictmode 0");
												Runtime.getRuntime().exec("su -c setprop wifi.supplicant_scan_interval 180");
												Runtime.getRuntime().exec("su -c setprop debug.performance.tuning 1");
											} catch (Exception e) {SketchwareUtil.showMessage(getApplicationContext(), "Failed.");}
											t = new TimerTask() {
												@Override
												public void run() {
													runOnUiThread(new Runnable() {
														@Override
														public void run() {
															textview1.setText(textview1.getText().toString().concat("\n> Disabled core dumping."));
															try {
																Runtime.getRuntime().exec("su -c ulimit -c 0; su -c sysctl -w fs.suid_dumpable=0");
															} catch (Exception s) {
																finishAffinity();
															}
															t = new TimerTask() {
																@Override
																public void run() {
																	runOnUiThread(new Runnable() {
																		@Override
																		public void run() {
																			textview1.setText(textview1.getText().toString().concat("\n> Enabled fixed performance mode."));
																			try {
																				Runtime.getRuntime().exec("su -c cmd power set-fixed-performance-mode-enabled [true]");
																			} catch (Exception s) {
																				finishAffinity();
																			}
																			t = new TimerTask() {
																				@Override
																				public void run() {
																					runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																							textview1.setText(textview1.getText().toString().concat("\n> Screen and interface fixes included."));
																							try {
																								Runtime.getRuntime().exec("su -c settings put secure refresh_rate_mode 2;su -c settings put system k2hd_effect 1;su -c settings put system tube_amp_effect 1;");
																							} catch (Exception s) {
																								finishAffinity();
																							}
																							t = new TimerTask() {
																								@Override
																								public void run() {
																									runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																											textview1.setText(textview1.getText().toString().concat("\n> Disabled a bit Google telemetry."));
																											try {
																												Runtime.getRuntime().exec("su -c settings put system send_security_reports 0");
																											} catch (Exception s) {
																												finishAffinity();
																											}
																											t = new TimerTask() {
																												@Override
																												public void run() {
																													runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																															textview1.setText(textview1.getText().toString().concat("\n> RAM has been optimized."));
																															try {
																																Runtime.getRuntime().exec("su -c settings put global zram 0");
																															} catch (Exception s) {
																																finishAffinity();
																															}
																															t = new TimerTask() {
																																@Override
																																public void run() {
																																	runOnUiThread(new Runnable() {
																																		@Override
																																		public void run() {
																																			textview1.setText(textview1.getText().toString().concat("\n> Done! Your phone will reboot in 5 seconds."));
																																			t = new TimerTask() {
																																				@Override
																																				public void run() {
																																					runOnUiThread(new Runnable() {
																																						@Override
																																						public void run() {
																																							try {
																																								Runtime.getRuntime().exec("su -c reboot");
																																							} catch (Exception s) {
																																								finishAffinity();
																																							}
																																						}
																																					});
																																				}
																																			};
																																			_timer.schedule(t, (int)(5000));
																																		}
																																	});
																																}
																															};
																															_timer.schedule(t, (int)(50));
																														}
																													});
																												}
																											};
																											_timer.schedule(t, (int)(50));
																										}
																									});
																								}
																							};
																							_timer.schedule(t, (int)(108));
																						}
																					});
																				}
																			};
																			_timer.schedule(t, (int)(80));
																		}
																	});
																}
															};
															_timer.schedule(t, (int)(108));
														}
													});
												}
											};
											_timer.schedule(t, (int)(300));
										}
									});
								}
							};
							_timer.schedule(t, (int)(100));
						}
					});
					d.create().show();
				}catch(Exception e){
					textview1.setText(textview1.getText().toString().concat("\n> Unknown error."));
				}
			}
		});
		d.setNegativeButton("Skip", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				d.setTitle("Can we do this?");
				d.setMessage("Make sure you have Magisk or KernelSU. Continue?");
				d.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						finish();
					}
				});
				d.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						t = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										textview1.setText(textview1.getText().toString().concat("\n! Make sure you have access to build.prop.\n> Communication has been accelerated.\n> Improved performance.\n"));
										try { 
											Runtime.getRuntime().exec("su -c setprop ro.HOME_APP_ADJ 1");
											Runtime.getRuntime().exec("su -c setprop ro.media.enc.jpeg.quality 100");
											Runtime.getRuntime().exec("su -c setprop ro.camcorder.videoModes true");
											Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-player true");
											Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-meta true");
											Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-scan true");
											Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-http true");
											Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-rtsp true");
											Runtime.getRuntime().exec("su -c setprop media.stagefright.enable-record false");
											Runtime.getRuntime().exec("su -c setprop profiler.force_disable_err_rpt 1");
											Runtime.getRuntime().exec("su -c setprop profiler.force_disable_ulog 1");
											Runtime.getRuntime().exec("su -c setprop net.tcp.buffersize.default 4096,87380,256960, 4096, 16384,256960");
											Runtime.getRuntime().exec("su -c setprop net.tcp.buffersize.wifi 4096,87380,256960,409 6,163 84,256960");
											Runtime.getRuntime().exec("su -c setprop net.tcp.buffersize.umts 4096,8 7380,256960,4096,163 84,256960");
											Runtime.getRuntime().exec("su -c setprop net.tcp.buffersize.gprs 4096,8 7380,256960,4096,163 84,256960");
											Runtime.getRuntime().exec("su -c setprop net.tcp.buffersize.edge 4096,8 7380,256960,4096,163 84,256960");
											Runtime.getRuntime().exec("su -c setprop ro.ril.hep 0");
											Runtime.getRuntime().exec("su -c setprop ro.ril.hsxpa 2");
											Runtime.getRuntime().exec("su -c setprop ro.ril.enable.dtm 1");
											Runtime.getRuntime().exec("su -c setprop ro.ril.hsdpa.category 8");
											Runtime.getRuntime().exec("su -c setprop ro.ril.enable.a53 1");
											Runtime.getRuntime().exec("su -c setprop ro.ril.enable.3g.prefix 1");
											Runtime.getRuntime().exec("su -c setprop ro.ril.htcmaskw1.bitmask 4294967295");
											Runtime.getRuntime().exec("su -c setprop ro.ril.htcmaskw1 14449");
											Runtime.getRuntime().exec("su -c setprop ro.ril.hsupa.category 6");
											Runtime.getRuntime().exec("su -c setprop ro.telephony.call_ring.delay 0");
											Runtime.getRuntime().exec("su -c setprop ring.delay 0");
											Runtime.getRuntime().exec("su -c setprop persist.telephony.support.ipv6 1");
											Runtime.getRuntime().exec("su -c setprop persist.telephony.support.ipv4 1");
											Runtime.getRuntime().exec("su -c setprop ro.lge.proximity.delay 25");
											Runtime.getRuntime().exec("su -c setprop mot.proximity.delay 25");
											Runtime.getRuntime().exec("su -c setprop windowsmgr.max_events_per_sec 150");
											Runtime.getRuntime().exec("su -c setprop ro.min_pointer_dur 8 ro.max.fling_velocity 12000");
											Runtime.getRuntime().exec("su -c setprop ro.min.fling_velocity 8000");
											Runtime.getRuntime().exec("su -c setprop persist.cust.tel.eons 1");
											Runtime.getRuntime().exec("su -c setprop ro.ril.enable.amr.wideband 1");
											Runtime.getRuntime().exec("su -c setprop ro.config.hw_fast_dormancy 1");
											Runtime.getRuntime().exec("su -c setprop ro.config.hw_quickpoweron true");
											Runtime.getRuntime().exec("su -c setprop ro.kernel.android.checkjni 0");
											Runtime.getRuntime().exec("su -c setprop ro.kernel.checkjni 0");
											Runtime.getRuntime().exec("su -c setprop dalvik.vm.checkjni false");
											Runtime.getRuntime().exec("su -c setprop dalvik.vm.dexopt-data-only 1");
											Runtime.getRuntime().exec("su -c setprop dalvik.vm.heapstartsize 5m");
											Runtime.getRuntime().exec("su -c setprop dalvik.vm.heapgrowthlimit 48m");
											Runtime.getRuntime().exec("su -c setprop dalvik.vm.heapsize 64m");
											Runtime.getRuntime().exec("su -c setprop dalvik.vm.verify-bytecode false");
											Runtime.getRuntime().exec("su -c setprop dalvik.vm.execution-mode int:jit");
											Runtime.getRuntime().exec("su -c setprop dalvik.vm.lockprof.threshold 250");
											Runtime.getRuntime().exec("su -c setprop dalvik.vm.dexopt-flags m v,o y");
											Runtime.getRuntime().exec("su -c setprop dalvik.vm.stack-trace-file /data/anr/traces.txt");
											Runtime.getRuntime().exec("su -c setprop dalvik.vm.jmiopts forcecopy");
											Runtime.getRuntime().exec("su -c setprop persist.sys.use_dithering 1");
											Runtime.getRuntime().exec("su -c setprop persist.adb.notify 0");
											Runtime.getRuntime().exec("su -c setprop persist.android.strictmode 0");
											Runtime.getRuntime().exec("su -c setprop wifi.supplicant_scan_interval 180");
											Runtime.getRuntime().exec("su -c setprop debug.performance.tuning 1");
										} catch (Exception e) {SketchwareUtil.showMessage(getApplicationContext(), "Failed.");}
										t = new TimerTask() {
											@Override
											public void run() {
												runOnUiThread(new Runnable() {
													@Override
													public void run() {
														textview1.setText(textview1.getText().toString().concat("\n> Disabled core dumping."));
														try {
															Runtime.getRuntime().exec("su -c ulimit -c 0; su -c sysctl -w fs.suid_dumpable=0");
														} catch (Exception s) {
															finishAffinity();
														}
														t = new TimerTask() {
															@Override
															public void run() {
																runOnUiThread(new Runnable() {
																	@Override
																	public void run() {
																		textview1.setText(textview1.getText().toString().concat("\n> Enabled fixed performance mode."));
																		try {
																			Runtime.getRuntime().exec("su -c cmd power set-fixed-performance-mode-enabled [true]");
																		} catch (Exception s) {
																			finishAffinity();
																		}
																		t = new TimerTask() {
																			@Override
																			public void run() {
																				runOnUiThread(new Runnable() {
																					@Override
																					public void run() {
																						textview1.setText(textview1.getText().toString().concat("\n> Screen and interface fixes included."));
																						try {
																							Runtime.getRuntime().exec("su -c settings put secure refresh_rate_mode 2;su -c settings put system k2hd_effect 1;su -c settings put system tube_amp_effect 1;");
																						} catch (Exception s) {
																							finishAffinity();
																						}
																						t = new TimerTask() {
																							@Override
																							public void run() {
																								runOnUiThread(new Runnable() {
																									@Override
																									public void run() {
																										textview1.setText(textview1.getText().toString().concat("\n> Disabled a bit Google telemetry."));
																										try {
																											Runtime.getRuntime().exec("su -c settings put system send_security_reports 0");
																										} catch (Exception s) {
																											finishAffinity();
																										}
																										t = new TimerTask() {
																											@Override
																											public void run() {
																												runOnUiThread(new Runnable() {
																													@Override
																													public void run() {
																														textview1.setText(textview1.getText().toString().concat("\n> RAM has been optimized."));
																														try {
																															Runtime.getRuntime().exec("su -c settings put global zram 0");
																														} catch (Exception s) {
																															finishAffinity();
																														}
																														t = new TimerTask() {
																															@Override
																															public void run() {
																																runOnUiThread(new Runnable() {
																																	@Override
																																	public void run() {
																																		textview1.setText(textview1.getText().toString().concat("\n> Done! Your phone will reboot in 5 seconds."));
																																		t = new TimerTask() {
																																			@Override
																																			public void run() {
																																				runOnUiThread(new Runnable() {
																																					@Override
																																					public void run() {
																																						try {
																																							Runtime.getRuntime().exec("su -c reboot");
																																						} catch (Exception s) {
																																							finishAffinity();
																																						}
																																					}
																																				});
																																			}
																																		};
																																		_timer.schedule(t, (int)(5000));
																																	}
																																});
																															}
																														};
																														_timer.schedule(t, (int)(50));
																													}
																												});
																											}
																										};
																										_timer.schedule(t, (int)(50));
																									}
																								});
																							}
																						};
																						_timer.schedule(t, (int)(108));
																					}
																				});
																			}
																		};
																		_timer.schedule(t, (int)(80));
																	}
																});
															}
														};
														_timer.schedule(t, (int)(108));
													}
												});
											}
										};
										_timer.schedule(t, (int)(300));
									}
								});
							}
						};
						_timer.schedule(t, (int)(100));
					}
				});
				d.create().show();
			}
		});
		d.setTitle("Until the start");
		d.create().show();
		linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFEEEEEE));
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/light.ttf"), 0);
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