/*  1 */ package com.tencent.qqmusic.business.lyricnew.load.manager;public class k implements c { private static final Object o = new Object(); private static k p; private static Context q; private final AtomicInteger b; private final AtomicInteger c; private final AtomicInteger d; private final AtomicInteger e; private int f; private int g; private boolean h; private boolean i; private c j; private HandlerThread k; private SongInfo l; private ArrayList<a> m; private com.tencent.qqmusic.business.preload.k n;
/*  2 */   private k() { this.b = new AtomicInteger(0);
/*  3 */     this.c = new AtomicInteger(0);
/*  4 */     this.d = new AtomicInteger(0);
/*  5 */     this.e = new AtomicInteger(0);
/*  6 */     this.f = 1;
/*  7 */     this.g = 2000;
/*  8 */     this.h = false;
/*  9 */     this.i = false;
/* 10 */     this.m = new ArrayList<a>();
/* 11 */     this.n = null;
/* 12 */     q = MusicApplication.getContext(); } private ArrayList<SongInfo> A() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1357] >> 3 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 22060); if (swordProxyResult.isSupported) return (ArrayList<SongInfo>)swordProxyResult.result;  }  List list = f.o().I(); ArrayList<SongInfo> arrayList = new ArrayList(); byte b = 0; Iterator<SongInfo> iterator = list.iterator(); while (iterator.hasNext()) { SongInfo songInfo = iterator.next(); if (songInfo != null && (D(songInfo) || C(songInfo))) { arrayList.add(songInfo); continue; }  b++; }  StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("getNeededSongLit size = "); stringBuilder.append(arrayList.size()); MLog.i("LyricLoad#BatchLoadManager", stringBuilder.toString()); this.e.set(b); return arrayList; } private boolean C(SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; boolean bool = true; if (arrayOfByte != null && (arrayOfByte[1360] >> 7 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramSongInfo, this, 22088); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  if (this.f == 1) return false;  int i = com.tencent.qqmusic.business.image.c.q(paramSongInfo, 0) ^ true; int j = i; if (!com.tencent.qqmusic.business.image.c.q(paramSongInfo, 2)) j = i + 1;  if (j <= 0) bool = false;  return bool; } private boolean D(SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1359] >> 4 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramSongInfo, this, 22077); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  if (paramSongInfo == null) return false;  String str2 = a.e(paramSongInfo, true); if (str2 != null) { com.tencent.qqmusiccommon.storage.k k1 = new com.tencent.qqmusiccommon.storage.k(str2); if (k1.i()) return false;  }  String str1 = a.e(paramSongInfo, false); if (str1 != null) { com.tencent.qqmusiccommon.storage.k k1 = new com.tencent.qqmusiccommon.storage.k(str1); if (k1.i()) return false;  }  return true; } private void E(int paramInt1, int paramInt2) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1334] >> 2 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }, this, 21875)).isSupported) return;  MLog.d("LyricLoad#BatchLoadManager", "notifyAllTaskFinish"); if (this.f == 2 && paramInt1 != Integer.MAX_VALUE) { Intent intent = new Intent("com.tencent.qqmusic.ACTION_BATCH_LYRIC_MATCH_FINISH.QQMusicPhone"); q.sendBroadcast(intent); }  synchronized (o) { for (a a : this.m) a.onAllTaskFinish(paramInt1, paramInt2);  null = new StringBuilder(); null.append("all:"); null.append(paramInt2); null.append(" hasMatched:"); null.append(paramInt1); MLog.i("LyricLoad#BatchLoadManager", null.toString()); L(); return; }  } private void F() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1326] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21812)).isSupported) return;  synchronized (o) { for (a a : this.m) a.onLoadSongStarted();  return; }  } private void H(SongInfo paramSongInfo, int paramInt1, int paramInt2) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1328] >> 6 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramSongInfo, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }, this, 21831)).isSupported) return;  this.l = paramSongInfo; if (this.f == 1) return;  synchronized (o) { for (a a : this.m) a.onOneTaskStart(paramSongInfo, paramInt1, paramInt2);  return; }  } private void L() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1336] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21891)).isSupported) return;  this.f = 1; this.i = false; this.c.set(0); this.d.set(0); this.b.set(0); this.e.set(0); this.l = null; } private void u() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1352] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22019)).isSupported) return;  MLog.i("LyricLoad#BatchLoadManager", "[cancelCurrentTask] "); c c1 = this.j; if (c1 != null) c1.removeMessages(2000);  com.tencent.qqmusic.business.preload.k k1 = this.n; if (k1 != null) { k1.c(); this.n = null; }  } public static k w() { // Byte code:
/*    */     //   0: ldc com/tencent/qqmusic/business/lyricnew/load/manager/k
/*    */     //   2: monitorenter
/*    */     //   3: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   6: astore_0
/*    */     //   7: aload_0
/*    */     //   8: ifnull -> 52
/*    */     //   11: aload_0
/*    */     //   12: sipush #1320
/*    */     //   15: baload
/*    */     //   16: iconst_3
/*    */     //   17: ishr
/*    */     //   18: iconst_1
/*    */     //   19: iand
/*    */     //   20: ifle -> 52
/*    */     //   23: aconst_null
/*    */     //   24: aconst_null
/*    */     //   25: sipush #21764
/*    */     //   28: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   31: astore_0
/*    */     //   32: aload_0
/*    */     //   33: getfield isSupported : Z
/*    */     //   36: ifeq -> 52
/*    */     //   39: aload_0
/*    */     //   40: getfield result : Ljava/lang/Object;
/*    */     //   43: checkcast com/tencent/qqmusic/business/lyricnew/load/manager/k
/*    */     //   46: astore_0
/*    */     //   47: ldc com/tencent/qqmusic/business/lyricnew/load/manager/k
/*    */     //   49: monitorexit
/*    */     //   50: aload_0
/*    */     //   51: areturn
/*    */     //   52: getstatic com/tencent/qqmusic/business/lyricnew/load/manager/k.p : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */     //   55: ifnonnull -> 70
/*    */     //   58: new com/tencent/qqmusic/business/lyricnew/load/manager/k
/*    */     //   61: astore_0
/*    */     //   62: aload_0
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: aload_0
/*    */     //   67: putstatic com/tencent/qqmusic/business/lyricnew/load/manager/k.p : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */     //   70: getstatic com/tencent/qqmusic/business/lyricnew/load/manager/k.p : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */     //   73: astore_0
/*    */     //   74: ldc com/tencent/qqmusic/business/lyricnew/load/manager/k
/*    */     //   76: monitorexit
/*    */     //   77: aload_0
/*    */     //   78: areturn
/*    */     //   79: astore_0
/*    */     //   80: ldc com/tencent/qqmusic/business/lyricnew/load/manager/k
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
/* 12 */     //   70	74	79	finally } public boolean B() { boolean bool; if (this.f == 2 && this.i) { bool = true; } else { bool = false; }  return bool; } public void G(SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1332] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramSongInfo, this, 21859)).isSupported) return;  if (paramSongInfo == null) return;  synchronized (o) { for (a a : this.m) a.onOneTaskFinish(paramSongInfo);  return; }  } public void I(SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1345] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramSongInfo, this, 21964)).isSupported) return;  c c1 = this.j; if (c1 != null) c1.a(paramSongInfo);  } public void J(a parama) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1322] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(parama, this, 21779)).isSupported) return;  synchronized (o) { if (!this.m.contains(parama)) this.m.add(parama);  return; }  } public void K() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1350] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22006)).isSupported) return;  StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("[resetStatus] "); stringBuilder.append(x.a(4)); MLog.i("LyricLoad#BatchLoadManager", stringBuilder.toString()); this.h = false; u(); } public void N() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1347] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21980)).isSupported) return;  c c1 = this.j; if (c1 != null) c1.sendEmptyMessage(2002);  } private void M(SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1355] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramSongInfo, this, 22042)).isSupported) return;  if (paramSongInfo != null) { com.tencent.qqmusic.business.lyricnew.load.helper.b b; H(paramSongInfo, this.d.get(), this.c.get()); if (D(paramSongInfo)) { b = new com.tencent.qqmusic.business.lyricnew.load.helper.b(paramSongInfo, this); b.b(); } else if (this.f != 1) { b b1 = new b((SongInfo)b); b1.c(); } else { this.j.removeMessages(2001); this.j.sendEmptyMessageDelayed(2001, this.g); this.d.decrementAndGet(); }  } else { this.j.removeMessages(2001); this.j.sendEmptyMessageDelayed(2001, this.g);
/* 13 */       this.d.decrementAndGet(); }  } public void O(a parama) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1324] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(parama, this, 21798)).isSupported) return;  synchronized (o) { this.m.remove(parama); return; }  } public void i(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1338] >> 0 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean3), paramSongInfo }, this, 21905)).isSupported) return;  if (paramInt == 13) { String str; StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("lyric download finish: "); if (paramSongInfo == null) { str = " null "; } else { str = paramSongInfo.g1(); }  stringBuilder.append(str); MLog.i("LyricLoad#BatchLoadManager", stringBuilder.toString()); b b = new b(paramSongInfo); b.c(); } else { this.j.removeMessages(2001); this.j.sendEmptyMessageDelayed(2001, this.g); this.d.decrementAndGet(); }  } public void t(int paramInt) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: monitorenter
/*    */     //   2: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   5: astore_2
/*    */     //   6: aload_2
/*    */     //   7: ifnull -> 44
/*    */     //   10: aload_2
/*    */     //   11: sipush #1348
/*    */     //   14: baload
/*    */     //   15: iconst_4
/*    */     //   16: ishr
/*    */     //   17: iconst_1
/*    */     //   18: iand
/*    */     //   19: ifle -> 44
/*    */     //   22: iload_1
/*    */     //   23: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   26: aload_0
/*    */     //   27: sipush #21989
/*    */     //   30: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   33: getfield isSupported : Z
/*    */     //   36: istore_3
/*    */     //   37: iload_3
/*    */     //   38: ifeq -> 44
/*    */     //   41: aload_0
/*    */     //   42: monitorexit
/*    */     //   43: return
/*    */     //   44: invokestatic h : ()V
/*    */     //   47: new java/lang/StringBuilder
/*    */     //   50: astore_2
/*    */     //   51: aload_2
/*    */     //   52: invokespecial <init> : ()V
/*    */     //   55: aload_2
/*    */     //   56: ldc_w '[batchLoadLyric] mode = '
/*    */     //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   62: pop
/*    */     //   63: aload_2
/*    */     //   64: iload_1
/*    */     //   65: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   68: pop
/*    */     //   69: ldc 'LyricLoad#BatchLoadManager'
/*    */     //   71: aload_2
/*    */     //   72: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   75: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   78: aload_0
/*    */     //   79: getfield k : Landroid/os/HandlerThread;
/*    */     //   82: ifnonnull -> 105
/*    */     //   85: new android/os/HandlerThread
/*    */     //   88: astore_2
/*    */     //   89: aload_2
/*    */     //   90: ldc_w 'LyricMatchThread'
/*    */     //   93: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   96: aload_0
/*    */     //   97: aload_2
/*    */     //   98: putfield k : Landroid/os/HandlerThread;
/*    */     //   101: aload_2
/*    */     //   102: invokevirtual start : ()V
/*    */     //   105: aload_0
/*    */     //   106: getfield j : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k$c;
/*    */     //   109: ifnonnull -> 133
/*    */     //   112: new com/tencent/qqmusic/business/lyricnew/load/manager/k$c
/*    */     //   115: astore_2
/*    */     //   116: aload_2
/*    */     //   117: aload_0
/*    */     //   118: aload_0
/*    */     //   119: getfield k : Landroid/os/HandlerThread;
/*    */     //   122: invokevirtual getLooper : ()Landroid/os/Looper;
/*    */     //   125: invokespecial <init> : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;Landroid/os/Looper;)V
/*    */     //   128: aload_0
/*    */     //   129: aload_2
/*    */     //   130: putfield j : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k$c;
/*    */     //   133: iload_1
/*    */     //   134: iconst_1
/*    */     //   135: if_icmpne -> 166
/*    */     //   138: aload_0
/*    */     //   139: getfield h : Z
/*    */     //   142: ifeq -> 156
/*    */     //   145: ldc 'LyricLoad#BatchLoadManager'
/*    */     //   147: ldc_w 'return isAutoBatchLoaded'
/*    */     //   150: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   153: aload_0
/*    */     //   154: monitorexit
/*    */     //   155: return
/*    */     //   156: aload_0
/*    */     //   157: sipush #2000
/*    */     //   160: putfield g : I
/*    */     //   163: goto -> 171
/*    */     //   166: aload_0
/*    */     //   167: iconst_0
/*    */     //   168: putfield g : I
/*    */     //   171: aload_0
/*    */     //   172: invokespecial u : ()V
/*    */     //   175: aload_0
/*    */     //   176: iconst_1
/*    */     //   177: putfield h : Z
/*    */     //   180: aload_0
/*    */     //   181: iload_1
/*    */     //   182: putfield f : I
/*    */     //   185: aload_0
/*    */     //   186: getfield e : Ljava/util/concurrent/atomic/AtomicInteger;
/*    */     //   189: iconst_0
/*    */     //   190: invokevirtual set : (I)V
/*    */     //   193: aload_0
/*    */     //   194: getfield j : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k$c;
/*    */     //   197: astore #4
/*    */     //   199: new com/tencent/qqmusic/business/lyricnew/load/manager/k$a
/*    */     //   202: astore_2
/*    */     //   203: aload_2
/*    */     //   204: aload_0
/*    */     //   205: iload_1
/*    */     //   206: invokespecial <init> : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;I)V
/*    */     //   209: aload #4
/*    */     //   211: aload_2
/*    */     //   212: invokevirtual post : (Ljava/lang/Runnable;)Z
/*    */     //   215: pop
/*    */     //   216: aload_0
/*    */     //   217: monitorexit
/*    */     //   218: return
/*    */     //   219: astore_2
/*    */     //   220: aload_0
/*    */     //   221: monitorexit
/*    */     //   222: aload_2
/*    */     //   223: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 44
/*    */     //   #2	-> 47
/*    */     //   #3	-> 78
/*    */     //   #4	-> 85
/*    */     //   #5	-> 101
/*    */     //   #6	-> 105
/*    */     //   #7	-> 112
/*    */     //   #8	-> 138
/*    */     //   #9	-> 145
/*    */     //   #10	-> 153
/*    */     //   #11	-> 156
/*    */     //   #12	-> 166
/*    */     //   #13	-> 171
/*    */     //   #14	-> 175
/*    */     //   #15	-> 180
/*    */     //   #16	-> 185
/*    */     //   #17	-> 193
/*    */     //   #18	-> 216
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   2	6	219	finally
/*    */     //   22	37	219	finally
/*    */     //   44	47	219	finally
/*    */     //   47	78	219	finally
/*    */     //   78	85	219	finally
/*    */     //   85	101	219	finally
/*    */     //   101	105	219	finally
/*    */     //   105	112	219	finally
/*    */     //   112	133	219	finally
/*    */     //   138	145	219	finally
/*    */     //   145	153	219	finally
/*    */     //   156	163	219	finally
/*    */     //   166	171	219	finally
/*    */     //   171	175	219	finally
/*    */     //   175	180	219	finally
/*    */     //   180	185	219	finally
/*    */     //   185	193	219	finally
/*    */     //   193	216	219	finally } public int v() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1343] >> 6 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21951); if (swordProxyResult.isSupported) return ((Integer)swordProxyResult.result).intValue();  }  return this.b.get() + this.e.get(); } public int x() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1341] >> 2 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21931); if (swordProxyResult.isSupported) return ((Integer)swordProxyResult.result).intValue();  }  return this.d.get(); } public int y() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1342] >> 2 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21939); if (swordProxyResult.isSupported) return ((Integer)swordProxyResult.result).intValue();  }  return this.c.get() + this.e.get(); } public SongInfo z() { return this.l; } class b { final AtomicInteger a; final AtomicInteger b; final AtomicInteger c; SongInfo d; private com.tencent.qqmusiccommon.imageloader.listener.b e; final k this$0; public b(SongInfo param1SongInfo) { AtomicInteger atomicInteger2 = new AtomicInteger(); AtomicInteger atomicInteger1 = new AtomicInteger(); AtomicInteger atomicInteger3 = new AtomicInteger(); this.e = new a(this); this.d = param1SongInfo; atomicInteger2.set(0); atomicInteger1.set(0); atomicInteger3.set(0); } private void b() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1316] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21729)).isSupported) return;  if (this.b.get() + this.c.get() >= this.a.get()) { if (this.b.get() >= this.a.get()) k.q(k.this).incrementAndGet();  k.r(k.this).decrementAndGet(); k.k(k.this).removeMessages(2001); k.k(k.this).sendEmptyMessageDelayed(2001, k.b(k.this)); }  } public void c() { // Byte code:
/*    */       //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */       //   3: astore_1
/*    */       //   4: iconst_1
/*    */       //   5: istore_2
/*    */       //   6: aload_1
/*    */       //   7: ifnull -> 37
/*    */       //   10: aload_1
/*    */       //   11: sipush #1314
/*    */       //   14: baload
/*    */       //   15: iconst_2
/*    */       //   16: ishr
/*    */       //   17: iconst_1
/*    */       //   18: iand
/*    */       //   19: ifle -> 37
/*    */       //   22: aconst_null
/*    */       //   23: aload_0
/*    */       //   24: sipush #21715
/*    */       //   27: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */       //   30: getfield isSupported : Z
/*    */       //   33: ifeq -> 37
/*    */       //   36: return
/*    */       //   37: aload_0
/*    */       //   38: getfield d : Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;
/*    */       //   41: ifnull -> 319
/*    */       //   44: aload_0
/*    */       //   45: getfield this$0 : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */       //   48: invokestatic s : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;)I
/*    */       //   51: iconst_1
/*    */       //   52: if_icmpne -> 58
/*    */       //   55: goto -> 319
/*    */       //   58: new java/lang/StringBuilder
/*    */       //   61: dup
/*    */       //   62: invokespecial <init> : ()V
/*    */       //   65: astore_1
/*    */       //   66: aload_1
/*    */       //   67: ldc 'album task start:'
/*    */       //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */       //   72: pop
/*    */       //   73: aload_1
/*    */       //   74: aload_0
/*    */       //   75: getfield d : Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;
/*    */       //   78: invokevirtual g1 : ()Ljava/lang/String;
/*    */       //   81: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */       //   84: pop
/*    */       //   85: ldc 'LyricLoad#BatchLoadManager'
/*    */       //   87: aload_1
/*    */       //   88: invokevirtual toString : ()Ljava/lang/String;
/*    */       //   91: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
/*    */       //   94: pop
/*    */       //   95: aload_0
/*    */       //   96: getfield d : Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;
/*    */       //   99: invokevirtual l0 : ()J
/*    */       //   102: lstore_3
/*    */       //   103: iconst_0
/*    */       //   104: istore #5
/*    */       //   106: lload_3
/*    */       //   107: lconst_0
/*    */       //   108: lcmp
/*    */       //   109: ifgt -> 129
/*    */       //   112: iload #5
/*    */       //   114: istore #6
/*    */       //   116: aload_0
/*    */       //   117: getfield d : Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;
/*    */       //   120: invokevirtual m0 : ()Ljava/lang/String;
/*    */       //   123: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
/*    */       //   126: ifne -> 246
/*    */       //   129: iload_2
/*    */       //   130: istore #6
/*    */       //   132: aload_0
/*    */       //   133: getfield d : Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;
/*    */       //   136: iconst_2
/*    */       //   137: invokestatic q : (Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;I)Z
/*    */       //   140: ifne -> 187
/*    */       //   143: invokestatic f : ()Lcom/tencent/qqmusic/business/image/a;
/*    */       //   146: astore #7
/*    */       //   148: aload_0
/*    */       //   149: getfield d : Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;
/*    */       //   152: astore #8
/*    */       //   154: aload_0
/*    */       //   155: getfield e : Lcom/tencent/qqmusiccommon/imageloader/listener/b;
/*    */       //   158: astore_1
/*    */       //   159: aload #7
/*    */       //   161: aload #8
/*    */       //   163: iconst_2
/*    */       //   164: aload_1
/*    */       //   165: invokevirtual v : (Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;ILcom/tencent/qqmusiccommon/imageloader/listener/b;)V
/*    */       //   168: aload_0
/*    */       //   169: getfield a : Ljava/util/concurrent/atomic/AtomicInteger;
/*    */       //   172: invokevirtual incrementAndGet : ()I
/*    */       //   175: pop
/*    */       //   176: ldc 'LyricLoad#BatchLoadManager'
/*    */       //   178: ldc 'album large start##'
/*    */       //   180: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
/*    */       //   183: pop
/*    */       //   184: iconst_0
/*    */       //   185: istore #6
/*    */       //   187: aload_0
/*    */       //   188: getfield d : Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;
/*    */       //   191: iconst_0
/*    */       //   192: invokestatic q : (Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;I)Z
/*    */       //   195: ifne -> 246
/*    */       //   198: invokestatic f : ()Lcom/tencent/qqmusic/business/image/a;
/*    */       //   201: astore #8
/*    */       //   203: aload_0
/*    */       //   204: getfield d : Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;
/*    */       //   207: astore_1
/*    */       //   208: aload_0
/*    */       //   209: getfield e : Lcom/tencent/qqmusiccommon/imageloader/listener/b;
/*    */       //   212: astore #7
/*    */       //   214: aload #8
/*    */       //   216: aload_1
/*    */       //   217: iconst_0
/*    */       //   218: aload #7
/*    */       //   220: invokevirtual v : (Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;ILcom/tencent/qqmusiccommon/imageloader/listener/b;)V
/*    */       //   223: aload_0
/*    */       //   224: getfield a : Ljava/util/concurrent/atomic/AtomicInteger;
/*    */       //   227: invokevirtual incrementAndGet : ()I
/*    */       //   230: pop
/*    */       //   231: ldc 'LyricLoad#BatchLoadManager'
/*    */       //   233: ldc 'album mini start##'
/*    */       //   235: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
/*    */       //   238: pop
/*    */       //   239: iload #5
/*    */       //   241: istore #6
/*    */       //   243: goto -> 246
/*    */       //   246: aload_0
/*    */       //   247: getfield a : Ljava/util/concurrent/atomic/AtomicInteger;
/*    */       //   250: invokevirtual get : ()I
/*    */       //   253: ifne -> 318
/*    */       //   256: iload #6
/*    */       //   258: ifeq -> 272
/*    */       //   261: aload_0
/*    */       //   262: getfield this$0 : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */       //   265: invokestatic q : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;)Ljava/util/concurrent/atomic/AtomicInteger;
/*    */       //   268: invokevirtual incrementAndGet : ()I
/*    */       //   271: pop
/*    */       //   272: aload_0
/*    */       //   273: getfield this$0 : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */       //   276: invokestatic r : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;)Ljava/util/concurrent/atomic/AtomicInteger;
/*    */       //   279: invokevirtual decrementAndGet : ()I
/*    */       //   282: pop
/*    */       //   283: aload_0
/*    */       //   284: getfield this$0 : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */       //   287: invokestatic k : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;)Lcom/tencent/qqmusic/business/lyricnew/load/manager/k$c;
/*    */       //   290: sipush #2001
/*    */       //   293: invokevirtual removeMessages : (I)V
/*    */       //   296: aload_0
/*    */       //   297: getfield this$0 : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */       //   300: invokestatic k : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;)Lcom/tencent/qqmusic/business/lyricnew/load/manager/k$c;
/*    */       //   303: sipush #2001
/*    */       //   306: aload_0
/*    */       //   307: getfield this$0 : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */       //   310: invokestatic b : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;)I
/*    */       //   313: i2l
/*    */       //   314: invokevirtual sendEmptyMessageDelayed : (IJ)Z
/*    */       //   317: pop
/*    */       //   318: return
/*    */       //   319: aload_0
/*    */       //   320: getfield this$0 : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */       //   323: invokestatic r : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;)Ljava/util/concurrent/atomic/AtomicInteger;
/*    */       //   326: invokevirtual decrementAndGet : ()I
/*    */       //   329: pop
/*    */       //   330: aload_0
/*    */       //   331: getfield this$0 : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */       //   334: invokestatic k : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;)Lcom/tencent/qqmusic/business/lyricnew/load/manager/k$c;
/*    */       //   337: sipush #2001
/*    */       //   340: invokevirtual removeMessages : (I)V
/*    */       //   343: aload_0
/*    */       //   344: getfield this$0 : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */       //   347: invokestatic k : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;)Lcom/tencent/qqmusic/business/lyricnew/load/manager/k$c;
/*    */       //   350: sipush #2001
/*    */       //   353: aload_0
/*    */       //   354: getfield this$0 : Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;
/*    */       //   357: invokestatic b : (Lcom/tencent/qqmusic/business/lyricnew/load/manager/k;)I
/*    */       //   360: i2l
/*    */       //   361: invokevirtual sendEmptyMessageDelayed : (IJ)Z
/*    */       //   364: pop
/*    */       //   365: return
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #1	-> 37
/*    */       //   #2	-> 58
/*    */       //   #3	-> 95
/*    */       //   #4	-> 129
/*    */       //   #5	-> 143
/*    */       //   #6	-> 159
/*    */       //   #7	-> 168
/*    */       //   #8	-> 176
/*    */       //   #9	-> 187
/*    */       //   #10	-> 198
/*    */       //   #11	-> 214
/*    */       //   #12	-> 223
/*    */       //   #13	-> 231
/*    */       //   #14	-> 246
/*    */       //   #15	-> 261
/*    */       //   #16	-> 272
/*    */       //   #17	-> 283
/*    */       //   #18	-> 296
/*    */       //   #19	-> 319
/*    */       //   #20	-> 330
/* 13 */       //   #21	-> 343 } } class c extends Handler { public void handleMessage(Message param1Message) { null = SwordSwitches.switches2; if (null != null && (null[1294] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1Message, this, 21554)).isSupported) return;  switch (param1Message.what) { default: return;case 2002: stringBuilder = new StringBuilder(); stringBuilder.append("暂停任务："); stringBuilder.append(this.a.size()); MLog.i("LyricLoad#BatchLoadManager", stringBuilder.toString()); synchronized (k.g()) { for (a a : k.h(k.this)) a.onAllTaskFinish(k.q(k.this).get(), k.o(k.this).get());  k.j(k.this); removeMessages(2001); removeMessages(2000); this.a.clear(); k.j(k.this); } case 2001: if (!k.m(k.this)) {
/* 14 */             MLog.i("LyricLoad#BatchLoadManager", "stop HANDLER_START_NEXT"); return;
/* 15 */           }  if (this.a.size() > 0)
/* 16 */           { SongInfo songInfo = this.a.remove(0);
/* 17 */             if (k.s(k.this) == 2)
/* 18 */             { k.c(k.this, songInfo); }
/* 19 */             else { k k1 = k.this; com.tencent.qqmusic.business.preload.k k2 = com.tencent.qqmusic.business.preload.k.p(new a(this, songInfo));
/* 20 */               k2 = k2.f(5000L);
/* 21 */               k2 = k2.k();
/* 22 */               k2 = k2.d();
/* 23 */               k2 = k2.h();
/* 24 */               k2 = k2.o();
/* 25 */               k2 = k2.f(5000L);
/* 26 */               k2 = k2.k();
/* 27 */               k2 = k2.d();
/* 28 */               k2 = k2.g();
/* 29 */               k.e(k1, k2);
/* 30 */               k.d(k.this).m(); }  }
/* 31 */           else { MLog.i("LyricLoad#BatchLoadManager", "finish all");
/* 32 */             int i = k.q(k.this).get(), j = k.f(k.this).get();
/* 33 */             int m = k.o(k.this).get(), n = k.f(k.this).get();
/* 34 */             k.p(k.this, i + j, m + n); } 
/* 35 */         case 2000: break; }  removeMessages(2001);
/* 36 */       removeMessages(2000);
/* 37 */       k.n(k.this, false);
/* 38 */       this.a.clear();
/* 39 */       this.a.addAll(k.a(k.this));
/* 40 */       k.o(k.this).set(this.a.size());
/* 41 */       if (this.a.size() == 0) {
/* 42 */         MLog.i("LyricLoad#BatchLoadManager", "[LyricHandler] all song has lyric");
/* 43 */         k.p(k.this, 2147483647, 0); return;
/* 44 */       }  k.q(k.this).set(0);
/* 45 */       k.r(k.this).set(this.a.size());
/* 46 */       k.n(k.this, true);
/* 47 */       sendEmptyMessageDelayed(2001, k.b(k.this));
/* 48 */       StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("start one task："); stringBuilder.append(this.a.size()); MLog.i("LyricLoad#BatchLoadManager", stringBuilder.toString()); }
/*    */ 
/*    */     
/*    */     final List<SongInfo> a;
/*    */     final k this$0;
/*    */     
/*    */     public c(Looper param1Looper) {
/*    */       super(param1Looper);
/*    */       this.a = new CopyOnWriteArrayList<SongInfo>();
/*    */     }
/*    */     
/*    */     public void a(SongInfo param1SongInfo) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1301] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(param1SongInfo, this, 21614)).isSupported)
/*    */         return; 
/*    */       if (this.a.remove(param1SongInfo) && k.m(k.this)) {
/*    */         k.r(k.this).decrementAndGet();
/*    */         k.o(k.this).decrementAndGet();
/*    */       } 
/*    */     } }
/*    */    }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\manager\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */