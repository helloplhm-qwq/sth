/* 1 */ package com.tencent.qqmusic.business.lyricnew.desklyric.permission;public class a extends a<b> { public a(String paramString) { super(paramString); } public b d(String paramString) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1275] >> 5 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, this, 21406); if (swordProxyResult.isSupported) return (b)swordProxyResult.result;  }  try { return (b)a.d.fromJson(paramString, b.class); } catch (Exception exception)
/* 2 */     { MLog.e("FloatWinOp@FloatWinOpAdapter", exception); return null; }
/*   */      }
/*   */    }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\desklyric\permission\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */