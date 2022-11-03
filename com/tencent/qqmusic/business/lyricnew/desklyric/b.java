/* 1 */ package com.tencent.qqmusic.business.lyricnew.desklyric;public class b { private Context a; private View b; private WindowManager.LayoutParams c; private WindowManager d; private a e; public void d() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1282] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21458)).isSupported) return;  MLog.e("DeskLyric#DeskHomeWindow", "[showHomeWindow] showHomeWindow");
/* 2 */     WindowManager windowManager = this.d; if (windowManager != null) { View view = this.b; if (view != null) { WindowManager.LayoutParams layoutParams = this.c; if (layoutParams != null)
/* 3 */           try { windowManager.addView(view, (ViewGroup.LayoutParams)layoutParams);
/* 4 */             MLog.e("DeskLyric#DeskHomeWindow", "[showHomeWindow] mWM.addView"); }
/*   */           
/* 6 */           catch (RuntimeException runtimeException)
/* 7 */           { MLog.e("DeskLyric#DeskHomeWindow", runtimeException); } catch (Exception exception) { MLog.e("DeskLyric#DeskHomeWindow", exception); } catch (OutOfMemoryError outOfMemoryError) { MLog.e("DeskLyric#DeskHomeWindow", outOfMemoryError); }   }  }  } public void c() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1283] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21469)).isSupported) return;  a a1 = this.e; if (a1 != null) { a1.b(null); this.e = null; }  try { this.d.removeView(this.b); } catch (Exception exception) { MLog.e("DeskLyric#DeskHomeWindow", exception); }  this.b = null; this.c = null;
/* 8 */     this.d = null; } public b(Context paramContext, View paramView, WindowManager.LayoutParams paramLayoutParams, a parama) { if (paramContext != null && paramView != null && paramLayoutParams != null) { this.a = paramContext; this.d = (WindowManager)paramContext.getSystemService("window"); this.b = paramView; this.c = paramLayoutParams; if (parama != null) { this.e = parama; parama.b(this.f); }  return; }
/* 9 */      throw new NullPointerException("context, view and windowParams mustn't be null!"); }
/*   */ 
/*   */   
/*   */   private void e() {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1280] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21442)).isSupported)
/*   */       return; 
/*   */     try {
/*   */       this.d.updateViewLayout(this.b, (ViewGroup.LayoutParams)this.c);
/*   */     } catch (IllegalArgumentException illegalArgumentException) {
/*   */       MLog.e("DeskLyric#DeskHomeWindow", illegalArgumentException);
/*   */       try {
/*   */         this.d.addView(this.b, (ViewGroup.LayoutParams)this.c);
/*   */       } catch (RuntimeException runtimeException) {
/*   */         MLog.e("DeskLyric#DeskHomeWindow", runtimeException);
/*   */       } catch (Exception exception) {
/*   */         MLog.e("DeskLyric#DeskHomeWindow", exception);
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   private a.a f = new a(this); }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\desklyric\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */