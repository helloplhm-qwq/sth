/* 1 */ package com.tencent.qqmusic.business.lyricnew;public class c implements a { public float a() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1283] >> 5 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21470); if (swordProxyResult.isSupported) return ((Float)swordProxyResult.result).floatValue();  }  return y.b(); } public int b() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1280] >> 4 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21445); if (swordProxyResult.isSupported) return ((Integer)swordProxyResult.result).intValue();  }  l l = l.K();
/* 2 */     return l.J(); }
/*   */ 
/*   */   
/*   */   public boolean c() {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1282] >> 3 & 0x1) > 0) {
/*   */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21460);
/*   */       if (swordProxyResult.isSupported)
/*   */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*   */     } 
/*   */     return e.l();
/*   */   }
/*   */   
/*   */   public int getWidth() {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1284] >> 6 & 0x1) > 0) {
/*   */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21479);
/*   */       if (swordProxyResult.isSupported)
/*   */         return ((Integer)swordProxyResult.result).intValue(); 
/*   */     } 
/*   */     return y.i();
/*   */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */