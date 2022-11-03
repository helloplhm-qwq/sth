/*    */ package com.tencent.qqmusic.business.lyricnew.desklyric.permission;
/*  2 */ public class e extends c { b d; public e(b paramb) { this.d = null;
/*  3 */     this.d = paramb; } public boolean b() { int i = Build.VERSION.SDK_INT; byte[] arrayOfByte = SwordSwitches.switches2; boolean bool1 = true, bool2 = true; if (arrayOfByte != null && (arrayOfByte[1289] >> 3 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21516); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  boolean bool3 = bool1; try { int j = this.d.i; if (j < 0) { bool3 = bool1; super.b(); bool1 = bool2; } else if (j > 0) { if (i >= 24) { bool3 = bool1; MLog.i("FloatWinOp@OpManager", "checkPermissionGranted: SDK_INT > N(24) return TYPE_PHONE");
/*  4 */           bool3 = bool1; bool1 = a(); }
/*  5 */         else { bool3 = bool1; MLog.i("FloatWinOp@OpManager", "goto special judge");
/*  6 */           bool3 = bool1; return a.a(MusicApplication.getContext()); }  } else if (i >= 24)
/*  7 */       { bool3 = bool1; MLog.i("FloatWinOp@OpManager", "uniteconfig give true"); bool1 = bool2; }
/*    */       else
/*  9 */       { bool3 = bool1; MLog.i("FloatWinOp@OpManager", "goto special judge");
/* 10 */         bool3 = bool1; return a.a(MusicApplication.getContext()); }  bool3 = bool1; StringBuilder stringBuilder = new StringBuilder(); bool3 = bool1; this(); bool3 = bool1; stringBuilder.append(" [checkPermissionGranted] "); bool3 = bool1; stringBuilder.append(bool1); bool3 = bool1; MLog.i("FloatWinOp@OpManager", stringBuilder.toString()); } catch (Exception exception)
/* 11 */     { MLog.e("FloatWinOp@OpManager", exception); bool1 = bool3; }  return bool1; }
/*    */ 
/*    */   
/*    */   public boolean d() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     boolean bool = true;
/*    */     if (arrayOfByte != null && (arrayOfByte[1287] >> 2 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21499);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     if (com.tencent.qqmusic.sharedfileaccessor.e.c().getBoolean("KEY_FLOAT_WIN_DIALOG_FORCE_DISABLE", false)) {
/*    */       MLog.i("FloatWinOp@OpManager", " [forceShowGuide] disabled.");
/*    */       return false;
/*    */     } 
/*    */     b b1 = this.d;
/*    */     if (b1 != null) {
/*    */       if (b1.j != 1)
/*    */         bool = false; 
/*    */       return bool;
/*    */     } 
/*    */     return super.d();
/*    */   }
/*    */   
/*    */   public int f() {
/*    */     int i;
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1284] >> 3 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21476);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Integer)swordProxyResult.result).intValue(); 
/*    */     } 
/*    */     if ("TypePhone".equals(this.d.h)) {
/*    */       if (Build.VERSION.SDK_INT >= 26) {
/*    */         i = 2038;
/*    */       } else {
/*    */         i = 2002;
/*    */       } 
/*    */     } else if ("TypeToast".equals(this.d.h)) {
/*    */       i = 2005;
/*    */     } else {
/*    */       i = super.f();
/*    */     } 
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(" [getFloatWinType] ");
/*    */     stringBuilder.append(i);
/*    */     MLog.i("FloatWinOp@OpManager", stringBuilder.toString());
/*    */     return i;
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\desklyric\permission\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */