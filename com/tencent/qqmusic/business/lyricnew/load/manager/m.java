/*  1 */ package com.tencent.qqmusic.business.lyricnew.load.manager;public class m { private boolean b(SongInfo paramSongInfo, com.tencent.qqmusic.business.lyricnew.load.model.a parama) { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1319] >> 5 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { paramSongInfo, parama }, this, 21758); if (swordProxyResult.isSupported) return ((Boolean)swordProxyResult.result).booleanValue();  }  if (parama == null) return true;  if (parama.h() == 80) return true;  if (paramSongInfo == null)
/*  2 */       return !(parama.b == null); 
/*  3 */     SongInfo songInfo = parama.b; if (songInfo == null) return true; 
/*  4 */     return f.c(paramSongInfo, songInfo) ^ true; } public final void g(SongInfo paramSongInfo, boolean paramBoolean) { c c1; byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1300] >> 2 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramSongInfo, Boolean.valueOf(paramBoolean) }, this, 21603)).isSupported) return;  if (paramSongInfo == null) { MLog.e("LyricLoadManager", " [loadBySongInfo] song == null."); return; }  if (this.b.size() <= 0) { MLog.e("LyricLoadManager", " [loadBySongInfo] no interface return."); return; }  if (b(paramSongInfo, (com.tencent.qqmusic.business.lyricnew.load.model.a)this.a) || paramBoolean) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 10 */       c c3 = this.a; if (c3 != null)
/* 11 */         c3.e(); 
/* 12 */       this.a = c1 = new c(paramSongInfo);
/* 13 */       c1.y(this.c);
/* 14 */       this.a.k(false);
/*    */       return;
/*    */     } 
/*    */     c c2 = this.a;
/*    */     if (c2 != null) {
/*    */       c2.q();
/*    */     } else {
/*    */       this.a = c1 = new c((SongInfo)c1);
/*    */       c1.y(this.c);
/*    */       this.a.k(false);
/*    */     }  }
/*    */ 
/*    */   
/*    */   public void a(b paramb) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1305] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramb, this, 21643)).isSupported)
/*    */       return; 
/*    */     if (!this.b.contains(paramb))
/*    */       this.b.add(paramb); 
/*    */   }
/*    */   
/*    */   public void c() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1309] >> 5 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21678)).isSupported)
/*    */       return; 
/*    */     this.a = null;
/*    */     this.b.clear();
/*    */   }
/*    */   
/*    */   public final void f(SongInfo paramSongInfo) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1297] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramSongInfo, this, 21583)).isSupported)
/*    */       return; 
/*    */     g(paramSongInfo, false);
/*    */   }
/*    */   
/*    */   public void h(int paramInt) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1316] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(Integer.valueOf(paramInt), this, 21730)).isSupported)
/*    */       return; 
/*    */     try {
/*    */       ArrayList arrayList = new ArrayList();
/*    */       this((Collection)this.b);
/*    */       for (b b1 : arrayList) {
/*    */         try {
/*    */           MLog.d("LyricLoadManager", "onLoadOther 2");
/*    */           long l = System.currentTimeMillis();
/*    */           i i = new i();
/*    */           this(b1, paramInt);
/*    */           y1.e(i);
/*    */           StringBuilder stringBuilder = new StringBuilder();
/*    */           this();
/*    */           stringBuilder.append("onLoadOther 2 Total Time:");
/*    */           stringBuilder.append(System.currentTimeMillis() - l);
/*    */           stringBuilder.append("ms");
/*    */           MLog.d("LyricLoadManager", stringBuilder.toString());
/*    */         } catch (Exception exception) {
/*    */           MLog.e("LyricLoadManager", exception);
/*    */         } 
/*    */       } 
/*    */     } catch (Exception exception) {
/*    */       MLog.e("LyricLoadManager", exception);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void i(com.tencent.qqmusic.business.lyricnew.load.model.a parama, int paramInt) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1311] >> 7 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { parama, Integer.valueOf(paramInt) }, this, 21696)).isSupported)
/*    */       return; 
/*    */     try {
/*    */       b b2 = parama.f();
/*    */       b b1 = parama.j();
/*    */       b b3 = parama.g();
/*    */       ArrayList arrayList = new ArrayList();
/*    */       this((Collection)this.b);
/*    */       for (b b4 : arrayList) {
/*    */         try {
/*    */           MLog.d("LyricLoadManager", "PlayingLyricLoader");
/*    */           j j = new j();
/*    */           this(b4, b2, b1, b3, paramInt);
/*    */           y1.e(j);
/*    */           LyricInfo lyricInfo = new LyricInfo();
/*    */           this();
/*    */           lyricInfo.j(parama.b());
/*    */           a a1 = new a();
/*    */           this(this, parama, lyricInfo, b2, b4);
/*    */           y1.a(a1);
/*    */         } catch (Exception exception) {
/*    */           MLog.e("LyricLoadManager", exception);
/*    */         } 
/*    */       } 
/*    */     } catch (Exception exception) {
/*    */       MLog.e("LyricLoadManager", exception);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void j(b paramb) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1308] >> 1 & 0x1) > 0 && (SwordProxy.proxyOneArg(paramb, this, 21666)).isSupported)
/*    */       return; 
/*    */     if (this.b.contains(paramb))
/*    */       this.b.remove(paramb); 
/*    */   }
/*    */   
/*    */   class a implements Runnable {
/*    */     final com.tencent.qqmusic.business.lyricnew.load.model.a b;
/*    */     final LyricInfo c;
/*    */     final b d;
/*    */     final b e;
/*    */     final m this$0;
/*    */     
/*    */     a(com.tencent.qqmusic.business.lyricnew.load.model.a param1a, LyricInfo param1LyricInfo, b param1b, b param1b1) {}
/*    */     
/*    */     public void run() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1309] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21679)).isSupported)
/*    */         return; 
/*    */       try {
/*    */         if (this.b.c.v()) {
/*    */           this.c.k(this.d.h());
/*    */           this.c.i(this.d.v());
/*    */         } else {
/*    */           this.c.i(this.d.h());
/*    */         } 
/*    */         StringBuilder stringBuilder2 = new StringBuilder();
/*    */         this();
/*    */         stringBuilder2.append("PlayingLyricLoader >>> LYRIC INFO FROM MAIN PROCESS:");
/*    */         stringBuilder2.append(this.c.toString());
/*    */         MLog.d("LyricLoadManager", stringBuilder2.toString());
/*    */         long l = System.currentTimeMillis();
/*    */         b b1 = this.e;
/*    */         LyricInfo lyricInfo = this.c;
/*    */         h h = new h();
/*    */         this(b1, lyricInfo);
/*    */         y1.e(h);
/*    */         StringBuilder stringBuilder1 = new StringBuilder();
/*    */         this();
/*    */         stringBuilder1.append("PlayingLyricLoader Total Time:");
/*    */         stringBuilder1.append(System.currentTimeMillis() - l);
/*    */         stringBuilder1.append("ms");
/*    */         String str = stringBuilder1.toString();
/*    */         MLog.d("LyricLoadManager", str);
/*    */       } catch (Exception exception) {
/*    */         exception.printStackTrace();
/*    */       } 
/*    */     }
/*    */   }
/*    */   private c a = null;
/*    */   private final List<b> b = new ArrayList<b>();
/*    */   private c.b c = new b(this); }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\manager\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */