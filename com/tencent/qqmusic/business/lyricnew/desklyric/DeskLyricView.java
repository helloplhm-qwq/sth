/*  1 */ package com.tencent.qqmusic.business.lyricnew.desklyric;@ViewMapping(2131427718) @SuppressLint({"NewApi", "InflateParams", "ClickableViewAccessibility"}) public class DeskLyricView extends LinearLayout { public static int O = 56; public static int P = 40; private Context A; View.OnClickListener B; private a C; private boolean D; private boolean E; private n F; private com.tencent.qqmusic.business.lyricnew.load.listener.b G; private BroadcastReceiver H; private Handler I; View.OnClickListener J; View.OnClickListener K; View.OnClickListener L; View.OnClickListener M; private View.OnTouchListener N; public int b; public ImageView c; @ViewMapping(2131298104) public RelativeLayout d; @ViewMapping(2131298128) public DoubleLyricView20 e; public DeskLyricView(Context paramContext) { super(paramContext);
/*  2 */     this.q = new HashMap<String, com.tencent.qqmusic.business.lyricnew.setting.a.a>();
/*  3 */     this.r = new ArrayList<Integer>();
/*  4 */     this.s = 0;
/*  5 */     this.v = false;
/*  6 */     this.z = false;
/*  7 */     this.B = new e();
/*  8 */     this.D = false;
/*  9 */     this.E = false;
/* 10 */     this.G = new f(this);
/* 11 */     this.H = new g();
/* 12 */     this.I = new h(Looper.getMainLooper());
/* 13 */     this.J = new i();
/* 14 */     this.K = new j();
/* 15 */     this.L = new k();
/* 16 */     this.M = new l();
/* 17 */     this.N = new m();
/* 18 */     x(paramContext); } @ViewMapping(2131297385) public ImageView f; public ImageView g; public ImageView h; @ViewMapping(2131298216) public ImageView i; public ImageView j; public ImageView k; public ImageView l; public ViewGroup m; @ViewMapping(2131297642) public LinearLayout n; @ViewMapping(2131297881) public RelativeLayout o; private LottieAnimationView p; private Map<String, com.tencent.qqmusic.business.lyricnew.setting.a.a> q; private List<Integer> r; private int s; private String t; private int u; private boolean v; private ViewGroup w; private int x; private int y; private boolean z; private void A() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1302] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21621)).isSupported) return;  this.r.add(Integer.valueOf(15)); this.r.add(Integer.valueOf(17)); this.r.add(Integer.valueOf(19)); this.r.add(Integer.valueOf(21)); this.r.add(Integer.valueOf(23)); } private void B() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1305] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21644)).isSupported) return;  com.tencent.qqmusic.business.newmusichall.n.j(this, LayoutInflater.from(this.A), (ViewGroup)this, true); this.w = (ViewGroup)LayoutInflater.from(this.A).inflate(2131427831, null); ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(this.A).inflate(2131427719, null); this.c = (ImageView)viewGroup.findViewById(2131297444); this.l = (ImageView)this.m.findViewById(2131297588); this.k = (ImageView)this.m.findViewById(2131297586); this.j = (ImageView)this.m.findViewById(2131297587); this.g = (ImageView)findViewById(2131301305); this.h = (ImageView)this.m.findViewById(2131297417); this.p = (LottieAnimationView)this.m.findViewById(2131297414); setOrientation(1); String str = D(r.r0().V()); if (str != null) r.r0().M2(this.t);  this.t = r.r0().V(); int i = z(); com.tencent.qqmusic.business.lyricnew.setting.a.a a1 = this.q.get(this.t); if (a1 != null) { this.e.setFontColorH(a1.a); this.e.setFontColor(a1.b); }
/* 19 */     else { int j = getResources().getColor(2131100942);
/* 20 */       int k = getResources().getColor(2131101221);
/* 21 */       this.e.setFontColor(k);
/* 22 */       this.e.setFontColorH(j); }
/* 23 */      this.h.setOnClickListener(new a());
/* 24 */     this.e.setFontSize(i);
/* 25 */     this.u = e1.f();
/* 26 */     ViewConfiguration viewConfiguration = ViewConfiguration.get(this.A);
/* 27 */     this.b = i = viewConfiguration.getScaledPagingTouchSlop(); if (i != 0)
/* 28 */       this.b = i >> 2; 
/* 29 */     if (this.b < 5)
/* 30 */       this.b = 5; 
/* 31 */     this.i.setOnClickListener(this.B);
/* 32 */     this.f.setOnClickListener(this.J);
/* 33 */     this.g.setOnClickListener(this.K);
/* 34 */     this.c.setOnClickListener(this.L);
/* 35 */     this.j.setOnClickListener(this.M);
/* 36 */     this.k.setOnClickListener(this.M);
/* 37 */     this.l.setOnClickListener(this.M);
/* 38 */     setOnTouchListener(this.N);
/* 39 */     this.o.setOnTouchListener(this.N);
/* 40 */     y();
/* 41 */     setVisibility(4);
/* 42 */     R(com.tencent.qqmusicplayerprocess.audio.playlist.l.e1().M1());
/* 43 */     if (getIsFirstOpenDeskLyric())
/* 44 */     { setIsFirstOpenDeskLyric(false);
/* 45 */       N();
/* 46 */       M(true); }
/* 47 */     else { this.n.setBackgroundResource(2131101091);
/* 48 */       this.m.setBackgroundResource(2131101091);
/* 49 */       I();
/* 50 */       M(false); }
/* 51 */      if (this.d.getVisibility() == 0)
/* 52 */       this.I.sendEmptyMessageDelayed(0, 5000L); 
/* 53 */     if (Pay4AdUtils.t(com.tencent.qqmusicplayerprocess.audio.playlist.l.e1().L1()))
/* 54 */       this.e.setVisibility(8);  } private String D(String paramString) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1319] >> 4 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, this, 21757); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  return this.q.containsKey(paramString) ? null : "Green"; } private boolean E(@Nullable SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; boolean bool1 = true; if (arrayOfByte != null && (arrayOfByte[1315] >> 6 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramSongInfo, this, 21727); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  boolean bool2 = false; if (paramSongInfo != null) { boolean bool3 = com.tencent.qqmusic.common.ipc.i.r().isSongILike(paramSongInfo); boolean bool4 = com.tencent.qqmusic.common.ipc.i.r().isRadioCollected(paramSongInfo.l0()); StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("[updateLikeButton] isMyFavor = "); stringBuilder.append(bool3); stringBuilder.append(" isMyFavorRadio:"); stringBuilder.append(bool4); MLog.i("DeskLyric#DeskLyricView", stringBuilder.toString()); bool2 = bool1; if (!bool3) if (bool4) { bool2 = bool1; } else { bool2 = false; }   }  return bool2; } private void G() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1355] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22048)).isSupported) return;  if (this.n.getVisibility() == 0) { this.I.removeMessages(0); this.I.sendEmptyMessageDelayed(0, 5000L); }  } private void M(boolean paramBoolean) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1335] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), this, 21884)).isSupported) return;  if (paramBoolean) { new ClickStatistics(4241); this.d.setVisibility(0); setOnTouchListener(this.N); } else { this.d.setVisibility(4); setOnTouchListener(null); }  } public DeskLyricView(Context paramContext, AttributeSet paramAttributeSet) { super(paramContext, paramAttributeSet); this.q = new HashMap<String, com.tencent.qqmusic.business.lyricnew.setting.a.a>(); this.r = new ArrayList<Integer>(); this.s = 0; this.v = false; this.z = false; this.B = new e(); this.D = false; this.E = false; this.G = new f(this); this.H = new g(); this.I = new h(Looper.getMainLooper()); this.J = new i(); this.K = new j(); this.L = new k(); this.M = new l(); this.N = new m(); x(paramContext); }
/*    */ 
/*    */   
/*    */   private void O() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1344] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21954)).isSupported)
/*    */       return; 
/*    */     if (com.tencent.qqmusic.sharedfileaccessor.e.c().getBoolean("KEY_SHOW_COLLECT_GUIDE", false)) {
/*    */       SongInfo songInfo = com.tencent.qqmusicplayerprocess.audio.playlist.l.e1().L1();
/*    */       if (songInfo != null) {
/*    */         float f = (float)com.tencent.qqmusicplayerprocess.audio.playlist.l.e1().U0() / (float)songInfo.y0();
/*    */         if (f * 100.0F > com.tencent.qqmusic.sharedfileaccessor.e.c().getInt("KEY_COLLECT_GUIDE_BAR", 0)) {
/*    */           LottieAnimationView lottieAnimationView = this.p;
/*    */           if (lottieAnimationView != null) {
/*    */             lottieAnimationView.u();
/*    */             ExposureStatistics exposureStatistics = ExposureStatistics.X(5000443L);
/*    */             StringBuilder stringBuilder = new StringBuilder();
/*    */             stringBuilder.append("1609_");
/*    */             stringBuilder.append(com.tencent.qqmusic.sharedfileaccessor.e.c().getString("KEY_COLLECT_GUIDE_ABT_ID", ""));
/*    */             exposureStatistics.a(stringBuilder.toString()).A();
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void Q(@Nullable SongInfo paramSongInfo) {
/*    */     // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_2
/*    */     //   4: iconst_1
/*    */     //   5: istore_3
/*    */     //   6: aload_2
/*    */     //   7: ifnull -> 37
/*    */     //   10: aload_2
/*    */     //   11: sipush #1313
/*    */     //   14: baload
/*    */     //   15: iconst_5
/*    */     //   16: ishr
/*    */     //   17: iconst_1
/*    */     //   18: iand
/*    */     //   19: ifle -> 37
/*    */     //   22: aload_1
/*    */     //   23: aload_0
/*    */     //   24: sipush #21710
/*    */     //   27: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   30: getfield isSupported : Z
/*    */     //   33: ifeq -> 37
/*    */     //   36: return
/*    */     //   37: aload_0
/*    */     //   38: aload_1
/*    */     //   39: invokespecial E : (Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;)Z
/*    */     //   42: istore #4
/*    */     //   44: aload_1
/*    */     //   45: ifnull -> 71
/*    */     //   48: iload_3
/*    */     //   49: istore #5
/*    */     //   51: aload_1
/*    */     //   52: invokevirtual a : ()Z
/*    */     //   55: ifeq -> 74
/*    */     //   58: aload_1
/*    */     //   59: invokevirtual d : ()Z
/*    */     //   62: ifeq -> 71
/*    */     //   65: iload_3
/*    */     //   66: istore #5
/*    */     //   68: goto -> 74
/*    */     //   71: iconst_0
/*    */     //   72: istore #5
/*    */     //   74: iload #5
/*    */     //   76: ifne -> 87
/*    */     //   79: ldc_w 2131237686
/*    */     //   82: istore #5
/*    */     //   84: goto -> 105
/*    */     //   87: iload #4
/*    */     //   89: ifeq -> 100
/*    */     //   92: ldc_w 2131237687
/*    */     //   95: istore #5
/*    */     //   97: goto -> 105
/*    */     //   100: ldc_w 2131237685
/*    */     //   103: istore #5
/*    */     //   105: aload_0
/*    */     //   106: getfield h : Landroid/widget/ImageView;
/*    */     //   109: iload #5
/*    */     //   111: invokevirtual setImageResource : (I)V
/*    */     //   114: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 37
/*    */     //   #2	-> 48
/*    */     //   #3	-> 105
/*    */   }
/*    */   
/*    */   private void R(int paramInt) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1353] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(Integer.valueOf(paramInt), this, 22030)).isSupported)
/*    */       return; 
/*    */     if (com.tencent.qqmusiccommon.util.music.e.m(paramInt)) {
/*    */       this.j.setImageResource(2131234051);
/*    */     } else {
/*    */       this.j.setImageResource(2131234060);
/*    */     } 
/*    */   }
/*    */   
/*    */   private WindowManager getWindowManager() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1355] >> 2 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 22043);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (WindowManager)swordProxyResult.result; 
/*    */     } 
/*    */     return (WindowManager)this.A.getSystemService("window");
/*    */   }
/*    */   
/*    */   private void x(Context paramContext) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1299] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramContext, this, 21595)).isSupported)
/*    */       return; 
/*    */     this.A = paramContext;
/*    */     this.C = new a();
/*    */     this.q = com.tencent.qqmusic.business.lyricnew.setting.a.c();
/*    */     A();
/*    */     B();
/*    */     DisplayMetrics displayMetrics = this.A.getResources().getDisplayMetrics();
/*    */     float f = displayMetrics.density;
/*    */     this.x = (int)(20.0F * f);
/*    */     int i = (int)(f * 31.0F);
/*    */     this.y = i;
/*    */   }
/*    */   
/*    */   private void y() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1330] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21843)).isSupported)
/*    */       return; 
/*    */     ViewGroup viewGroup1 = this.w;
/*    */     byte b1 = 0;
/*    */     ViewGroup viewGroup2 = (ViewGroup)viewGroup1.getChildAt(0);
/*    */     while (b1 < viewGroup2.getChildCount()) {
/*    */       View view = viewGroup2.getChildAt(b1);
/*    */       if (view.getId() != -1)
/*    */         if (view instanceof ImageButton) {
/*    */           String str = (String)view.getTag();
/*    */           if (this.t.equals(str)) {
/*    */             ImageButton imageButton = (ImageButton)view;
/*    */             imageButton.setImageResource(2131237358);
/*    */           } 
/*    */           view.setOnClickListener(new c(viewGroup2, str));
/*    */         } else if (view instanceof ImageView) {
/*    */           view.setOnClickListener(new d());
/*    */         }  
/*    */       b1++;
/*    */     } 
/*    */   }
/*    */   
/*    */   private int z() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1321] >> 4 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21773);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Integer)swordProxyResult.result).intValue(); 
/*    */     } 
/*    */     int i = r.r0().W();
/*    */     this.s = this.r.indexOf(Integer.valueOf(i));
/*    */     DisplayMetrics displayMetrics = this.A.getResources().getDisplayMetrics();
/*    */     float f = i;
/*    */     return (int)((f * displayMetrics.density) + 0.5D);
/*    */   }
/*    */   
/*    */   public boolean C() {
/*    */     return this.v;
/*    */   }
/*    */   
/*    */   public void F() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1347] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21984)).isSupported)
/*    */       return; 
/*    */     if (this.v)
/*    */       return; 
/*    */     if (this.C.a() != null)
/*    */       this.C.a().a(O); 
/*    */     this.v = true;
/*    */   }
/*    */   
/*    */   public void H() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1337] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21899)).isSupported)
/*    */       return; 
/*    */     if (findViewById(2131297437) != null) {
/*    */       this.c.setBackgroundResource(2131234089);
/*    */       removeView((View)this.w);
/*    */       if (this.C.a() != null)
/*    */         this.C.a().b(0, -this.x, true, true); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void I() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1340] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21921)).isSupported)
/*    */       return; 
/*    */     if (findViewById(2131297585) != null) {
/*    */       removeView((View)this.m);
/*    */       if (this.C.a() != null)
/*    */         this.C.a().b(0, -this.y, true, true); 
/*    */       LottieAnimationView lottieAnimationView = this.p;
/*    */       if (lottieAnimationView != null) {
/*    */         lottieAnimationView.setProgress(0.0F);
/*    */         this.p.j();
/*    */       } 
/*    */       if (!this.z) {
/*    */         ExposureStatistics exposureStatistics = ExposureStatistics.X(5000440L);
/*    */         StringBuilder stringBuilder = new StringBuilder();
/*    */         stringBuilder.append("1609_");
/*    */         stringBuilder.append(com.tencent.qqmusic.sharedfileaccessor.e.c().getString("KEY_COLLECT_GUIDE_ABT_ID", ""));
/*    */         exposureStatistics.a(stringBuilder.toString()).A();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void J() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1346] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21973)).isSupported)
/*    */       return; 
/*    */     com.tencent.qqmusic.business.message.g.d(this);
/*    */     this.n.setBackgroundColor(0);
/*    */     H();
/*    */     this.d.setVisibility(4);
/*    */     I();
/*    */   }
/*    */   
/*    */   public void K() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1338] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21911)).isSupported)
/*    */       return; 
/*    */     addView((View)this.w);
/*    */     if (this.C.a() != null)
/*    */       this.C.a().b(0, this.x, true, true); 
/*    */   }
/*    */   
/*    */   public void L() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1323] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21785)).isSupported)
/*    */       return; 
/*    */     MLog.i("DeskLyric#DeskLyricView", "[showDeskLyricView] showDeskLyricView");
/*    */     if (getVisibility() == 0) {
/*    */       MLog.i("DeskLyric#DeskLyricView", "is showing,return");
/*    */       return;
/*    */     } 
/*    */     if (!this.z) {
/*    */       ExposureStatistics exposureStatistics = ExposureStatistics.X(5000440L);
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append("1609_");
/*    */       stringBuilder.append(com.tencent.qqmusic.sharedfileaccessor.e.c().getString("KEY_COLLECT_GUIDE_ABT_ID", ""));
/*    */       exposureStatistics.a(stringBuilder.toString()).A();
/*    */       this.z = true;
/*    */     } 
/*    */     try {
/*    */       if (!this.D) {
/*    */         IntentFilter intentFilter = new IntentFilter();
/*    */         this();
/*    */         intentFilter.addAction("com.tencent.qqmusic.ACTION_META_CHANGED.QQMusicPhone");
/*    */         intentFilter.addAction("com.tencent.qqmusic.ACTION_PLAYSONG_CHANGED.QQMusicPhone");
/*    */         intentFilter.addAction("com.tencent.qqmusic.ACTION_REFRESH_PLAYER_NOTIFICATION.QQMusicPhone");
/*    */         z.a.b(this.A, this.H, intentFilter);
/*    */         this.D = true;
/*    */       } else {
/*    */         MLog.i("DeskLyric#DeskLyricView", "[showDeskLyricView] play event alreay registered");
/*    */       } 
/*    */     } catch (Exception exception) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append("[showDeskLyricView] ");
/*    */       stringBuilder.append(exception.toString());
/*    */       MLog.e("DeskLyric#DeskLyricView", stringBuilder.toString());
/*    */     } 
/*    */     Q(com.tencent.qqmusicplayerprocess.audio.playlist.l.e1().L1());
/*    */     R(com.tencent.qqmusicplayerprocess.audio.playlist.l.e1().M1());
/*    */     setVisibility(0);
/*    */     if (this.v) {
/*    */       M(false);
/*    */       this.n.setBackgroundResource(2131101091);
/*    */       this.m.setBackgroundResource(2131101091);
/*    */       I();
/*    */     } 
/*    */     try {
/*    */       MLog.i("DeskLyric#DeskLyricView", "addLoadPlayLyricListener");
/*    */       com.tencent.qqmusic.business.lyricnew.load.manager.l.K().A(this.G);
/*    */       b b1 = new b();
/*    */       this(this);
/*    */       y1.a(b1);
/*    */     } catch (Exception exception) {
/*    */       MLog.e("DeskLyric#DeskLyricView", exception);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void N() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1341] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21936)).isSupported)
/*    */       return; 
/*    */     addView((View)this.m);
/*    */     if (this.C.a() != null)
/*    */       this.C.a().b(0, this.y, true, true); 
/*    */     O();
/*    */     ExposureStatistics exposureStatistics = ExposureStatistics.X(5000441L);
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append("1609_");
/*    */     stringBuilder.append(com.tencent.qqmusic.sharedfileaccessor.e.c().getString("KEY_COLLECT_GUIDE_ABT_ID", ""));
/*    */     exposureStatistics.a(stringBuilder.toString()).A();
/*    */   }
/*    */   
/*    */   public void P() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1349] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21997)).isSupported)
/*    */       return; 
/*    */     if (!this.v)
/*    */       return; 
/*    */     if (this.C.a() != null)
/*    */       this.C.a().a(P); 
/*    */     this.v = false;
/*    */   }
/*    */   
/*    */   public a getDeskHomeInterfaceReceiver() {
/*    */     return this.C;
/*    */   }
/*    */   
/*    */   public boolean getIsFirstOpenDeskLyric() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1350] >> 3 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 22004);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     return r.r0().t0();
/*    */   }
/*    */   
/*    */   public void setDeskLyricObserver(n paramn) {
/*    */     this.F = paramn;
/*    */   }
/*    */   
/*    */   public void setIsFirstOpenDeskLyric(boolean paramBoolean) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1352] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), this, 22017)).isSupported)
/*    */       return; 
/*    */     r.r0().k3(Boolean.valueOf(paramBoolean));
/*    */   }
/*    */   
/*    */   public void setLock(boolean paramBoolean) {
/*    */     if (this.v != paramBoolean)
/*    */       this.v = paramBoolean; 
/*    */   }
/*    */   
/*    */   public void w() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1327] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21823)).isSupported)
/*    */       return; 
/*    */     MLog.d("DeskLyric#DeskLyricView", "goneDeskLyricView");
/*    */     try {
/*    */       if (this.D) {
/*    */         this.A.unregisterReceiver(this.H);
/*    */         z.a.e(this.A, this.H);
/*    */         this.D = false;
/*    */       } else {
/*    */         MLog.i("DeskLyric#DeskLyricView", "[goneDeskLyricView] play event not register");
/*    */       } 
/*    */     } catch (Exception exception) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append("[goneDeskLyricView] ");
/*    */       stringBuilder.append(exception.toString());
/*    */       MLog.e("DeskLyric#DeskLyricView", stringBuilder.toString());
/*    */     } 
/*    */     setVisibility(8);
/*    */     this.z = false;
/*    */     com.tencent.qqmusic.business.lyricnew.load.manager.l.K().j0(this.G);
/*    */     this.e.stop();
/*    */     com.tencent.qqmusic.business.lyricnew.load.manager.l.K().r0(hashCode(), "DeskLyric#DeskLyricView");
/*    */   }
/*    */   
/*    */   class a implements View.OnClickListener {
/*    */     final DeskLyricView this$0;
/*    */     
/*    */     public void onClick(View param1View) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1278] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1View, this, 21427)).isSupported)
/*    */         return; 
/*    */       SongInfo songInfo = com.tencent.qqmusicplayerprocess.audio.playlist.l.e1().L1();
/*    */       if (songInfo != null) {
/*    */         int i = DeskLyricView.f(DeskLyricView.this, songInfo) ^ true;
/*    */         com.tencent.qqmusic.common.ipc.i.r().favoriteSong(songInfo, i, null);
/*    */         if (i != 0) {
/*    */           ClickStatistics clickStatistics = ClickStatistics.x0(1001010);
/*    */           StringBuilder stringBuilder = new StringBuilder();
/*    */           stringBuilder.append("1609_");
/*    */           stringBuilder.append(com.tencent.qqmusic.sharedfileaccessor.e.c().getString("KEY_COLLECT_GUIDE_ABT_ID", ""));
/*    */           clickStatistics.b(stringBuilder.toString()).Q();
/*    */         } else {
/*    */           ClickStatistics clickStatistics = ClickStatistics.x0(1001011);
/*    */           StringBuilder stringBuilder = new StringBuilder();
/*    */           stringBuilder.append("1609_");
/*    */           stringBuilder.append(com.tencent.qqmusic.sharedfileaccessor.e.c().getString("KEY_COLLECT_GUIDE_ABT_ID", ""));
/*    */           clickStatistics.b(stringBuilder.toString()).Q();
/*    */         } 
/*    */       } 
/*    */       EventCollector.getInstance().onViewClicked(param1View);
/*    */     }
/*    */   }
/*    */   
/*    */   class b implements Runnable {
/*    */     final DeskLyricView this$0;
/*    */     
/*    */     public void run() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1257] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21262)).isSupported)
/*    */         return; 
/*    */       MLog.i("DeskLyric#DeskLyricView", "startLoadLyric");
/*    */       com.tencent.qqmusic.business.lyricnew.load.manager.l.K().q0(hashCode(), "DeskLyric#DeskLyricView");
/*    */     }
/*    */   }
/*    */   
/*    */   class c implements View.OnClickListener {
/*    */     final ViewGroup b;
/*    */     final String c;
/*    */     final DeskLyricView this$0;
/*    */     
/*    */     c(ViewGroup param1ViewGroup, String param1String) {}
/*    */     
/*    */     public void onClick(View param1View) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1265] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1View, this, 21325)).isSupported)
/*    */         return; 
/*    */       DeskLyricView.r(DeskLyricView.this);
/*    */       ImageButton imageButton = (ImageButton)param1View;
/*    */       byte b = 0;
/*    */       while (b < this.b.getChildCount()) {
/*    */         View view = this.b.getChildAt(b);
/*    */         if (view.getId() != -1 && view instanceof ImageButton) {
/*    */           ImageButton imageButton1 = (ImageButton)view;
/*    */           imageButton1.setImageDrawable(null);
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */       imageButton.setImageResource(2131237358);
/*    */       com.tencent.qqmusic.business.lyricnew.setting.a.a a = (com.tencent.qqmusic.business.lyricnew.setting.a.a)DeskLyricView.g(DeskLyricView.this).get(this.c);
/*    */       DeskLyricView.this.e.setFontColor(a.b);
/*    */       DeskLyricView.this.e.setFontColorH(a.a);
/*    */       DeskLyricView.i(DeskLyricView.this, this.c);
/*    */       r.r0().M2(DeskLyricView.h(DeskLyricView.this));
/*    */       EventCollector.getInstance().onViewClicked(param1View);
/*    */     }
/*    */   }
/*    */   
/*    */   class d implements View.OnClickListener {
/*    */     final DeskLyricView this$0;
/*    */     
/*    */     public void onClick(View param1View) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1280] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1View, this, 21448)).isSupported)
/*    */         return; 
/*    */       DeskLyricView.r(DeskLyricView.this);
/*    */       switch (param1View.getId()) {
/*    */         case 2131298215:
/*    */           if (DeskLyricView.j(DeskLyricView.this) > 0) {
/*    */             DeskLyricView.l(DeskLyricView.this, 1);
/*    */             int i = ((Integer)DeskLyricView.m(DeskLyricView.this).get(DeskLyricView.j(DeskLyricView.this))).intValue();
/*    */             r.r0().N2(i);
/*    */             DisplayMetrics displayMetrics = DeskLyricView.a(DeskLyricView.this).getResources().getDisplayMetrics();
/*    */             float f = i;
/*    */             i = (int)((f * displayMetrics.density) + 0.5D);
/*    */             DeskLyricView.this.e.setFontSize(i);
/*    */           } 
/*    */           break;
/*    */         case 2131298214:
/*    */           if (DeskLyricView.j(DeskLyricView.this) < DeskLyricView.m(DeskLyricView.this).size() - 1) {
/*    */             DeskLyricView.k(DeskLyricView.this, 1);
/*    */             int i = ((Integer)DeskLyricView.m(DeskLyricView.this).get(DeskLyricView.j(DeskLyricView.this))).intValue();
/*    */             r.r0().N2(i);
/*    */             DisplayMetrics displayMetrics = DeskLyricView.a(DeskLyricView.this).getResources().getDisplayMetrics();
/*    */             float f = i;
/*    */             i = (int)((f * displayMetrics.density) + 0.5D);
/*    */             DeskLyricView.this.e.setFontSize(i);
/*    */           } 
/*    */           break;
/*    */       } 
/*    */       EventCollector.getInstance().onViewClicked(param1View);
/*    */     }
/*    */   }
/*    */   
/*    */   class e implements View.OnClickListener {
/*    */     final DeskLyricView this$0;
/*    */     
/*    */     public void onClick(View param1View) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1262] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1View, this, 21300)).isSupported)
/*    */         return; 
/*    */       new ClickStatistics(4248);
/*    */       Intent intent = new Intent("android.intent.action.MAIN");
/*    */       intent.addCategory("android.intent.category.LAUNCHER");
/*    */       intent.setComponent(AppStarterActivity.getAliasComponentName(DeskLyricView.a(DeskLyricView.this)));
/*    */       intent.setFlags(270532608);
/*    */       DeskLyricView.a(DeskLyricView.this).startActivity(intent);
/*    */       EventCollector.getInstance().onViewClicked(param1View);
/*    */     }
/*    */   }
/*    */   
/*    */   class g extends BroadcastReceiver {
/*    */     final DeskLyricView this$0;
/*    */     
/*    */     public void onReceive(Context param1Context, Intent param1Intent) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1279] >> 1 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { param1Context, param1Intent }, this, 21434)).isSupported)
/*    */         return; 
/*    */       if (param1Intent != null && param1Intent.getAction() != null) {
/*    */         String str = param1Intent.getAction();
/*    */         if ("com.tencent.qqmusic.ACTION_META_CHANGED.QQMusicPhone".equalsIgnoreCase(str)) {
/*    */           MLog.d("DeskLyric#DeskLyricView", "[onReceive] ACTION_PLAYSTATE_CHANGED");
/*    */           if (DeskLyricView.this.j.getVisibility() == 0)
/*    */             DeskLyricView.b(DeskLyricView.this, com.tencent.qqmusicplayerprocess.audio.playlist.l.e1().M1()); 
/*    */         } else if ("com.tencent.qqmusic.ACTION_PLAYSONG_CHANGED.QQMusicPhone".equalsIgnoreCase(str)) {
/*    */           if (DeskLyricView.this.h.getVisibility() == 0)
/*    */             DeskLyricView.n(DeskLyricView.this, com.tencent.qqmusicplayerprocess.audio.playlist.l.e1().L1()); 
/*    */         } else if ("com.tencent.qqmusic.ACTION_REFRESH_PLAYER_NOTIFICATION.QQMusicPhone".equalsIgnoreCase(str) && "com.tencent.qqmusic.ACTION_REFRESH_PLAYER_NOTIFICATION.QQMusicPhone".equals(str) && DeskLyricView.this.h.getVisibility() == 0) {
/*    */           DeskLyricView.n(DeskLyricView.this, com.tencent.qqmusicplayerprocess.audio.playlist.l.e1().L1());
/*    */         } 
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   class h extends Handler {
/*    */     final DeskLyricView this$0;
/*    */     
/*    */     h(Looper param1Looper) {
/*    */       super(param1Looper);
/*    */     }
/*    */     
/*    */     public void handleMessage(Message param1Message) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1280] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1Message, this, 21446)).isSupported)
/*    */         return; 
/*    */       super.handleMessage(param1Message);
/*    */       if (param1Message.what == 0 && !DeskLyricView.o(DeskLyricView.this)) {
/*    */         DeskLyricView.this.n.setBackgroundResource(2131101091);
/*    */         DeskLyricView.this.m.setBackgroundResource(2131101091);
/*    */         DeskLyricView.this.H();
/*    */         DeskLyricView.this.I();
/*    */         DeskLyricView.q(DeskLyricView.this, false);
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   class i implements View.OnClickListener {
/*    */     final DeskLyricView this$0;
/*    */     
/*    */     public void onClick(View param1View) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1279] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1View, this, 21436)).isSupported)
/*    */         return; 
/*    */       new ClickStatistics(9237);
/*    */       DeskLyricView.r(DeskLyricView.this);
/*    */       if (DeskLyricView.s(DeskLyricView.this) != null)
/*    */         DeskLyricView.s(DeskLyricView.this).a(); 
/*    */       EventCollector.getInstance().onViewClicked(param1View);
/*    */     }
/*    */   }
/*    */   
/*    */   class j implements View.OnClickListener {
/*    */     final DeskLyricView this$0;
/*    */     
/*    */     public void onClick(View param1View) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1262] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1View, this, 21299)).isSupported)
/*    */         return; 
/*    */       new ClickStatistics(9236);
/*    */       DeskLyricView.r(DeskLyricView.this);
/*    */       if (DeskLyricView.s(DeskLyricView.this) != null)
/*    */         DeskLyricView.s(DeskLyricView.this).b(); 
/*    */       EventCollector.getInstance().onViewClicked(param1View);
/*    */     }
/*    */   }
/*    */   
/*    */   class k implements View.OnClickListener {
/*    */     final DeskLyricView this$0;
/*    */     
/*    */     public void onClick(View param1View) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1262] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1View, this, 21297)).isSupported)
/*    */         return; 
/*    */       new ClickStatistics(9238);
/*    */       DeskLyricView.r(DeskLyricView.this);
/*    */       if (DeskLyricView.this.findViewById(2131297437) == null) {
/*    */         DeskLyricView.this.K();
/*    */       } else {
/*    */         DeskLyricView.this.H();
/*    */       } 
/*    */       EventCollector.getInstance().onViewClicked(param1View);
/*    */     }
/*    */   }
/*    */   
/*    */   class l implements View.OnClickListener {
/*    */     final DeskLyricView this$0;
/*    */     
/*    */     public void onClick(View param1View) {
/*    */       MusicWorldPlayIntercept.Action action;
/*    */       boolean bool;
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1279] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1View, this, 21435)).isSupported)
/*    */         return; 
/*    */       int i = param1View.getId();
/*    */       DeskLyricView.r(DeskLyricView.this);
/*    */       switch (i) {
/*    */         case 2131297588:
/*    */           if (com.tencent.qqmusicplayerprocess.qplayauto.c.d()) {
/*    */             MLog.i("DeskLyric#DeskLyricView", "Is QPlay Auto play,not control!!!");
/*    */             break;
/*    */           } 
/*    */           if (!PlayerPay4AdManager.a.i()) {
/*    */             MLog.i("DeskLyric#DeskLyricView", "play previous, playing ad info and can not skip");
/*    */             break;
/*    */           } 
/*    */           if (MusicWorldPlayIntercept.interceptSongAction(MusicWorldPlayIntercept.Action.PRE)) {
/*    */             MLog.i("DeskLyric#DeskLyricView", "play previous, musicworld intercept, skip");
/*    */             MusicWorldPlayIntercept.showToast();
/*    */             break;
/*    */           } 
/*    */           MLog.d("DeskLyric#DeskLyricView", "playPrev");
/*    */           new ClickStatistics(4244);
/*    */           try {
/*    */             com.tencent.qqmusiccommon.util.music.a.I(2);
/*    */           } catch (Exception exception) {
/*    */             exception.printStackTrace();
/*    */             StringBuilder stringBuilder = new StringBuilder();
/*    */             stringBuilder.append("[mPlayBtnClickListener.onClick] ");
/*    */             stringBuilder.append(exception.toString());
/*    */             MLog.e("DeskLyric#DeskLyricView", stringBuilder.toString());
/*    */           } 
/*    */           break;
/*    */         case 2131297587:
/*    */           if (com.tencent.qqmusicplayerprocess.qplayauto.c.d()) {
/*    */             MLog.i("DeskLyric#DeskLyricView", "Is QPlay Auto play,not control!!!");
/*    */             break;
/*    */           } 
/*    */           bool = com.tencent.qqmusiccommon.util.music.e.l();
/*    */           if (bool) {
/*    */             action = MusicWorldPlayIntercept.Action.PAUSE;
/*    */           } else {
/*    */             action = MusicWorldPlayIntercept.Action.RESUME;
/*    */           } 
/*    */           if (MusicWorldPlayIntercept.interceptSongAction(action)) {
/*    */             if (bool) {
/*    */               MLog.i("DeskLyric#DeskLyricView", "pause, musicworld intercept, skip");
/*    */             } else {
/*    */               MLog.i("DeskLyric#DeskLyricView", "play, musicworld intercept, skip");
/*    */             } 
/*    */             MusicWorldPlayIntercept.showToast();
/*    */             break;
/*    */           } 
/*    */           new ClickStatistics(9235);
/*    */           if (com.tencent.qqmusiccommon.util.music.e.l()) {
/*    */             new ClickStatistics(4246);
/*    */             MLog.d("DeskLyric#DeskLyricView", "【DeskLyricView->onClick】->PAUSE");
/*    */           } else if (com.tencent.qqmusiccommon.util.music.e.h()) {
/*    */             new ClickStatistics(4247);
/*    */             MLog.d("DeskLyric#DeskLyricView", "【DeskLyricView->onClick】->PLAY");
/*    */           } 
/*    */           new AppStartStatics(104);
/*    */           if (r3.D()) {
/*    */             s.f().s(2);
/*    */           } else {
/*    */             r.c();
/*    */           } 
/*    */           com.tencent.qqmusiccommon.util.music.e.q(2);
/*    */           break;
/*    */         case 2131297586:
/*    */           if (com.tencent.qqmusicplayerprocess.qplayauto.c.d()) {
/*    */             MLog.i("DeskLyric#DeskLyricView", "Is QPlay Auto play,not control!!!");
/*    */             break;
/*    */           } 
/*    */           if (!PlayerPay4AdManager.a.i()) {
/*    */             MLog.i("DeskLyric#DeskLyricView", "play next, playing ad info and can not skip");
/*    */             break;
/*    */           } 
/*    */           if (MusicWorldPlayIntercept.interceptSongAction(MusicWorldPlayIntercept.Action.NEXT)) {
/*    */             MLog.i("DeskLyric#DeskLyricView", "play next, musicworld intercept, skip");
/*    */             MusicWorldPlayIntercept.showToast();
/*    */             break;
/*    */           } 
/*    */           MLog.d("DeskLyric#DeskLyricView", "playNext");
/*    */           new ClickStatistics(4245);
/*    */           try {
/*    */             com.tencent.qqmusiccommon.util.music.a.s(2);
/*    */           } catch (Exception exception) {
/*    */             exception.printStackTrace();
/*    */             StringBuilder stringBuilder = new StringBuilder();
/*    */             stringBuilder.append("[mPlayBtnClickListener.onClick] ");
/*    */             stringBuilder.append(exception.toString());
/*    */             MLog.e("DeskLyric#DeskLyricView", stringBuilder.toString());
/*    */           } 
/*    */           break;
/*    */       } 
/*    */       EventCollector.getInstance().onViewClicked(param1View);
/*    */     }
/*    */   }
/*    */   
/*    */   class m implements View.OnTouchListener {
/*    */     float b;
/*    */     float c;
/*    */     
/*    */     public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1268] >> 1 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { param1View, param1MotionEvent }, this, 21346);
/*    */         if (swordProxyResult.isSupported)
/*    */           return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */       } 
/*    */       if (DeskLyricView.t(DeskLyricView.this))
/*    */         return false; 
/*    */       int i = param1MotionEvent.getAction();
/*    */       float f = param1MotionEvent.getRawY();
/*    */       if (i == 0) {
/*    */         this.b = param1MotionEvent.getX();
/*    */         this.c = param1MotionEvent.getY();
/*    */       } else {
/*    */         if (i == 2) {
/*    */           if (!DeskLyricView.o(DeskLyricView.this))
/*    */             DeskLyricView.p(DeskLyricView.this, true); 
/*    */           if (!DeskLyricView.t(DeskLyricView.this)) {
/*    */             Point point = new Point();
/*    */             DeskLyricView.u(DeskLyricView.this).getDefaultDisplay().getSize(point);
/*    */             i = point.y;
/*    */             if (Math.abs(this.b - param1MotionEvent.getX()) <= DeskLyricView.this.b) {
/*    */               float f1 = this.c;
/*    */               if (Math.abs(f1 - param1MotionEvent.getY()) > DeskLyricView.this.b) {
/*    */                 int k = (int)(f - this.c - (i + DeskLyricView.v(DeskLyricView.this) - DeskLyricView.this.getHeight() >> 1));
/*    */                 this.d = true;
/*    */               } 
/*    */               return true;
/*    */             } 
/*    */           } else {
/*    */             return true;
/*    */           } 
/*    */         } else {
/*    */           if (i == 1) {
/*    */             if (DeskLyricView.c(DeskLyricView.this).a() != null) {
/*    */               if (DeskLyricView.this.findViewById(2131297437) != null) {
/*    */                 i = 0 - DeskLyricView.d(DeskLyricView.this);
/*    */               } else {
/*    */                 i = 0;
/*    */               } 
/*    */               int k = i;
/*    */               if (DeskLyricView.this.findViewById(2131297585) != null)
/*    */                 k = i - DeskLyricView.e(DeskLyricView.this); 
/*    */               r r = r.r0();
/*    */               DeskLyricView deskLyricView = DeskLyricView.this;
/*    */               i = DeskLyricView.c(deskLyricView).a().c();
/*    */               r.S2(i + k);
/*    */             } 
/*    */             if (Math.abs(param1MotionEvent.getX() - this.b) <= DeskLyricView.this.b) {
/*    */               float f1 = Math.abs(param1MotionEvent.getY() - this.c);
/*    */               DeskLyricView deskLyricView = DeskLyricView.this;
/*    */               if (f1 <= deskLyricView.b && !this.d)
/*    */                 if (deskLyricView.d.getVisibility() == 4) {
/*    */                   DeskLyricView.q(DeskLyricView.this, true);
/*    */                   DeskLyricView.this.N();
/*    */                   deskLyricView = DeskLyricView.this;
/*    */                   deskLyricView.n.setBackgroundColor(DeskLyricView.a(deskLyricView).getResources().getColor(2131099942));
/*    */                 } else {
/*    */                   DeskLyricView.this.n.setBackgroundResource(2131101091);
/*    */                   DeskLyricView.this.m.setBackgroundResource(2131101091);
/*    */                   DeskLyricView.this.H();
/*    */                   DeskLyricView.this.I();
/*    */                   DeskLyricView.q(DeskLyricView.this, false);
/*    */                 }  
/*    */             } 
/*    */             this.d = false;
/*    */             if (DeskLyricView.o(DeskLyricView.this))
/*    */               DeskLyricView.p(DeskLyricView.this, false); 
/*    */             DeskLyricView.r(DeskLyricView.this);
/*    */           } 
/*    */           return true;
/*    */         } 
/*    */         int j = (int)(f - this.c - (i + DeskLyricView.v(DeskLyricView.this) - DeskLyricView.this.getHeight() >> 1));
/*    */         this.d = true;
/*    */       } 
/*    */       return true;
/*    */     }
/*    */     
/*    */     boolean d = false;
/*    */     final DeskLyricView this$0;
/*    */   }
/*    */   
/*    */   public DeskLyricView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
/*    */     super(paramContext, paramAttributeSet, paramInt);
/*    */     this.q = new HashMap<String, com.tencent.qqmusic.business.lyricnew.setting.a.a>();
/*    */     this.r = new ArrayList<Integer>();
/*    */     this.s = 0;
/*    */     this.v = false;
/*    */     this.z = false;
/*    */     this.B = new e();
/*    */     this.D = false;
/*    */     this.E = false;
/*    */     this.G = new f(this);
/*    */     this.H = new g();
/*    */     this.I = new h(Looper.getMainLooper());
/*    */     this.J = new i();
/*    */     this.K = new j();
/*    */     this.L = new k();
/*    */     this.M = new l();
/*    */     this.N = new m();
/*    */     x(paramContext);
/*    */   }
/*    */   
/*    */   public static interface n {
/*    */     void a();
/*    */     
/*    */     void b();
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\desklyric\DeskLyricView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */