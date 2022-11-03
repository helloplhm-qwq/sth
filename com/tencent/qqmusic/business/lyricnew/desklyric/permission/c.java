/*  1 */ package com.tencent.qqmusic.business.lyricnew.desklyric.permission;public class c { private static final Object c = new Object(); private static c b; protected Context a; public c() {
/*  2 */     new Handler(Looper.getMainLooper());
/*  3 */     this.a = MusicApplication.getContext(); } public static void c() { null = SwordSwitches.switches2; if (null != null && (null[1299] >> 7 & 0x1) > 0 && (SwordProxy.proxyOneArg(null, null, 21600)).isSupported) return;  synchronized (c) { MLog.i("FloatWinOp@OpManager", " [clear] "); b = null; return; }  } public static c g() { byte[] arrayOfByte = SwordSwitches.switches2; if (arrayOfByte != null && (arrayOfByte[1282] >> 0 & 0x1) > 0) { SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, null, 21457); if (swordProxyResult.isSupported) return (c)swordProxyResult.result;  }  synchronized (c) { if (b == null) { MLog.i("FloatWinOp@OpManager", " [getInstance] create instance");
/*  4 */         b b = h(); if (b != null)
/*  5 */         { StringBuilder stringBuilder = new StringBuilder(); this(); stringBuilder.append(" [getInstance] remote "); stringBuilder.append(b); MLog.i("FloatWinOp@OpManager", stringBuilder.toString());
/*  6 */           e e = new e(); this(b); b = e; }
/*  7 */         else if (a.h())
/*  8 */         { MLog.i("FloatWinOp@OpManager", " [getInstance] miui");
/*  9 */           d d = new d(); this(); b = d; }
/* 10 */         else { MLog.i("FloatWinOp@OpManager", " [getInstance] default");
/* 11 */           c c1 = new c(); this(); b = c1; }  }
/* 12 */        return b; }
/*    */      }
/*    */ 
/*    */   
/*    */   public static String e() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1298] >> 5 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, null, 21590);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (String)swordProxyResult.result; 
/*    */     } 
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(Build.MANUFACTURER);
/*    */     stringBuilder.append(" ");
/*    */     stringBuilder.append(DeviceInfoMonitor.getPhoneModel());
/*    */     stringBuilder.append(" ");
/*    */     stringBuilder.append(Build.BRAND);
/*    */     stringBuilder.append(" ");
/*    */     stringBuilder.append(Build.VERSION.SDK_INT);
/*    */     stringBuilder.append(" ");
/*    */     stringBuilder.append(Build.VERSION.RELEASE);
/*    */     stringBuilder.append(" ");
/*    */     stringBuilder.append(PhoneSystemUtil.h());
/*    */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   public static b h() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1296] >> 2 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, null, 21571);
/*    */       if (swordProxyResult.isSupported)
/*    */         return (b)swordProxyResult.result; 
/*    */     } 
/*    */     try {
/*    */       String str = (g0.v()).G;
/*    */       if (TextUtils.isEmpty(str)) {
/*    */         str = "{\"configs\":[{\"roms\":[{\"brands\":[\"oppo\"]}],\"config\":{\"alert_desc\":\"1、依次进入OPPO自带手机管家（安全中心）> 隐私权限 > 悬浮窗管理\\n\\n2、开启悬浮窗权限\",\"float_win_check\":1,\"float_win_type\":\"TypePhone\"}},{\"roms\":[{\"brands\":[\"vivo\"]}],\"config\":{\"alert_desc\":\"1、依次进入系统i管家 > 软件管理 > 悬浮窗管理\\n\\n2、勾选QQ音乐\",\"float_win_check\":1,\"float_win_type\":\"TypePhone\"}},{\"roms\":[{\"brands\":[\"meizu\"]}],\"config\":{\"alert_desc\":\"1、系统设置 > 应用管理 > QQ音乐 > 权限管理 \\n\\n2、勾选悬浮窗权限\",\"float_win_check\":1,\"float_win_type\":\"TypePhone\"}},{\"roms\":[{\"brands\":[\"huawei\"]}],\"config\":{\"alert_desc\":\"1、系统设置 > 权限管理 > 悬浮窗\\n\\n2、勾选悬浮窗权限\",\"float_win_check\":1,\"float_win_type\":\"TypePhone\"}},{\"roms\":[{\"min_sdk\":24}],\"config\":{\"alert_desc\":\"请尝试以下几种方式打开悬浮窗权限\\n\\n1、系统设置 > 应用 > QQ音乐\\n2、勾选允许出现在其他应用上\\n\\n1、系统设置 > 应用管理 > QQ音乐 > 权限管理 \\n2、勾选悬浮窗权限\",\"float_win_check\":1,\"float_win_type\":\"TypePhone\"}}]}";
/*    */         StringBuilder stringBuilder = new StringBuilder();
/*    */         this();
/*    */         stringBuilder.append(" [getRemoteConfig] default ");
/*    */         stringBuilder.append("{\"configs\":[{\"roms\":[{\"brands\":[\"oppo\"]}],\"config\":{\"alert_desc\":\"1、依次进入OPPO自带手机管家（安全中心）> 隐私权限 > 悬浮窗管理\\n\\n2、开启悬浮窗权限\",\"float_win_check\":1,\"float_win_type\":\"TypePhone\"}},{\"roms\":[{\"brands\":[\"vivo\"]}],\"config\":{\"alert_desc\":\"1、依次进入系统i管家 > 软件管理 > 悬浮窗管理\\n\\n2、勾选QQ音乐\",\"float_win_check\":1,\"float_win_type\":\"TypePhone\"}},{\"roms\":[{\"brands\":[\"meizu\"]}],\"config\":{\"alert_desc\":\"1、系统设置 > 应用管理 > QQ音乐 > 权限管理 \\n\\n2、勾选悬浮窗权限\",\"float_win_check\":1,\"float_win_type\":\"TypePhone\"}},{\"roms\":[{\"brands\":[\"huawei\"]}],\"config\":{\"alert_desc\":\"1、系统设置 > 权限管理 > 悬浮窗\\n\\n2、勾选悬浮窗权限\",\"float_win_check\":1,\"float_win_type\":\"TypePhone\"}},{\"roms\":[{\"min_sdk\":24}],\"config\":{\"alert_desc\":\"请尝试以下几种方式打开悬浮窗权限\\n\\n1、系统设置 > 应用 > QQ音乐\\n2、勾选允许出现在其他应用上\\n\\n1、系统设置 > 应用管理 > QQ音乐 > 权限管理 \\n2、勾选悬浮窗权限\",\"float_win_check\":1,\"float_win_type\":\"TypePhone\"}}]}");
/*    */         MLog.i("FloatWinOp@OpManager", stringBuilder.toString());
/*    */       } else {
/*    */         StringBuilder stringBuilder = new StringBuilder();
/*    */         this();
/*    */         stringBuilder.append(" [getRemoteConfig] online ");
/*    */         stringBuilder.append(str);
/*    */         MLog.i("FloatWinOp@OpManager", stringBuilder.toString());
/*    */       } 
/*    */       a a = new a();
/*    */       this(str);
/*    */       return (b)a.a();
/*    */     } catch (Exception exception) {
/*    */       MLog.e("FloatWinOp@OpManager", exception);
/*    */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean a() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     boolean bool = true;
/*    */     if (arrayOfByte != null && (arrayOfByte[1287] >> 7 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21504);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     try {
/*    */       if (j0.b(19, 0)) {
/*    */         boolean bool1 = q3.i(this.a, 24);
/*    */       } else {
/*    */         int i = (this.a.getApplicationInfo()).flags;
/*    */         if ((i & 0x8000000) != 134217728)
/*    */           bool = false; 
/*    */       } 
/*    */     } catch (Exception exception) {
/*    */       MLog.e("FloatWinOp@OpManager", exception);
/*    */     } 
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(" [checkOpManager] ");
/*    */     stringBuilder.append(bool);
/*    */     MLog.i("FloatWinOp@OpManager", stringBuilder.toString());
/*    */     return bool;
/*    */   }
/*    */   
/*    */   public boolean b() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1286] >> 3 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21492);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Boolean)swordProxyResult.result).booleanValue(); 
/*    */     } 
/*    */     if (Build.VERSION.SDK_INT > 24) {
/*    */       MLog.i("FloatWinOp@OpManager", "checkPermissionGranted: SDK_INT > N(24) return TYPE_PHONE");
/*    */       return a();
/*    */     } 
/*    */     MLog.i("FloatWinOp@OpManager", "checkPermissionGranted: return true");
/*    */     return a.a(MusicApplication.getContext());
/*    */   }
/*    */   
/*    */   public boolean d() {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public int f() {
/*    */     byte[] arrayOfByte = SwordSwitches.switches2;
/*    */     if (arrayOfByte != null && (arrayOfByte[1284] >> 7 & 0x1) > 0) {
/*    */       SwordProxyResult swordProxyResult = SwordProxy.proxyOneArg(null, this, 21480);
/*    */       if (swordProxyResult.isSupported)
/*    */         return ((Integer)swordProxyResult.result).intValue(); 
/*    */     } 
/*    */     if (t3.e0())
/*    */       return -2; 
/*    */     int i = Build.VERSION.SDK_INT;
/*    */     if (i >= 26) {
/*    */       MLog.e("FloatWinOp@OpManager", "getFloatWinType: SDK_INT >= o(26) return TYPE_APPLICATION_OVERLAY");
/*    */       return 2038;
/*    */     } 
/*    */     if (i > 24) {
/*    */       MLog.e("FloatWinOp@OpManager", "getFloatWinType: SDK_INT > N(24) return TYPE_PHONE");
/*    */       return 2002;
/*    */     } 
/*    */     MLog.e("FloatWinOp@OpManager", "getFloatWinType: return TYPE_TOAST");
/*    */     return 2005;
/*    */   } }


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\desklyric\permission\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */