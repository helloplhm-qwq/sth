/*  1 */ package com.tencent.qqmusic.business.lyricnew.desklyric;public class d { private static d a; public static d b() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1282] >> 2 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, null, 21459); if (swordProxyResult.isSupported) return (d)swordProxyResult.result;  }  if (a == null)
/*  2 */       a = new d(); 
/*  3 */     return a; } public void a(Context paramContext, boolean paramBoolean) { // Byte code:
/*    */     //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches2 : [B
/*    */     //   3: astore_3
/*    */     //   4: aload_3
/*    */     //   5: ifnull -> 49
/*    */     //   8: aload_3
/*    */     //   9: sipush #1293
/*    */     //   12: baload
/*    */     //   13: iconst_0
/*    */     //   14: ishr
/*    */     //   15: iconst_1
/*    */     //   16: iand
/*    */     //   17: ifle -> 49
/*    */     //   20: iconst_2
/*    */     //   21: anewarray java/lang/Object
/*    */     //   24: dup
/*    */     //   25: iconst_0
/*    */     //   26: aload_1
/*    */     //   27: aastore
/*    */     //   28: dup
/*    */     //   29: iconst_1
/*    */     //   30: iload_2
/*    */     //   31: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   34: aastore
/*    */     //   35: aload_0
/*    */     //   36: sipush #21545
/*    */     //   39: invokestatic proxyMoreArgs : ([Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
/*    */     //   42: getfield isSupported : Z
/*    */     //   45: ifeq -> 49
/*    */     //   48: return
/*    */     //   49: iload_2
/*    */     //   50: ifeq -> 72
/*    */     //   53: aload_1
/*    */     //   54: invokevirtual getResources : ()Landroid/content/res/Resources;
/*    */     //   57: ldc 2131829502
/*    */     //   59: invokevirtual getString : (I)Ljava/lang/String;
/*    */     //   62: astore_3
/*    */     //   63: aload_1
/*    */     //   64: iconst_0
/*    */     //   65: aload_3
/*    */     //   66: invokestatic C : (Landroid/content/Context;ILjava/lang/String;)V
/*    */     //   69: goto -> 79
/*    */     //   72: aload_1
/*    */     //   73: iconst_0
/*    */     //   74: ldc 2131829502
/*    */     //   76: invokestatic b : (Landroid/content/Context;II)V
/*    */     //   79: invokestatic d : ()Z
/*    */     //   82: ifeq -> 103
/*    */     //   85: ldc 'DeskLyric#MainProcessHelper'
/*    */     //   87: ldc ' [closeDeskLyric] sService.closeDeskLyric()'
/*    */     //   89: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   92: getstatic com/tencent/qqmusicplayerprocess/servicenew/b0.a : Lcom/tencent/qqmusicplayerprocess/servicenew/IQQPlayerServiceNew;
/*    */     //   95: invokeinterface closeDeskLyric : ()V
/*    */     //   100: goto -> 151
/*    */     //   103: ldc 'DeskLyric#MainProcessHelper'
/*    */     //   105: ldc '[closeDeskLyric] sService not open.'
/*    */     //   107: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   110: goto -> 151
/*    */     //   113: astore_1
/*    */     //   114: aload_1
/*    */     //   115: invokevirtual printStackTrace : ()V
/*    */     //   118: new java/lang/StringBuilder
/*    */     //   121: dup
/*    */     //   122: invokespecial <init> : ()V
/*    */     //   125: astore_3
/*    */     //   126: aload_3
/*    */     //   127: ldc '[closeDeskLyric] '
/*    */     //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   132: pop
/*    */     //   133: aload_3
/*    */     //   134: aload_1
/*    */     //   135: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   141: pop
/*    */     //   142: ldc 'DeskLyric#MainProcessHelper'
/*    */     //   144: aload_3
/*    */     //   145: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   148: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   151: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 53
/*    */     //   #2	-> 63
/*    */     //   #3	-> 72
/*    */     //   #4	-> 79
/*    */     //   #5	-> 85
/*    */     //   #6	-> 92
/*    */     //   #7	-> 103
/*    */     //   #8	-> 114
/*    */     //   #9	-> 118
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   53	63	113	java/lang/Exception
/*    */     //   63	69	113	java/lang/Exception
/*    */     //   72	79	113	java/lang/Exception
/*    */     //   79	85	113	java/lang/Exception
/*    */     //   85	92	113	java/lang/Exception
/*    */     //   92	100	113	java/lang/Exception
/*  3 */     //   103	110	113	java/lang/Exception } public void d() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1296] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21570)).isSupported) return;  try { if (b0.d()) { MLog.i("DeskLyric#MainProcessHelper", " [lockDeskLyric] sService.lockDeskLyric()"); b0.a.lockDeskLyric(); }
/*  4 */       else { MLog.e("DeskLyric#MainProcessHelper", "[lockDeskLyric] sService not open."); }  } catch (Exception exception)
/*  5 */     { exception.printStackTrace();
/*  6 */       StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("[lockDeskLyric] "); stringBuilder.append(exception.toString()); MLog.e("DeskLyric#MainProcessHelper", stringBuilder.toString()); }
/*    */      }
/*    */   public void c() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1286] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21496)).isSupported)
/*    */       return;  y1.a(new b()); } public boolean e(Activity paramActivity, boolean paramBoolean) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1288] >> 0 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramActivity, Boolean.valueOf(paramBoolean) }, this, 21505);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     if (paramActivity == null)
/*    */       try {
/*    */         MLog.i("DeskLyric#MainProcessHelper", " [openDeskLyric] activity null return false");
/*    */         return false;
/* 18 */       } catch (Exception exception) {
/* 19 */         exception.printStackTrace();
/* 20 */         StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("[openDeskLyric] "); stringBuilder.append(exception.toString()); MLog.e("DeskLyric#MainProcessHelper", stringBuilder.toString()); return false;
/*    */       }  
/*    */     if (!c.g().b()) {
/*    */       MLog.i("DeskLyric#MainProcessHelper", " [openDeskLyric] no permission return and show guide dialog.");
/*    */       Intent intent = new Intent();
/*    */       this((Context)exception, DeskHomeDialogActivity.class);
/*    */       intent.addFlags(268435456);
/*    */       exception.startActivity(intent);
/*    */       return false;
/*    */     } 
/*    */     if (c.g().d()) {
/*    */       MLog.i("DeskLyric#MainProcessHelper", " [openDeskLyric] force show guide dialog.");
/*    */       Intent intent = new Intent();
/*    */       this((Context)exception, DeskHomeDialogActivity.class);
/*    */       intent.addFlags(268435456);
/*    */       exception.startActivity(intent);
/*    */     } 
/*    */     if (paramBoolean && exception != null) {
/*    */       String str = exception.getResources().getString(2131829503);
/*    */       BannerTips.C((Context)exception, 0, str);
/*    */     } else {
/*    */       q.b((Context)exception, 0, 2131829503);
/*    */     } 
/*    */     if (b0.d()) {
/*    */       MLog.i("DeskLyric#MainProcessHelper", " [openDeskLyric] sService.openDeskLyric().");
/*    */       b0.a.openDeskLyric();
/*    */     } else {
/*    */       MLog.e("DeskLyric#MainProcessHelper", "[openDeskLyric] sService not open.");
/*    */     } 
/*    */     return true; }
/*    */ 
/*    */   
/*    */   public void f() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1285] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21484)).isSupported)
/*    */       return; 
/*    */     y1.a(new a());
/*    */   }
/*    */   
/*    */   public void g() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1298] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21591)).isSupported)
/*    */       return; 
/*    */     try {
/*    */       if (b0.d()) {
/*    */         MLog.i("DeskLyric#MainProcessHelper", " [unlockDeskLyric] sService.unlockDeskLyric()");
/*    */         b0.a.unlockDeskLyric();
/*    */       } else {
/*    */         MLog.e("DeskLyric#MainProcessHelper", "[unlockDeskLyric] sService not open.");
/*    */       } 
/*    */     } catch (Exception exception) {
/*    */       exception.printStackTrace();
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append("[unlockDeskLyric] ");
/*    */       stringBuilder.append(exception.toString());
/*    */       MLog.e("DeskLyric#MainProcessHelper", stringBuilder.toString());
/*    */     } 
/*    */   }
/*    */   
/*    */   class a implements Runnable {
/*    */     final d this$0;
/*    */     
/*    */     public void run() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1280] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21447)).isSupported)
/*    */         return; 
/*    */       try {
/*    */         if (b0.d()) {
/*    */           MLog.i("DeskLyric#MainProcessHelper", " [showDeskLyric] sService.showDeskLyric()");
/*    */           b0.a.showDeskLyric();
/*    */         } else {
/*    */           MLog.e("DeskLyric#MainProcessHelper", "[showDeskLyric] sService not open.");
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         StringBuilder stringBuilder = new StringBuilder();
/*    */         stringBuilder.append("[showDeskLyric] ");
/*    */         stringBuilder.append(exception.toString());
/*    */         MLog.e("DeskLyric#MainProcessHelper", stringBuilder.toString());
/*    */         exception.printStackTrace();
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   class b implements Runnable {
/*    */     final d this$0;
/*    */     
/*    */     public void run() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1260] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21288)).isSupported)
/*    */         return; 
/*    */       h0.b(new a(this));
/*    */     }
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\desklyric\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */