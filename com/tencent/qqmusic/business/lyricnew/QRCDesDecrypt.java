package com.tencent.qqmusic.business.lyricnew;

import androidx.collection.LruCache;
import com.lyricengine.base.c;
import com.tencent.qqmusic.sword.SwordProxy;
import com.tencent.qqmusic.sword.SwordProxyResult;
import com.tencent.qqmusic.sword.SwordSwitches;
import com.tencent.qqmusiccommon.util.MLog;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\004\n\002\020\005\n\000\n\002\020\f\n\000\n\002\020\b\n\000\n\002\020\022\n\002\b\002\n\002\020\016\n\002\b\007\030\000 \0272\0020\001:\001\027B\021\b\002\022\b\b\002\020\002\032\0020\003\006\002\020\004J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\002J\031\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\fHJ\022\020\020\032\004\030\0010\0212\006\020\022\032\0020\021H\026J\022\020\023\032\004\030\0010\0162\006\020\024\032\0020\021H\002J\024\020\025\032\004\030\0010\0162\b\020\026\032\004\030\0010\016H\002R\021\020\002\032\0020\003\006\b\n\000\032\004\b\005\020\006\006\030"}, d2 = {"Lcom/tencent/qqmusic/business/lyricnew/QRCDesDecrypt;", "Lcom/lyricengine/base/LyricDecryptImpl;", "unzip", "", "(Z)V", "getUnzip", "()Z", "charToByte", "", "c", "", "desDecrypt", "", "buffer", "", "len", "doDecryptionLyric", "", "content", "hexStringToBytes", "hexString", "unZipByte", "data", "Companion", "qqmusic_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class QRCDesDecrypt implements c {
  @NotNull
  public static final a Companion = new a();
  
  @NotNull
  private static final String TAG = "QRCDesDecrypt";
  
  @Nullable
  private static QRCDesDecrypt mInstance;
  
  @NotNull
  private static final LruCache<String, String> mLyricCache = new LruCache(4);
  
  private final boolean unzip;
  
  private QRCDesDecrypt(boolean paramBoolean) {
    this.unzip = paramBoolean;
  }
  
  private final byte[] hexStringToBytes(String paramString) {
    byte[] arrayOfByte = SwordSwitches.switches8;
    if (arrayOfByte != null && (arrayOfByte[239] >> 6 & 0x1) > 0) {
      SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, this, 80319);
      if (swordProxyResult.isSupported)
        return (byte[])swordProxyResult.result; 
    } 
    if (paramString != null)
      try {
        if (paramString.length() > 0) {
          paramString = paramString.toUpperCase();
          t.f(paramString, "this as java.lang.String).toUpperCase()");
          int i = paramString.length() / 2;
          char[] arrayOfChar = paramString.toCharArray();
          t.f(arrayOfChar, "this as java.lang.String).toCharArray()");
          byte[] arrayOfByte1 = new byte[i];
          int j = 0;
          if (i > 0)
            while (true) {
              int k = j + 1, m = j * 2;
              byte b = charToByte(arrayOfChar[m]);
              arrayOfByte1[j] = (byte)(charToByte(arrayOfChar[m + 1]) | b << 4);
              if (k >= i)
                break; 
              j = k;
            }  
          return arrayOfByte1;
        } 
      } catch (Exception exception) {
        MLog.e("QRCDesDecrypt", exception);
      }  
    return null;
  }
  
  private final byte[] unZipByte(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: getstatic com/tencent/qqmusic/sword/SwordSwitches.switches8 : [B
    //   3: astore_2
    //   4: aload_2
    //   5: ifnull -> 43
    //   8: aload_2
    //   9: sipush #229
    //   12: baload
    //   13: iconst_4
    //   14: ishr
    //   15: iconst_1
    //   16: iand
    //   17: ifle -> 43
    //   20: aload_1
    //   21: aload_0
    //   22: ldc 80237
    //   24: invokestatic proxyOneArg : (Ljava/lang/Object;Ljava/lang/Object;I)Lcom/tencent/qqmusic/sword/SwordProxyResult;
    //   27: astore_2
    //   28: aload_2
    //   29: getfield isSupported : Z
    //   32: ifeq -> 43
    //   35: aload_2
    //   36: getfield result : Ljava/lang/Object;
    //   39: checkcast [B
    //   42: areturn
    //   43: aload_1
    //   44: ifnonnull -> 49
    //   47: aconst_null
    //   48: areturn
    //   49: new java/util/zip/Inflater
    //   52: astore_2
    //   53: aload_2
    //   54: invokespecial <init> : ()V
    //   57: aload_2
    //   58: aload_1
    //   59: invokevirtual setInput : ([B)V
    //   62: new java/io/ByteArrayOutputStream
    //   65: astore_1
    //   66: aload_1
    //   67: iconst_1
    //   68: invokespecial <init> : (I)V
    //   71: aload_2
    //   72: astore_3
    //   73: aload_1
    //   74: astore #4
    //   76: invokestatic a : ()Lcom/tencent/qqmusic/qzdownloader/cache/b;
    //   79: invokevirtual b : ()Lcom/tencent/qqmusic/qzdownloader/cache/a;
    //   82: sipush #1024
    //   85: invokevirtual a : (I)[B
    //   88: astore #5
    //   90: aload_2
    //   91: astore_3
    //   92: aload_1
    //   93: astore #4
    //   95: aload_2
    //   96: invokevirtual finished : ()Z
    //   99: ifne -> 152
    //   102: aload_2
    //   103: astore_3
    //   104: aload_1
    //   105: astore #4
    //   107: aload_2
    //   108: aload #5
    //   110: invokevirtual inflate : ([B)I
    //   113: istore #6
    //   115: iload #6
    //   117: ifgt -> 135
    //   120: aload_2
    //   121: astore_3
    //   122: aload_1
    //   123: astore #4
    //   125: ldc 'QRCDesDecrypt'
    //   127: ldc '[unZipByte] decompresser.inflate return 0'
    //   129: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)V
    //   132: goto -> 152
    //   135: aload_2
    //   136: astore_3
    //   137: aload_1
    //   138: astore #4
    //   140: aload_1
    //   141: aload #5
    //   143: iconst_0
    //   144: iload #6
    //   146: invokevirtual write : ([BII)V
    //   149: goto -> 90
    //   152: aload_2
    //   153: astore_3
    //   154: aload_1
    //   155: astore #4
    //   157: aload_1
    //   158: invokevirtual toByteArray : ()[B
    //   161: astore #5
    //   163: aload_1
    //   164: invokevirtual close : ()V
    //   167: goto -> 177
    //   170: astore_1
    //   171: ldc 'QRCDesDecrypt'
    //   173: aload_1
    //   174: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   177: aload_2
    //   178: invokevirtual end : ()V
    //   181: goto -> 191
    //   184: astore_1
    //   185: ldc 'QRCDesDecrypt'
    //   187: aload_1
    //   188: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   191: aload #5
    //   193: areturn
    //   194: astore #5
    //   196: goto -> 228
    //   199: astore_1
    //   200: aconst_null
    //   201: astore #4
    //   203: goto -> 287
    //   206: astore #5
    //   208: aconst_null
    //   209: astore_1
    //   210: goto -> 228
    //   213: astore_1
    //   214: aconst_null
    //   215: astore_2
    //   216: aconst_null
    //   217: astore #4
    //   219: goto -> 287
    //   222: astore #5
    //   224: aconst_null
    //   225: astore_1
    //   226: aconst_null
    //   227: astore_2
    //   228: aload_2
    //   229: astore_3
    //   230: aload_1
    //   231: astore #4
    //   233: ldc 'QRCDesDecrypt'
    //   235: aload #5
    //   237: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   240: aload_1
    //   241: ifnonnull -> 247
    //   244: goto -> 261
    //   247: aload_1
    //   248: invokevirtual close : ()V
    //   251: goto -> 261
    //   254: astore_1
    //   255: ldc 'QRCDesDecrypt'
    //   257: aload_1
    //   258: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   261: aload_2
    //   262: ifnonnull -> 268
    //   265: goto -> 282
    //   268: aload_2
    //   269: invokevirtual end : ()V
    //   272: goto -> 282
    //   275: astore_1
    //   276: ldc 'QRCDesDecrypt'
    //   278: aload_1
    //   279: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   282: aconst_null
    //   283: areturn
    //   284: astore_1
    //   285: aload_3
    //   286: astore_2
    //   287: aload #4
    //   289: ifnonnull -> 295
    //   292: goto -> 310
    //   295: aload #4
    //   297: invokevirtual close : ()V
    //   300: goto -> 310
    //   303: astore_3
    //   304: ldc 'QRCDesDecrypt'
    //   306: aload_3
    //   307: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   310: aload_2
    //   311: ifnonnull -> 317
    //   314: goto -> 331
    //   317: aload_2
    //   318: invokevirtual end : ()V
    //   321: goto -> 331
    //   324: astore_2
    //   325: ldc 'QRCDesDecrypt'
    //   327: aload_2
    //   328: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   331: aload_1
    //   332: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 49
    //   #2	-> 57
    //   #3	-> 62
    //   #4	-> 71
    //   #5	-> 90
    //   #6	-> 102
    //   #7	-> 120
    //   #8	-> 135
    //   #9	-> 152
    //   #10	-> 163
    //   #11	-> 171
    //   #12	-> 177
    //   #13	-> 185
    //   #14	-> 228
    //   #15	-> 247
    //   #16	-> 255
    //   #17	-> 268
    //   #18	-> 276
    //   #19	-> 295
    //   #20	-> 304
    //   #21	-> 317
    //   #22	-> 325
    // Exception table:
    //   from	to	target	type
    //   49	57	222	java/lang/Exception
    //   49	57	213	finally
    //   57	62	206	java/lang/Exception
    //   57	62	199	finally
    //   62	71	206	java/lang/Exception
    //   62	71	199	finally
    //   76	90	194	java/lang/Exception
    //   76	90	284	finally
    //   95	102	194	java/lang/Exception
    //   95	102	284	finally
    //   107	115	194	java/lang/Exception
    //   107	115	284	finally
    //   125	132	194	java/lang/Exception
    //   125	132	284	finally
    //   140	149	194	java/lang/Exception
    //   140	149	284	finally
    //   157	163	194	java/lang/Exception
    //   157	163	284	finally
    //   163	167	170	java/lang/Exception
    //   177	181	184	java/lang/Exception
    //   233	240	284	finally
    //   247	251	254	java/lang/Exception
    //   268	272	275	java/lang/Exception
    //   295	300	303	java/lang/Exception
    //   317	321	324	java/lang/Exception
  }
  
  @Nullable
  public String doDecryptionLyric(@NotNull String paramString) {
    String str1;
    byte[] arrayOfByte = SwordSwitches.switches8;
    if (arrayOfByte != null && (arrayOfByte[220] >> 2 & 0x1) > 0) {
      SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(paramString, this, 80163);
      if (swordProxyResult.isSupported)
        return (String)swordProxyResult.result; 
    } 
    t.g(paramString, "content");
    String str2 = t.p("key_", Integer.valueOf(paramString.hashCode()));
    try {
      String str = (String)mLyricCache.get(str2);
    } finally {
      Exception exception = null;
      arrayOfByte = null;
    } 
    try {
      String str;
      byte[] arrayOfByte2 = hexStringToBytes(paramString);
      if (arrayOfByte2 == null)
        return null; 
      try {
        desDecrypt(arrayOfByte2, arrayOfByte2.length);
      } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
        com.tencent.mediaplayer.a.f("desdecrypt", null, 2, null);
        desDecrypt(arrayOfByte2, arrayOfByte2.length);
      } 
      byte[] arrayOfByte1 = arrayOfByte2;
      if (this.unzip)
        arrayOfByte1 = unZipByte(arrayOfByte2); 
      if (arrayOfByte1 == null)
        return null; 
    } finally {
      Exception exception = null;
      MLog.e("QRCDesDecrypt", exception);
    } 
    t.e(paramString);
    return paramString;
  }
  
  public final boolean getUnzip() {
    return this.unzip;
  }
  
  @Metadata(d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\b\003\030\0002\0020\001B\007\b\002\006\002\020\002J\b\020\t\032\0020\006H\007J\022\020\t\032\0020\0062\b\b\002\020\n\032\0020\013H\007R\016\020\003\032\0020\004X\006\002\n\000R\020\020\005\032\004\030\0010\006X\016\006\002\n\000R\032\020\007\032\016\022\004\022\0020\004\022\004\022\0020\0040\bX\004\006\002\n\000\006\f"}, d2 = {"Lcom/tencent/qqmusic/business/lyricnew/QRCDesDecrypt$Companion;", "", "()V", "TAG", "", "mInstance", "Lcom/tencent/qqmusic/business/lyricnew/QRCDesDecrypt;", "mLyricCache", "Landroidx/collection/LruCache;", "getInstance", "unzip", "", "qqmusic_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
  class a {
    private a() {}
    
    @JvmStatic
    @NotNull
    public final QRCDesDecrypt a() {
      if (QRCDesDecrypt.mInstance == null)
        QRCDesDecrypt.mInstance = new QRCDesDecrypt(true, null); 
      QRCDesDecrypt qRCDesDecrypt = QRCDesDecrypt.mInstance;
      t.e(qRCDesDecrypt);
      return qRCDesDecrypt;
    }
    
    @JvmStatic
    @NotNull
    public final QRCDesDecrypt b(boolean param1Boolean) {
      if (QRCDesDecrypt.mInstance == null)
        QRCDesDecrypt.mInstance = new QRCDesDecrypt(param1Boolean, null); 
      QRCDesDecrypt qRCDesDecrypt = QRCDesDecrypt.mInstance;
      t.e(qRCDesDecrypt);
      return qRCDesDecrypt;
    }
  }
  
  static {
    com.tencent.mediaplayer.a.f("desdecrypt", null, 2, null);
  }
  
  private final byte charToByte(char paramChar) {
    int i;
    boolean bool2;
    boolean bool1 = true;
    byte b = 0;
    if ('0' <= paramChar && paramChar <= '9') {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool2) {
      paramChar -= '0';
      return (byte)paramChar;
    } 
    if ('A' <= paramChar && paramChar <= 'F') {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool2) {
      i = paramChar - 65 + 10;
      return (byte)i;
    } 
    if (97 <= i && i <= 102) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    if (bool2)
      b = (byte)(i - 97 + 10); 
    return b;
  }
  
  @JvmStatic
  @NotNull
  public static final QRCDesDecrypt getInstance() {
    byte[] arrayOfByte = SwordSwitches.switches8;
    if (arrayOfByte != null && (arrayOfByte[249] >> 7 & 0x1) > 0) {
      SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, null, 80400);
      if (swordProxyResult.isSupported)
        return (QRCDesDecrypt)swordProxyResult.result; 
    } 
    return Companion.a();
  }
  
  @JvmStatic
  @NotNull
  public static final QRCDesDecrypt getInstance(boolean paramBoolean) {
    byte[] arrayOfByte = SwordSwitches.switches8;
    if (arrayOfByte != null && (arrayOfByte[248] >> 5 & 0x1) > 0) {
      SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(Boolean.valueOf(paramBoolean), null, 80390);
      if (swordProxyResult.isSupported)
        return (QRCDesDecrypt)swordProxyResult.result; 
    } 
    return Companion.b(paramBoolean);
  }
  
  public final native int desDecrypt(@NotNull byte[] paramArrayOfbyte, int paramInt);
}
