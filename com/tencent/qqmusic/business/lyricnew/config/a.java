/*  1 */ package com.tencent.qqmusic.business.lyricnew.config;public class a { private static String a(long paramLong, String paramString1, String paramString2, String paramString3) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1344] >> 4 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { Long.valueOf(paramLong), paramString1, paramString2, paramString3 }, null, 21957); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  StringBuffer stringBuffer = new StringBuffer(); if (paramLong > 0L)
/*  2 */       stringBuffer.append(paramLong);  if (paramString1 != null && 
/*  3 */       paramString1.length() > 0)
/*  4 */       stringBuffer.append(paramString1);  if (paramString2 != null && 
/*  5 */       paramString2.length() > 0)
/*  6 */     { stringBuffer.append("-");
/*  7 */       stringBuffer.append(paramString2); }  if (paramString3 != null && 
/*  8 */       paramString3.length() > 0) {
/*  9 */       stringBuffer.append("-");
/* 10 */       stringBuffer.append(paramString3);
/* 11 */     }  return String.valueOf(stringBuffer.toString().hashCode()); }
/*    */ 
/*    */   
/*    */   public static String b(SongInfo paramSongInfo) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1333] >> 5 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramSongInfo, null, 21870);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     return (paramSongInfo == null) ? null : c(paramSongInfo.O0(), paramSongInfo.g1(), paramSongInfo.L1(), paramSongInfo.j0(), ".ex");
/*    */   }
/*    */   
/*    */   private static String c(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1340] >> 5 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { Long.valueOf(paramLong), paramString1, paramString2, paramString3, paramString4 }, null, 21926);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     paramString2 = a(paramLong, paramString1, paramString2, paramString3);
/*    */     StringBuffer stringBuffer = new StringBuffer();
/*    */     stringBuffer.append(o.k(g.l));
/*    */     stringBuffer.append(paramString2);
/*    */     stringBuffer.append(paramString4);
/*    */     return stringBuffer.toString();
/*    */   }
/*    */   
/*    */   public static String d(long paramLong, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/*    */     String str;
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1329] >> 5 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { Long.valueOf(paramLong), paramString1, paramString2, paramString3, Boolean.valueOf(paramBoolean) }, null, 21838);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     if (paramBoolean) {
/*    */       str = ".qrc";
/*    */     } else {
/*    */       str = ".lrc";
/*    */     } 
/*    */     return c(paramLong, paramString1, paramString2, paramString3, str);
/*    */   }
/*    */   
/*    */   public static String e(SongInfo paramSongInfo, boolean paramBoolean) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1335] >> 5 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramSongInfo, Boolean.valueOf(paramBoolean) }, null, 21886);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     return (paramSongInfo == null) ? null : d(paramSongInfo.O0(), paramSongInfo.g1(), paramSongInfo.L1(), paramSongInfo.j0(), paramBoolean);
/*    */   }
/*    */   
/*    */   public static String f(SongInfo paramSongInfo) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1331] >> 7 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramSongInfo, null, 21856);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     return (paramSongInfo == null) ? null : c(paramSongInfo.O0(), paramSongInfo.g1(), paramSongInfo.L1(), paramSongInfo.j0(), ".off");
/*    */   }
/*    */   
/*    */   public static String g(String paramString) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1323] >> 6 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, null, 21791);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     if (paramString != null && paramString.length() > 0) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(o.k(g.b));
/*    */       stringBuilder.append(paramString);
/*    */       stringBuilder.append(".lrc");
/*    */       return stringBuilder.toString();
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public static String h(String paramString) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1321] >> 3 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, null, 21772);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     if (paramString != null && paramString.length() > 0) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(o.k(g.b));
/*    */       stringBuilder.append(paramString);
/*    */       stringBuilder.append(".qrc");
/*    */       return stringBuilder.toString();
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public static String i(SongInfo paramSongInfo) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1339] >> 3 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramSongInfo, null, 21916);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     return (paramSongInfo == null) ? null : c(paramSongInfo.O0(), paramSongInfo.g1(), paramSongInfo.L1(), paramSongInfo.j0(), ".producer");
/*    */   }
/*    */   
/*    */   public static String j(long paramLong, String paramString1, String paramString2, String paramString3) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1337] >> 6 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { Long.valueOf(paramLong), paramString1, paramString2, paramString3 }, null, 21903);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     return c(paramLong, paramString1, paramString2, paramString3, ".romaqrc");
/*    */   }
/*    */   
/*    */   public static String k(long paramLong, String paramString1, String paramString2, String paramString3) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1336] >> 4 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { Long.valueOf(paramLong), paramString1, paramString2, paramString3 }, null, 21893);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     return c(paramLong, paramString1, paramString2, paramString3, ".translrc");
/*    */   }
/*    */   
/*    */   public static String l(String paramString) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1325] >> 5 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, null, 21806);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     if (paramString != null && paramString.length() > 0) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(o.k(g.j));
/*    */       stringBuilder.append(paramString);
/*    */       stringBuilder.append(".lrc");
/*    */       return stringBuilder.toString();
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public static String m(String paramString) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1327] >> 0 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, null, 21817);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     if (paramString != null && paramString.length() > 0) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(o.k(g.j));
/*    */       stringBuilder.append(paramString);
/*    */       stringBuilder.append(".lrc");
/*    */       return stringBuilder.toString();
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public static String n(String paramString) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1328] >> 2 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, null, 21827);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     if (paramString != null && paramString.length() > 0) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(o.k(g.j));
/*    */       stringBuilder.append(paramString);
/*    */       stringBuilder.append(".lrc");
/*    */       return stringBuilder.toString();
/*    */     } 
/*    */     return null;
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\config\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */