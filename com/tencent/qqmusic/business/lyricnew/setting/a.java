/*  1 */ package com.tencent.qqmusic.business.lyricnew.setting;public class a { public static a a(String paramString) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1323] >> 3 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, null, 21788); if (swordProxyResult.isSupported) return (a)swordProxyResult.result;  }  Map<String, a> map = c();
/*  2 */     return map.get(paramString); } public static Map<String, a> c() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1320] >> 5 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, null, 21766); if (swordProxyResult.isSupported) return (Map<String, a>)swordProxyResult.result;  }  HashMap<Object, Object> hashMap = new HashMap<Object, Object>(); a a1 = new a();
/*  3 */     a1.a = -11933284;
/*  4 */     a1.b = -1;
/*  5 */     hashMap.put("Green", a1);
/*  6 */     a1 = new a();
/*  7 */     a1.a = -15751938;
/*  8 */     a1.b = -1;
/*  9 */     hashMap.put("LightBlue", a1);
/* 10 */     a1 = new a();
/* 11 */     a1.a = -1455536;
/* 12 */     a1.b = -1;
/* 13 */     hashMap.put("Yellow", a1);
/* 14 */     a1 = new a();
/* 15 */     a1.a = -65422;
/* 16 */     a1.b = -1;
/* 17 */     hashMap.put("Pink", a1);
/* 18 */     a1 = new a();
/* 19 */     a1.a = -34528;
/* 20 */     a1.b = -1;
/* 21 */     hashMap.put("Orange", a1);
/* 22 */     a1 = new a();
/* 23 */     a1.a = -6946561;
/* 24 */     a1.b = -1;
/* 25 */     hashMap.put("Purple", a1); return (Map)hashMap; }
/*    */ 
/*    */   
/*    */   public static String b(int paramInt) {
/*    */     switch (paramInt) {
/*    */       default:
/*    */         return "";
/*    */       case -34528:
/*    */         return "Orange";
/*    */       case -65422:
/*    */         return "Pink";
/*    */       case -1455536:
/*    */         return "Yellow";
/*    */       case -6946561:
/*    */         return "Purple";
/*    */       case -11933284:
/*    */         return "Green";
/*    */       case -15751938:
/*    */         break;
/*    */     } 
/*    */     return "LightBlue";
/*    */   }
/*    */   
/*    */   public static class a {
/*    */     public int a;
/*    */     public int b;
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\setting\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */