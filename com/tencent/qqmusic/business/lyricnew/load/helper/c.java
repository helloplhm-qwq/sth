/* 1 */ package com.tencent.qqmusic.business.lyricnew.load.helper;public class c { private static final Object a = new Object(); public static void a() { null = SwordSwitches.switches2; if (null != null && (null[1317] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, null, 21737)).isSupported) return;  synchronized (a)
/* 2 */     { if (b != null)
/* 3 */       { MLog.i("LyricLoad#ObjectCacheHelper", " [clearCaches] ");
/* 4 */         b.clear(); }  return; }  } public static void c(SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; int i = 0; if (arrayOfByte != null && (arrayOfByte[1318] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramSongInfo, null, 21745)).isSupported) return;  StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(" [removeLyricLoadObjectFromCache] "); stringBuilder.append(d.E(paramSongInfo)); MLog.i("LyricLoad#ObjectCacheHelper", stringBuilder.toString()); if (paramSongInfo == null) return;  synchronized (a) { b b = new b(); this(paramSongInfo); ArrayList<b> arrayList = b; if (arrayList != null) i = arrayList.size();  while (--i >= 0) {
/* 5 */         b b1 = b.get(i); if (b1 != null && 
/* 6 */           b1.m(b))
/* 7 */           b.remove(i);  i--;
/*   */       } 
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static b b(SongInfo paramSongInfo, d paramd, boolean paramBoolean) {
/*   */     // Byte code:
/*   */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*   */     //   3: astore_3
/*   */     //   4: aload_3
/*   */     //   5: ifnull -> 62
/*   */     //   8: aload_3
/*   */     //   9: sipush #1314
/*   */     //   12: baload
/*   */     //   13: iconst_1
/*   */     //   14: ishr
/*   */     //   15: iconst_1
/*   */     //   16: iand
/*   */     //   17: ifle -> 62
/*   */     //   20: iconst_3
/*   */     //   21: anewarray java/lang/Object
/*   */     //   24: dup
/*   */     //   25: iconst_0
/*   */     //   26: aload_0
/*   */     //   27: aastore
/*   */     //   28: dup
/*   */     //   29: iconst_1
/*   */     //   30: aload_1
/*   */     //   31: aastore
/*   */     //   32: dup
/*   */     //   33: iconst_2
/*   */     //   34: iload_2
/*   */     //   35: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*   */     //   38: aastore
/*   */     //   39: aconst_null
/*   */     //   40: sipush #21714
/*   */     //   43: invokestatic proxyMoreArgs : ([Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*   */     //   46: astore_3
/*   */     //   47: aload_3
/*   */     //   48: getfield isSupported : Z
/*   */     //   51: ifeq -> 62
/*   */     //   54: aload_3
/*   */     //   55: getfield result : Ljava/lang/Object;
/*   */     //   58: checkcast com/tencent/qqmusic/business/lyricnew/load/model/b
/*   */     //   61: areturn
/*   */     //   62: new com/tencent/qqmusic/business/lyricnew/load/model/b
/*   */     //   65: dup
/*   */     //   66: aload_0
/*   */     //   67: invokespecial <init> : (Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;)V
/*   */     //   70: astore #4
/*   */     //   72: iload_2
/*   */     //   73: ifeq -> 310
/*   */     //   76: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/c.a : Ljava/lang/Object;
/*   */     //   79: astore_3
/*   */     //   80: aload_3
/*   */     //   81: monitorenter
/*   */     //   82: iconst_0
/*   */     //   83: istore #5
/*   */     //   85: iload #5
/*   */     //   87: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/c.b : Ljava/util/ArrayList;
/*   */     //   90: invokevirtual size : ()I
/*   */     //   93: if_icmpge -> 217
/*   */     //   96: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/c.b : Ljava/util/ArrayList;
/*   */     //   99: iload #5
/*   */     //   101: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   104: checkcast com/tencent/qqmusic/business/lyricnew/load/model/b
/*   */     //   107: astore #6
/*   */     //   109: aload #6
/*   */     //   111: ifnull -> 211
/*   */     //   114: aload #6
/*   */     //   116: aload #4
/*   */     //   118: invokevirtual m : (Lcom/tencent/qqmusic/business/lyricnew/load/model/b;)Z
/*   */     //   121: ifeq -> 211
/*   */     //   124: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/c.b : Ljava/util/ArrayList;
/*   */     //   127: iload #5
/*   */     //   129: invokevirtual remove : (I)Ljava/lang/Object;
/*   */     //   132: pop
/*   */     //   133: aload #6
/*   */     //   135: invokevirtual A : ()Z
/*   */     //   138: ifne -> 211
/*   */     //   141: aload #6
/*   */     //   143: invokevirtual u : ()Z
/*   */     //   146: ifeq -> 211
/*   */     //   149: aload #6
/*   */     //   151: invokevirtual y : ()Z
/*   */     //   154: ifne -> 211
/*   */     //   157: aload #6
/*   */     //   159: aload_1
/*   */     //   160: invokevirtual i : (Lcom/tencent/qqmusic/business/lyricnew/load/listener/d;)Z
/*   */     //   163: pop
/*   */     //   164: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/c.b : Ljava/util/ArrayList;
/*   */     //   167: aload #6
/*   */     //   169: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   172: pop
/*   */     //   173: new java/lang/StringBuilder
/*   */     //   176: astore_1
/*   */     //   177: aload_1
/*   */     //   178: invokespecial <init> : ()V
/*   */     //   181: aload_1
/*   */     //   182: ldc ' [getCache] hit cache:'
/*   */     //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   187: pop
/*   */     //   188: aload_1
/*   */     //   189: aload_0
/*   */     //   190: invokestatic E : (Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;)Ljava/lang/String;
/*   */     //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   196: pop
/*   */     //   197: ldc 'LyricLoad#ObjectCacheHelper'
/*   */     //   199: aload_1
/*   */     //   200: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   203: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*   */     //   206: aload_3
/*   */     //   207: monitorexit
/*   */     //   208: aload #6
/*   */     //   210: areturn
/*   */     //   211: iinc #5, 1
/*   */     //   214: goto -> 85
/*   */     //   217: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/c.b : Ljava/util/ArrayList;
/*   */     //   220: invokevirtual size : ()I
/*   */     //   223: bipush #50
/*   */     //   225: if_icmple -> 253
/*   */     //   228: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/c.b : Ljava/util/ArrayList;
/*   */     //   231: iconst_0
/*   */     //   232: invokevirtual remove : (I)Ljava/lang/Object;
/*   */     //   235: checkcast com/tencent/qqmusic/business/lyricnew/load/model/b
/*   */     //   238: astore #6
/*   */     //   240: aload #6
/*   */     //   242: ifnull -> 217
/*   */     //   245: aload #6
/*   */     //   247: invokevirtual k : ()V
/*   */     //   250: goto -> 217
/*   */     //   253: getstatic com/tencent/qqmusic/business/lyricnew/load/helper/c.b : Ljava/util/ArrayList;
/*   */     //   256: aload #4
/*   */     //   258: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   261: pop
/*   */     //   262: new java/lang/StringBuilder
/*   */     //   265: astore #6
/*   */     //   267: aload #6
/*   */     //   269: invokespecial <init> : ()V
/*   */     //   272: aload #6
/*   */     //   274: ldc ' [getCache] miss cache:'
/*   */     //   276: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   279: pop
/*   */     //   280: aload #6
/*   */     //   282: aload_0
/*   */     //   283: invokestatic E : (Lcom/tencent/qqmusicplayerprocess/songinfo/SongInfo;)Ljava/lang/String;
/*   */     //   286: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   289: pop
/*   */     //   290: ldc 'LyricLoad#ObjectCacheHelper'
/*   */     //   292: aload #6
/*   */     //   294: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   297: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*   */     //   300: aload_3
/*   */     //   301: monitorexit
/*   */     //   302: goto -> 310
/*   */     //   305: astore_0
/*   */     //   306: aload_3
/*   */     //   307: monitorexit
/*   */     //   308: aload_0
/*   */     //   309: athrow
/*   */     //   310: aload #4
/*   */     //   312: aload_1
/*   */     //   313: invokevirtual i : (Lcom/tencent/qqmusic/business/lyricnew/load/listener/d;)Z
/*   */     //   316: pop
/*   */     //   317: aload #4
/*   */     //   319: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 62
/*   */     //   #2	-> 76
/*   */     //   #3	-> 85
/*   */     //   #4	-> 96
/*   */     //   #5	-> 114
/*   */     //   #6	-> 124
/*   */     //   #7	-> 133
/*   */     //   #8	-> 157
/*   */     //   #9	-> 164
/*   */     //   #10	-> 173
/*   */     //   #11	-> 206
/*   */     //   #12	-> 217
/*   */     //   #13	-> 228
/*   */     //   #14	-> 245
/*   */     //   #15	-> 253
/*   */     //   #16	-> 262
/*   */     //   #17	-> 300
/*   */     //   #18	-> 310
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   85	96	305	finally
/*   */     //   96	109	305	finally
/*   */     //   114	124	305	finally
/*   */     //   124	133	305	finally
/*   */     //   133	157	305	finally
/*   */     //   157	164	305	finally
/*   */     //   164	173	305	finally
/*   */     //   173	206	305	finally
/*   */     //   206	208	305	finally
/*   */     //   217	228	305	finally
/*   */     //   228	240	305	finally
/*   */     //   245	250	305	finally
/*   */     //   253	262	305	finally
/*   */     //   262	300	305	finally
/*   */     //   300	302	305	finally
/*   */     //   306	308	305	finally
/*   */   }
/*   */   
/*   */   private static ArrayList<b> b = new ArrayList<b>(); }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\helper\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */