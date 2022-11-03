/*  1 */ package com.tencent.qqmusic.business.lyricnew.load.model;public abstract class a implements d { private static final Object k = new Object(); private final boolean a; public SongInfo b; public b c; public int d; protected int e; private int f; protected b g; protected b h; protected b i; private int j; public a(SongInfo paramSongInfo) { this(paramSongInfo, true); } private void m(boolean paramBoolean1, boolean paramBoolean2) { // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_3
/*    */     //   4: aload_3
/*    */     //   5: ifnull -> 52
/*    */     //   8: aload_3
/*    */     //   9: sipush #1313
/*    */     //   12: baload
/*    */     //   13: iconst_0
/*    */     //   14: ishr
/*    */     //   15: iconst_1
/*    */     //   16: iand
/*    */     //   17: ifle -> 52
/*    */     //   20: iconst_2
/*    */     //   21: anewarray java/lang/Object
/*    */     //   24: dup
/*    */     //   25: iconst_0
/*    */     //   26: iload_1
/*    */     //   27: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   30: aastore
/*    */     //   31: dup
/*    */     //   32: iconst_1
/*    */     //   33: iload_2
/*    */     //   34: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   37: aastore
/*    */     //   38: aload_0
/*    */     //   39: sipush #21705
/*    */     //   42: invokestatic proxyMoreArgs : ([Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   45: getfield isSupported : Z
/*    */     //   48: ifeq -> 52
/*    */     //   51: return
/*    */     //   52: getstatic com/tencent/qqmusic/business/lyricnew/load/model/a.k : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: aload_3
/*    */     //   57: monitorenter
/*    */     //   58: aload_0
/*    */     //   59: getfield b : Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;
/*    */     //   62: aload_0
/*    */     //   63: aload_0
/*    */     //   64: getfield a : Z
/*    */     //   67: invokestatic b : (Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;Lcom/tencent/qqmusic/business/lyricnew/load/listener/d;Z)Lcom/tencent/qqmusic/business/lyricnew/load/model/b;
/*    */     //   70: astore #4
/*    */     //   72: aload_0
/*    */     //   73: aload #4
/*    */     //   75: putfield c : Lcom/tencent/qqmusic/business/lyricnew/load/model/b;
/*    */     //   78: aload #4
/*    */     //   80: iload_2
/*    */     //   81: invokevirtual L : (Z)V
/*    */     //   84: aload_0
/*    */     //   85: getfield c : Lcom/tencent/qqmusic/business/lyricnew/load/model/b;
/*    */     //   88: invokevirtual s : ()I
/*    */     //   91: istore #5
/*    */     //   93: iload #5
/*    */     //   95: ifeq -> 146
/*    */     //   98: iload #5
/*    */     //   100: iconst_2
/*    */     //   101: if_icmpeq -> 139
/*    */     //   104: iload #5
/*    */     //   106: iconst_3
/*    */     //   107: if_icmpeq -> 146
/*    */     //   110: iload #5
/*    */     //   112: iconst_4
/*    */     //   113: if_icmpeq -> 139
/*    */     //   116: iload #5
/*    */     //   118: iconst_5
/*    */     //   119: if_icmpeq -> 125
/*    */     //   122: goto -> 159
/*    */     //   125: aload_0
/*    */     //   126: invokespecial o : ()V
/*    */     //   129: aload_0
/*    */     //   130: getfield c : Lcom/tencent/qqmusic/business/lyricnew/load/model/b;
/*    */     //   133: invokevirtual j : ()V
/*    */     //   136: goto -> 159
/*    */     //   139: aload_0
/*    */     //   140: invokespecial o : ()V
/*    */     //   143: goto -> 159
/*    */     //   146: aload_0
/*    */     //   147: getfield c : Lcom/tencent/qqmusic/business/lyricnew/load/model/b;
/*    */     //   150: aload_0
/*    */     //   151: getfield a : Z
/*    */     //   154: iload_1
/*    */     //   155: iconst_1
/*    */     //   156: invokevirtual M : (ZZZ)V
/*    */     //   159: aload_3
/*    */     //   160: monitorexit
/*    */     //   161: return
/*    */     //   162: astore #4
/*    */     //   164: aload_3
/*    */     //   165: monitorexit
/*    */     //   166: aload #4
/*    */     //   168: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 52
/*    */     //   #2	-> 58
/*    */     //   #3	-> 78
/*    */     //   #4	-> 84
/*    */     //   #5	-> 125
/*    */     //   #6	-> 129
/*    */     //   #7	-> 139
/*    */     //   #8	-> 146
/*    */     //   #9	-> 159
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   58	78	162	finally
/*    */     //   78	84	162	finally
/*    */     //   84	93	162	finally
/*    */     //   125	129	162	finally
/*    */     //   129	136	162	finally
/*    */     //   139	143	162	finally
/*    */     //   146	159	162	finally
/*    */     //   159	161	162	finally
/*  1 */     //   164	166	162	finally } private void o() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1318] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21747)).isSupported) return;  b b1 = this.c; if (b1 != null)
/*  2 */     { int i = b1.s(); if (i != 0) { if (i != 2) { if (i != 3) { if (i != 4) { if (i == 5)
/*  3 */               { MLog.i("LyricLoad#Loader", " [loadOver] STATE_LOADSUC");
/*  4 */                 s(50);
/*  5 */                 y1.a(new b(this)); }  }
/*  6 */             else { MLog.i("LyricLoad#Loader", " [loadOver] STATE_SAVEERROR");
/*  7 */               t(30, 2000); }  }
/*  8 */           else { MLog.i("LyricLoad#Loader", " [loadOver] STATE_LOADERROR");
/*  9 */             t(30, 1000); }  }
/* 10 */         else { MLog.i("LyricLoad#Loader", " [loadOver] STATE_LOADEMPTY");
/* 11 */           s(40); }  }
/* 12 */       else { MLog.i("LyricLoad#Loader", " [loadOver] STATE_NONE");
/* 13 */         e(); }  }  } private void p() { byte[] arrayOfByte2 = SwordSwitches.switches2; if (arrayOfByte2 != null && (arrayOfByte2[1321] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21770)).isSupported) return;  b b3 = this.c; if (b3 == null) { MLog.i("LyricLoad#Loader", " [parse] mLyricLoadTask == null return."); return; }  b b2 = d.c(b3, 0, b3.z()); if (b2 == null) { MLog.i("LyricLoad#Loader", " [parse] STATE_PARSE_ERROR"); s(60); return; }  if (this.e == 80) return;  this.h = null; b b1 = this.c; if (b1 != null && b1.x()) this.h = d.c(this.c, 1, false);  this.i = null; b1 = this.c; if (b1 != null && b1.w()) this.i = d.c(this.c, 2, true);  if (this.e == 80) {
/* 14 */       MLog.i("LyricLoad#Loader", " [parse] STATE_CLOSE return."); return;
/* 15 */     }  this.d = 0;
/* 16 */     String str = com.tencent.qqmusic.business.lyricnew.config.a.f(this.b);
/* 17 */     byte[] arrayOfByte1 = Util4File.t(str); if (arrayOfByte1 != null)
/* 18 */     { String str1 = new String(arrayOfByte1); try {
/* 19 */         this.d = Integer.parseInt(str1.trim());
/*    */       
/*    */       }
/* 22 */       catch (Exception exception) {} }  this.j = this.d; s(70); MLog.i("LyricLoad#Loader", " [parse] STATE_PARSE_SUC"); }
/*    */ 
/*    */   
/*    */   private void s(int paramInt) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1304] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(Integer.valueOf(paramInt), this, 21637)).isSupported)
/*    */       return; 
/*    */     t(paramInt, 0);
/*    */   }
/*    */   
/*    */   private void t(int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: monitorenter
/*    */     //   2: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   5: astore_3
/*    */     //   6: aload_3
/*    */     //   7: ifnull -> 60
/*    */     //   10: aload_3
/*    */     //   11: sipush #1315
/*    */     //   14: baload
/*    */     //   15: iconst_3
/*    */     //   16: ishr
/*    */     //   17: iconst_1
/*    */     //   18: iand
/*    */     //   19: ifle -> 60
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
/*    */     //   36: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   39: aastore
/*    */     //   40: aload_0
/*    */     //   41: sipush #21724
/*    */     //   44: invokestatic proxyMoreArgs : ([Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   47: getfield isSupported : Z
/*    */     //   50: istore #4
/*    */     //   52: iload #4
/*    */     //   54: ifeq -> 60
/*    */     //   57: aload_0
/*    */     //   58: monitorexit
/*    */     //   59: return
/*    */     //   60: aload_0
/*    */     //   61: getfield e : I
/*    */     //   64: bipush #80
/*    */     //   66: if_icmpeq -> 105
/*    */     //   69: aload_0
/*    */     //   70: iload_1
/*    */     //   71: putfield e : I
/*    */     //   74: aload_0
/*    */     //   75: iload_2
/*    */     //   76: putfield f : I
/*    */     //   79: aload_0
/*    */     //   80: iload_1
/*    */     //   81: iload_2
/*    */     //   82: invokevirtual u : (II)V
/*    */     //   85: goto -> 105
/*    */     //   88: astore_3
/*    */     //   89: ldc 'LyricLoad#Loader'
/*    */     //   91: aload_3
/*    */     //   92: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   95: goto -> 105
/*    */     //   98: astore_3
/*    */     //   99: ldc 'LyricLoad#Loader'
/*    */     //   101: aload_3
/*    */     //   102: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   105: aload_0
/*    */     //   106: monitorexit
/*    */     //   107: return
/*    */     //   108: astore_3
/*    */     //   109: aload_0
/*    */     //   110: monitorexit
/*    */     //   111: aload_3
/*    */     //   112: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 60
/*    */     //   #2	-> 69
/*    */     //   #3	-> 74
/*    */     //   #4	-> 79
/*    */     //   #5	-> 89
/*    */     //   #6	-> 99
/*    */     //   #7	-> 105
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   2	6	108	finally
/*    */     //   22	52	108	finally
/*    */     //   60	69	108	finally
/*    */     //   69	74	108	finally
/*    */     //   74	79	108	finally
/*    */     //   79	85	98	java/lang/Exception
/*    */     //   79	85	88	java/lang/Error
/*    */     //   79	85	108	finally
/*    */     //   89	95	108	finally
/*    */     //   99	105	108	finally
/*    */   }
/*    */   
/*    */   public void a() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1324] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21797)).isSupported)
/*    */       return; 
/*    */     o();
/*    */   }
/*    */   
/*    */   public long b() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1299] >> 4 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21597);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Long)swordProxyResult.result).longValue(); 
/*    */     } 
/*    */     return this.b.O0();
/*    */   }
/*    */   
/*    */   public void e() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1301] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21615)).isSupported)
/*    */       return; 
/*    */     r();
/*    */     b b1 = this.c;
/*    */     if (b1 != null)
/*    */       b1.K(this); 
/*    */     this.e = 80;
/*    */   }
/*    */   
/*    */   public b f() {
/*    */     return this.g;
/*    */   }
/*    */   
/*    */   public b g() {
/*    */     return this.i;
/*    */   }
/*    */   
/*    */   public int h() {
/*    */     return this.e;
/*    */   }
/*    */   
/*    */   public int i() {
/*    */     return this.f;
/*    */   }
/*    */   
/*    */   public b j() {
/*    */     return this.h;
/*    */   }
/*    */   
/*    */   public void k(boolean paramBoolean) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1310] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), this, 21681)).isSupported)
/*    */       return; 
/*    */     l(paramBoolean, false);
/*    */   }
/*    */   
/*    */   public void l(boolean paramBoolean1, boolean paramBoolean2) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1311] >> 2 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) }, this, 21691)).isSupported)
/*    */       return; 
/*    */     if (this.e == 0) {
/*    */       s(20);
/*    */       y1.a(new a(this, paramBoolean1, paramBoolean2));
/*    */     } 
/*    */   }
/*    */   
/*    */   public void n(boolean paramBoolean, String paramString) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1306] >> 5 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Boolean.valueOf(paramBoolean), paramString }, this, 21654)).isSupported)
/*    */       return; 
/*    */     if (paramString == null) {
/*    */       MLog.i("LyricLoad#Loader", " [loadBySearch] STATE_LOAD_NONE");
/*    */       s(40);
/*    */       return;
/*    */     } 
/*    */     s(50);
/*    */     b b1 = d.e(paramString, paramBoolean, true);
/*    */     if (b1 == null) {
/*    */       MLog.i("LyricLoad#Loader", " [loadBySearch] STATE_PARSE_ERROR");
/*    */       s(60);
/*    */       return;
/*    */     } 
/*    */     MLog.i("LyricLoad#Loader", " [loadBySearch] STATE_PARSE_SUC");
/*    */     s(70);
/*    */   }
/*    */   
/*    */   public void q() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1327] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21821)).isSupported)
/*    */       return; 
/*    */     u(this.e, this.f);
/*    */   }
/*    */   
/*    */   public void r() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1325] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21808)).isSupported)
/*    */       return; 
/*    */     if (this.j != this.d) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(" [saveOffSet] ");
/*    */       stringBuilder.append(d.E(this.b));
/*    */       stringBuilder.append(this.d);
/*    */       MLog.i("LyricLoad#Loader", stringBuilder.toString());
/*    */       String str = com.tencent.qqmusic.business.lyricnew.config.a.f(this.b);
/*    */       stringBuilder = new StringBuilder();
/*    */       stringBuilder.append("");
/*    */       stringBuilder.append(this.d);
/*    */       Util4File.V(str, stringBuilder.toString());
/*    */       this.j = this.d;
/*    */     } 
/*    */   }
/*    */   
/*    */   public a(SongInfo paramSongInfo, boolean paramBoolean) {
/*    */     this.d = 0;
/*    */     this.e = 0;
/*    */     this.f = 0;
/*    */     this.j = 0;
/*    */     this.b = paramSongInfo;
/*    */     this.a = paramBoolean;
/*    */   }
/*    */   
/*    */   public abstract void u(int paramInt1, int paramInt2); }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */