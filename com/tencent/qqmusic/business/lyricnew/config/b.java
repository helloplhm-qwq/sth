/*  1 */ package com.tencent.qqmusic.business.lyricnew.config;public class b { private static final Gson a = new Gson(); public static a a(SongInfo paramSongInfo) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1317] >> 7 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramSongInfo, null, 21744); if (swordProxyResult.isSupported) return (a)swordProxyResult.result;  }  if (paramSongInfo != null) try { String str = a.b(paramSongInfo);
/*  2 */         byte[] arrayOfByte1 = Util4File.t(str); if (arrayOfByte1 != null)
/*  3 */         { str = new String(); this(arrayOfByte1);
/*  4 */           StringBuilder stringBuilder = new StringBuilder(); this(); stringBuilder.append(" [load] "); stringBuilder.append(str); stringBuilder.append(" "); stringBuilder.append(d.E(paramSongInfo)); MLog.i("LyricFileUtil", stringBuilder.toString());
/*  5 */           return (a)a.fromJson(str, a.class); }  } catch (Exception exception)
/*  6 */       { MLog.e("LyricFileUtil", exception); }   return null; } public static boolean b(SongInfo paramSongInfo, String paramString1, boolean paramBoolean, String paramString2, String paramString3) { byte[] arrayOfByte = SwordSwitches.switches2; boolean bool1 = false, bool2 = true; if (arrayOfByte != null && (arrayOfByte[1323] >> 4 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramSongInfo, paramString1, Boolean.valueOf(paramBoolean), paramString2, paramString3 }, null, 21789); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  if (paramSongInfo == null) { MLog.i("LyricFileUtil", "[saveLyric] null songInfo"); return false; }  String str2 = paramSongInfo.g1(); String str3 = paramSongInfo.L1(); String str4 = paramSongInfo.j0(); StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("[saveLyric] "); stringBuilder.append(d.E(paramSongInfo)); stringBuilder.append(", "); String str5 = stringBuilder.toString(); boolean bool3 = bool1; if (paramString1 != null) { bool3 = bool1; if (paramString1.trim().length() > 0)
/*  7 */       { String str6, str7 = a.d(paramSongInfo.O0(), str2, str3, str4, true);
/*  8 */         String str8 = a.d(paramSongInfo.O0(), str2, str3, str4, false); if (paramBoolean) { str6 = str7; } else { str6 = str8; }  if (paramBoolean) str7 = str8; 
/*  9 */         bool3 = bool1; if (!TextUtils.isEmpty(str6)) { bool3 = bool1; if (Util4File.W(str6, paramString1.getBytes()))
/* 10 */           { StringBuilder stringBuilder1 = new StringBuilder(); stringBuilder1.append(str5); stringBuilder1.append(" savePath:"); stringBuilder1.append(str6); MLog.i("LyricFileUtil", stringBuilder1.toString());
/* 11 */             if (Util4File.p(str7))
/* 12 */             { stringBuilder1 = new StringBuilder(); stringBuilder1.append(str5); stringBuilder1.append(" deletePath:"); stringBuilder1.append(str7); MLog.i("LyricFileUtil", stringBuilder1.toString()); }  bool3 = true; }  }  }  }
/* 13 */      paramString1 = a.k(paramSongInfo.O0(), str2, str3, str4); paramBoolean = bool3; if (paramString2 != null) {
/* 14 */       paramBoolean = bool3; if (paramString2.trim().length() > 0) { paramBoolean = bool3; if (paramString1 != null)
/* 15 */         { paramBoolean = bool3; if (Util4File.W(paramString1, paramString2.getBytes()))
/* 16 */           { StringBuilder stringBuilder1 = new StringBuilder(); stringBuilder1.append(str5); stringBuilder1.append(" transPath:"); stringBuilder1.append(paramString1); MLog.i("LyricFileUtil", stringBuilder1.toString()); paramBoolean = true; }  }  } 
/* 17 */     }  String str1 = a.j(paramSongInfo.O0(), str2, str3, str4); if (paramString3 != null && 
/* 18 */       paramString3.trim().length() > 0 && str1 != null && 
/* 19 */       Util4File.W(str1, paramString3.getBytes()))
/* 20 */     { StringBuilder stringBuilder1 = new StringBuilder(); stringBuilder1.append(str5); stringBuilder1.append(" romaPath:"); stringBuilder1.append(str1); MLog.i("LyricFileUtil", stringBuilder1.toString()); paramBoolean = bool2; }  return paramBoolean; }
/*    */ 
/*    */   
/*    */   public static boolean c(SongInfo paramSongInfo, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1320] >> 2 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramSongInfo, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3), Long.valueOf(paramLong4), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) }, null, 21763);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     if (paramSongInfo == null)
/*    */       return false; 
/*    */     try {
/*    */       a a = new a();
/*    */       this();
/*    */       a.b = paramBoolean1;
/*    */       a.d = paramLong1;
/*    */       a.e = paramLong2;
/*    */       a.f = paramLong3;
/*    */       a.g = paramLong4;
/*    */       a.c = System.currentTimeMillis();
/*    */       a.a = paramBoolean2;
/*    */       String str = a.b(paramSongInfo);
/*    */       Util4File.V(str, a.toJson(a));
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       this();
/*    */       stringBuilder.append(" [saveTimestamp] ");
/*    */       stringBuilder.append(d.E(paramSongInfo));
/*    */       MLog.i("LyricFileUtil", stringBuilder.toString());
/*    */       return true;
/*    */     } catch (Exception exception) {
/*    */       MLog.e("LyricFileUtil", exception);
/*    */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static class a {
/*    */     public boolean a(long param1Long1, long param1Long2, long param1Long3, long param1Long4) {
/*    */       return (param1Long1 > this.d || param1Long2 > this.e || param1Long3 > this.f || param1Long4 > this.g);
/*    */     }
/*    */     
/*    */     public boolean b() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1318] >> 1 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21746);
/*    */         if (swordProxyResult.isSupported)
/*    */           return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */       } 
/*    */       if (this.b && System.currentTimeMillis() - this.c < 2592000000L)
/*    */         return false; 
/*    */       if (this.a && System.currentTimeMillis() - this.c < 2592000000L)
/*    */         return false; 
/*    */       return !(System.currentTimeMillis() - this.c < 3600000L);
/*    */     }
/*    */     
/*    */     @SerializedName("isClassic")
/*    */     public boolean a = false;
/*    */     @SerializedName("manual")
/*    */     public boolean b = false;
/*    */     @SerializedName("saving_t")
/*    */     public long c = 0L;
/*    */     @SerializedName("lrc_t")
/*    */     public long d = 0L;
/*    */     @SerializedName("qrc_t")
/*    */     public long e = 0L;
/*    */     @SerializedName("trans_t")
/*    */     public long f = 0L;
/*    */     @SerializedName("roma_t")
/*    */     public long g = 0L;
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\config\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */