/* 1 */ package com.tencent.qqmusic.business.lyricnew.desklyric.permission;public class d extends c { public boolean b() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1276] >> 3 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21412); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  if (Build.VERSION.SDK_INT >= 24) {
/* 2 */       MLog.i("FloatWinOp@OpManager", "checkPermissionGranted: SDK_INT > N(24) return TYPE_PHONE");
/* 3 */       return a();
/* 4 */     }  MLog.i("FloatWinOp@OpManager", "checkPermissionGranted: return true");
/* 5 */     return a.a(MusicApplication.getContext()); }
/*   */ 
/*   */   
/*   */   public int f() {
/*   */     char c1;
/*   */     if (Build.VERSION.SDK_INT >= 26) {
/*   */       c1 = '߶';
/*   */     } else {
/*   */       c1 = 'ߒ';
/*   */     } 
/*   */     return c1;
/*   */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\desklyric\permission\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */