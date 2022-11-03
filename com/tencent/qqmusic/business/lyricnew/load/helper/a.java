/*  1 */ package com.tencent.qqmusic.business.lyricnew.load.helper;public abstract class a { protected final SongInfo a; public void c(a parama) { this.b = parama; } private a b; protected c c; public abstract String b(); public String a(int paramInt, boolean paramBoolean, String paramString) { String str; byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1317] >> 3 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), paramString }, this, 21740); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  if (this.a == null) return null; 
/*  2 */     com.tencent.qqmusic.business.lyricnew.load.network.a a2 = new com.tencent.qqmusic.business.lyricnew.load.network.a();
/*  3 */     if (this.a.y3() && paramInt == 0)
/*  4 */     { a2.h(this.a.O0());
/*  5 */       a2.m(this.a.J1()); }
/*  6 */     else if (this.a.h3() && paramInt == 0)
/*  7 */     { a2.h(this.a.C0());
/*  8 */       a2.m(this.a.B0()); }
/*  9 */     else { long l = this.a.y0(); if (l > 0L)
/* 10 */       { a2.d(l); }
/* 11 */       else { str = this.a.F0(); if (str != null && 
/* 12 */           str.length() > 5)
/* 13 */         { l = e.a(str); if (l > 0L)
/* 14 */             a2.d(l);  }  }
/* 15 */        a2.e(d.p(this.a));
/* 16 */       a2.f(d.j(this.a));
/* 17 */       a2.m(this.a.J1()); }
/* 18 */      a2.b(this.g);
/* 19 */     a a1 = this.b; if (a1 != null && !TextUtils.isEmpty(a1.a))
/* 20 */     { a2.i(this.b.a); }
/* 21 */     else { a2.i(this.a.g1()); }
/* 22 */      a1 = this.b; if (a1 != null && !TextUtils.isEmpty(a1.b))
/* 23 */     { str = this.b.b; }
/* 24 */     else { str = this.a.L1(); }
/* 25 */      if (f.j(str))
/* 26 */       a2.l(str);  if (paramInt == 0)
/* 27 */     { str = this.a.j0();
/* 28 */       if (f.j(str))
/* 29 */         a2.a(str);  }  if (paramString != null)
/* 30 */       a2.k(paramString); 
/* 31 */     a2.g(paramBoolean);
/* 32 */     a2.c(paramInt); if (paramInt != 0) { if (paramInt != 1)
/* 33 */       { a2.j(5); }
/* 34 */       else { a2.j(5); }  }
/* 35 */     else { a2.j(1); }
/* 36 */      return a2.getRequestXml(); }
/*    */ 
/*    */   
/*    */   public static class a {
/*    */     public String a;
/*    */     public String b;
/*    */   }
/*    */   protected long d = 0L;
/*    */   protected String e = null;
/*    */   protected long f;
/*    */   protected b.a g;
/*    */   
/*    */   public a(SongInfo paramSongInfo, c paramc) {
/*    */     long l = -1L;
/*    */     this.f = -1L;
/*    */     this.g = null;
/*    */     this.a = paramSongInfo;
/*    */     this.c = paramc;
/*    */     if (paramSongInfo != null) {
/*    */       if (paramSongInfo.y3())
/*    */         l = paramSongInfo.O0(); 
/*    */       this.f = l;
/*    */     } 
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\helper\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */