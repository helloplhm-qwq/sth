/*  1 */ package com.tencent.qqmusic.business.lyricnew.load.network;public class b extends j { private static final String[] b = new String[] { "root.meta.ret", "root.body.item" }; private ArrayList<a> a;
/*  2 */   public b() { this.a = new ArrayList<a>();
/*  3 */     ((h)this).reader.i(b); } public void g() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1289] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21515)).isSupported) return;  Vector<String> vector = c(); if (vector == null) return;  int i; byte b1; for (i = vector.size(), b1 = 0; b1 < i; ) { a a = new a();
/*  4 */       String str = vector.elementAt(b1);
/*  5 */       b b2 = new b();
/*  6 */       b2.parse(str);
/*  7 */       b2.getType();
/*  8 */       a.d = b2.i();
/*  9 */       a.e = b2.l();
/* 10 */       a.f = b2.r();
/* 11 */       a.g = b2.n();
/* 12 */       a.a = b2.g();
/* 13 */       a.c = b2.getSingerName();
/* 14 */       a.b = b2.p();
/* 15 */       a.l = b2.h();
/* 16 */       a.h = b2.j();
/* 17 */       a.i = b2.m();
/* 18 */       a.j = b2.s();
/* 19 */       a.k = b2.o();
/* 20 */       boolean bool = b2.t(); if (bool) {
/* 21 */         a.n = "";
/* 22 */         str = b2.e();
/* 23 */         if (!TextUtils.isEmpty(str)) {
/* 24 */           StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(str); stringBuilder.append("\n"); a.n = stringBuilder.toString();
/* 25 */         }  str = b2.c();
/* 26 */         if (!TextUtils.isEmpty(str))
/* 27 */         { StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(a.n); stringBuilder.append(str); a.n = stringBuilder.toString(); } 
/* 28 */       }  b2.k();
/* 29 */       this.a.add(a); b1++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public Vector<String> c() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1288] >> 5 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21510);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (Vector<String>)swordProxyResult.result; 
/*    */     } 
/*    */     return ((h)this).reader.b(1);
/*    */   }
/*    */   
/*    */   public ArrayList<a> e() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   public int getCode() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1287] >> 3 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21500);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Integer)swordProxyResult.result).intValue(); 
/*    */     } 
/*    */     return h.decodeInteger(((h)this).reader.c(0), 0);
/*    */   }
/*    */   
/*    */   class a {
/*    */     public String a;
/*    */     public String b;
/*    */     public String c;
/*    */     public String d;
/*    */     public String e;
/*    */     public String f;
/*    */     public String g;
/*    */     public long h;
/*    */     public long i;
/*    */     public long j;
/*    */     public long k;
/*    */     public long l;
/*    */     public boolean m;
/*    */     public String n;
/*    */     final b this$0;
/*    */   }
/*    */   
/*    */   public class b extends j {
/*    */     private final String[] a;
/*    */     final b this$0;
/*    */     
/*    */     public b() {
/*    */       String[] arrayOfString = new String[17];
/*    */       arrayOfString[0] = "song";
/*    */       arrayOfString[1] = "singer";
/*    */       arrayOfString[2] = "duration";
/*    */       arrayOfString[3] = "docid";
/*    */       arrayOfString[4] = "type";
/*    */       arrayOfString[5] = "lrc";
/*    */       arrayOfString[6] = "qrc";
/*    */       arrayOfString[7] = "trans";
/*    */       arrayOfString[8] = "roma";
/*    */       arrayOfString[9] = "classical";
/*    */       arrayOfString[10] = "introducetitle";
/*    */       arrayOfString[11] = "introducetext.item";
/*    */       arrayOfString[12] = "lrc_t";
/*    */       arrayOfString[13] = "qrc_t";
/*    */       arrayOfString[14] = "trans_t";
/*    */       arrayOfString[15] = "roma_t";
/*    */       arrayOfString[16] = "lyric_style";
/*    */       this.a = arrayOfString;
/*    */       ((h)this).reader.i(arrayOfString);
/*    */     }
/*    */     
/*    */     public String c() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1315] >> 5 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21726);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (String)swordProxyResult.result; 
/*    */       } 
/*    */       Vector<String> vector = ((h)this).reader.b(11);
/*    */       byte b1 = 0;
/*    */       String str = "";
/*    */       while (b1 < vector.size()) {
/*    */         String str1 = vector.elementAt(b1);
/*    */         String str2 = str;
/*    */         if (!TextUtils.isEmpty(str1)) {
/*    */           String str3, str4;
/*    */           a a = new a(this);
/*    */           a.parse(str1);
/*    */           str1 = a.e();
/*    */           str2 = str;
/*    */           if (!TextUtils.isEmpty(str1)) {
/*    */             StringBuilder stringBuilder1 = new StringBuilder();
/*    */             stringBuilder1.append(str);
/*    */             stringBuilder1.append("[");
/*    */             stringBuilder1.append(str1);
/*    */             stringBuilder1.append("]\n");
/*    */             str4 = stringBuilder1.toString();
/*    */           } 
/*    */           String str5 = a.c();
/*    */           str = str4;
/*    */           if (!TextUtils.isEmpty(str5)) {
/*    */             StringBuilder stringBuilder1 = new StringBuilder();
/*    */             stringBuilder1.append(str4);
/*    */             stringBuilder1.append(a.c());
/*    */             stringBuilder1.append("\n");
/*    */             str3 = stringBuilder1.toString();
/*    */           } 
/*    */           StringBuilder stringBuilder = new StringBuilder();
/*    */           stringBuilder.append(" [getClassicalHeaderAndContent] ");
/*    */           stringBuilder.append(str1);
/*    */           MLog.d("LyricXmlSearchResponse", stringBuilder.toString());
/*    */           stringBuilder = new StringBuilder();
/*    */           stringBuilder.append(" [getClassicalHeaderAndContent] ");
/*    */           stringBuilder.append(str5);
/*    */           MLog.d("LyricXmlSearchResponse", stringBuilder.toString());
/*    */           str2 = str3;
/*    */         } 
/*    */         b1++;
/*    */         str = str2;
/*    */       } 
/*    */       return str;
/*    */     }
/*    */     
/*    */     public String e() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1314] >> 7 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21720);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (String)swordProxyResult.result; 
/*    */       } 
/*    */       return h.decodeBase64(((h)this).reader.c(10));
/*    */     }
/*    */     
/*    */     public String g() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1293] >> 2 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21547);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (String)swordProxyResult.result; 
/*    */       } 
/*    */       return ((h)this).reader.c(3);
/*    */     }
/*    */     
/*    */     public String getSingerName() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1296] >> 3 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21572);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (String)swordProxyResult.result; 
/*    */       } 
/*    */       return h.decodeBase64(((h)this).reader.c(1));
/*    */     }
/*    */     
/*    */     public int getType() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1297] >> 3 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21580);
/*    */         if (swordProxyResult.isSupported)
/*    */           return ((Integer)swordProxyResult.result).intValue(); 
/*    */       } 
/*    */       return h.decodeInteger(((h)this).reader.c(4), 0);
/*    */     }
/*    */     
/*    */     public int h() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1312] >> 7 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21704);
/*    */         if (swordProxyResult.isSupported)
/*    */           return ((Integer)swordProxyResult.result).intValue(); 
/*    */       } 
/*    */       return h.decodeInteger(((h)this).reader.c(2), 0);
/*    */     }
/*    */     
/*    */     public String i() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1299] >> 1 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21594);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (String)swordProxyResult.result; 
/*    */       } 
/*    */       return ((h)this).reader.c(5);
/*    */     }
/*    */     
/*    */     public long j() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1305] >> 7 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21648);
/*    */         if (swordProxyResult.isSupported)
/*    */           return ((Long)swordProxyResult.result).longValue(); 
/*    */       } 
/*    */       return h.decodeLong(((h)this).reader.c(12), 0L);
/*    */     }
/*    */     
/*    */     public int k() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1312] >> 0 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21697);
/*    */         if (swordProxyResult.isSupported)
/*    */           return ((Integer)swordProxyResult.result).intValue(); 
/*    */       } 
/*    */       return h.decodeInteger(((h)this).reader.c(16), 0);
/*    */     }
/*    */     
/*    */     public String l() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1300] >> 4 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21605);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (String)swordProxyResult.result; 
/*    */       } 
/*    */       return ((h)this).reader.c(6);
/*    */     }
/*    */     
/*    */     public long m() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1308] >> 0 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21665);
/*    */         if (swordProxyResult.isSupported)
/*    */           return ((Long)swordProxyResult.result).longValue(); 
/*    */       } 
/*    */       return h.decodeLong(((h)this).reader.c(13), 0L);
/*    */     }
/*    */     
/*    */     public String n() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1304] >> 2 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21635);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (String)swordProxyResult.result; 
/*    */       } 
/*    */       return ((h)this).reader.c(8);
/*    */     }
/*    */     
/*    */     public long o() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1310] >> 4 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21685);
/*    */         if (swordProxyResult.isSupported)
/*    */           return ((Long)swordProxyResult.result).longValue(); 
/*    */       } 
/*    */       return h.decodeLong(((h)this).reader.c(15), 0L);
/*    */     }
/*    */     
/*    */     public String p() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1295] >> 0 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21561);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (String)swordProxyResult.result; 
/*    */       } 
/*    */       return h.decodeBase64(((h)this).reader.c(0));
/*    */     }
/*    */     
/*    */     public String r() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1302] >> 3 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21620);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (String)swordProxyResult.result; 
/*    */       } 
/*    */       return ((h)this).reader.c(7);
/*    */     }
/*    */     
/*    */     public long s() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1308] >> 6 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21671);
/*    */         if (swordProxyResult.isSupported)
/*    */           return ((Long)swordProxyResult.result).longValue(); 
/*    */       } 
/*    */       return h.decodeLong(((h)this).reader.c(14), 0L);
/*    */     }
/*    */     
/*    */     public boolean t() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       boolean bool = true;
/*    */       if (arrayOfByte != null && (arrayOfByte[1313] >> 7 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21712);
/*    */         if (swordProxyResult.isSupported)
/*    */           return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */       } 
/*    */       if (h.decodeInteger(((h)this).reader.c(9), 0) != 1)
/*    */         bool = false; 
/*    */       return bool;
/*    */     }
/*    */     
/*    */     public class a extends j {
/*    */       private final String[] a;
/*    */       
/*    */       public a(b.b this$0) {
/*    */         String[] arrayOfString = new String[2];
/*    */         arrayOfString[0] = "title";
/*    */         arrayOfString[1] = "content";
/*    */         this.a = arrayOfString;
/*    */         ((h)this).reader.i(arrayOfString);
/*    */       }
/*    */       
/*    */       public String c() {
/*    */         byte[] arrayOfByte = SwordSwitches.switches2;
/*    */         if (arrayOfByte != null && (arrayOfByte[1288] >> 4 & 0x1) > 0) {
/*    */           SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21509);
/*    */           if (swordProxyResult.isSupported)
/*    */             return (String)swordProxyResult.result; 
/*    */         } 
/*    */         return h.decodeBase64(((h)this).reader.c(1));
/*    */       }
/*    */       
/*    */       public String e() {
/*    */         byte[] arrayOfByte = SwordSwitches.switches2;
/*    */         if (arrayOfByte != null && (arrayOfByte[1286] >> 5 & 0x1) > 0) {
/*    */           SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21494);
/*    */           if (swordProxyResult.isSupported)
/*    */             return (String)swordProxyResult.result; 
/*    */         } 
/*    */         return h.decodeBase64(((h)this).reader.c(0));
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public class a extends j {
/*    */     private final String[] a;
/*    */     
/*    */     public a(b this$0) {
/*    */       String[] arrayOfString = new String[2];
/*    */       arrayOfString[0] = "title";
/*    */       arrayOfString[1] = "content";
/*    */       this.a = arrayOfString;
/*    */       ((h)this).reader.i(arrayOfString);
/*    */     }
/*    */     
/*    */     public String c() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1288] >> 4 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21509);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (String)swordProxyResult.result; 
/*    */       } 
/*    */       return h.decodeBase64(((h)this).reader.c(1));
/*    */     }
/*    */     
/*    */     public String e() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1286] >> 5 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21494);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (String)swordProxyResult.result; 
/*    */       } 
/*    */       return h.decodeBase64(((h)this).reader.c(0));
/*    */     }
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\network\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */