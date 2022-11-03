/*   */ package com.tencent.qqmusic.business.lyricnew.desklyric;public class DeskHomeDialogActivity extends Activity { public DeskHomeDialogActivity() { 
/* 2 */     try { StringBuilder stringBuilder = new StringBuilder(); this(); stringBuilder.append(getClass().getName()); stringBuilder.append("_"); stringBuilder.append(System.currentTimeMillis()); BaseActivity.sLastNewActivityInfo = stringBuilder.toString(); } finally { Exception exception = null;
/* 3 */       StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("[instance initializer] "); stringBuilder.append(exception.toString()); }
/* 4 */      this.b = new a(this); }
/* 5 */   private c b; @Override public boolean dispatchTouchEvent(MotionEvent paramMotionEvent) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1281] >> 4 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramMotionEvent, this, 21453); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  EventCollector.getInstance().onActivityDispatchTouchEvent(this, paramMotionEvent, false, true); boolean bool = super.dispatchTouchEvent(paramMotionEvent); EventCollector.getInstance().onActivityDispatchTouchEvent(this, paramMotionEvent, bool, false); return bool; } public void onCreate(Bundle paramBundle) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1274] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramBundle, this, 21395)).isSupported) return;  c1.f(this); super.onCreate(paramBundle); if (!c.g().b() || c.g().d()) { if (c.h() != null) { String str = (c.h()).a; } else { paramBundle = null; }
/* 6 */        if (Looper.myLooper() == Looper.getMainLooper())
/* 7 */       { String str = Resource.m(2131824038);
/* 8 */         (new StatusBarLyricPermissionDialog(this, (String)paramBundle, str, Resource.m(2131828067), this.b)).show(); }
/* 9 */       else { (new Handler(Looper.getMainLooper())).post(new b((String)paramBundle)); }
/*   */       
/*   */       return; }
/*   */     
/*   */     this.b.a(); }
/*   */ 
/*   */   
/*   */   @Override
/*   */   public void onConfigurationChanged(Configuration paramConfiguration) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1280] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramConfiguration, this, 21443)).isSupported)
/*   */       return; 
/*   */     super.onConfigurationChanged(paramConfiguration);
/*   */     EventCollector.getInstance().onActivityConfigurationChanged(this, paramConfiguration);
/*   */   }
/*   */   
/*   */   public void onDestroy() {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1278] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21431)).isSupported)
/*   */       return; 
/*   */     MLog.i("DeskLyric#DeskHomeDialogActivity", "[onDestroy]->");
/*   */     super.onDestroy();
/*   */     d.b().f();
/*   */   }
/*   */   
/*   */   public void onStop() {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1277] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21423)).isSupported)
/*   */       return; 
/*   */     super.onStop();
/*   */     MLog.i("DeskLyric#DeskHomeDialogActivity", "[onStop]->");
/*   */     d.b().f();
/*   */   }
/*   */   
/*   */   public void setRequestedOrientation(int paramInt) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1271] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(Integer.valueOf(paramInt), this, 21376)).isSupported)
/*   */       return; 
/*   */     if (Build.VERSION.SDK_INT == 26 && c1.e(getTheme()) && c1.b(paramInt))
/*   */       return; 
/*   */     super.setRequestedOrientation(paramInt);
/*   */   }
/*   */   
/*   */   class b implements Runnable {
/*   */     final String b;
/*   */     final DeskHomeDialogActivity this$0;
/*   */     
/*   */     b(String param1String) {}
/*   */     
/*   */     public void run() {
/*   */       byte[] arrayOfByte = SwordSwitches.switches2;
/*   */       if (arrayOfByte != null && (arrayOfByte[1257] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21264)).isSupported)
/*   */         return; 
/*   */       DeskHomeDialogActivity deskHomeDialogActivity = DeskHomeDialogActivity.this;
/*   */       String str2 = this.b, str1 = Resource.m(2131824038);
/*   */       (new StatusBarLyricPermissionDialog(deskHomeDialogActivity, str2, str1, Resource.m(2131828067), DeskHomeDialogActivity.a(DeskHomeDialogActivity.this))).show();
/*   */     }
/*   */   }
/*   */   
/*   */   public static interface c {
/*   */     void a();
/*   */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\desklyric\DeskHomeDialogActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */