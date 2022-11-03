/* 1 */ package com.tencent.qqmusic.business.lyricnew;public class d { public static void a(b paramb) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1321] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramb, null, 21769)).isSupported) return;  if (paramb.a == 30) { CopyOnWriteArrayList copyOnWriteArrayList = paramb.b; if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0)
/* 2 */       { j j = new j();
/* 3 */         j.a = Resource.m(2131829300);
/* 4 */         paramb.b.add(0, j);
/* 5 */         j = new j();
/* 6 */         j.a = "------------------------";
/* 7 */         paramb.b.add(1, j); }  }  } public static b c(String paramString) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1316] >> 4 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, null, 21733); if (swordProxyResult.isSupported) return (b)swordProxyResult.result;  }  b b = new b(30, 0, null); j j = new j(); j.b = 0L; j.c = 9999L; j.a = paramString; if (b.b == null) b.b = new CopyOnWriteArrayList(); 
/* 8 */     b.b.add(j); return b; }
/*   */ 
/*   */   
/*   */   public static b b(int paramInt) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1318] >> 4 & 0x1) > 0) {
/*   */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(Integer.valueOf(paramInt), null, 21749);
/*   */       if (swordProxyResult.isSupported)
/*   */         return (b)swordProxyResult.result; 
/*   */     } 
/*   */     return c(Resource.m(paramInt));
/*   */   }
/*   */   
/*   */   public static boolean d(b paramb) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     null = true;
/*   */     if (arrayOfByte != null && (arrayOfByte[1321] >> 7 & 0x1) > 0) {
/*   */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramb, null, 21776);
/*   */       if (swordProxyResult.isSupported)
/*   */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*   */     } 
/*   */     if (paramb != null) {
/*   */       CopyOnWriteArrayList copyOnWriteArrayList = paramb.b;
/*   */       if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() == 1) {
/*   */         copyOnWriteArrayList = paramb.b;
/*   */         if (((j)copyOnWriteArrayList.get(0)).a != null) {
/*   */           CopyOnWriteArrayList copyOnWriteArrayList1 = paramb.b;
/*   */           if (((j)copyOnWriteArrayList1.get(0)).a.contains(Resource.m(2131827145)))
/*   */             return null; 
/*   */         } 
/*   */       } 
/*   */     } 
/*   */     return false;
/*   */   }
/*   */   
/*   */   public static boolean e(b paramb) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     null = true;
/*   */     if (arrayOfByte != null && (arrayOfByte[1319] >> 6 & 0x1) > 0) {
/*   */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramb, null, 21759);
/*   */       if (swordProxyResult.isSupported)
/*   */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*   */     } 
/*   */     if (paramb.a == 30) {
/*   */       CopyOnWriteArrayList copyOnWriteArrayList = paramb.b;
/*   */       if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0)
/*   */         return null; 
/*   */     } 
/*   */     return false;
/*   */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */