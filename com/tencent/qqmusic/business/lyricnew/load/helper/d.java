/*  1 */ package com.tencent.qqmusic.business.lyricnew.load.helper;public class d { private static final Object a = new Object(); public static void a() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1321] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, null, 21774)).isSupported) return;  synchronized (a)
/*  2 */     { MLog.i("LyricLoad#ParseHelper", " [removeAllCache] ");
/*  3 */       ArrayList<a> arrayList = b; if (arrayList != null)
/*  4 */         arrayList.clear();  return; }  } private static String b(b paramb, int paramInt) { // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_2
/*    */     //   4: aload_2
/*    */     //   5: ifnull -> 59
/*    */     //   8: aload_2
/*    */     //   9: sipush #1333
/*    */     //   12: baload
/*    */     //   13: bipush #7
/*    */     //   15: ishr
/*    */     //   16: iconst_1
/*    */     //   17: iand
/*    */     //   18: ifle -> 59
/*    */     //   21: iconst_2
/*    */     //   22: anewarray java/lang/Object
/*    */     //   25: dup
/*    */     //   26: iconst_0
/*    */     //   27: aload_0
/*    */     //   28: aastore
/*    */     //   29: dup
/*    */     //   30: iconst_1
/*    */     //   31: iload_1
/*    */     //   32: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   35: aastore
/*    */     //   36: aconst_null
/*    */     //   37: sipush #21872
/*    */     //   40: invokestatic proxyMoreArgs : ([Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   43: astore_2
/*    */     //   44: aload_2
/*    */     //   45: getfield isSupported : Z
/*    */     //   48: ifeq -> 59
/*    */     //   51: aload_2
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: checkcast java/lang/String
/*    */     //   58: areturn
/*    */     //   59: aload_0
/*    */     //   60: ifnonnull -> 65
/*    */     //   63: aconst_null
/*    */     //   64: areturn
/*    */     //   65: iload_1
/*    */     //   66: ifeq -> 117
/*    */     //   69: iload_1
/*    */     //   70: iconst_1
/*    */     //   71: if_icmpeq -> 97
/*    */     //   74: iload_1
/*    */     //   75: iconst_2
/*    */     //   76: if_icmpeq -> 82
/*    */     //   79: goto -> 112
/*    */     //   82: aload_0
/*    */     //   83: invokevirtual w : ()Z
/*    */     //   86: ifeq -> 112
/*    */     //   89: aload_0
/*    */     //   90: invokevirtual r : ()Ljava/lang/String;
/*    */     //   93: astore_0
/*    */     //   94: goto -> 137
/*    */     //   97: aload_0
/*    */     //   98: invokevirtual x : ()Z
/*    */     //   101: ifeq -> 112
/*    */     //   104: aload_0
/*    */     //   105: invokevirtual t : ()Ljava/lang/String;
/*    */     //   108: astore_0
/*    */     //   109: goto -> 137
/*    */     //   112: aconst_null
/*    */     //   113: astore_0
/*    */     //   114: goto -> 137
/*    */     //   117: aload_0
/*    */     //   118: invokevirtual v : ()Z
/*    */     //   121: ifeq -> 132
/*    */     //   124: aload_0
/*    */     //   125: invokevirtual q : ()Ljava/lang/String;
/*    */     //   128: astore_0
/*    */     //   129: goto -> 137
/*    */     //   132: aload_0
/*    */     //   133: invokevirtual p : ()Ljava/lang/String;
/*    */     //   136: astore_0
/*    */     //   137: aload_0
/*    */     //   138: invokestatic t0 : (Ljava/lang/String;)Z
/*    */     //   141: ifne -> 203
/*    */     //   144: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/d.c : Landroidx/collection/LruCache;
/*    */     //   147: aload_0
/*    */     //   148: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   151: checkcast java/lang/String
/*    */     //   154: astore_2
/*    */     //   155: aload_2
/*    */     //   156: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
/*    */     //   159: ifne -> 171
/*    */     //   162: ldc 'LyricLoad#ParseHelper'
/*    */     //   164: ldc ' [getLyricString] hit fileIO cache.'
/*    */     //   166: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   169: aload_2
/*    */     //   170: areturn
/*    */     //   171: aload_0
/*    */     //   172: invokestatic t : (Ljava/lang/String;)[B
/*    */     //   175: astore_2
/*    */     //   176: aload_2
/*    */     //   177: ifnull -> 203
/*    */     //   180: new java/lang/String
/*    */     //   183: dup
/*    */     //   184: aload_2
/*    */     //   185: invokespecial <init> : ([B)V
/*    */     //   188: astore_2
/*    */     //   189: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/d.c : Landroidx/collection/LruCache;
/*    */     //   192: aload_0
/*    */     //   193: aload_2
/*    */     //   194: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   197: pop
/*    */     //   198: aload_2
/*    */     //   199: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   202: areturn
/*    */     //   203: aconst_null
/*    */     //   204: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 82
/*    */     //   #2	-> 89
/*    */     //   #3	-> 97
/*    */     //   #4	-> 104
/*    */     //   #5	-> 117
/*    */     //   #6	-> 124
/*    */     //   #7	-> 132
/*    */     //   #8	-> 137
/*    */     //   #9	-> 144
/*    */     //   #10	-> 155
/*    */     //   #11	-> 162
/*    */     //   #12	-> 171
/*    */     //   #13	-> 180
/*    */     //   #14	-> 189
/*  4 */     //   #15	-> 198 } private static b f(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) { byte[] arrayOfByte = SwordSwitches.switches2; byte b = 0; if (arrayOfByte != null && (arrayOfByte[1329] >> 6 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean3) }, null, 21839); if (swordProxyResult.isSupported) return (b)swordProxyResult.result;  }  if (paramString != null && paramString.length() >= 0) try { b b1; if (paramString.startsWith("fakelyric")) { String str = paramString.substring(9, paramString.length()); StringBuilder stringBuilder = new StringBuilder(); this(); stringBuilder.append(" [parse fakeLyricContent] "); stringBuilder.append(str); MLog.i("LyricLoad#ParseHelper", stringBuilder.toString());
/*  5 */           b b2 = new b(); this(str, (c)QRCDesDecrypt.getInstance());
/*  6 */           b1 = b2.a(false); } else if (paramBoolean1)
/*  7 */         { b b2 = new b(); this(paramString, (c)QRCDesDecrypt.getInstance());
/*  8 */           b1 = b2.b(paramBoolean2); }
/*  9 */         else { LrcParser lrcParser = new LrcParser(); this(paramString, (c)QRCDesDecrypt.getInstance());
/* 10 */           b1 = lrcParser.d(paramBoolean2); }  if (b1 != null && 
/* 11 */           com.tencent.qqmusic.business.lyricnew.d.e(b1))
/* 12 */           com.tencent.qqmusic.business.lyricnew.d.a(b1);  if (b1 != null && 
/* 13 */           b1.b.size() > 0)
/* 14 */         { paramBoolean1 = e.c().getBoolean("KEY_LYRIC_ST_OPTION_FIX", false);
/* 15 */           boolean bool = PlayerDynamicLyricManager.K();
/* 16 */           StringBuilder stringBuilder = new StringBuilder(); this(); stringBuilder.append(" [parseTextToLyric] isLyricSTChange "); stringBuilder.append(paramBoolean1); stringBuilder.append(" isDynamicLyric: "); stringBuilder.append(bool); MLog.i("LyricLoad#ParseHelper", stringBuilder.toString()); if (paramBoolean1 && !paramBoolean3 && !bool) {
/* 17 */             com.tencent.qqmusic.business.lyricnew.stconverter.a a = com.tencent.qqmusic.business.lyricnew.stconverter.a.d();
/* 18 */             while (b < b1.b.size())
/* 19 */             { j j = b1.b.get(b);
/* 20 */               j.a = a.h(j.a); b++; } 
/* 21 */           }  b1.s(paramString, paramBoolean2); return b1; }  } catch (Exception exception)
/* 22 */       { StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("error is:"); stringBuilder.append(exception.toString()); stringBuilder.append(" and string is:"); stringBuilder.append(paramString); n.a("歌词", "LyricLoad#ParseHelper", stringBuilder.toString());
/* 23 */         MLog.e("LyricLoad#ParseHelper", exception); }
/* 24 */         MLog.e("loadLyric##devin", "[LyricParseHelper->parseTextToLyric]->directly return null"); return null; }
/*    */ 
/*    */   
/*    */   public static b c(b paramb, int paramInt, boolean paramBoolean) {
/*    */     // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_3
/*    */     //   4: aload_3
/*    */     //   5: ifnull -> 65
/*    */     //   8: aload_3
/*    */     //   9: sipush #1317
/*    */     //   12: baload
/*    */     //   13: iconst_2
/*    */     //   14: ishr
/*    */     //   15: iconst_1
/*    */     //   16: iand
/*    */     //   17: ifle -> 65
/*    */     //   20: iconst_3
/*    */     //   21: anewarray java/lang/Object
/*    */     //   24: dup
/*    */     //   25: iconst_0
/*    */     //   26: aload_0
/*    */     //   27: aastore
/*    */     //   28: dup
/*    */     //   29: iconst_1
/*    */     //   30: iload_1
/*    */     //   31: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   34: aastore
/*    */     //   35: dup
/*    */     //   36: iconst_2
/*    */     //   37: iload_2
/*    */     //   38: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   41: aastore
/*    */     //   42: aconst_null
/*    */     //   43: sipush #21739
/*    */     //   46: invokestatic proxyMoreArgs : ([Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   49: astore_3
/*    */     //   50: aload_3
/*    */     //   51: getfield isSupported : Z
/*    */     //   54: ifeq -> 65
/*    */     //   57: aload_3
/*    */     //   58: getfield result : Ljava/lang/Object;
/*    */     //   61: checkcast com/lyricengine/base/b
/*    */     //   64: areturn
/*    */     //   65: aload_0
/*    */     //   66: ifnonnull -> 71
/*    */     //   69: aconst_null
/*    */     //   70: areturn
/*    */     //   71: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/d.a : Ljava/lang/Object;
/*    */     //   74: astore_3
/*    */     //   75: aload_3
/*    */     //   76: monitorenter
/*    */     //   77: iconst_0
/*    */     //   78: istore #4
/*    */     //   80: iload #4
/*    */     //   82: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/d.b : Ljava/util/ArrayList;
/*    */     //   85: invokevirtual size : ()I
/*    */     //   88: if_icmpge -> 212
/*    */     //   91: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/d.b : Ljava/util/ArrayList;
/*    */     //   94: iload #4
/*    */     //   96: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   99: checkcast com/tencent/qqmusic/business/lyricnew/load/helper/d$a
/*    */     //   102: astore #5
/*    */     //   104: aload #5
/*    */     //   106: getfield a : Lcom/tencent/qqmusic/business/lyricnew/load/model/b;
/*    */     //   109: aload_0
/*    */     //   110: invokevirtual m : (Lcom/tencent/qqmusic/business/lyricnew/load/model/b;)Z
/*    */     //   113: ifeq -> 206
/*    */     //   116: aload #5
/*    */     //   118: getfield c : I
/*    */     //   121: iload_1
/*    */     //   122: if_icmpne -> 206
/*    */     //   125: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/d.b : Ljava/util/ArrayList;
/*    */     //   128: iload #4
/*    */     //   130: invokevirtual remove : (I)Ljava/lang/Object;
/*    */     //   133: pop
/*    */     //   134: aload #5
/*    */     //   136: getfield a : Lcom/tencent/qqmusic/business/lyricnew/load/model/b;
/*    */     //   139: invokevirtual y : ()Z
/*    */     //   142: ifne -> 199
/*    */     //   145: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/d.b : Ljava/util/ArrayList;
/*    */     //   148: aload #5
/*    */     //   150: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   153: pop
/*    */     //   154: new java/lang/StringBuilder
/*    */     //   157: astore #6
/*    */     //   159: aload #6
/*    */     //   161: invokespecial <init> : ()V
/*    */     //   164: aload #6
/*    */     //   166: ldc ' [parseLyric] hit cache '
/*    */     //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   171: pop
/*    */     //   172: aload #6
/*    */     //   174: aload_0
/*    */     //   175: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   178: pop
/*    */     //   179: ldc 'LyricLoad#ParseHelper'
/*    */     //   181: aload #6
/*    */     //   183: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   186: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   189: aload #5
/*    */     //   191: getfield b : Lcom/lyricengine/base/b;
/*    */     //   194: astore_0
/*    */     //   195: aload_3
/*    */     //   196: monitorexit
/*    */     //   197: aload_0
/*    */     //   198: areturn
/*    */     //   199: ldc 'LyricLoad#ParseHelper'
/*    */     //   201: ldc ' [parseLyric] lyricLoadTask dirty.'
/*    */     //   203: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   206: iinc #4, 1
/*    */     //   209: goto -> 80
/*    */     //   212: aload_3
/*    */     //   213: monitorexit
/*    */     //   214: aload_0
/*    */     //   215: iload_1
/*    */     //   216: iload_2
/*    */     //   217: invokestatic d : (Lcom/tencent/qqmusic/business/lyricnew/load/model/b;IZ)Lcom/lyricengine/base/b;
/*    */     //   220: astore_3
/*    */     //   221: aload_3
/*    */     //   222: ifnull -> 316
/*    */     //   225: new java/lang/StringBuilder
/*    */     //   228: dup
/*    */     //   229: invokespecial <init> : ()V
/*    */     //   232: astore #6
/*    */     //   234: aload #6
/*    */     //   236: ldc ' [parseLyric] miss cache '
/*    */     //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   241: pop
/*    */     //   242: aload #6
/*    */     //   244: aload_0
/*    */     //   245: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   248: pop
/*    */     //   249: ldc 'LyricLoad#ParseHelper'
/*    */     //   251: aload #6
/*    */     //   253: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   256: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   259: new com/tencent/qqmusic/business/lyricnew/load/helper/d$a
/*    */     //   262: dup
/*    */     //   263: aload_0
/*    */     //   264: iload_1
/*    */     //   265: aload_3
/*    */     //   266: invokespecial <init> : (Lcom/tencent/qqmusic/business/lyricnew/load/model/b;ILcom/lyricengine/base/b;)V
/*    */     //   269: astore #6
/*    */     //   271: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/d.a : Ljava/lang/Object;
/*    */     //   274: astore_0
/*    */     //   275: aload_0
/*    */     //   276: monitorenter
/*    */     //   277: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/d.b : Ljava/util/ArrayList;
/*    */     //   280: aload #6
/*    */     //   282: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   285: pop
/*    */     //   286: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/d.b : Ljava/util/ArrayList;
/*    */     //   289: invokevirtual size : ()I
/*    */     //   292: iconst_4
/*    */     //   293: if_icmple -> 307
/*    */     //   296: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/d.b : Ljava/util/ArrayList;
/*    */     //   299: iconst_0
/*    */     //   300: invokevirtual remove : (I)Ljava/lang/Object;
/*    */     //   303: pop
/*    */     //   304: goto -> 286
/*    */     //   307: aload_0
/*    */     //   308: monitorexit
/*    */     //   309: aload_3
/*    */     //   310: areturn
/*    */     //   311: astore_3
/*    */     //   312: aload_0
/*    */     //   313: monitorexit
/*    */     //   314: aload_3
/*    */     //   315: athrow
/*    */     //   316: new java/lang/StringBuilder
/*    */     //   319: dup
/*    */     //   320: invokespecial <init> : ()V
/*    */     //   323: astore_3
/*    */     //   324: aload_3
/*    */     //   325: ldc ' [parseLyric] parseLyric null:'
/*    */     //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   330: pop
/*    */     //   331: aload_3
/*    */     //   332: aload_0
/*    */     //   333: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   336: pop
/*    */     //   337: ldc 'LyricLoad#ParseHelper'
/*    */     //   339: aload_3
/*    */     //   340: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   343: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   346: iconst_2
/*    */     //   347: iload_1
/*    */     //   348: if_icmpne -> 362
/*    */     //   351: new com/tencent/qqmusiccommon/statistics/trackpoint/ClickStatistics
/*    */     //   354: dup
/*    */     //   355: sipush #5103
/*    */     //   358: invokespecial <init> : (I)V
/*    */     //   361: pop
/*    */     //   362: aconst_null
/*    */     //   363: areturn
/*    */     //   364: astore_0
/*    */     //   365: aload_3
/*    */     //   366: monitorexit
/*    */     //   367: aload_0
/*    */     //   368: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 71
/*    */     //   #2	-> 80
/*    */     //   #3	-> 91
/*    */     //   #4	-> 104
/*    */     //   #5	-> 125
/*    */     //   #6	-> 134
/*    */     //   #7	-> 145
/*    */     //   #8	-> 154
/*    */     //   #9	-> 189
/*    */     //   #10	-> 199
/*    */     //   #11	-> 212
/*    */     //   #12	-> 214
/*    */     //   #13	-> 225
/*    */     //   #14	-> 259
/*    */     //   #15	-> 271
/*    */     //   #16	-> 277
/*    */     //   #17	-> 286
/*    */     //   #18	-> 296
/*    */     //   #19	-> 307
/*    */     //   #20	-> 316
/*    */     //   #21	-> 351
/*    */     //   #22	-> 365
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   80	91	364	finally
/*    */     //   91	104	364	finally
/*    */     //   104	125	364	finally
/*    */     //   125	134	364	finally
/*    */     //   134	145	364	finally
/*    */     //   145	154	364	finally
/*    */     //   154	189	364	finally
/*    */     //   189	197	364	finally
/*    */     //   199	206	364	finally
/*    */     //   212	214	364	finally
/*    */     //   277	286	311	finally
/*    */     //   286	296	311	finally
/*    */     //   296	304	311	finally
/*    */     //   307	309	311	finally
/*    */     //   312	314	311	finally
/*    */     //   365	367	364	finally
/*    */   }
/*    */   
/*    */   private static b d(b paramb, int paramInt, boolean paramBoolean) {
/*    */     boolean bool1;
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     boolean bool = false;
/*    */     if (arrayOfByte != null && (arrayOfByte[1324] >> 7 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramb, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) }, null, 21800);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (b)swordProxyResult.result; 
/*    */     } 
/*    */     if (paramb == null)
/*    */       return null; 
/*    */     String str = b(paramb, paramInt);
/*    */     if (paramInt != 0) {
/*    */       bool1 = bool;
/*    */       if (paramInt != 1)
/*    */         if (paramInt != 2) {
/*    */           bool1 = bool;
/*    */         } else {
/*    */           bool1 = true;
/*    */         }  
/*    */     } else {
/*    */       bool1 = paramb.v();
/*    */     } 
/*    */     return e(str, bool1, paramBoolean);
/*    */   }
/*    */   
/*    */   public static b e(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1328] >> 3 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) }, null, 21828);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (b)swordProxyResult.result; 
/*    */     } 
/*    */     return f(paramString, paramBoolean1, paramBoolean2, false);
/*    */   }
/*    */   
/*    */   public static b g(b paramb) {
/*    */     boolean bool;
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1327] >> 2 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramb, null, 21819);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (b)swordProxyResult.result; 
/*    */     } 
/*    */     if (paramb == null)
/*    */       return null; 
/*    */     String str = paramb.h();
/*    */     if (paramb.a == 20) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     boolean bool1 = paramb.n().booleanValue();
/*    */     return f(str, bool, bool1, true);
/*    */   }
/*    */   
/*    */   public static void h(SongInfo paramSongInfo) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1322] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramSongInfo, null, 21782)).isSupported)
/*    */       return; 
/*    */     synchronized (a) {
/*    */       int i;
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       this();
/*    */       stringBuilder.append(" [removeLyricCache] ");
/*    */       stringBuilder.append(com.tencent.qqmusicplayerprocess.songinfo.d.E(paramSongInfo));
/*    */       MLog.i("LyricLoad#ParseHelper", stringBuilder.toString());
/*    */       if (paramSongInfo == null)
/*    */         return; 
/*    */       b b = new b();
/*    */       this(paramSongInfo);
/*    */       ArrayList<a> arrayList = b;
/*    */       if (arrayList == null) {
/*    */         i = 0;
/*    */       } else {
/*    */         i = arrayList.size();
/*    */       } 
/*    */       while (--i >= 0) {
/*    */         a a = b.get(i);
/*    */         if (a.a.m(b))
/*    */           b.remove(i); 
/*    */         i--;
/*    */       } 
/*    */       return;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void i(String paramString) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1345] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramString, null, 21967)).isSupported)
/*    */       return; 
/*    */     if (!TextUtils.isEmpty(paramString))
/*    */       c.remove(paramString); 
/*    */   }
/*    */   
/*    */   static class a {
/*    */     public final b a;
/*    */     public final b b;
/*    */     public final int c;
/*    */     
/*    */     public a(b param1b, int param1Int, b param1b1) {
/*    */       this.a = param1b;
/*    */       this.c = param1Int;
/*    */       this.b = param1b1;
/*    */     }
/*    */   }
/*    */   private static ArrayList<a> b = new ArrayList<a>();
/*    */   static LruCache<String, String> c = com.tencent.qqmusic.common.a.a(); }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\helper\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */