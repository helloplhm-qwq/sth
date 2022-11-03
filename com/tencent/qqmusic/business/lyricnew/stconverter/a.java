/*    */ package com.tencent.qqmusic.business.lyricnew.stconverter;
/*  2 */ public class a { private static String c = "https://dldir1v6.qq.com/music/clntupate/ios/Lyric_SC2TC_Word.json"; private static String d = "Lyric_SC2TC_Char.json"; private static String e = "Lyric_SC2TC_Word.json"; private a() { this.a = new HashMap<Character, Character>();
/*  3 */     this.b = new HashMap<Character, b>();
/*  4 */     g();
/*  5 */     f(); } private static String f = "multiStConvertFile.json"; private static a g; private final Map<Character, Character> a; private final Map<Character, b> b; private void c() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1290] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21521)).isSupported) return;  y1.b(new a(), 30000L); } private void f() { byte[] arrayOfByte = SwordSwitches.switches2; String str = null; if (arrayOfByte != null && (arrayOfByte[1292] >> 2 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21539)).isSupported) return;  try { k k = new k(); this(e()); byte[] arrayOfByte1 = Util4File.s(k); if (arrayOfByte1 != null && arrayOfByte1.length > 0) { str = new String(); this(arrayOfByte1); } else { MLog.e("Lyric#StChineseConverter", " [loadMultiMap] file error"); }
/*  6 */        String str1 = str; if (TextUtils.isEmpty(str))
/*  7 */         str1 = Util4File.S(e); 
/*  8 */       if (!TextUtils.isEmpty(str1)) {
/*  9 */         JSONObject jSONObject = new JSONObject(); this(str1);
/* 10 */         Iterator<String> iterator = jSONObject.keys();
/* 11 */         while (iterator.hasNext())
/* 12 */         { String str2 = iterator.next();
/* 13 */           b b = new b(); this(jSONObject.getJSONArray(str2));
/* 14 */           if (b.a())
/* 15 */             this.b.put(Character.valueOf(str2.charAt(0)), b);  } 
/* 16 */       }  StringBuilder stringBuilder = new StringBuilder(); this(); stringBuilder.append(" [loadMultiMap] "); stringBuilder.append(this.b.size()); MLog.i("Lyric#StChineseConverter", stringBuilder.toString());
/* 17 */       c(); } catch (Exception exception)
/* 18 */     { MLog.e("Lyric#StChineseConverter", exception); }
/*    */      }
/*    */ 
/*    */   
/*    */   public static a d() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1286] >> 1 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, null, 21490);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (a)swordProxyResult.result; 
/*    */     } 
/*    */     if (g == null)
/*    */       g = new a(); 
/*    */     return g;
/*    */   }
/*    */   
/*    */   private String e() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1290] >> 7 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21528);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(o.k(g.l));
/*    */     stringBuilder.append(f);
/*    */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   private void g() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1287] >> 6 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21503)).isSupported)
/*    */       return; 
/*    */     try {
/*    */       String str = Util4File.S(d);
/*    */       if (TextUtils.isEmpty(str)) {
/*    */         MLog.e("Lyric#StChineseConverter", " [loadSingleMap] file error.");
/*    */         return;
/*    */       } 
/*    */       JSONObject jSONObject = new JSONObject();
/*    */       this(str);
/*    */       Iterator<String> iterator = jSONObject.keys();
/*    */       while (iterator.hasNext()) {
/*    */         String str1 = iterator.next();
/*    */         String str2 = jSONObject.getString(str1);
/*    */         this.a.put(Character.valueOf(str1.charAt(0)), Character.valueOf(str2.charAt(0)));
/*    */       } 
/*    */       StringBuilder stringBuilder = new StringBuilder();
/*    */       this();
/*    */       stringBuilder.append(" [loadSingleMap] ");
/*    */       stringBuilder.append(this.a.size());
/*    */       MLog.i("Lyric#StChineseConverter", stringBuilder.toString());
/*    */     } catch (Exception exception) {
/*    */       MLog.e("Lyric#StChineseConverter", " [loadSingleMap] ");
/*    */     } 
/*    */   }
/*    */   
/*    */   public String h(String paramString) {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1294] >> 7 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, this, 21560);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     char[] arrayOfChar = new char[paramString.length()];
/*    */     byte b = 0;
/*    */     while (b < paramString.length()) {
/*    */       Character character1, character2 = Character.valueOf(paramString.charAt(b));
/*    */       arrayOfByte = null;
/*    */       if (this.b.containsKey(character2)) {
/*    */         b b1 = this.b.get(character2);
/*    */         character1 = b1.b(paramString, b);
/*    */       } 
/*    */       if (character1 == null) {
/*    */         character1 = character2;
/*    */         if (this.a.containsKey(character2))
/*    */           character1 = this.a.get(character2); 
/*    */       } 
/*    */       arrayOfChar[b] = character1.charValue();
/*    */       b++;
/*    */     } 
/*    */     return new String(arrayOfChar);
/*    */   }
/*    */   
/*    */   class a implements Runnable {
/*    */     final a this$0;
/*    */     
/*    */     public void run() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1283] >> 0 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, this, 21465)).isSupported)
/*    */         return; 
/*    */       if (Util4Process.isInMainProcess()) {
/*    */         StringBuilder stringBuilder = new StringBuilder();
/*    */         stringBuilder.append(" [downloadMultiConvertFile] localFilePath ");
/*    */         stringBuilder.append(a.a(a.this));
/*    */         MLog.i("Lyric#StChineseConverter", stringBuilder.toString());
/*    */         n.a().m(a.b(), a.a(a.this), null);
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   private static class b {
/*    */     public Character b(String param1String, int param1Int) {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       if (arrayOfByte != null && (arrayOfByte[1293] >> 6 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyMoreArgs(new Object[] { param1String, Integer.valueOf(param1Int) }, this, 21551);
/*    */         if (swordProxyResult.isSupported)
/*    */           return (Character)swordProxyResult.result; 
/*    */       } 
/*    */       for (Map.Entry<Character, ArrayList<a>> entry : this.a.entrySet()) {
/*    */         Character character = (Character)entry.getKey();
/*    */         ArrayList arrayList = (ArrayList)entry.getValue();
/*    */         for (a a : arrayList) {
/*    */           int i = param1Int - a.b;
/*    */           int j = a.a.length() + i;
/*    */           if (i >= 0 && j <= param1String.length()) {
/*    */             String str = param1String.substring(i, j);
/*    */             if (str.equals(a.a))
/*    */               return character; 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */       return null;
/*    */     }
/*    */     
/*    */     public boolean a() {
/*    */       byte[] arrayOfByte = SwordSwitches.switches2;
/*    */       boolean bool = true;
/*    */       if (arrayOfByte != null && (arrayOfByte[1291] >> 7 & 0x1) > 0) {
/*    */         SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21536);
/*    */         if (swordProxyResult.isSupported)
/*    */           return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */       } 
/*    */       if (this.a.size() <= 0)
/*    */         bool = false; 
/*    */       return bool;
/*    */     }
/*    */     
/*    */     private static class a {
/*    */       public String a;
/*    */       public int b;
/*    */       
/*    */       private a() {}
/*    */     }
/*    */     private Map<Character, ArrayList<a>> a = new HashMap<Character, ArrayList<a>>();
/*    */     
/*    */     public b(JSONArray param1JSONArray) throws JSONException {
/*    */       byte b1 = 0;
/*    */       while (b1 < param1JSONArray.length()) {
/*    */         JSONObject jSONObject = param1JSONArray.getJSONObject(b1);
/*    */         String str = jSONObject.keys().next();
/*    */         ArrayList<a> arrayList = new ArrayList();
/*    */         JSONArray jSONArray = jSONObject.getJSONArray(str);
/*    */         byte b2 = 0;
/*    */         while (b2 < jSONArray.length()) {
/*    */           a a = new a(null);
/*    */           JSONObject jSONObject1 = jSONArray.getJSONObject(b2);
/*    */           String str1 = jSONObject1.keys().next();
/*    */           int i = jSONObject1.getInt(str1);
/*    */           a.a = str1;
/*    */           a.b = i;
/*    */           arrayList.add(a);
/*    */           b2++;
/*    */         } 
/*    */         if (arrayList.size() > 0)
/*    */           this.a.put(Character.valueOf(str.charAt(0)), arrayList); 
/*    */         b1++;
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   private static class a {
/*    */     public String a;
/*    */     public int b;
/*    */     
/*    */     private a() {}
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\stconverter\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */