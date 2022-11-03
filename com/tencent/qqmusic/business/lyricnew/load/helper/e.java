/*  1 */ package com.tencent.qqmusic.business.lyricnew.load.helper;public class e extends a { private int h; private int i; public e(SongInfo paramSongInfo, c paramc, boolean paramBoolean, int paramInt) { super(paramSongInfo, paramc);
/*  2 */     this.k = (OnResultListener)new a(this);
/*  3 */     this.j = paramBoolean;
/*  4 */     this.i = paramInt; } private boolean j; private OnResultListener k; private l g() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1319] >> 0 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21753); if (swordProxyResult.isSupported) return (l)swordProxyResult.result;  }  return (l)v0.getInstance(17); } public String b() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1315] >> 4 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21725); if (swordProxyResult.isSupported) return (String)swordProxyResult.result;  }  if (this.a != null) { g().c0(this.h, 20); String str1 = f.k(); String str2 = a(1, this.j, str1);
/*  5 */       t t = new t(t.A);
/*  6 */       t.q(str2);
/*  7 */       t.z(3);
/*  8 */       this.i = t.a;
/*  9 */       StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(" [searchLyric] "); stringBuilder.append(str2); MLog.i("LyricLoad#Manual", stringBuilder.toString());
/* 10 */       r.n(t, this.k); }  return ""; }
/*    */    }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\helper\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */