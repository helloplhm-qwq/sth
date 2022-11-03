/*  1 */ package com.tencent.qqmusic.business.lyricnew.load.helper;public class b extends a { private boolean h; private boolean i; public b(SongInfo paramSongInfo, c paramc) { super(paramSongInfo, paramc);
/*  2 */     this.h = false;
/*  3 */     this.i = false;
/*  4 */     this.j = false;
/*  5 */     this.k = false;
/*  6 */     this.l = (OnResultListener)new a(this); } private boolean j; private boolean k; private OnResultListener l; private void k(int paramInt) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1320] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(Integer.valueOf(paramInt), this, 21762)).isSupported) return;  if (i0.j()) { String str = a(0, false, this.e); t t = new t(t.A); t.q(str); t.z(paramInt); this.d = System.currentTimeMillis();
/*  7 */       StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(" [searchById3] "); stringBuilder.append(str); MLog.i("LyricLoad#Auto", stringBuilder.toString());
/*  8 */       r.n(t, this.l); }
/*  9 */     else { MLog.i("LyricLoad#Auto", "no network");
/* 10 */       c c = this.c; if (c != null)
/* 11 */         c.i(11, this.h, this.i, this.j, null);  }
/*    */      }
/*    */ 
/*    */   
/*    */   public String b() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1317] >> 6 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21743);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     if (this.a != null) {
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       stringBuilder.append(" [searchLyric] ");
/*    */       stringBuilder.append(d.E(this.a));
/*    */       MLog.i("LyricLoad#Auto", stringBuilder.toString());
/*    */       this.e = f.k();
/*    */       k(2);
/*    */       return this.e;
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public void l(boolean paramBoolean, com.tencent.qqmusic.business.lyricnew.config.b.a parama) {
/*    */     this.k = paramBoolean;
/*    */     this.g = parama;
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\helper\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */