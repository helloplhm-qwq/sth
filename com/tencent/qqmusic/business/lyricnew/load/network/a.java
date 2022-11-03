/*   */ package com.tencent.qqmusic.business.lyricnew.load.network;
/* 2 */ public class a extends i { public a() { addRequestXml("cid", 111);
/* 3 */     if (r.h() == null)
/* 4 */       return;  addRequestXml("gt", 1);
/* 5 */     addRequestXml("crypt", 0);
/* 6 */     addRequestXml("qrc", 1);
/* 7 */     addRequestXml("trans", 1);
/* 8 */     addRequestXml("roma", 1); } public void b(b.a parama) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1289] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(parama, this, 21520)).isSupported) return;  if (parama != null) { addRequestXml("lrc_t", parama.d); addRequestXml("qrc_t", parama.e); addRequestXml("trans_t", parama.f); addRequestXml("roma_t", parama.g); } else { addRequestXml("lrc_t", 0); addRequestXml("qrc_t", 0); addRequestXml("trans_t", 0); addRequestXml("roma_t", 0); }
/*   */      }
/*   */ 
/*   */   
/*   */   public void a(String paramString) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1296] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramString, this, 21573)).isSupported)
/*   */       return; 
/*   */     addRequestXml("album", paramString, true);
/*   */   }
/*   */   
/*   */   public void c(int paramInt) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1303] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(Integer.valueOf(paramInt), this, 21625)).isSupported)
/*   */       return; 
/*   */     addRequestXml("cmd", paramInt);
/*   */   }
/*   */   
/*   */   public void d(long paramLong) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1301] >> 3 & 0x1) > 0 && (SwordProxy.proxyOneArg(Long.valueOf(paramLong), this, 21612)).isSupported)
/*   */       return; 
/*   */     addRequestXml("duration", paramLong / 1000L);
/*   */   }
/*   */   
/*   */   public void e(String paramString) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1299] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramString, this, 21593)).isSupported)
/*   */       return; 
/*   */     if (paramString == null)
/*   */       paramString = ""; 
/*   */     addRequestXml("filepath", paramString, true);
/*   */   }
/*   */   
/*   */   public void f(String paramString) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1297] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramString, this, 21581)).isSupported)
/*   */       return; 
/*   */     addRequestXml("filename", paramString, true);
/*   */   }
/*   */   
/*   */   public void g(int paramInt) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1305] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(Integer.valueOf(paramInt), this, 21641)).isSupported)
/*   */       return; 
/*   */     addRequestXml("modify", paramInt);
/*   */   }
/*   */   
/*   */   public void h(long paramLong) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1292] >> 4 & 0x1) > 0 && (SwordProxy.proxyOneArg(Long.valueOf(paramLong), this, 21541)).isSupported)
/*   */       return; 
/*   */     addRequestXml("gl", paramLong);
/*   */   }
/*   */   
/*   */   public void i(String paramString) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1293] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramString, this, 21552)).isSupported)
/*   */       return; 
/*   */     addRequestXml("music", paramString, true);
/*   */   }
/*   */   
/*   */   public void j(int paramInt) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1306] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(Integer.valueOf(paramInt), this, 21651)).isSupported)
/*   */       return; 
/*   */     addRequestXml("num", paramInt);
/*   */   }
/*   */   
/*   */   public void k(String paramString) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1307] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramString, this, 21663)).isSupported)
/*   */       return; 
/*   */     addRequestXml("searchid", paramString, false);
/*   */   }
/*   */   
/*   */   public void l(String paramString) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1295] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramString, this, 21563)).isSupported)
/*   */       return; 
/*   */     addRequestXml("singer", paramString, true);
/*   */   }
/*   */   
/*   */   public void m(int paramInt) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1308] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(Integer.valueOf(paramInt), this, 21672)).isSupported)
/*   */       return; 
/*   */     addRequestXml("type", paramInt);
/*   */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\network\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */