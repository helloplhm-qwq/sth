/*  1 */ package com.tencent.qqmusic.business.lyricnew.load.model;public class b { public final String a; private final Object b; private final ArrayList<d> c; public long d; public String e; public String f; public String g; public String h; public String i; private boolean j; private boolean k; private boolean l; private boolean m; private int n; private SongInfo o; private String p; private String q; private String r; private String s; private boolean t; private boolean u; private c v; private c w; public boolean z() { return this.k; } public boolean y() { return this.u; } public boolean x() { return this.l; } public boolean w() { return this.m; } public boolean v() { return this.j; } public boolean u() { boolean bool2; byte[] arrayOfByte = SwordSwitches.switches2; boolean bool1 = true; if (arrayOfByte != null && (arrayOfByte[1363] >> 6 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 22111); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  String str = q();
/*  2 */     if (!TextUtils.isEmpty(str) && (new k(str)).i()) { bool2 = true; } else { bool2 = false; }  boolean bool3 = bool1; if (!bool2)
/*  3 */     { str = p();
/*  4 */       if (!TextUtils.isEmpty(str) && (new k(str)).i()) { bool3 = bool1; } else { bool3 = false; }  }  return bool3; } public String toString() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1365] >> 1 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 22122); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  return d.E(this.o); } public String t() { String str1; long l; String str4; byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1331] >> 2 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21851); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  String str2 = this.r; if (str2 != null) return str2;  SongInfo songInfo1 = this.o; if (songInfo1 == null) { l = -1L; } else { l = songInfo1.O0(); }  songInfo1 = this.o; String str3 = ""; if (songInfo1 == null) { str1 = ""; } else { str1 = str1.g1(); }  SongInfo songInfo2 = this.o; if (songInfo2 == null) { str4 = ""; } else { str4 = str4.L1(); }  SongInfo songInfo3 = this.o; if (songInfo3 != null) str3 = songInfo3.j0();  return a.k(l, str1, str4, str3); } public int s() { return this.n; } public String r() { String str1; long l; String str4; byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1333] >> 0 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21865); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  String str2 = this.s; if (str2 != null) return str2;  SongInfo songInfo1 = this.o; if (songInfo1 == null) { l = -1L; } else { l = songInfo1.O0(); }  songInfo1 = this.o; String str3 = ""; if (songInfo1 == null) { str1 = ""; } else { str1 = str1.g1(); }  SongInfo songInfo2 = this.o; if (songInfo2 == null) { str4 = ""; } else { str4 = str4.L1(); }  SongInfo songInfo3 = this.o; if (songInfo3 != null) str3 = songInfo3.j0();  return a.j(l, str1, str4, str3); } public String q() { String str1; long l; String str3, str4; byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1326] >> 5 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21814); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  String str2 = this.p; if (str2 != null) return str2;  SongInfo songInfo1 = this.o; if (songInfo1 == null) { l = -1L; } else { l = songInfo1.O0(); }  songInfo1 = this.o; if (songInfo1 == null) { str1 = ""; } else { str1 = str1.g1(); }  SongInfo songInfo2 = this.o; if (songInfo2 == null) { str3 = ""; } else { str3 = str3.L1(); }  SongInfo songInfo3 = this.o; if (songInfo3 == null) { str4 = ""; } else { str4 = str4.j0(); }  return a.d(l, str1, str3, str4, true); } public String p() { String str1; long l; String str3, str4; byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1329] >> 1 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21834); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  String str2 = this.q; if (str2 != null) return str2;  SongInfo songInfo1 = this.o; if (songInfo1 == null) { l = -1L; } else { l = songInfo1.O0(); }  songInfo1 = this.o; if (songInfo1 == null) { str1 = ""; } else { str1 = str1.g1(); }  SongInfo songInfo2 = this.o; if (songInfo2 == null) { str3 = ""; } else { str3 = str3.L1(); }  SongInfo songInfo3 = this.o; if (songInfo3 == null) { str4 = ""; } else { str4 = str4.j0(); }  return a.d(l, str1, str3, str4, false); } public boolean m(b paramb) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1335] >> 7 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramb, this, 21888); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  return (paramb != null) ? this.i.equals(paramb.i) : false; } public void l() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1362] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 22098)).isSupported) return;  synchronized (this.b) { this.c.clear(); return; }  } public void k() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1325] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21804)).isSupported) return;  l(); } public boolean i(d paramd) { // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_2
/*    */     //   4: aload_2
/*    */     //   5: ifnull -> 47
/*    */     //   8: aload_2
/*    */     //   9: sipush #1358
/*    */     //   12: baload
/*    */     //   13: iconst_1
/*    */     //   14: ishr
/*    */     //   15: iconst_1
/*    */     //   16: iand
/*    */     //   17: ifle -> 47
/*    */     //   20: aload_1
/*    */     //   21: aload_0
/*    */     //   22: sipush #22066
/*    */     //   25: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   28: astore_2
/*    */     //   29: aload_2
/*    */     //   30: getfield isSupported : Z
/*    */     //   33: ifeq -> 47
/*    */     //   36: aload_2
/*    */     //   37: getfield result : Ljava/lang/Object;
/*    */     //   40: checkcast java/lang/Boolean
/*    */     //   43: invokevirtual booleanValue : ()Z
/*    */     //   46: ireturn
/*    */     //   47: aload_0
/*    */     //   48: getfield b : Ljava/lang/Object;
/*    */     //   51: astore_2
/*    */     //   52: aload_2
/*    */     //   53: monitorenter
/*    */     //   54: aload_1
/*    */     //   55: ifnull -> 82
/*    */     //   58: aload_0
/*    */     //   59: getfield c : Ljava/util/ArrayList;
/*    */     //   62: aload_1
/*    */     //   63: invokevirtual contains : (Ljava/lang/Object;)Z
/*    */     //   66: ifne -> 82
/*    */     //   69: aload_0
/*    */     //   70: getfield c : Ljava/util/ArrayList;
/*    */     //   73: aload_1
/*    */     //   74: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   77: pop
/*    */     //   78: aload_2
/*    */     //   79: monitorexit
/*    */     //   80: iconst_1
/*    */     //   81: ireturn
/*    */     //   82: aload_2
/*    */     //   83: monitorexit
/*    */     //   84: iconst_0
/*    */     //   85: ireturn
/*    */     //   86: astore_1
/*    */     //   87: aload_2
/*    */     //   88: monitorexit
/*    */     //   89: aload_1
/*    */     //   90: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 47
/*    */     //   #2	-> 58
/*    */     //   #3	-> 69
/*    */     //   #4	-> 78
/*    */     //   #5	-> 82
/*    */     //   #6	-> 87
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   58	69	86	finally
/*    */     //   69	78	86	finally
/*    */     //   78	80	86	finally
/*    */     //   82	84	86	finally
/*    */     //   87	89	86	finally } public void M(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: monitorenter
/*    */     //   2: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   5: astore #4
/*    */     //   7: aload #4
/*    */     //   9: ifnull -> 70
/*    */     //   12: aload #4
/*    */     //   14: sipush #1337
/*    */     //   17: baload
/*    */     //   18: iconst_3
/*    */     //   19: ishr
/*    */     //   20: iconst_1
/*    */     //   21: iand
/*    */     //   22: ifle -> 70
/*    */     //   25: iconst_3
/*    */     //   26: anewarray java/lang/Object
/*    */     //   29: dup
/*    */     //   30: iconst_0
/*    */     //   31: iload_1
/*    */     //   32: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   35: aastore
/*    */     //   36: dup
/*    */     //   37: iconst_1
/*    */     //   38: iload_2
/*    */     //   39: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   42: aastore
/*    */     //   43: dup
/*    */     //   44: iconst_2
/*    */     //   45: iload_3
/*    */     //   46: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   49: aastore
/*    */     //   50: aload_0
/*    */     //   51: sipush #21900
/*    */     //   54: invokestatic proxyMoreArgs : ([Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   57: getfield isSupported : Z
/*    */     //   60: istore #5
/*    */     //   62: iload #5
/*    */     //   64: ifeq -> 70
/*    */     //   67: aload_0
/*    */     //   68: monitorexit
/*    */     //   69: return
/*    */     //   70: new java/lang/StringBuilder
/*    */     //   73: astore #4
/*    */     //   75: aload #4
/*    */     //   77: invokespecial <init> : ()V
/*    */     //   80: aload #4
/*    */     //   82: ldc_w ' [startLoad] '
/*    */     //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   88: pop
/*    */     //   89: aload #4
/*    */     //   91: aload_0
/*    */     //   92: getfield o : Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;
/*    */     //   95: invokestatic E : (Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;)Ljava/lang/String;
/*    */     //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   101: pop
/*    */     //   102: aload #4
/*    */     //   104: ldc_w ' useCache '
/*    */     //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   110: pop
/*    */     //   111: aload #4
/*    */     //   113: iload_1
/*    */     //   114: invokevirtual append : (Z)Ljava/lang/StringBuilder;
/*    */     //   117: pop
/*    */     //   118: aload #4
/*    */     //   120: ldc_w ' useOldLyric '
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: pop
/*    */     //   127: aload #4
/*    */     //   129: iload_2
/*    */     //   130: invokevirtual append : (Z)Ljava/lang/StringBuilder;
/*    */     //   133: pop
/*    */     //   134: aload #4
/*    */     //   136: ldc_w ' needCallback '
/*    */     //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   142: pop
/*    */     //   143: aload #4
/*    */     //   145: iload_3
/*    */     //   146: invokevirtual append : (Z)Ljava/lang/StringBuilder;
/*    */     //   149: pop
/*    */     //   150: ldc 'LyricLoad#LoadObject'
/*    */     //   152: aload #4
/*    */     //   154: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   157: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   160: aload_0
/*    */     //   161: getfield n : I
/*    */     //   164: istore #6
/*    */     //   166: iload #6
/*    */     //   168: ifne -> 206
/*    */     //   171: aload_0
/*    */     //   172: iconst_1
/*    */     //   173: putfield n : I
/*    */     //   176: aload_0
/*    */     //   177: invokespecial I : ()V
/*    */     //   180: iload_1
/*    */     //   181: ifeq -> 199
/*    */     //   184: aload_0
/*    */     //   185: iload_2
/*    */     //   186: invokespecial D : (Z)Z
/*    */     //   189: ifeq -> 199
/*    */     //   192: aload_0
/*    */     //   193: invokevirtual j : ()V
/*    */     //   196: aload_0
/*    */     //   197: monitorexit
/*    */     //   198: return
/*    */     //   199: aload_0
/*    */     //   200: invokespecial E : ()V
/*    */     //   203: goto -> 225
/*    */     //   206: iload #6
/*    */     //   208: iconst_3
/*    */     //   209: if_icmpne -> 225
/*    */     //   212: aload_0
/*    */     //   213: iconst_1
/*    */     //   214: putfield n : I
/*    */     //   217: aload_0
/*    */     //   218: invokespecial I : ()V
/*    */     //   221: aload_0
/*    */     //   222: invokespecial E : ()V
/*    */     //   225: aload_0
/*    */     //   226: monitorexit
/*    */     //   227: return
/*    */     //   228: astore #4
/*    */     //   230: aload_0
/*    */     //   231: monitorexit
/*    */     //   232: aload #4
/*    */     //   234: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 70
/*    */     //   #2	-> 160
/*    */     //   #3	-> 171
/*    */     //   #4	-> 176
/*    */     //   #5	-> 184
/*    */     //   #6	-> 192
/*    */     //   #7	-> 196
/*    */     //   #8	-> 199
/*    */     //   #9	-> 212
/*    */     //   #10	-> 217
/*    */     //   #11	-> 221
/*    */     //   #12	-> 225
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   2	7	228	finally
/*    */     //   25	62	228	finally
/*    */     //   70	160	228	finally
/*    */     //   160	166	228	finally
/*    */     //   171	176	228	finally
/*    */     //   176	180	228	finally
/*    */     //   184	192	228	finally
/*    */     //   192	196	228	finally
/*    */     //   199	203	228	finally
/*    */     //   212	217	228	finally
/*    */     //   217	221	228	finally
/*    */     //   221	225	228	finally } public void L(boolean paramBoolean) {} public boolean K(d paramd) { // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_2
/*    */     //   4: aload_2
/*    */     //   5: ifnull -> 48
/*    */     //   8: aload_2
/*    */     //   9: sipush #1359
/*    */     //   12: baload
/*    */     //   13: bipush #6
/*    */     //   15: ishr
/*    */     //   16: iconst_1
/*    */     //   17: iand
/*    */     //   18: ifle -> 48
/*    */     //   21: aload_1
/*    */     //   22: aload_0
/*    */     //   23: sipush #22079
/*    */     //   26: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   29: astore_2
/*    */     //   30: aload_2
/*    */     //   31: getfield isSupported : Z
/*    */     //   34: ifeq -> 48
/*    */     //   37: aload_2
/*    */     //   38: getfield result : Ljava/lang/Object;
/*    */     //   41: checkcast java/lang/Boolean
/*    */     //   44: invokevirtual booleanValue : ()Z
/*    */     //   47: ireturn
/*    */     //   48: aload_0
/*    */     //   49: getfield b : Ljava/lang/Object;
/*    */     //   52: astore_2
/*    */     //   53: aload_2
/*    */     //   54: monitorenter
/*    */     //   55: aload_1
/*    */     //   56: ifnull -> 83
/*    */     //   59: aload_0
/*    */     //   60: getfield c : Ljava/util/ArrayList;
/*    */     //   63: aload_1
/*    */     //   64: invokevirtual contains : (Ljava/lang/Object;)Z
/*    */     //   67: ifeq -> 83
/*    */     //   70: aload_0
/*    */     //   71: getfield c : Ljava/util/ArrayList;
/*    */     //   74: aload_1
/*    */     //   75: invokevirtual remove : (Ljava/lang/Object;)Z
/*    */     //   78: pop
/*    */     //   79: aload_2
/*    */     //   80: monitorexit
/*    */     //   81: iconst_1
/*    */     //   82: ireturn
/*    */     //   83: aload_2
/*    */     //   84: monitorexit
/*    */     //   85: iconst_0
/*    */     //   86: ireturn
/*    */     //   87: astore_1
/*    */     //   88: aload_2
/*    */     //   89: monitorexit
/*    */     //   90: aload_1
/*    */     //   91: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 48
/*    */     //   #2	-> 59
/*    */     //   #3	-> 70
/*    */     //   #4	-> 79
/*    */     //   #5	-> 83
/*    */     //   #6	-> 88
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   59	70	87	finally
/*    */     //   70	79	87	finally
/*    */     //   79	81	87	finally
/*    */     //   83	85	87	finally
/*  4 */     //   88	90	87	finally } public void j() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1339] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21919)).isSupported) return;  if (i0.j()) { com.tencent.qqmusic.business.lyricnew.config.b.a a2 = com.tencent.qqmusic.business.lyricnew.config.b.a(this.o), a1 = a2; if (a2 == null) { MLog.e("LyricLoad#LoadObject", " [checkCacheDirty] load cacheExInfo null."); a1 = new com.tencent.qqmusic.business.lyricnew.config.b.a(); }
/*  5 */        if (!a1.b()) {
/*  6 */         StringBuilder stringBuilder1 = new StringBuilder(); stringBuilder1.append(" [checkCache] manual return. "); stringBuilder1.append(d.E(this.o)); stringBuilder1.append(" ,lyric saving time = "); stringBuilder1.append(a1.c); MLog.i("LyricLoad#LoadObject", stringBuilder1.toString()); return;
/*  7 */       }  StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(" [checkCache] "); stringBuilder.append(d.E(this.o)); MLog.i("LyricLoad#LoadObject", stringBuilder.toString());
/*  8 */       com.tencent.qqmusic.business.lyricnew.load.helper.b b1 = new com.tencent.qqmusic.business.lyricnew.load.helper.b(this.o, this.w);
/*  9 */       b1.l(true, a1);
/* 10 */       b1.b(); }  } public void H(int paramInt) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1322] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(Integer.valueOf(paramInt), this, 21781)).isSupported) return;  this.n = paramInt; B(); } public boolean A() { return this.t; } public static String o(b paramb) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1316] >> 3 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramb, null, 21732); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  return (paramb == null) ? "" : n(paramb.d, paramb.e, paramb.g, paramb.f); } public static String n(long paramLong, String paramString1, String paramString2, String paramString3) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1319] >> 7 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { Long.valueOf(paramLong), paramString1, paramString2, paramString3 }, null, 21760); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  StringBuffer stringBuffer = new StringBuffer("l_"); StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(""); stringBuilder.append(paramLong); stringBuffer.append(stringBuilder.toString()); stringBuffer.append("_"); if (paramString1 != null) stringBuffer.append(paramString1);  stringBuffer.append("_"); if (paramString2 != null) stringBuffer.append(paramString2);  stringBuffer.append("_"); if (paramString3 != null) stringBuffer.append(paramString3);  return stringBuffer.toString(); } private boolean J(String paramString, boolean paramBoolean) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1353] >> 3 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramString, Boolean.valueOf(paramBoolean) }, this, 22028); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  try { StringBuilder stringBuilder = new StringBuilder(); this(); stringBuilder.append(" [loadUserLocalFile] "); stringBuilder.append(paramString); stringBuilder.append(" isQRC "); stringBuilder.append(paramBoolean); MLog.i("LyricLoad#LoadObject", stringBuilder.toString()); if (paramString != null) { k k = new k(); this(paramString); if (k.i()) { if (paramBoolean) { this.p = paramString; } else { this.q = paramString; }  this.l = false; this.m = false; this.j = paramBoolean; this.k = false; H(5); return true; }  }  } catch (Exception exception)
/* 11 */     { MLog.e("LyricLoad#LoadObject", exception); }  return false; } private void I() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1345] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21965)).isSupported) return;  SongProductionTeamManager.z(this.o); } private boolean G() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1350] >> 7 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 22008); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  String str = a.h(this.h); if (J(str, true)) return true;  str = a.g(this.h); if (J(str, false)) return true;  str = a.l(this.h); if (J(str, false)) return true;  str = a.m(this.h); if (J(str, false)) return true;  str = a.n(this.h); return J(str, false); } private boolean F() { // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_1
/*    */     //   4: aload_1
/*    */     //   5: ifnull -> 47
/*    */     //   8: aload_1
/*    */     //   9: sipush #1355
/*    */     //   12: baload
/*    */     //   13: iconst_5
/*    */     //   14: ishr
/*    */     //   15: iconst_1
/*    */     //   16: iand
/*    */     //   17: ifle -> 47
/*    */     //   20: aconst_null
/*    */     //   21: aload_0
/*    */     //   22: sipush #22046
/*    */     //   25: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   28: astore_1
/*    */     //   29: aload_1
/*    */     //   30: getfield isSupported : Z
/*    */     //   33: ifeq -> 47
/*    */     //   36: aload_1
/*    */     //   37: getfield result : Ljava/lang/Object;
/*    */     //   40: checkcast java/lang/Boolean
/*    */     //   43: invokevirtual booleanValue : ()Z
/*    */     //   46: ireturn
/*    */     //   47: aload_0
/*    */     //   48: getfield e : Ljava/lang/String;
/*    */     //   51: aload_0
/*    */     //   52: getfield g : Ljava/lang/String;
/*    */     //   55: aload_0
/*    */     //   56: getfield f : Ljava/lang/String;
/*    */     //   59: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   62: astore_1
/*    */     //   63: aload_1
/*    */     //   64: ifnull -> 100
/*    */     //   67: new com/tencent/qqmusiccommon/storage/k
/*    */     //   70: astore_2
/*    */     //   71: aload_2
/*    */     //   72: aload_1
/*    */     //   73: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   76: aload_2
/*    */     //   77: invokevirtual i : ()Z
/*    */     //   80: ifeq -> 100
/*    */     //   83: aload_0
/*    */     //   84: aload_1
/*    */     //   85: putfield r : Ljava/lang/String;
/*    */     //   88: iconst_1
/*    */     //   89: istore_3
/*    */     //   90: goto -> 102
/*    */     //   93: astore_1
/*    */     //   94: ldc 'LyricLoad#LoadObject'
/*    */     //   96: aload_1
/*    */     //   97: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   100: iconst_0
/*    */     //   101: istore_3
/*    */     //   102: aload_0
/*    */     //   103: getfield e : Ljava/lang/String;
/*    */     //   106: aload_0
/*    */     //   107: getfield g : Ljava/lang/String;
/*    */     //   110: aload_0
/*    */     //   111: getfield f : Ljava/lang/String;
/*    */     //   114: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   117: astore_1
/*    */     //   118: aload_1
/*    */     //   119: ifnull -> 177
/*    */     //   122: new com/tencent/qqmusiccommon/storage/k
/*    */     //   125: astore_2
/*    */     //   126: aload_2
/*    */     //   127: aload_1
/*    */     //   128: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   131: aload_2
/*    */     //   132: invokevirtual i : ()Z
/*    */     //   135: ifeq -> 177
/*    */     //   138: aload_0
/*    */     //   139: aload_1
/*    */     //   140: putfield q : Ljava/lang/String;
/*    */     //   143: aload_0
/*    */     //   144: iload_3
/*    */     //   145: putfield l : Z
/*    */     //   148: aload_0
/*    */     //   149: iconst_0
/*    */     //   150: putfield m : Z
/*    */     //   153: aload_0
/*    */     //   154: iconst_0
/*    */     //   155: putfield j : Z
/*    */     //   158: aload_0
/*    */     //   159: iconst_0
/*    */     //   160: putfield k : Z
/*    */     //   163: aload_0
/*    */     //   164: iconst_5
/*    */     //   165: invokevirtual H : (I)V
/*    */     //   168: iconst_1
/*    */     //   169: ireturn
/*    */     //   170: astore_1
/*    */     //   171: ldc 'LyricLoad#LoadObject'
/*    */     //   173: aload_1
/*    */     //   174: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   177: aload_0
/*    */     //   178: getfield e : Ljava/lang/String;
/*    */     //   181: aload_0
/*    */     //   182: getfield g : Ljava/lang/String;
/*    */     //   185: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   188: astore_2
/*    */     //   189: aload_2
/*    */     //   190: ifnull -> 248
/*    */     //   193: new com/tencent/qqmusiccommon/storage/k
/*    */     //   196: astore_1
/*    */     //   197: aload_1
/*    */     //   198: aload_2
/*    */     //   199: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   202: aload_1
/*    */     //   203: invokevirtual i : ()Z
/*    */     //   206: ifeq -> 248
/*    */     //   209: aload_0
/*    */     //   210: aload_2
/*    */     //   211: putfield q : Ljava/lang/String;
/*    */     //   214: aload_0
/*    */     //   215: iload_3
/*    */     //   216: putfield l : Z
/*    */     //   219: aload_0
/*    */     //   220: iconst_0
/*    */     //   221: putfield m : Z
/*    */     //   224: aload_0
/*    */     //   225: iconst_0
/*    */     //   226: putfield j : Z
/*    */     //   229: aload_0
/*    */     //   230: iconst_0
/*    */     //   231: putfield k : Z
/*    */     //   234: aload_0
/*    */     //   235: iconst_5
/*    */     //   236: invokevirtual H : (I)V
/*    */     //   239: iconst_1
/*    */     //   240: ireturn
/*    */     //   241: astore_1
/*    */     //   242: ldc 'LyricLoad#LoadObject'
/*    */     //   244: aload_1
/*    */     //   245: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   248: iconst_0
/*    */     //   249: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 47
/*    */     //   #2	-> 67
/*    */     //   #3	-> 76
/*    */     //   #4	-> 83
/*    */     //   #5	-> 94
/*    */     //   #6	-> 102
/*    */     //   #7	-> 122
/*    */     //   #8	-> 131
/*    */     //   #9	-> 138
/*    */     //   #10	-> 143
/*    */     //   #11	-> 148
/*    */     //   #12	-> 153
/*    */     //   #13	-> 158
/*    */     //   #14	-> 163
/*    */     //   #15	-> 171
/*    */     //   #16	-> 177
/*    */     //   #17	-> 193
/*    */     //   #18	-> 202
/*    */     //   #19	-> 209
/*    */     //   #20	-> 214
/*    */     //   #21	-> 219
/*    */     //   #22	-> 224
/*    */     //   #23	-> 229
/*    */     //   #24	-> 234
/*    */     //   #25	-> 242
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   47	63	93	java/lang/Exception
/*    */     //   67	76	93	java/lang/Exception
/*    */     //   76	83	93	java/lang/Exception
/*    */     //   83	88	93	java/lang/Exception
/*    */     //   102	118	170	java/lang/Exception
/*    */     //   122	131	170	java/lang/Exception
/*    */     //   131	138	170	java/lang/Exception
/*    */     //   138	143	170	java/lang/Exception
/*    */     //   143	148	170	java/lang/Exception
/*    */     //   148	153	170	java/lang/Exception
/*    */     //   153	158	170	java/lang/Exception
/*    */     //   158	163	170	java/lang/Exception
/*    */     //   163	168	170	java/lang/Exception
/*    */     //   177	189	241	java/lang/Exception
/*    */     //   193	202	241	java/lang/Exception
/*    */     //   202	209	241	java/lang/Exception
/*    */     //   209	214	241	java/lang/Exception
/*    */     //   214	219	241	java/lang/Exception
/*    */     //   219	224	241	java/lang/Exception
/*    */     //   224	229	241	java/lang/Exception
/*    */     //   229	234	241	java/lang/Exception
/*    */     //   234	239	241	java/lang/Exception } private void E() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1346] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21976)).isSupported) return;  StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(" [loadFromNet] "); stringBuilder.append(d.E(this.o)); MLog.i("LyricLoad#LoadObject", stringBuilder.toString()); com.tencent.qqmusic.business.lyricnew.load.helper.b b1 = new com.tencent.qqmusic.business.lyricnew.load.helper.b(this.o, this.v); b1.b(); } private boolean D(boolean paramBoolean) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1343] >> 2 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), this, 21947); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  if (C()) return true;  if (paramBoolean && !i0.j() && F()) { this.t = true; return true; }  if (G()) return true;  MLog.i("LyricLoad#LoadObject", " [loadFromLocal] false"); return false; } private boolean C() { // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_1
/*    */     //   4: aload_1
/*    */     //   5: ifnull -> 47
/*    */     //   8: aload_1
/*    */     //   9: sipush #1348
/*    */     //   12: baload
/*    */     //   13: iconst_0
/*    */     //   14: ishr
/*    */     //   15: iconst_1
/*    */     //   16: iand
/*    */     //   17: ifle -> 47
/*    */     //   20: aconst_null
/*    */     //   21: aload_0
/*    */     //   22: sipush #21985
/*    */     //   25: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   28: astore_1
/*    */     //   29: aload_1
/*    */     //   30: getfield isSupported : Z
/*    */     //   33: ifeq -> 47
/*    */     //   36: aload_1
/*    */     //   37: getfield result : Ljava/lang/Object;
/*    */     //   40: checkcast java/lang/Boolean
/*    */     //   43: invokevirtual booleanValue : ()Z
/*    */     //   46: ireturn
/*    */     //   47: new java/lang/StringBuilder
/*    */     //   50: dup
/*    */     //   51: invokespecial <init> : ()V
/*    */     //   54: astore_1
/*    */     //   55: aload_1
/*    */     //   56: ldc ' [loadFromFile] '
/*    */     //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   61: pop
/*    */     //   62: aload_1
/*    */     //   63: aload_0
/*    */     //   64: getfield o : Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;
/*    */     //   67: invokestatic E : (Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;)Ljava/lang/String;
/*    */     //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   73: pop
/*    */     //   74: ldc 'LyricLoad#LoadObject'
/*    */     //   76: aload_1
/*    */     //   77: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   80: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   83: aload_0
/*    */     //   84: invokevirtual r : ()Ljava/lang/String;
/*    */     //   87: astore_2
/*    */     //   88: aload_2
/*    */     //   89: invokestatic t0 : (Ljava/lang/String;)Z
/*    */     //   92: ifne -> 121
/*    */     //   95: new com/tencent/qqmusiccommon/storage/k
/*    */     //   98: dup
/*    */     //   99: aload_2
/*    */     //   100: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   103: astore_1
/*    */     //   104: aload_1
/*    */     //   105: invokevirtual i : ()Z
/*    */     //   108: ifeq -> 121
/*    */     //   111: aload_0
/*    */     //   112: aload_2
/*    */     //   113: putfield s : Ljava/lang/String;
/*    */     //   116: iconst_1
/*    */     //   117: istore_3
/*    */     //   118: goto -> 123
/*    */     //   121: iconst_0
/*    */     //   122: istore_3
/*    */     //   123: aload_0
/*    */     //   124: invokevirtual t : ()Ljava/lang/String;
/*    */     //   127: astore_2
/*    */     //   128: aload_2
/*    */     //   129: invokestatic t0 : (Ljava/lang/String;)Z
/*    */     //   132: ifne -> 162
/*    */     //   135: new com/tencent/qqmusiccommon/storage/k
/*    */     //   138: dup
/*    */     //   139: aload_2
/*    */     //   140: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   143: astore_1
/*    */     //   144: aload_1
/*    */     //   145: invokevirtual i : ()Z
/*    */     //   148: ifeq -> 162
/*    */     //   151: aload_0
/*    */     //   152: aload_2
/*    */     //   153: putfield r : Ljava/lang/String;
/*    */     //   156: iconst_1
/*    */     //   157: istore #4
/*    */     //   159: goto -> 165
/*    */     //   162: iconst_0
/*    */     //   163: istore #4
/*    */     //   165: aload_0
/*    */     //   166: invokevirtual q : ()Ljava/lang/String;
/*    */     //   169: astore_1
/*    */     //   170: aload_1
/*    */     //   171: invokestatic t0 : (Ljava/lang/String;)Z
/*    */     //   174: ifne -> 234
/*    */     //   177: new com/tencent/qqmusiccommon/storage/k
/*    */     //   180: dup
/*    */     //   181: aload_1
/*    */     //   182: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   185: astore_2
/*    */     //   186: aload_2
/*    */     //   187: invokevirtual i : ()Z
/*    */     //   190: ifeq -> 234
/*    */     //   193: new java/lang/StringBuilder
/*    */     //   196: dup
/*    */     //   197: invokespecial <init> : ()V
/*    */     //   200: astore_2
/*    */     //   201: aload_2
/*    */     //   202: ldc ' [loadFromFile] qrcPath is: '
/*    */     //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   207: pop
/*    */     //   208: aload_2
/*    */     //   209: aload_1
/*    */     //   210: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   213: pop
/*    */     //   214: ldc 'LyricLoad#LoadObject'
/*    */     //   216: aload_2
/*    */     //   217: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   220: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   223: aload_0
/*    */     //   224: aload_1
/*    */     //   225: putfield p : Ljava/lang/String;
/*    */     //   228: iconst_1
/*    */     //   229: istore #5
/*    */     //   231: goto -> 237
/*    */     //   234: iconst_0
/*    */     //   235: istore #5
/*    */     //   237: iload #5
/*    */     //   239: ifeq -> 270
/*    */     //   242: aload_0
/*    */     //   243: iload #4
/*    */     //   245: putfield l : Z
/*    */     //   248: aload_0
/*    */     //   249: iload_3
/*    */     //   250: putfield m : Z
/*    */     //   253: aload_0
/*    */     //   254: iconst_1
/*    */     //   255: putfield j : Z
/*    */     //   258: aload_0
/*    */     //   259: iconst_1
/*    */     //   260: putfield k : Z
/*    */     //   263: aload_0
/*    */     //   264: iconst_5
/*    */     //   265: invokevirtual H : (I)V
/*    */     //   268: iconst_1
/*    */     //   269: ireturn
/*    */     //   270: aload_0
/*    */     //   271: invokevirtual p : ()Ljava/lang/String;
/*    */     //   274: astore_1
/*    */     //   275: aload_1
/*    */     //   276: invokestatic t0 : (Ljava/lang/String;)Z
/*    */     //   279: ifne -> 331
/*    */     //   282: new com/tencent/qqmusiccommon/storage/k
/*    */     //   285: dup
/*    */     //   286: aload_1
/*    */     //   287: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   290: astore_2
/*    */     //   291: aload_2
/*    */     //   292: invokevirtual i : ()Z
/*    */     //   295: ifeq -> 331
/*    */     //   298: aload_0
/*    */     //   299: aload_1
/*    */     //   300: putfield q : Ljava/lang/String;
/*    */     //   303: aload_0
/*    */     //   304: iload #4
/*    */     //   306: putfield l : Z
/*    */     //   309: aload_0
/*    */     //   310: iload_3
/*    */     //   311: putfield m : Z
/*    */     //   314: aload_0
/*    */     //   315: iconst_0
/*    */     //   316: putfield j : Z
/*    */     //   319: aload_0
/*    */     //   320: iconst_0
/*    */     //   321: putfield k : Z
/*    */     //   324: aload_0
/*    */     //   325: iconst_5
/*    */     //   326: invokevirtual H : (I)V
/*    */     //   329: iconst_1
/*    */     //   330: ireturn
/*    */     //   331: iconst_0
/*    */     //   332: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 47
/*    */     //   #2	-> 83
/*    */     //   #3	-> 88
/*    */     //   #4	-> 95
/*    */     //   #5	-> 104
/*    */     //   #6	-> 111
/*    */     //   #7	-> 123
/*    */     //   #8	-> 128
/*    */     //   #9	-> 135
/*    */     //   #10	-> 144
/*    */     //   #11	-> 151
/*    */     //   #12	-> 165
/*    */     //   #13	-> 170
/*    */     //   #14	-> 177
/*    */     //   #15	-> 186
/*    */     //   #16	-> 193
/*    */     //   #17	-> 223
/*    */     //   #18	-> 242
/*    */     //   #19	-> 248
/*    */     //   #20	-> 253
/*    */     //   #21	-> 258
/*    */     //   #22	-> 263
/*    */     //   #23	-> 270
/*    */     //   #24	-> 275
/*    */     //   #25	-> 282
/*    */     //   #26	-> 291
/*    */     //   #27	-> 298
/*    */     //   #28	-> 303
/*    */     //   #29	-> 309
/*    */     //   #30	-> 314
/*    */     //   #31	-> 319
/*    */     //   #32	-> 324 } private void B() { // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_1
/*    */     //   4: aload_1
/*    */     //   5: ifnull -> 36
/*    */     //   8: aload_1
/*    */     //   9: sipush #1360
/*    */     //   12: baload
/*    */     //   13: bipush #6
/*    */     //   15: ishr
/*    */     //   16: iconst_1
/*    */     //   17: iand
/*    */     //   18: ifle -> 36
/*    */     //   21: aconst_null
/*    */     //   22: aload_0
/*    */     //   23: sipush #22087
/*    */     //   26: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   29: getfield isSupported : Z
/*    */     //   32: ifeq -> 36
/*    */     //   35: return
/*    */     //   36: aload_0
/*    */     //   37: getfield b : Ljava/lang/Object;
/*    */     //   40: astore_1
/*    */     //   41: aload_1
/*    */     //   42: monitorenter
/*    */     //   43: iconst_0
/*    */     //   44: istore_2
/*    */     //   45: iload_2
/*    */     //   46: aload_0
/*    */     //   47: getfield c : Ljava/util/ArrayList;
/*    */     //   50: invokevirtual size : ()I
/*    */     //   53: if_icmpge -> 78
/*    */     //   56: aload_0
/*    */     //   57: getfield c : Ljava/util/ArrayList;
/*    */     //   60: iload_2
/*    */     //   61: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   64: checkcast com/tencent/qqmusic/business/lyricnew/load/listener/d
/*    */     //   67: invokeinterface a : ()V
/*    */     //   72: iinc #2, 1
/*    */     //   75: goto -> 45
/*    */     //   78: aload_1
/*    */     //   79: monitorexit
/*    */     //   80: return
/*    */     //   81: astore_3
/*    */     //   82: aload_1
/*    */     //   83: monitorexit
/*    */     //   84: aload_3
/*    */     //   85: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 36
/*    */     //   #2	-> 45
/*    */     //   #3	-> 56
/*    */     //   #4	-> 78
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   45	56	81	finally
/*    */     //   56	72	81	finally
/*    */     //   78	80	81	finally
/* 11 */     //   82	84	81	finally } public b(SongInfo paramSongInfo) { this(l1, str2, str3, str4, str5, l2, str1); String str2, str3, str4, str5; long l2; this.o = paramSongInfo; } public b(long paramLong1, String paramString1, String paramString2, String paramString3, String paramString4, long paramLong2, String paramString5) { this.b = new Object(); this.n = 0; this.o = null; this.t = false;
/* 12 */     this.u = false;
/* 13 */     this.v = new a(this);
/* 14 */     this.w = new b(this);
/* 15 */     this.d = paramLong1; if (paramString1 != null)
/* 16 */     { this.e = paramString1; }
/* 17 */     else { this.e = ""; }  if (paramString2 != null)
/* 18 */     { this.g = paramString2; }
/* 19 */     else { this.g = ""; }  if (paramString3 != null)
/* 20 */     { this.f = paramString3; }
/* 21 */     else { this.f = ""; }  if (paramString4 != null)
/* 22 */     { this.h = paramString4; }
/* 23 */     else { this.h = ""; }  if (paramString5 != null)
/* 24 */     { this.a = paramString5;
/* 25 */       StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("【LyricLoadTask->LyricLoadTask】->create LyricLoadTask Constructor，mFilePath path is: "); stringBuilder.append(paramString5); MLog.d("LyricLoad#LoadObject", stringBuilder.toString()); }
/* 26 */     else { this.a = ""; }
/* 27 */      this.i = o(this);
/* 28 */     this.c = new ArrayList<d>(); }
/*    */    }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */