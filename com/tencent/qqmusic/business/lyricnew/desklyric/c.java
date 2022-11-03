/*  1 */ package com.tencent.qqmusic.business.lyricnew.desklyric;public class c { private static c g; private static Context h; private b a; private DeskLyricView b; private WindowManager.LayoutParams c; public void u() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1338] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21910)).isSupported) return;  this.f.post(new g()); } public void z(boolean paramBoolean) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1321] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), this, 21771)).isSupported) return;  if (h == null) {
/*  2 */       MLog.e("DeskLyric#Controller", "[showDeskLyric] mContext == null"); return;
/*  3 */     }  if (!d0.w().n()) {
/*  4 */       MLog.e("DeskLyric#Controller", "[showDeskLyric] desktopLyric sp is false"); return;
/*  5 */     }  if (l.e1().G1() == 111112) {
/*  6 */       MLog.e("DeskLyric#Controller", "[showDeskLyric] playListType is PLAY_QUICK_PODCAST_TYPE"); return;
/*  7 */     }  if (q()) {
/*  8 */       MLog.i("DeskLyric#Controller", " [showDeskLyric] isForeground, return."); return;
/*  9 */     }  boolean bool = c.g().b();
/* 10 */     StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(" [showDeskLyric] checkPermission:"); stringBuilder.append(bool); stringBuilder.append(" isInUI:"); stringBuilder.append(paramBoolean); MLog.i("DeskLyric#Controller", stringBuilder.toString());
/* 11 */     if (this.b != null && this.a != null) { if (paramBoolean)
/* 12 */       { w(); }
/* 13 */       else { this.f.post(new d()); }  }
/* 14 */     else { A(paramBoolean); }  } public void t() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1336] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21892)).isSupported) return;  MLog.i("DeskLyric#Controller", " [postLockDtLyric] "); this.f.post(new f()); } public void s(boolean paramBoolean1, boolean paramBoolean2) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1315] >> 1 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) }, this, 21722)).isSupported) return;  StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(" [openDeskLyric] openDeskLyric isInUI:"); stringBuilder.append(paramBoolean1); stringBuilder.append(" showTip:"); stringBuilder.append(paramBoolean2); MLog.i("DeskLyric#Controller", stringBuilder.toString()); if (h == null) { MLog.e("DeskLyric#Controller", " [openDeskLyric] mContext == null, return."); return; }  if (!c.g().b()) { if (paramBoolean2) { try { MLog.i("DeskLyric#Controller", "[openDeskLyric] no permission and show guide dialog."); Intent intent = new Intent(); this(h, DeskHomeDialogActivity.class); intent.addFlags(268435456); h.startActivity(intent); } catch (Exception exception) { MLog.e("DeskLyric#Controller", exception); }  } else { MLog.i("DeskLyric#Controller", "[openDeskLyric] no permission."); }  } else { if (c.g().d() && paramBoolean2) { MLog.i("DeskLyric#Controller", " [openDeskLyric] force show guide dialog."); Intent intent = new Intent(h, DeskHomeDialogActivity.class); intent.addFlags(268435456);
/* 15 */         h.startActivity(intent); }
/* 16 */        stringBuilder = new StringBuilder(); stringBuilder.append(" [openDeskLyric] permission ok and showTips:"); stringBuilder.append(paramBoolean2); MLog.i("DeskLyric#Controller", stringBuilder.toString()); if (paramBoolean2)
/* 17 */         B(h, 2131829503); 
/* 18 */       d0.w().I0(true);
/* 19 */       if (!q())
/* 20 */       { MLog.i("DeskLyric#Controller", " [openDeskLyric] showDtLyric now.");
/* 21 */         A(paramBoolean1); }
/* 22 */       else { MLog.i("DeskLyric#Controller", " [openDeskLyric] showDtLyric Foreground Delay."); }
/* 23 */        h.sendBroadcast(new Intent("com.tencent.qqmusic.ACTION_SERVICE_REFRESH_DESKLYRIC_NOTI.QQMusicPhone")); }  } private void e() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1326] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21815)).isSupported) return;  x(); MLog.i("DeskLyric#Controller", "[addDtLyricInUi]->Step 1,addDtLyricInUi"); int i = k(); if (this.c == null || this.d != i) { this.d = i; MLog.i("DeskLyric#Controller", "[addDtLyricInUi]->Step 2,initPosition"); o(); }  y(); if (this.b == null) { MLog.i("DeskLyric#Controller", "[addDtLyricInUi]->Step 3, new DeskLyricView"); DeskLyricView deskLyricView = new DeskLyricView(h); deskLyricView.setDeskLyricObserver(this.e); if (d0.w().p()) { this.b.setLock(true); this.c.flags = DeskLyricView.O; } else { this.b.setLock(false); this.c.flags = DeskLyricView.P; }  }  if (this.a == null) { MLog.i("DeskLyric#Controller", "[addDtLyricInUi]->Step 4, new DeskHomeWindow"); Context context = h; DeskLyricView deskLyricView = this.b; WindowManager.LayoutParams layoutParams = this.c; this.a = new b(context, (View)deskLyricView, layoutParams, deskLyricView.getDeskHomeInterfaceReceiver()); }  this.a.d(); try { boolean bool1 = com.tencent.qqmusiccommon.util.music.e.l();
/* 24 */       boolean bool2 = q();
/* 25 */       StringBuilder stringBuilder = new StringBuilder(); this(); stringBuilder.append("[addDtLyricInUi]->isQQMusicForeground = "); stringBuilder.append(bool2); stringBuilder.append(", isPlayingForUI = "); stringBuilder.append(bool1); MLog.i("DeskLyric#Controller", stringBuilder.toString());
/* 26 */       stringBuilder = new StringBuilder(); this(); stringBuilder.append("[addDtLyricInUi]->mDeskLyricView = "); stringBuilder.append(this.b); stringBuilder.append(", mDeskHomeWindow = "); stringBuilder.append(this.a); MLog.i("DeskLyric#Controller", stringBuilder.toString()); if (!bool2 && bool1)
/* 27 */       { this.b.L(); }
/* 28 */       else { this.b.w(); }  } catch (Exception exception)
/* 29 */     { MLog.e("DeskLyric#Controller", exception); }
/* 30 */      MLog.i("DeskLyric#Controller", "[addDtLyricInUi]->Step 5,addDtLyricInUi End"); }
/*    */ 
/*    */   
/*    */   public void r() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1337] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21902)).isSupported)
/*    */       return; 
/*    */     MLog.i("DeskLyric#Controller", " [lockDtLyric] ");
/*    */     DeskLyricView deskLyricView = this.b;
/*    */     if (deskLyricView != null) {
/*    */       deskLyricView.F();
/*    */       this.b.J();
/*    */     } 
/*    */     d0.J0(h, true);
/*    */     y.T();
/*    */     B(h, 2131829501);
/*    */     h.sendBroadcast(new Intent("com.tencent.qqmusic.ACTION_SERVICE_REFRESH_DESKLYRIC_NOTI.QQMusicPhone"));
/*    */   }
/*    */   
/*    */   public boolean p() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1341] >> 0 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21929);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     DeskLyricView deskLyricView = this.b;
/*    */     if (deskLyricView != null)
/*    */       return deskLyricView.C(); 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public void m(boolean paramBoolean) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1318] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), this, 21751)).isSupported)
/*    */       return; 
/*    */     if (d0.w().n()) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(" [goneDeskLyric] isInUI:");
/*    */       stringBuilder.append(paramBoolean);
/*    */       MLog.i("DeskLyric#Controller", stringBuilder.toString());
/*    */       if (paramBoolean) {
/*    */         n();
/*    */       } else {
/*    */         this.f.post(new c());
/*    */       } 
/*    */     } else {
/*    */       MLog.i("DeskLyric#Controller", " [goneDeskLyric] already gone return.");
/*    */     } 
/*    */   }
/*    */   
/*    */   public void j(boolean paramBoolean1, boolean paramBoolean2) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1314] >> 4 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) }, this, 21717)).isSupported)
/*    */       return; 
/*    */     boolean bool = d0.w().n();
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(" [closeDeskLyricAndSaveStatus] isDeskLyricOpen ");
/*    */     stringBuilder.append(bool);
/*    */     MLog.i("DeskLyric#Controller", stringBuilder.toString());
/*    */     i(paramBoolean1, bool, paramBoolean2);
/*    */   }
/*    */   
/*    */   public void h(boolean paramBoolean1, boolean paramBoolean2) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1313] >> 1 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) }, this, 21706)).isSupported)
/*    */       return; 
/*    */     i(paramBoolean1, paramBoolean2, true);
/*    */   }
/*    */   
/*    */   public void g(boolean paramBoolean) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1308] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), this, 21670)).isSupported)
/*    */       return; 
/*    */     boolean bool = d0.w().n();
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(" [closeDeskLyric] isDeskLyricOpen ");
/*    */     stringBuilder.append(bool);
/*    */     MLog.i("DeskLyric#Controller", stringBuilder.toString());
/*    */     h(paramBoolean, bool);
/*    */   }
/*    */   
/*    */   public void f() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1307] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21664)).isSupported)
/*    */       return; 
/*    */     MLog.i("DeskLyric#Controller", "[clear]");
/*    */     x();
/*    */     this.e = null;
/*    */     this.c = null;
/*    */   }
/*    */   
/*    */   public void C() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1339] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21918)).isSupported)
/*    */       return; 
/*    */     DeskLyricView deskLyricView = this.b;
/*    */     if (deskLyricView != null)
/*    */       deskLyricView.P(); 
/*    */     d0.J0(h, false);
/*    */     B(h, 2131829500);
/*    */     h.sendBroadcast(new Intent("com.tencent.qqmusic.ACTION_SERVICE_NOTIFY_UNLOCK.QQMusicPhone"));
/*    */   }
/*    */   
/*    */   private void y() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1330] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21848)).isSupported)
/*    */       return; 
/*    */     int i = r.r0().a0();
/*    */     if (i != 0)
/*    */       this.c.y = i; 
/*    */   }
/*    */   
/*    */   private void x() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1332] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21860)).isSupported)
/*    */       return; 
/*    */     MLog.i("DeskLyric#Controller", "[removeDtLyricInUi]");
/*    */     b b1 = this.a;
/*    */     if (b1 != null) {
/*    */       b1.c();
/*    */       this.a = null;
/*    */     } 
/*    */     DeskLyricView deskLyricView = this.b;
/*    */     if (deskLyricView != null) {
/*    */       deskLyricView.w();
/*    */       this.b.setDeskLyricObserver(null);
/*    */       this.b = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   private void w() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1334] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21880)).isSupported)
/*    */       return; 
/*    */     if (this.b != null && h != null) {
/*    */       try {
/*    */         if (!q()) {
/*    */           MLog.i("DeskLyric#Controller", "[reShowDtLyricInUi] showDeskLyricView");
/*    */           this.b.L();
/*    */         } else {
/*    */           MLog.i("DeskLyric#Controller", " [reShowDtLyricInUi] Foreground Return.");
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         MLog.e("DeskLyric#Controller", String.format("[DeskLyricController->reShowDtLyricInUi]->e = %s ", new Object[] { exception }));
/*    */       } 
/*    */     } else {
/*    */       MLog.e("DeskLyric#Controller", " [reShowDtLyricInUi] mDeskLyricView or mContext is null,not reShowDtLyricInUi.");
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void v(Context paramContext) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1303] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramContext, null, 21626)).isSupported)
/*    */       return; 
/*    */     h = paramContext.getApplicationContext();
/*    */     c c1 = g;
/*    */     if (c1 != null) {
/*    */       c1.f();
/*    */       g = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean q() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1349] >> 2 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21995);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     int i = i.r().isBackground() ^ true;
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(" [isQQMusicForeground] ");
/*    */     stringBuilder.append(i);
/*    */     MLog.d("DeskLyric#Controller", stringBuilder.toString());
/*    */     return i;
/*    */   }
/*    */   
/*    */   private void o() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1298] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21589)).isSupported)
/*    */       return; 
/*    */     WindowManager.LayoutParams layoutParams1 = new WindowManager.LayoutParams();
/*    */     layoutParams1.type = c.g().f();
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(" [initPosition] mWMParams.type = ");
/*    */     stringBuilder.append(this.c.type);
/*    */     MLog.i("DeskLyric#Controller", stringBuilder.toString());
/*    */     this.c.format = 1;
/*    */     DisplayMetrics displayMetrics = h.getResources().getDisplayMetrics();
/*    */     WindowManager.LayoutParams layoutParams2 = this.c;
/*    */     layoutParams2.width = this.d - (int)((displayMetrics.density * 10.0F) + 0.5D) * 2;
/*    */     layoutParams2.height = -2;
/*    */     b4.a.a(layoutParams2);
/*    */     r.r0().R2((int)((displayMetrics.density * 10.0F) + 0.5D));
/*    */     y();
/*    */   }
/*    */   
/*    */   private void n() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1334] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21873)).isSupported)
/*    */       return; 
/*    */     x();
/*    */   }
/*    */   
/*    */   public static c l() {
/*    */     // Byte code:
/*    */     //   0: ldc com/tencent/qqmusic/business/lyricnew/desklyric/c
/*    */     //   2: monitorenter
/*    */     //   3: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   6: astore_0
/*    */     //   7: aload_0
/*    */     //   8: ifnull -> 52
/*    */     //   11: aload_0
/*    */     //   12: sipush #1306
/*    */     //   15: baload
/*    */     //   16: iconst_0
/*    */     //   17: ishr
/*    */     //   18: iconst_1
/*    */     //   19: iand
/*    */     //   20: ifle -> 52
/*    */     //   23: aconst_null
/*    */     //   24: aconst_null
/*    */     //   25: sipush #21649
/*    */     //   28: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   31: astore_0
/*    */     //   32: aload_0
/*    */     //   33: getfield isSupported : Z
/*    */     //   36: ifeq -> 52
/*    */     //   39: aload_0
/*    */     //   40: getfield result : Ljava/lang/Object;
/*    */     //   43: checkcast com/tencent/qqmusic/business/lyricnew/desklyric/c
/*    */     //   46: astore_0
/*    */     //   47: ldc com/tencent/qqmusic/business/lyricnew/desklyric/c
/*    */     //   49: monitorexit
/*    */     //   50: aload_0
/*    */     //   51: areturn
/*    */     //   52: getstatic com/tencent/qqmusic/business/lyricnew/desklyric/c.g : Lcom/tencent/qqmusic/business/lyricnew/desklyric/c;
/*    */     //   55: ifnonnull -> 70
/*    */     //   58: new com/tencent/qqmusic/business/lyricnew/desklyric/c
/*    */     //   61: astore_0
/*    */     //   62: aload_0
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: aload_0
/*    */     //   67: putstatic com/tencent/qqmusic/business/lyricnew/desklyric/c.g : Lcom/tencent/qqmusic/business/lyricnew/desklyric/c;
/*    */     //   70: getstatic com/tencent/qqmusic/business/lyricnew/desklyric/c.g : Lcom/tencent/qqmusic/business/lyricnew/desklyric/c;
/*    */     //   73: astore_0
/*    */     //   74: ldc com/tencent/qqmusic/business/lyricnew/desklyric/c
/*    */     //   76: monitorexit
/*    */     //   77: aload_0
/*    */     //   78: areturn
/*    */     //   79: astore_0
/*    */     //   80: ldc com/tencent/qqmusic/business/lyricnew/desklyric/c
/*    */     //   82: monitorexit
/*    */     //   83: aload_0
/*    */     //   84: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 52
/*    */     //   #2	-> 58
/*    */     //   #3	-> 70
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	7	79	finally
/*    */     //   23	47	79	finally
/*    */     //   52	58	79	finally
/*    */     //   58	70	79	finally
/*    */     //   70	74	79	finally
/*    */   }
/*    */   
/*    */   @TargetApi(13)
/*    */   private int k() {
/*    */     // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_1
/*    */     //   4: aload_1
/*    */     //   5: ifnull -> 48
/*    */     //   8: aload_1
/*    */     //   9: sipush #1341
/*    */     //   12: baload
/*    */     //   13: bipush #6
/*    */     //   15: ishr
/*    */     //   16: iconst_1
/*    */     //   17: iand
/*    */     //   18: ifle -> 48
/*    */     //   21: aconst_null
/*    */     //   22: aload_0
/*    */     //   23: sipush #21935
/*    */     //   26: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   29: astore_1
/*    */     //   30: aload_1
/*    */     //   31: getfield isSupported : Z
/*    */     //   34: ifeq -> 48
/*    */     //   37: aload_1
/*    */     //   38: getfield result : Ljava/lang/Object;
/*    */     //   41: checkcast java/lang/Integer
/*    */     //   44: invokevirtual intValue : ()I
/*    */     //   47: ireturn
/*    */     //   48: iconst_0
/*    */     //   49: istore_2
/*    */     //   50: invokestatic i : ()I
/*    */     //   53: istore_3
/*    */     //   54: invokestatic c : ()I
/*    */     //   57: istore #4
/*    */     //   59: iload #4
/*    */     //   61: istore_2
/*    */     //   62: iload_3
/*    */     //   63: istore #5
/*    */     //   65: new java/lang/StringBuilder
/*    */     //   68: astore_1
/*    */     //   69: iload #4
/*    */     //   71: istore_2
/*    */     //   72: iload_3
/*    */     //   73: istore #5
/*    */     //   75: aload_1
/*    */     //   76: invokespecial <init> : ()V
/*    */     //   79: iload #4
/*    */     //   81: istore_2
/*    */     //   82: iload_3
/*    */     //   83: istore #5
/*    */     //   85: aload_1
/*    */     //   86: ldc_w '[getScreenWidth] UIConfig width='
/*    */     //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   92: pop
/*    */     //   93: iload #4
/*    */     //   95: istore_2
/*    */     //   96: iload_3
/*    */     //   97: istore #5
/*    */     //   99: aload_1
/*    */     //   100: iload_3
/*    */     //   101: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   104: pop
/*    */     //   105: iload #4
/*    */     //   107: istore_2
/*    */     //   108: iload_3
/*    */     //   109: istore #5
/*    */     //   111: aload_1
/*    */     //   112: ldc_w ' height='
/*    */     //   115: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   118: pop
/*    */     //   119: iload #4
/*    */     //   121: istore_2
/*    */     //   122: iload_3
/*    */     //   123: istore #5
/*    */     //   125: aload_1
/*    */     //   126: iload #4
/*    */     //   128: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   131: pop
/*    */     //   132: iload #4
/*    */     //   134: istore_2
/*    */     //   135: iload_3
/*    */     //   136: istore #5
/*    */     //   138: ldc 'DeskLyric#Controller'
/*    */     //   140: aload_1
/*    */     //   141: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   144: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   147: iload_3
/*    */     //   148: ifle -> 162
/*    */     //   151: iload #4
/*    */     //   153: istore #5
/*    */     //   155: iload_3
/*    */     //   156: istore_2
/*    */     //   157: iload #4
/*    */     //   159: ifgt -> 532
/*    */     //   162: iload #4
/*    */     //   164: istore_2
/*    */     //   165: iload_3
/*    */     //   166: istore #5
/*    */     //   168: getstatic com/tencent/qqmusic/business/lyricnew/desklyric/c.h : Landroid/content/Context;
/*    */     //   171: ldc_w 'window'
/*    */     //   174: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   177: checkcast android/view/WindowManager
/*    */     //   180: astore_1
/*    */     //   181: iload #4
/*    */     //   183: istore_2
/*    */     //   184: iload_3
/*    */     //   185: istore #5
/*    */     //   187: bipush #13
/*    */     //   189: iconst_1
/*    */     //   190: invokestatic b : (II)Z
/*    */     //   193: ifeq -> 312
/*    */     //   196: iload #4
/*    */     //   198: istore_2
/*    */     //   199: iload_3
/*    */     //   200: istore #5
/*    */     //   202: aload_1
/*    */     //   203: invokeinterface getDefaultDisplay : ()Landroid/view/Display;
/*    */     //   208: invokevirtual getWidth : ()I
/*    */     //   211: istore_3
/*    */     //   212: aload_1
/*    */     //   213: invokeinterface getDefaultDisplay : ()Landroid/view/Display;
/*    */     //   218: invokevirtual getHeight : ()I
/*    */     //   221: istore #5
/*    */     //   223: iload #5
/*    */     //   225: istore #4
/*    */     //   227: new java/lang/StringBuilder
/*    */     //   230: astore_1
/*    */     //   231: iload #5
/*    */     //   233: istore #4
/*    */     //   235: aload_1
/*    */     //   236: invokespecial <init> : ()V
/*    */     //   239: iload #5
/*    */     //   241: istore #4
/*    */     //   243: aload_1
/*    */     //   244: ldc_w '[getScreenWidth] getWidth='
/*    */     //   247: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   250: pop
/*    */     //   251: iload #5
/*    */     //   253: istore #4
/*    */     //   255: aload_1
/*    */     //   256: iload_3
/*    */     //   257: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   260: pop
/*    */     //   261: iload #5
/*    */     //   263: istore #4
/*    */     //   265: aload_1
/*    */     //   266: ldc_w ' geiHeight='
/*    */     //   269: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   272: pop
/*    */     //   273: iload #5
/*    */     //   275: istore #4
/*    */     //   277: aload_1
/*    */     //   278: iload #5
/*    */     //   280: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   283: pop
/*    */     //   284: iload #5
/*    */     //   286: istore #4
/*    */     //   288: ldc 'DeskLyric#Controller'
/*    */     //   290: aload_1
/*    */     //   291: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   294: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   297: iload_3
/*    */     //   298: istore_2
/*    */     //   299: goto -> 532
/*    */     //   302: astore_1
/*    */     //   303: iload #4
/*    */     //   305: istore #5
/*    */     //   307: iload_3
/*    */     //   308: istore_2
/*    */     //   309: goto -> 497
/*    */     //   312: iload #4
/*    */     //   314: istore_2
/*    */     //   315: iload_3
/*    */     //   316: istore #5
/*    */     //   318: new android/graphics/Point
/*    */     //   321: astore #6
/*    */     //   323: iload #4
/*    */     //   325: istore_2
/*    */     //   326: iload_3
/*    */     //   327: istore #5
/*    */     //   329: aload #6
/*    */     //   331: invokespecial <init> : ()V
/*    */     //   334: iload #4
/*    */     //   336: istore_2
/*    */     //   337: iload_3
/*    */     //   338: istore #5
/*    */     //   340: aload_1
/*    */     //   341: invokeinterface getDefaultDisplay : ()Landroid/view/Display;
/*    */     //   346: aload #6
/*    */     //   348: invokevirtual getSize : (Landroid/graphics/Point;)V
/*    */     //   351: iload #4
/*    */     //   353: istore_2
/*    */     //   354: iload_3
/*    */     //   355: istore #5
/*    */     //   357: aload #6
/*    */     //   359: getfield x : I
/*    */     //   362: istore_3
/*    */     //   363: iload #4
/*    */     //   365: istore_2
/*    */     //   366: iload_3
/*    */     //   367: istore #5
/*    */     //   369: aload #6
/*    */     //   371: getfield y : I
/*    */     //   374: istore #4
/*    */     //   376: iload #4
/*    */     //   378: istore_2
/*    */     //   379: iload_3
/*    */     //   380: istore #5
/*    */     //   382: new java/lang/StringBuilder
/*    */     //   385: astore_1
/*    */     //   386: iload #4
/*    */     //   388: istore_2
/*    */     //   389: iload_3
/*    */     //   390: istore #5
/*    */     //   392: aload_1
/*    */     //   393: invokespecial <init> : ()V
/*    */     //   396: iload #4
/*    */     //   398: istore_2
/*    */     //   399: iload_3
/*    */     //   400: istore #5
/*    */     //   402: aload_1
/*    */     //   403: ldc_w '[getScreenWidth] p.x='
/*    */     //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   409: pop
/*    */     //   410: iload #4
/*    */     //   412: istore_2
/*    */     //   413: iload_3
/*    */     //   414: istore #5
/*    */     //   416: aload_1
/*    */     //   417: iload_3
/*    */     //   418: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   421: pop
/*    */     //   422: iload #4
/*    */     //   424: istore_2
/*    */     //   425: iload_3
/*    */     //   426: istore #5
/*    */     //   428: aload_1
/*    */     //   429: ldc_w ' p.y='
/*    */     //   432: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   435: pop
/*    */     //   436: iload #4
/*    */     //   438: istore_2
/*    */     //   439: iload_3
/*    */     //   440: istore #5
/*    */     //   442: aload_1
/*    */     //   443: iload #4
/*    */     //   445: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   448: pop
/*    */     //   449: iload #4
/*    */     //   451: istore_2
/*    */     //   452: iload_3
/*    */     //   453: istore #5
/*    */     //   455: ldc 'DeskLyric#Controller'
/*    */     //   457: aload_1
/*    */     //   458: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   461: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   464: iload #4
/*    */     //   466: istore #5
/*    */     //   468: iload_3
/*    */     //   469: istore_2
/*    */     //   470: goto -> 532
/*    */     //   473: astore_1
/*    */     //   474: iload_2
/*    */     //   475: istore #4
/*    */     //   477: iload #5
/*    */     //   479: istore_2
/*    */     //   480: iload #4
/*    */     //   482: istore #5
/*    */     //   484: goto -> 497
/*    */     //   487: astore_1
/*    */     //   488: iload_3
/*    */     //   489: istore_2
/*    */     //   490: goto -> 494
/*    */     //   493: astore_1
/*    */     //   494: iconst_0
/*    */     //   495: istore #5
/*    */     //   497: new java/lang/StringBuilder
/*    */     //   500: dup
/*    */     //   501: invokespecial <init> : ()V
/*    */     //   504: astore #6
/*    */     //   506: aload #6
/*    */     //   508: ldc_w ' [getScreenWidth] '
/*    */     //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   514: pop
/*    */     //   515: aload #6
/*    */     //   517: aload_1
/*    */     //   518: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   521: pop
/*    */     //   522: ldc 'DeskLyric#Controller'
/*    */     //   524: aload #6
/*    */     //   526: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   529: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   532: iload_2
/*    */     //   533: iload #5
/*    */     //   535: invokestatic min : (II)I
/*    */     //   538: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 50
/*    */     //   #2	-> 54
/*    */     //   #3	-> 59
/*    */     //   #4	-> 162
/*    */     //   #5	-> 181
/*    */     //   #6	-> 196
/*    */     //   #7	-> 212
/*    */     //   #8	-> 223
/*    */     //   #9	-> 312
/*    */     //   #10	-> 334
/*    */     //   #11	-> 351
/*    */     //   #12	-> 363
/*    */     //   #13	-> 376
/*    */     //   #14	-> 497
/*    */     //   #15	-> 532
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   50	54	493	java/lang/Exception
/*    */     //   54	59	487	java/lang/Exception
/*    */     //   65	69	473	java/lang/Exception
/*    */     //   75	79	473	java/lang/Exception
/*    */     //   85	93	473	java/lang/Exception
/*    */     //   99	105	473	java/lang/Exception
/*    */     //   111	119	473	java/lang/Exception
/*    */     //   125	132	473	java/lang/Exception
/*    */     //   138	147	473	java/lang/Exception
/*    */     //   168	181	473	java/lang/Exception
/*    */     //   187	196	473	java/lang/Exception
/*    */     //   202	212	473	java/lang/Exception
/*    */     //   212	223	302	java/lang/Exception
/*    */     //   227	231	302	java/lang/Exception
/*    */     //   235	239	302	java/lang/Exception
/*    */     //   243	251	302	java/lang/Exception
/*    */     //   255	261	302	java/lang/Exception
/*    */     //   265	273	302	java/lang/Exception
/*    */     //   277	284	302	java/lang/Exception
/*    */     //   288	297	302	java/lang/Exception
/*    */     //   318	323	473	java/lang/Exception
/*    */     //   329	334	473	java/lang/Exception
/*    */     //   340	351	473	java/lang/Exception
/*    */     //   357	363	473	java/lang/Exception
/*    */     //   369	376	473	java/lang/Exception
/*    */     //   382	386	473	java/lang/Exception
/*    */     //   392	396	473	java/lang/Exception
/*    */     //   402	410	473	java/lang/Exception
/*    */     //   416	422	473	java/lang/Exception
/*    */     //   428	436	473	java/lang/Exception
/*    */     //   442	449	473	java/lang/Exception
/*    */     //   455	464	473	java/lang/Exception
/*    */   }
/*    */   
/*    */   private void i(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1310] >> 7 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean3) }, this, 21688)).isSupported)
/*    */       return; 
/*    */     MLog.i("DeskLyric#Controller", " [closeDeskLyric] isInUI = %s, showTips = %s, saveStatus = %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean3) });
/*    */     Context context = h;
/*    */     if (context == null) {
/*    */       MLog.e("DeskLyric#Controller", " [closeDeskLyric] mContext == null return.");
/*    */       return;
/*    */     } 
/*    */     if (paramBoolean2)
/*    */       B(context, 2131829502); 
/*    */     if (paramBoolean3)
/*    */       d0.w().I0(false); 
/*    */     if (paramBoolean1) {
/*    */       x();
/*    */     } else {
/*    */       this.f.post(new b());
/*    */     } 
/*    */     h.sendBroadcast(new Intent("com.tencent.qqmusic.ACTION_SERVICE_REFRESH_DESKLYRIC_NOTI.QQMusicPhone"));
/*    */   }
/*    */   
/*    */   private void B(Context paramContext, int paramInt) {
/*    */     char c1;
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1346] >> 3 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramContext, Integer.valueOf(paramInt) }, this, 21972)).isSupported)
/*    */       return; 
/*    */     MLog.i("DeskLyric#Controller", " [showToast] ");
/*    */     int i = Build.VERSION.SDK_INT;
/*    */     if (i >= 26) {
/*    */       c1 = '߶';
/*    */     } else {
/*    */       c1 = 'ߒ';
/*    */     } 
/*    */     if (c.g().f() == c1) {
/*    */       l.h(paramContext, paramInt, 0);
/*    */     } else if (i > 24) {
/*    */       l.h(paramContext, paramInt, 0);
/*    */     } else {
/*    */       l.j(paramContext, paramInt, 0);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void A(boolean paramBoolean) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1325] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), this, 21801)).isSupported)
/*    */       return; 
/*    */     if (l.e1().L1() != null) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(" [showDtLyric] isInUI:");
/*    */       stringBuilder.append(paramBoolean);
/*    */       MLog.i("DeskLyric#Controller", stringBuilder.toString());
/*    */       if (paramBoolean) {
/*    */         e();
/*    */       } else {
/*    */         this.f.post(new e());
/*    */       } 
/*    */     } else {
/*    */       MLog.i("DeskLyric#Controller", " [showDtLyric] no song, return.");
/*    */     } 
/*    */   }
/*    */   
/*    */   class b implements Runnable {
/*    */     final c this$0;
/*    */     
/*    */     public void run() {
/*    */       c.a(c.this);
/*    */     }
/*    */   }
/*    */   
/*    */   class c implements Runnable {
/*    */     final c this$0;
/*    */     
/*    */     public void run() {
/*    */       c.b(c.this);
/*    */     }
/*    */   }
/*    */   
/*    */   class d implements Runnable {
/*    */     final c this$0;
/*    */     
/*    */     public void run() {
/*    */       c.c(c.this);
/*    */     }
/*    */   }
/*    */   
/*    */   class e implements Runnable {
/*    */     final c this$0;
/*    */     
/*    */     public void run() {
/*    */       c.d(c.this);
/*    */     }
/*    */   }
/*    */   
/*    */   class f implements Runnable {
/*    */     final c this$0;
/*    */     
/*    */     public void run() {
/*    */       c.this.r();
/*    */     }
/*    */   }
/*    */   
/*    */   class g implements Runnable {
/*    */     final c this$0;
/*    */     
/*    */     public void run() {
/*    */       c.this.C();
/*    */     }
/*    */   }
/*    */   private int d = 0;
/*    */   private DeskLyricView.n e = new a(this);
/*    */   private Handler f = new Handler(Looper.getMainLooper());
/*    */   
/*    */   private c() {
/*    */     if (h != null) {
/*    */       this.d = k();
/*    */       o();
/*    */     } 
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\desklyric\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */