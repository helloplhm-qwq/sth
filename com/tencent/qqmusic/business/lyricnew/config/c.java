/*  1 */ package com.tencent.qqmusic.business.lyricnew.config;public class c { private static String a(String paramString1, String paramString2, String paramString3) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1319] >> 1 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramString1, paramString2, paramString3 }, null, 21754); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  StringBuffer stringBuffer = new StringBuffer(); if (paramString1 != null && 
/*  2 */       paramString1.length() > 0)
/*  3 */       stringBuffer.append(paramString1);  if (paramString2 != null && 
/*  4 */       paramString2.length() > 0)
/*  5 */     { stringBuffer.append("-");
/*  6 */       stringBuffer.append(paramString2); }  if (paramString3 != null && 
/*  7 */       paramString3.length() > 0) {
/*  8 */       stringBuffer.append("-");
/*  9 */       stringBuffer.append(paramString3);
/* 10 */     }  StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(stringBuffer.toString().hashCode()); stringBuilder.append(".lrc"); return stringBuilder.toString(); }
/*    */ 
/*    */   
/*    */   private static String b(String paramString1, String paramString2) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1325] >> 6 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramString1, paramString2 }, null, 21807);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     StringBuffer stringBuffer = new StringBuffer();
/*    */     if (paramString1 != null && paramString1.length() > 0)
/*    */       stringBuffer.append(paramString1); 
/*    */     if (paramString2 != null && paramString2.length() > 0) {
/*    */       stringBuffer.append("-");
/*    */       stringBuffer.append(paramString2);
/*    */     } 
/*    */     stringBuffer.append(".lrc");
/*    */     return stringBuffer.toString();
/*    */   }
/*    */   
/*    */   public static String c(String paramString1, String paramString2) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1323] >> 5 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramString1, paramString2 }, null, 21790);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     paramString2 = b(paramString1, paramString2);
/*    */     if (paramString2 != null && paramString2.length() > 4) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(o.k(g.j));
/*    */       stringBuilder.append(paramString2);
/*    */       return stringBuilder.toString();
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public static String d(String paramString1, String paramString2, String paramString3) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1316] >> 7 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramString1, paramString2, paramString3 }, null, 21736);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     paramString1 = a(paramString1, paramString2, paramString3);
/*    */     if (paramString1 != null && paramString1.length() > 4) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(o.k(g.j));
/*    */       stringBuilder.append(paramString1);
/*    */       return stringBuilder.toString();
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public static String e(String paramString1, String paramString2, String paramString3) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1322] >> 0 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramString1, paramString2, paramString3 }, null, 21777);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     paramString1 = d(paramString1, paramString2, paramString3);
/*    */     if (paramString1 != null) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(paramString1);
/*    */       stringBuilder.append(".trans");
/*    */       return stringBuilder.toString();
/*    */     } 
/*    */     return null;
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\config\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */