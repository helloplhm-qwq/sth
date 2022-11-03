/*    */ package com.tencent.qqmusic.business.lyricnew.load.manager;
/*  2 */ public class l extends v0 implements c { private static l o; private static Context p; private m b; private List<Integer> c; private boolean d; private List<b> e; private List<b> f; private l() { this.c = new ArrayList<Integer>();
/*  3 */     this.d = false;
/*  4 */     this.e = new ArrayList<b>();
/*  5 */     this.f = new ArrayList<b>();
/*  6 */     this.g = null;
/*  7 */     this.h = false;
/*  8 */     this.i = new AtomicBoolean(false);
/*  9 */     this.j = new c(this);
/* 10 */     this.k = new d();
/* 11 */     this.l = false;
/* 12 */     this.m = new o(this);
/* 13 */     this.n = new e(this);
/* 14 */     programStart(MusicApplication.getContext());
/* 15 */     i0.m(this.k);
/* 16 */     g0();
/* 17 */     if (!S())
/* 18 */       u.b(this);  } private ArrayList<n> g; private boolean h; private AtomicBoolean i; private BroadcastReceiver j; private b k; private boolean l; private Handler m; private BroadcastReceiver n; private void C(int paramInt, boolean paramBoolean) { // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches3 : [B
/*    */     //   3: astore_3
/*    */     //   4: iconst_1
/*    */     //   5: istore #4
/*    */     //   7: aload_3
/*    */     //   8: ifnull -> 54
/*    */     //   11: aload_3
/*    */     //   12: bipush #10
/*    */     //   14: baload
/*    */     //   15: iconst_3
/*    */     //   16: ishr
/*    */     //   17: iconst_1
/*    */     //   18: iand
/*    */     //   19: ifle -> 54
/*    */     //   22: iconst_2
/*    */     //   23: anewarray java/lang/Object
/*    */     //   26: dup
/*    */     //   27: iconst_0
/*    */     //   28: iload_1
/*    */     //   29: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   32: aastore
/*    */     //   33: dup
/*    */     //   34: iconst_1
/*    */     //   35: iload_2
/*    */     //   36: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   39: aastore
/*    */     //   40: aload_0
/*    */     //   41: sipush #22484
/*    */     //   44: invokestatic proxyMoreArgs : ([Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   47: getfield isSupported : Z
/*    */     //   50: ifeq -> 54
/*    */     //   53: return
/*    */     //   54: aload_0
/*    */     //   55: getfield b : Lcom/tencent/qqmusic/business/lyricnew/load/manager/l$m;
/*    */     //   58: astore_3
/*    */     //   59: aload_3
/*    */     //   60: ifnull -> 116
/*    */     //   63: iload_2
/*    */     //   64: ifeq -> 85
/*    */     //   67: aload_3
/*    */     //   68: getfield d : I
/*    */     //   71: ifeq -> 105
/*    */     //   74: aload_3
/*    */     //   75: iconst_0
/*    */     //   76: putfield d : I
/*    */     //   79: iload #4
/*    */     //   81: istore_1
/*    */     //   82: goto -> 107
/*    */     //   85: iload_1
/*    */     //   86: ifeq -> 105
/*    */     //   89: aload_3
/*    */     //   90: aload_3
/*    */     //   91: getfield d : I
/*    */     //   94: iload_1
/*    */     //   95: iadd
/*    */     //   96: putfield d : I
/*    */     //   99: iload #4
/*    */     //   101: istore_1
/*    */     //   102: goto -> 107
/*    */     //   105: iconst_0
/*    */     //   106: istore_1
/*    */     //   107: iload_1
/*    */     //   108: ifeq -> 116
/*    */     //   111: aload_0
/*    */     //   112: iconst_0
/*    */     //   113: invokespecial o0 : (Z)V
/*    */     //   116: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 54
/*    */     //   #2	-> 67
/*    */     //   #3	-> 74
/*    */     //   #4	-> 89
/* 18 */     //   #5	-> 111 } public static void F(SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1337] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramSongInfo, null, 21904)).isSupported) return;  if (paramSongInfo == null) { MLog.e("LyricLoad#CurrentLoadManager", " [deleteLyricCache] songInfo null."); return; }  StringBuilder stringBuilder2 = new StringBuilder(); stringBuilder2.append(" [deleteLyricCache] "); stringBuilder2.append(com.tencent.qqmusicplayerprocess.songinfo.d.E(paramSongInfo)); stringBuilder2.append(" isMainProcess "); stringBuilder2.append(r3.D()); stringBuilder2.append(" inPlayerProcess"); stringBuilder2.append(r3.x(p)); MLog.i("LyricLoad#CurrentLoadManager", stringBuilder2.toString()); String str2 = paramSongInfo.g1(); String str1 = paramSongInfo.L1(); String str3 = paramSongInfo.j0(); com.tencent.qqmusic.business.lyricnew.load.helper.d.i(com.tencent.qqmusic.business.lyricnew.config.a.d(paramSongInfo.O0(), str2, str1, str3, true)); com.tencent.qqmusic.business.lyricnew.load.helper.d.i(com.tencent.qqmusic.business.lyricnew.config.a.d(paramSongInfo.O0(), str2, str1, str3, false)); com.tencent.qqmusic.business.lyricnew.load.helper.d.i(com.tencent.qqmusic.business.lyricnew.config.a.k(paramSongInfo.O0(), str2, str1, str3)); com.tencent.qqmusic.business.lyricnew.load.helper.d.i(com.tencent.qqmusic.business.lyricnew.config.a.j(paramSongInfo.O0(), str2, str1, str3)); com.tencent.qqmusic.business.lyricnew.load.helper.d.h(paramSongInfo); c.c(paramSongInfo); StringBuilder stringBuilder1 = new StringBuilder(); stringBuilder1.append(" [deleteLyricCache] finished "); stringBuilder1.append(com.tencent.qqmusicplayerprocess.songinfo.d.E(paramSongInfo)); MLog.i("LyricLoad#CurrentLoadManager", stringBuilder1.toString()); } public static void G(SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1334] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramSongInfo, null, 21879)).isSupported) return;  ArrayList<String> arrayList = new ArrayList(); String str1 = com.tencent.qqmusic.business.lyricnew.config.a.e(paramSongInfo, true); byte b1 = 0; String str2 = com.tencent.qqmusic.business.lyricnew.config.a.e(paramSongInfo, false); String str3 = com.tencent.qqmusic.business.lyricnew.config.a.k(paramSongInfo.O0(), paramSongInfo.g1(), paramSongInfo.L1(), paramSongInfo.j0()); String str4 = com.tencent.qqmusic.business.lyricnew.config.a.j(paramSongInfo.O0(), paramSongInfo.g1(), paramSongInfo.L1(), paramSongInfo.j0()); String str5 = com.tencent.qqmusic.business.lyricnew.config.a.b(paramSongInfo); String str6 = com.tencent.qqmusic.business.lyricnew.config.a.i(paramSongInfo); arrayList.add(str1); arrayList.add(str2); arrayList.add(str3); arrayList.add(str4); arrayList.add(str5); arrayList.add(str6); while (b1 < arrayList.size()) { k k = new k(arrayList.get(b1)); if (k.i()) k.g();  b1++; }  StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(paramSongInfo.g1()); stringBuilder.append(" LyricFiles deleted!!!"); MLog.d("LyricLoad#CurrentLoadManager", stringBuilder.toString()); } private void H() { byte[] arrayOfByte = SwordSwitches.switches3; if (arrayOfByte != null && (arrayOfByte[21] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22570)).isSupported) return;  y1.a(new b(this)); } public static l K() { // Byte code:
/*    */     //   0: ldc com/tencent/qqmusic/business/lyricnew/load/manager/l
/*    */     //   2: monitorenter
/*    */     //   3: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   6: astore_0
/*    */     //   7: aload_0
/*    */     //   8: ifnull -> 52
/*    */     //   11: aload_0
/*    */     //   12: sipush #1330
/*    */     //   15: baload
/*    */     //   16: iconst_5
/*    */     //   17: ishr
/*    */     //   18: iconst_1
/*    */     //   19: iand
/*    */     //   20: ifle -> 52
/*    */     //   23: aconst_null
/*    */     //   24: aconst_null
/*    */     //   25: sipush #21846
/*    */     //   28: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   31: astore_0
/*    */     //   32: aload_0
/*    */     //   33: getfield isSupported : Z
/*    */     //   36: ifeq -> 52
/*    */     //   39: aload_0
/*    */     //   40: getfield result : Ljava/lang/Object;
/*    */     //   43: checkcast com/tencent/qqmusic/business/lyricnew/load/manager/l
/*    */     //   46: astore_0
/*    */     //   47: ldc com/tencent/qqmusic/business/lyricnew/load/manager/l
/*    */     //   49: monitorexit
/*    */     //   50: aload_0
/*    */     //   51: areturn
/*    */     //   52: getstatic com/tencent/qqmusic/business/lyricnew/load/manager/l.o : Lcom/tencent/qqmusic/business/lyricnew/load/manager/l;
/*    */     //   55: ifnonnull -> 84
/*    */     //   58: new com/tencent/qqmusic/business/lyricnew/load/manager/l
/*    */     //   61: astore_0
/*    */     //   62: aload_0
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: aload_0
/*    */     //   67: putstatic com/tencent/qqmusic/business/lyricnew/load/manager/l.o : Lcom/tencent/qqmusic/business/lyricnew/load/manager/l;
/*    */     //   70: invokestatic S : ()Z
/*    */     //   73: ifne -> 84
/*    */     //   76: getstatic com/tencent/qqmusic/business/lyricnew/load/manager/l.o : Lcom/tencent/qqmusic/business/lyricnew/load/manager/l;
/*    */     //   79: bipush #17
/*    */     //   81: invokestatic setInstance : (Lcom/tencent/qqmusic/v0;I)V
/*    */     //   84: getstatic com/tencent/qqmusic/business/lyricnew/load/manager/l.o : Lcom/tencent/qqmusic/business/lyricnew/load/manager/l;
/*    */     //   87: astore_0
/*    */     //   88: ldc com/tencent/qqmusic/business/lyricnew/load/manager/l
/*    */     //   90: monitorexit
/*    */     //   91: aload_0
/*    */     //   92: areturn
/*    */     //   93: astore_0
/*    */     //   94: ldc com/tencent/qqmusic/business/lyricnew/load/manager/l
/*    */     //   96: monitorexit
/*    */     //   97: aload_0
/*    */     //   98: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 52
/*    */     //   #2	-> 58
/*    */     //   #3	-> 70
/*    */     //   #4	-> 76
/*    */     //   #5	-> 84
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   3	7	93	finally
/*    */     //   23	47	93	finally
/*    */     //   52	58	93	finally
/*    */     //   58	70	93	finally
/*    */     //   70	76	93	finally
/*    */     //   76	84	93	finally
/* 18 */     //   84	88	93	finally } private void L(SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1397] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramSongInfo, this, 22381)).isSupported) return;  boolean bool = O(paramSongInfo, this.b); StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(" [handleLyricEvent] hasChanged "); stringBuilder.append(bool); stringBuilder.append(", "); stringBuilder.append(com.tencent.qqmusicplayerprocess.songinfo.d.E(paramSongInfo)); stringBuilder.append(this.b); MLog.i("LyricLoad#CurrentLoadManager", stringBuilder.toString()); if (bool) { try { m m1 = this.b; if (m1 != null) m1.e();  if (paramSongInfo != null) { m1 = new m(); this(this, paramSongInfo); this.b = m1; if (paramSongInfo.r3() && com.tencent.qqmusic.musicdisk.module.f.t().J(paramSongInfo)) { m1.v(); m1.q(); return; }  m1.k(true); o0(false); } else { m m2 = this.b; if (m2 != null) m2.q();  }  } catch (Exception exception)
/* 19 */       { MLog.e("LyricLoad#CurrentLoadManager", exception); }  } else { m m1 = this.b; if (m1 != null) { m1.q(); } else if (exception != null) { m1 = new m(); this(this, (SongInfo)exception); this.b = m1; m1.k(true); o0(false); }  }  } public void d0(com.tencent.qqmusic.business.lyricnew.load.model.a parama, int paramInt) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1363] >> 4 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { parama, Integer.valueOf(paramInt) }, this, 22109)).isSupported) return;  if (parama == null) return;  b b2 = parama.f(); b b1 = parama.j(); b b3 = parama.g(); StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(" [notifyLoadSuc] Song "); stringBuilder.append(com.tencent.qqmusicplayerprocess.songinfo.d.E(parama.b)); stringBuilder.append(" Lyric:"); stringBuilder.append(b2); stringBuilder.append(" Trans "); stringBuilder.append(b1); stringBuilder.append(" Roma:"); stringBuilder.append(b3); MLog.i("LyricLoad#CurrentLoadManager", stringBuilder.toString()); try { if (parama instanceof m) { ArrayList arrayList = new ArrayList(); this((Collection)this.e); for (b b4 : arrayList) { try { MLog.d("LyricLoad#CurrentLoadManager", "PlayingLyricLoader"); e e = new e(); this(b4, b2, b1, b3, paramInt); y1.e(e); LyricInfo lyricInfo = new LyricInfo(); this(); lyricInfo.j(parama.b()); h h = new h(); this(this, lyricInfo, b2, b4); y1.a(h); } catch (Exception exception) { MLog.e("LyricLoad#CurrentLoadManager", exception); }  }  }  } catch (Exception exception) { MLog.e("LyricLoad#CurrentLoadManager", exception); }  if (parama instanceof n) { for (b b4 : this.f) { try { MLog.d("LyricLoad#CurrentLoadManager", "onSearchSuc"); long l1 = System.currentTimeMillis(); ArrayList<n> arrayList = this.g;
/* 20 */           c c1 = new c(); this(b4, arrayList); y1.e(c1);
/* 21 */           StringBuilder stringBuilder1 = new StringBuilder(); this(); stringBuilder1.append("onSearchSuc Total Time:"); stringBuilder1.append(System.currentTimeMillis() - l1); stringBuilder1.append("ms"); MLog.d("LyricLoad#CurrentLoadManager", stringBuilder1.toString()); } catch (Exception exception)
/* 22 */         { exception.printStackTrace(); }  }
/* 23 */        if (this.g != null)
/* 24 */         this.g = null;  }
/*    */      }
/*    */ 
/*    */   
/*    */   private void M() {
/*    */     SongInfo songInfo;
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1390] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22324)).isSupported)
/*    */       return; 
/*    */     boolean bool1 = T();
/*    */     boolean bool2 = i0.g();
/*    */     boolean bool3 = r3.D();
/*    */     StringBuilder stringBuilder1 = new StringBuilder();
/*    */     stringBuilder1.append(" [handlePlaySongChanged]  isBackground = ");
/*    */     stringBuilder1.append(bool2);
/*    */     stringBuilder1.append(", isMainProcess");
/*    */     stringBuilder1.append(bool3);
/*    */     stringBuilder1.append(", !isUsingBluetoothLyric");
/*    */     stringBuilder1.append(bool1 ^ true);
/*    */     MLog.i("LyricLoad#CurrentLoadManager", stringBuilder1.toString());
/*    */     if (bool2 && bool3 && !bool1) {
/*    */       this.l = true;
/*    */       stringBuilder1 = new StringBuilder();
/*    */       stringBuilder1.append(" [handlePlaySongChanged] set mNeedRecoverLoadLyric ");
/*    */       stringBuilder1.append(this.l);
/*    */       MLog.i("LyricLoad#CurrentLoadManager", stringBuilder1.toString());
/*    */       return;
/*    */     } 
/*    */     this.l = false;
/*    */     if (S()) {
/*    */       songInfo = com.tencent.qqmusicplayerprocess.audio.playlist.l.e1().L1();
/*    */     } else {
/*    */       songInfo = c.t().E();
/*    */     } 
/*    */     StringBuilder stringBuilder2 = new StringBuilder();
/*    */     stringBuilder2.append(" [handlePlaySongChanged] ");
/*    */     stringBuilder2.append(com.tencent.qqmusicplayerprocess.songinfo.d.E(songInfo));
/*    */     MLog.i("LyricLoad#CurrentLoadManager", stringBuilder2.toString());
/*    */     if (b0(songInfo)) {
/*    */       L(null);
/*    */       a0(songInfo, new j(songInfo));
/*    */     } else {
/*    */       L(songInfo);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void N(boolean paramBoolean) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches3;
/*    */     if (arrayOfByte != null && (arrayOfByte[4] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), this, 22433)).isSupported)
/*    */       return; 
/*    */     boolean bool = e.l();
/*    */     MLog.i("LyricLoad#CurrentLoadManager", " [handlePlayStateChanged] doubleCheck:%b isPlaying:%b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
/*    */     e0(bool);
/*    */     o0(paramBoolean);
/*    */   }
/*    */   
/*    */   private boolean O(SongInfo paramSongInfo, com.tencent.qqmusic.business.lyricnew.load.model.a parama) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1383] >> 5 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramSongInfo, parama }, this, 22270);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     if (parama == null)
/*    */       return true; 
/*    */     if (parama.h() == 80)
/*    */       return true; 
/*    */     if (paramSongInfo == null)
/*    */       return !(parama.b == null); 
/*    */     SongInfo songInfo = parama.b;
/*    */     if (songInfo == null)
/*    */       return true; 
/*    */     return com.tencent.qqmusicplayerprocess.songinfo.f.c(paramSongInfo, songInfo) ^ true;
/*    */   }
/*    */   
/*    */   private boolean P() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches3;
/*    */     boolean bool1 = true;
/*    */     if (arrayOfByte != null && (arrayOfByte[15] >> 6 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 22527);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     boolean bool2 = bool1;
/*    */     if (this.e.size() <= 0)
/*    */       if (this.f.size() > 0) {
/*    */         bool2 = bool1;
/*    */       } else {
/*    */         bool2 = false;
/*    */       }  
/*    */     return bool2;
/*    */   }
/*    */   
/*    */   private static boolean R() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1333] >> 6 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, null, 21871);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     return r3.w(MusicApplication.getContext());
/*    */   }
/*    */   
/*    */   private static boolean S() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1332] >> 4 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, null, 21861);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     return r3.x(MusicApplication.getContext());
/*    */   }
/*    */   
/*    */   private boolean T() {
/*    */     // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_1
/*    */     //   4: iconst_1
/*    */     //   5: istore_2
/*    */     //   6: aload_1
/*    */     //   7: ifnull -> 49
/*    */     //   10: aload_1
/*    */     //   11: sipush #1388
/*    */     //   14: baload
/*    */     //   15: iconst_0
/*    */     //   16: ishr
/*    */     //   17: iconst_1
/*    */     //   18: iand
/*    */     //   19: ifle -> 49
/*    */     //   22: aconst_null
/*    */     //   23: aload_0
/*    */     //   24: sipush #22305
/*    */     //   27: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   30: astore_1
/*    */     //   31: aload_1
/*    */     //   32: getfield isSupported : Z
/*    */     //   35: ifeq -> 49
/*    */     //   38: aload_1
/*    */     //   39: getfield result : Ljava/lang/Object;
/*    */     //   42: checkcast java/lang/Boolean
/*    */     //   45: invokevirtual booleanValue : ()Z
/*    */     //   48: ireturn
/*    */     //   49: ldc 'LyricLoad#CurrentLoadManager'
/*    */     //   51: ldc_w 'isNotUsingBluetoothLyric() >>> '
/*    */     //   54: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   57: invokestatic w : ()Lcom/tencent/qqmusicplayerprocess/servicenew/d0;
/*    */     //   60: invokevirtual Z : ()Z
/*    */     //   63: iconst_1
/*    */     //   64: ixor
/*    */     //   65: istore_3
/*    */     //   66: getstatic com/tencent/qqmusicplayerprocess/servicenew/b0.a : Lcom/tencent/qqmusicplayerprocess/servicenew/IQQPlayerServiceNew;
/*    */     //   69: astore_1
/*    */     //   70: aload_1
/*    */     //   71: ifnull -> 92
/*    */     //   74: aload_1
/*    */     //   75: invokeinterface BluetoothA2DPConnected : ()Z
/*    */     //   80: istore #4
/*    */     //   82: goto -> 95
/*    */     //   85: astore_1
/*    */     //   86: ldc 'LyricLoad#CurrentLoadManager'
/*    */     //   88: aload_1
/*    */     //   89: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   92: iconst_0
/*    */     //   93: istore #4
/*    */     //   95: new java/lang/StringBuilder
/*    */     //   98: dup
/*    */     //   99: invokespecial <init> : ()V
/*    */     //   102: astore_1
/*    */     //   103: aload_1
/*    */     //   104: ldc_w 'isUsingBluetoothLyric() >>> isBluetoothLyricOpened:'
/*    */     //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   110: pop
/*    */     //   111: aload_1
/*    */     //   112: iload_3
/*    */     //   113: invokevirtual append : (Z)Ljava/lang/StringBuilder;
/*    */     //   116: pop
/*    */     //   117: aload_1
/*    */     //   118: ldc_w ' isBluetoothConnected:'
/*    */     //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   124: pop
/*    */     //   125: aload_1
/*    */     //   126: iload #4
/*    */     //   128: invokevirtual append : (Z)Ljava/lang/StringBuilder;
/*    */     //   131: pop
/*    */     //   132: ldc 'LyricLoad#CurrentLoadManager'
/*    */     //   134: aload_1
/*    */     //   135: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   138: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   141: iload #4
/*    */     //   143: ifeq -> 156
/*    */     //   146: iload_3
/*    */     //   147: ifeq -> 156
/*    */     //   150: iload_2
/*    */     //   151: istore #4
/*    */     //   153: goto -> 159
/*    */     //   156: iconst_0
/*    */     //   157: istore #4
/*    */     //   159: iload #4
/*    */     //   161: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 49
/*    */     //   #2	-> 57
/*    */     //   #3	-> 66
/*    */     //   #4	-> 74
/*    */     //   #5	-> 86
/*    */     //   #6	-> 95
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   66	70	85	java/lang/Exception
/*    */     //   74	82	85	java/lang/Exception
/*    */   }
/*    */   
/*    */   private void a0(SongInfo paramSongInfo, l paraml) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1395] >> 7 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramSongInfo, paraml }, this, 22368)).isSupported)
/*    */       return; 
/*    */     y1.d(new k(this, paramSongInfo, paraml));
/*    */   }
/*    */   
/*    */   private boolean b0(SongInfo paramSongInfo) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     boolean bool = true;
/*    */     if (arrayOfByte != null && (arrayOfByte[1394] >> 2 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramSongInfo, this, 22355);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     if (!r3.D() || paramSongInfo == null || !i0.j() || !com.tencent.qqmusicplayerprocess.songinfo.d.b(paramSongInfo))
/*    */       bool = false; 
/*    */     return bool;
/*    */   }
/*    */   
/*    */   private void clear() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1360] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22083)).isSupported)
/*    */       return; 
/*    */     if (this.c.size() > 0 && this.d) {
/*    */       MLog.i("LyricLoad#CurrentLoadManager", " [clear]");
/*    */       try {
/*    */         Context context = p;
/*    */         if (context != null) {
/*    */           context.unregisterReceiver(this.n);
/*    */           this.d = false;
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         MLog.e("LyricLoad#CurrentLoadManager", exception);
/*    */       } 
/*    */       this.c.clear();
/*    */       this.e.clear();
/*    */       this.f.clear();
/*    */       if (!S())
/*    */         u.c(this); 
/*    */     } 
/*    */     i0.o(this.k);
/*    */   }
/*    */   
/*    */   private void e0(boolean paramBoolean) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1376] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), this, 22216)).isSupported)
/*    */       return; 
/*    */     try {
/*    */       ArrayList arrayList = new ArrayList();
/*    */       this((Collection)this.e);
/*    */       null = arrayList.iterator();
/*    */       while (true) {
/*    */         boolean bool = null.hasNext();
/*    */         if (bool) {
/*    */           b b1 = null.next();
/*    */           try {
/*    */             MLog.d("LyricLoad#CurrentLoadManager", "onLyricStart 1");
/*    */             long l1 = System.currentTimeMillis();
/*    */             d d = new d();
/*    */             this(b1, paramBoolean);
/*    */             y1.e(d);
/*    */             StringBuilder stringBuilder = new StringBuilder();
/*    */             this();
/*    */             stringBuilder.append("onLyricStart 1 Total Time:");
/*    */             stringBuilder.append(System.currentTimeMillis() - l1);
/*    */             stringBuilder.append("ms");
/*    */             MLog.d("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */           } catch (Exception exception) {
/*    */             exception.printStackTrace();
/*    */           } 
/*    */           continue;
/*    */         } 
/*    */         break;
/*    */       } 
/*    */       for (b b1 : this.f) {
/*    */         try {
/*    */           MLog.d("LyricLoad#CurrentLoadManager", "onLyricStart 2");
/*    */           long l1 = System.currentTimeMillis();
/*    */           b b2 = new b();
/*    */           this(b1, paramBoolean);
/*    */           y1.e(b2);
/*    */           StringBuilder stringBuilder = new StringBuilder();
/*    */           this();
/*    */           stringBuilder.append("onLyricStart 2 Total Time:");
/*    */           stringBuilder.append(System.currentTimeMillis() - l1);
/*    */           stringBuilder.append("ms");
/*    */           MLog.d("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */         } catch (Exception exception) {
/*    */           MLog.e("LyricLoad#CurrentLoadManager", exception);
/*    */         } 
/*    */       } 
/*    */     } catch (Exception exception) {
/*    */       MLog.e("LyricLoad#CurrentLoadManager", exception);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void g0() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1341] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21934)).isSupported)
/*    */       return; 
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(" [registerLyricReceivers] isMainProcess ");
/*    */     stringBuilder.append(r3.D());
/*    */     stringBuilder.append(", isPlayerProcess");
/*    */     stringBuilder.append(r3.x(p));
/*    */     MLog.i("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */     IntentFilter intentFilter = new IntentFilter();
/*    */     intentFilter.addAction("com.tencent.qqmusic.ACTION_SERVICE_LYRIC_ROLLBACK.QQMusicPhone");
/*    */     intentFilter.addAction("com.tencent.qqmusic.ACTION_SERVICE_SELECT_SEARCH_LYRIC.QQMusicPhone");
/*    */     intentFilter.addAction("com.tencent.qqmusic.ACTION_SERVICE_LYRIC_ST_CHANGE.QQMusicPhone");
/*    */     p.registerReceiver(this.j, new IntentFilter(intentFilter), "com.tencent.qqmusic.permission.SEND_BROADCAST_PERMISSION", null);
/*    */     this.h = true;
/*    */     g.c(this);
/*    */   }
/*    */   
/*    */   private void h0() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1324] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21799)).isSupported)
/*    */       return; 
/*    */     m m1 = this.b;
/*    */     if (m1 != null) {
/*    */       int i = m1.h();
/*    */       m1 = this.b;
/*    */       if (i == 30 && m1.i() == 1000) {
/*    */         MLog.i("LyricLoad#CurrentLoadManager", " [reloadAfterNetRecovery] ");
/*    */         this.b.e();
/*    */         M();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void i0(SongInfo paramSongInfo) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches3;
/*    */     if (arrayOfByte != null && (arrayOfByte[19] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramSongInfo, this, 22560)).isSupported)
/*    */       return; 
/*    */     if (paramSongInfo == null) {
/*    */       MLog.e("LyricLoad#CurrentLoadManager", " [reloadSearchLyric] songInfo == null");
/*    */       return;
/*    */     } 
/*    */     y1.a(new a(this, paramSongInfo));
/*    */   }
/*    */   
/*    */   private void o0(boolean paramBoolean) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1369] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), this, 22153)).isSupported)
/*    */       return; 
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(" [seek] ");
/*    */     stringBuilder.append(paramBoolean);
/*    */     MLog.i("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */     if (paramBoolean) {
/*    */       this.m.removeCallbacksAndMessages(null);
/*    */       this.m.sendEmptyMessageDelayed(0, 2000L);
/*    */     } 
/*    */     y1.h(new i(this));
/*    */   }
/*    */   
/*    */   public static void programStart(Context paramContext) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1329] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramContext, null, 21835)).isSupported)
/*    */       return; 
/*    */     l l1 = o;
/*    */     if (l1 != null) {
/*    */       l1.clear();
/*    */       o = null;
/*    */     } 
/*    */     p = paramContext;
/*    */   }
/*    */   
/*    */   private void z() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1356] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22056)).isSupported)
/*    */       return; 
/*    */     i.h(new f());
/*    */   }
/*    */   
/*    */   public void A(b paramb) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1348] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramb, this, 21992)).isSupported)
/*    */       return; 
/*    */     if (!this.e.contains(paramb))
/*    */       this.e.add(paramb); 
/*    */   }
/*    */   
/*    */   public void B(b paramb) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1351] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramb, this, 22011)).isSupported)
/*    */       return; 
/*    */     if (!this.f.contains(paramb))
/*    */       this.f.add(paramb); 
/*    */   }
/*    */   
/*    */   public void D() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1386] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22289)).isSupported)
/*    */       return; 
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(" [checkAndLoadLyricIfNeed] ");
/*    */     stringBuilder.append(this.l);
/*    */     MLog.i("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */     if (this.l)
/*    */       M(); 
/*    */   }
/*    */   
/*    */   public void E() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches3;
/*    */     if (arrayOfByte != null && (arrayOfByte[6] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22456)).isSupported)
/*    */       return; 
/*    */     C(500, false);
/*    */   }
/*    */   
/*    */   public m I() {
/*    */     m m1 = this.b;
/*    */     return (m1 != null) ? m1 : null;
/*    */   }
/*    */   
/*    */   public int J() {
/*    */     m m1 = this.b;
/*    */     if (m1 != null)
/*    */       return m1.d; 
/*    */     return 0;
/*    */   }
/*    */   
/*    */   public void Q() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches3;
/*    */     if (arrayOfByte != null && (arrayOfByte[5] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22448)).isSupported)
/*    */       return; 
/*    */     C(-500, false);
/*    */   }
/*    */   
/*    */   public void c0(int paramInt1, int paramInt2) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1371] >> 6 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }, this, 22175)).isSupported)
/*    */       return; 
/*    */     if (paramInt1 != 257) {
/*    */       if (paramInt1 == 258)
/*    */         for (b b1 : this.f) {
/*    */           try {
/*    */             MLog.d("LyricLoad#CurrentLoadManager", "onLoadOther 3");
/*    */             long l1 = System.currentTimeMillis();
/*    */             f f = new f();
/*    */             this(b1, paramInt2);
/*    */             y1.e(f);
/*    */             StringBuilder stringBuilder = new StringBuilder();
/*    */             this();
/*    */             stringBuilder.append("onLoadOther 3 Total Time:");
/*    */             stringBuilder.append(System.currentTimeMillis() - l1);
/*    */             stringBuilder.append("ms");
/*    */             MLog.d("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */           } catch (Exception exception) {
/*    */             exception.printStackTrace();
/*    */           } 
/*    */         }  
/*    */     } else {
/*    */       try {
/*    */         ArrayList arrayList = new ArrayList();
/*    */         this((Collection)this.e);
/*    */         for (b b1 : arrayList) {
/*    */           try {
/*    */             MLog.d("LyricLoad#CurrentLoadManager", "onLoadOther 2");
/*    */             long l1 = System.currentTimeMillis();
/*    */             g g = new g();
/*    */             this(b1, paramInt2);
/*    */             y1.e(g);
/*    */             StringBuilder stringBuilder = new StringBuilder();
/*    */             this();
/*    */             stringBuilder.append("onLoadOther 2 Total Time:");
/*    */             stringBuilder.append(System.currentTimeMillis() - l1);
/*    */             stringBuilder.append("ms");
/*    */             MLog.d("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */           } catch (Exception exception) {
/*    */             MLog.e("LyricLoad#CurrentLoadManager", exception);
/*    */           } 
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         MLog.e("LyricLoad#CurrentLoadManager", exception);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void f0(SongInfo paramSongInfo) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1346] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramSongInfo, this, 21974)).isSupported)
/*    */       return; 
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(" [refreshCurrentSongLyric] ");
/*    */     stringBuilder.append(com.tencent.qqmusicplayerprocess.songinfo.d.E(paramSongInfo));
/*    */     MLog.i("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */     m m1 = this.b;
/*    */     if (m1 != null)
/*    */       m1.e(); 
/*    */     if (paramSongInfo != null) {
/*    */       m m2 = new m(paramSongInfo);
/*    */       m2.q();
/*    */     } else {
/*    */       m m2 = this.b;
/*    */       if (m2 != null)
/*    */         m2.q(); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void i(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, SongInfo paramSongInfo) {}
/*    */   
/*    */   public void j0(b paramb) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1350] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramb, this, 22001)).isSupported)
/*    */       return; 
/*    */     if (this.e.contains(paramb))
/*    */       this.e.remove(paramb); 
/*    */   }
/*    */   
/*    */   public void k0(b paramb) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1353] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramb, this, 22025)).isSupported)
/*    */       return; 
/*    */     if (this.f.contains(paramb))
/*    */       this.f.remove(paramb); 
/*    */   }
/*    */   
/*    */   public void l0() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches3;
/*    */     if (arrayOfByte != null && (arrayOfByte[9] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22474)).isSupported)
/*    */       return; 
/*    */     C(0, true);
/*    */   }
/*    */   
/*    */   public void m0() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1359] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22074)).isSupported)
/*    */       return; 
/*    */     try {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       this();
/*    */       stringBuilder.append(" [saveOffset] ");
/*    */       stringBuilder.append(this.b);
/*    */       MLog.i("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */       g g = new g();
/*    */       this(this);
/*    */     } finally {
/*    */       arrayOfByte = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public String n0(SongInfo paramSongInfo, com.tencent.qqmusic.business.lyricnew.load.helper.a.a parama, boolean paramBoolean) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches3;
/*    */     if (arrayOfByte != null && (arrayOfByte[1] >> 3 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramSongInfo, parama, Boolean.valueOf(paramBoolean) }, this, 22412);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     e e = new e(paramSongInfo, this, paramBoolean, 258);
/*    */     e.c(parama);
/*    */     if (this.g == null)
/*    */       this.g = new ArrayList<n>(); 
/*    */     this.g.clear();
/*    */     return e.b();
/*    */   }
/*    */   
/*    */   public void onEventBackgroundThread(t paramt) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1362] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramt, this, 22097)).isSupported)
/*    */       return; 
/*    */     if (paramt != null)
/*    */       try {
/*    */         if (paramt.i() && P() && b0.a != null) {
/*    */           M();
/*    */         } else if ((paramt.k() || paramt.o()) && P()) {
/*    */           N(true);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         exception.printStackTrace();
/*    */       }  
/*    */   }
/*    */   
/*    */   public void onEventMainThread(com.tencent.qqmusic.business.message.f paramf) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1370] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramf, this, 22164)).isSupported)
/*    */       return; 
/*    */     o0(false);
/*    */   }
/*    */   
/*    */   public void p0(String paramString1, boolean paramBoolean1, String paramString2, String paramString3, SongInfo paramSongInfo, boolean paramBoolean2) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches3;
/*    */     if (arrayOfByte != null && (arrayOfByte[17] >> 5 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramString1, Boolean.valueOf(paramBoolean1), paramString2, paramString3, paramSongInfo, Boolean.valueOf(paramBoolean2) }, this, 22542)).isSupported)
/*    */       return; 
/*    */     if (b.b(paramSongInfo, paramString1, paramBoolean1, paramString2, paramString3)) {
/*    */       b.c(paramSongInfo, 0L, 0L, 0L, 0L, true, paramBoolean2);
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(" [selectSearchLyricToCurrentSong] ");
/*    */       stringBuilder.append(paramSongInfo);
/*    */       MLog.i("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */       Intent intent = new Intent("com.tencent.qqmusic.ACTION_SERVICE_SELECT_SEARCH_LYRIC.QQMusicPhone");
/*    */       intent.putExtra("SongInfo", (Parcelable)paramSongInfo);
/*    */       MusicApplication.getContext().sendBroadcast(intent);
/*    */     } else {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append("[selectSearchLyricToCurrentSong] save lyric error: ");
/*    */       stringBuilder.append(paramSongInfo);
/*    */       MLog.e("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */     } 
/*    */   }
/*    */   
/*    */   public void q0(int paramInt, String paramString) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1354] >> 5 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Integer.valueOf(paramInt), paramString }, this, 22038)).isSupported)
/*    */       return; 
/*    */     if (p != null && this.c.size() == 0) {
/*    */       MLog.i("LyricLoad#CurrentLoadManager", " [startLoadLyric] registerReceiver");
/*    */       IntentFilter intentFilter = new IntentFilter();
/*    */       intentFilter.addAction("com.tencent.qqmusic.ACTION_SEEK_CHANGED.QQMusicPhone");
/*    */       if (S()) {
/*    */         intentFilter.addAction("com.tencent.qqmusic.ACTION_PLAYSONG_CHANGED.QQMusicPhone");
/*    */         intentFilter.addAction("com.tencent.qqmusic.ACTION_META_CHANGED.QQMusicPhone");
/*    */         intentFilter.addAction("com.tencent.qqmusic.ACTION_SEAMLESS_PLAYER_CHANGED.QQMusicPhone");
/*    */       } 
/*    */       z.a.b(p, this.n, intentFilter);
/*    */       this.d = true;
/*    */     } 
/*    */     if (!this.c.contains(Integer.valueOf(paramInt))) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(" [startLoadLyric] registerId:");
/*    */       stringBuilder.append(paramInt);
/*    */       stringBuilder.append(" from:");
/*    */       stringBuilder.append(paramString);
/*    */       MLog.i("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */       this.c.add(Integer.valueOf(paramInt));
/*    */       M();
/*    */       N(false);
/*    */       if (R() && !i.m() && !this.i.getAndSet(true)) {
/*    */         MLog.e("LyricLoad#CurrentLoadManager", "start load lyric in main process when music process is not connected");
/*    */         z();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void r0(int paramInt, String paramString) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1357] >> 4 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Integer.valueOf(paramInt), paramString }, this, 22061)).isSupported)
/*    */       return; 
/*    */     if (this.c.contains(Integer.valueOf(paramInt))) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(" [stopLoadLyric] registerId:");
/*    */       stringBuilder.append(paramInt);
/*    */       stringBuilder.append(" fom:");
/*    */       stringBuilder.append(paramString);
/*    */       MLog.i("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */       this.c.remove(Integer.valueOf(paramInt));
/*    */     } 
/*    */     if (this.c.size() == 0 && this.d)
/*    */       try {
/*    */         if (p != null) {
/*    */           MLog.i("LyricLoad#CurrentLoadManager", " [stopLoadLyric] unregisterReceiver");
/*    */           p.unregisterReceiver(this.n);
/*    */           z.a.e(p, this.n);
/*    */         } 
/*    */         this.d = false;
/*    */       } catch (Exception exception) {
/*    */         MLog.e("LyricLoad#CurrentLoadManager", exception);
/*    */       }  
/*    */   }
/*    */   
/*    */   public void s0() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1344] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21960)).isSupported)
/*    */       return; 
/*    */     if (this.h) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(" [unregisterLyricReceivers] isMainProcess ");
/*    */       stringBuilder.append(r3.D());
/*    */       stringBuilder.append(", isPlayerProcess");
/*    */       stringBuilder.append(r3.x(p));
/*    */       MLog.i("LyricLoad#CurrentLoadManager", stringBuilder.toString());
/*    */       p.unregisterReceiver(this.j);
/*    */     } 
/*    */     g.d(this);
/*    */   }
/*    */   
/*    */   class d implements b {
/*    */     final l this$0;
/*    */     
/*    */     public void onConnectMobile() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1309] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21674)).isSupported)
/*    */         return; 
/*    */       l.q(l.this);
/*    */     }
/*    */     
/*    */     public void onConnectWiFi() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1307] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21660)).isSupported)
/*    */         return; 
/*    */       l.q(l.this);
/*    */     }
/*    */     
/*    */     public void onDisconnect() {}
/*    */   }
/*    */   
/*    */   class f implements IPC.IPCConnectListener {
/*    */     final l this$0;
/*    */     
/*    */     public void onConnected() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1303] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21628)).isSupported)
/*    */         return; 
/*    */       if (l.s(l.this)) {
/*    */         y1.a(new a(this));
/*    */         i.q(this);
/*    */       } 
/*    */     }
/*    */     
/*    */     public void onDisconnected() {}
/*    */   }
/*    */   
/*    */   class j implements l {
/*    */     final SongInfo a;
/*    */     final l this$0;
/*    */     
/*    */     j(SongInfo param1SongInfo) {}
/*    */     
/*    */     public void a(boolean param1Boolean) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1294] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(Boolean.valueOf(param1Boolean), this, 21555)).isSupported)
/*    */         return; 
/*    */       if (param1Boolean) {
/*    */         c.j().l(this.a, true, new a(this));
/*    */       } else {
/*    */         l.n(l.this, this.a);
/*    */       } 
/*    */     }
/*    */     
/*    */     class a implements c.i {
/*    */       final l.j a;
/*    */       
/*    */       a(l.j this$0) {}
/*    */       
/*    */       public void b(boolean param2Boolean, SongInfo param2SongInfo) {
/*    */         byte[] arrayOfByte = SwordSwitches.switches2;
/*    */         if (arrayOfByte != null && (arrayOfByte[1303] >> 6 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Boolean.valueOf(param2Boolean), param2SongInfo }, this, 21631)).isSupported)
/*    */           return; 
/*    */         if (!param2Boolean || param2SongInfo == null || param2SongInfo.r3()) {
/*    */           l.j j1 = this.a;
/*    */           l.n(j1.this$0, j1.a);
/*    */         } 
/*    */         StringBuilder stringBuilder = new StringBuilder();
/*    */         stringBuilder.append(" [onMatch] result: ");
/*    */         stringBuilder.append(param2Boolean);
/*    */         stringBuilder.append(" ");
/*    */         stringBuilder.append(this.a.a.O0());
/*    */         stringBuilder.append(" ");
/*    */         stringBuilder.append(this.a.a.g1());
/*    */         stringBuilder.append(" isMatchFail:");
/*    */         SongInfo songInfo = this.a.a;
/*    */         stringBuilder.append(songInfo.r3());
/*    */         String str = stringBuilder.toString();
/*    */         MLog.i("LyricLoad#CurrentLoadManager", str);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   class a implements c.i {
/*    */     final l.j a;
/*    */     
/*    */     a(l this$0) {}
/*    */     
/*    */     public void b(boolean param1Boolean, SongInfo param1SongInfo) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1303] >> 6 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Boolean.valueOf(param1Boolean), param1SongInfo }, this, 21631)).isSupported)
/*    */         return; 
/*    */       if (!param1Boolean || param1SongInfo == null || param1SongInfo.r3()) {
/*    */         l.j j1 = this.a;
/*    */         l.n(j1.this$0, j1.a);
/*    */       } 
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(" [onMatch] result: ");
/*    */       stringBuilder.append(param1Boolean);
/*    */       stringBuilder.append(" ");
/*    */       stringBuilder.append(this.a.a.O0());
/*    */       stringBuilder.append(" ");
/*    */       stringBuilder.append(this.a.a.g1());
/*    */       stringBuilder.append(" isMatchFail:");
/*    */       SongInfo songInfo = this.a.a;
/*    */       stringBuilder.append(songInfo.r3());
/*    */       String str = stringBuilder.toString();
/*    */       MLog.i("LyricLoad#CurrentLoadManager", str);
/*    */     }
/*    */   }
/*    */   
/*    */   class l {
/*    */     public abstract void a(boolean param1Boolean);
/*    */   }
/*    */   
/*    */   class m extends com.tencent.qqmusic.business.lyricnew.load.model.a {
/*    */     final l this$0;
/*    */     
/*    */     public m(SongInfo param1SongInfo) {
/*    */       super(param1SongInfo);
/*    */     }
/*    */     
/*    */     public void u(int param1Int1, int param1Int2) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1307] >> 2 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Integer.valueOf(param1Int1), Integer.valueOf(param1Int2) }, this, 21659)).isSupported)
/*    */         return; 
/*    */       if (param1Int1 != 20 && param1Int1 != 30 && param1Int1 != 40 && param1Int1 != 50 && param1Int1 != 60) {
/*    */         if (param1Int1 != 70) {
/*    */           l.this.c0(257, h());
/*    */         } else {
/*    */           l.this.d0(this, h());
/*    */         } 
/*    */       } else {
/*    */         l.this.c0(257, h());
/*    */       } 
/*    */     }
/*    */     
/*    */     public void v() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1305] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21645)).isSupported)
/*    */         return; 
/*    */       this.e = 70;
/*    */       this.g = (new LrcParser(Resource.m(2131825630), (c)QRCDesDecrypt.getInstance())).d(false);
/*    */       this.h = null;
/*    */       this.i = null;
/*    */     }
/*    */   }
/*    */   
/*    */   class n extends com.tencent.qqmusic.business.lyricnew.load.model.a {
/*    */     public b l;
/*    */     public b.a m;
/*    */     final l this$0;
/*    */     
/*    */     public n(SongInfo param1SongInfo) {
/*    */       super(param1SongInfo, false);
/*    */       this.l = null;
/*    */       this.m = null;
/*    */     }
/*    */     
/*    */     public void u(int param1Int1, int param1Int2) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1309] >> 7 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Integer.valueOf(param1Int1), Integer.valueOf(param1Int2) }, this, 21680)).isSupported)
/*    */         return; 
/*    */       if (param1Int1 == 70) {
/*    */         this.l = f();
/*    */         if (l.p(l.this) != null)
/*    */           l.p(l.this).add(this); 
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   class o extends Handler {
/*    */     WeakReference<l> a;
/*    */     final l this$0;
/*    */     
/*    */     o(l param1l1) {
/*    */       super(Looper.getMainLooper());
/*    */       this.a = new WeakReference<l>(param1l1);
/*    */     }
/*    */     
/*    */     public void handleMessage(Message param1Message) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1294] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1Message, this, 21557)).isSupported)
/*    */         return; 
/*    */       l l1 = this.a.get();
/*    */       if (l1 != null) {
/*    */         MLog.i("LyricLoad#CurrentLoadManager", " [SeekCheckHandler] seek");
/*    */         l.r(l1, false);
/*    */       } 
/*    */     }
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\manager\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */