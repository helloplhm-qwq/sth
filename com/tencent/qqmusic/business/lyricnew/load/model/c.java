/* 1 */ package com.tencent.qqmusic.business.lyricnew.load.model;public class c extends a { private ArrayList<a> l; private b m; public c(SongInfo paramSongInfo) { super(paramSongInfo);
/* 2 */     this.l = new ArrayList<a>(); } public void u(int paramInt1, int paramInt2) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1292] >> 3 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }, this, 21540)).isSupported) return;  try { StringBuilder stringBuilder = new StringBuilder(); this(); stringBuilder.append(" [stateChanged] state "); stringBuilder.append(paramInt1); stringBuilder.append(" subState "); stringBuilder.append(paramInt2); MLog.i("SimpleLyricLoader", stringBuilder.toString()); if (paramInt1 != 30 && paramInt1 != 60) { if (paramInt1 == 70) for (a a1 : this.l)
/* 3 */             a1.m(this);   }
/* 4 */       else { for (a a1 : this.l)
/* 5 */           a1.h(this);  }  } catch (Exception exception)
/* 6 */     { MLog.e("SimpleLyricLoader", exception); }
/* 7 */      try { b b1 = this.m; if (b1 != null)
/* 8 */         b1.a(this, paramInt1, paramInt2);  } catch (Exception exception)
/* 9 */     { MLog.e("SimpleLyricLoader", exception); }
/*   */      }
/*   */ 
/*   */   
/*   */   public void v(a parama) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1297] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(parama, this, 21578)).isSupported)
/*   */       return; 
/*   */     if (!this.l.contains(parama) && parama != null)
/*   */       this.l.add(parama); 
/*   */   }
/*   */   
/*   */   public void w(a parama) {
/*   */     byte[] arrayOfByte = SwordSwitches.switches2;
/*   */     if (arrayOfByte != null && (arrayOfByte[1301] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(parama, this, 21609)).isSupported)
/*   */       return; 
/*   */     if (this.l.contains(parama))
/*   */       this.l.remove(parama); 
/*   */   }
/*   */   
/*   */   public void x(SongInfo paramSongInfo) {
/*   */     this.b = paramSongInfo;
/*   */     this.e = 0;
/*   */   }
/*   */   
/*   */   public void y(b paramb) {
/*   */     this.m = paramb;
/*   */   }
/*   */   
/*   */   public c(SongInfo paramSongInfo, boolean paramBoolean) {
/*   */     super(paramSongInfo, paramBoolean);
/*   */     this.l = new ArrayList<a>();
/*   */   }
/*   */   
/*   */   class a {
/*   */     public abstract void h(c param1c);
/*   */     
/*   */     public abstract void m(c param1c);
/*   */   }
/*   */   
/*   */   class b {
/*   */     public abstract void a(c param1c, int param1Int1, int param1Int2);
/*   */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */