package com.tencent.qqmusic.business.lyricnew;

import com.lyricengine.common.c;
import com.tencent.qqmusic.sword.SwordProxy;
import com.tencent.qqmusic.sword.SwordSwitches;
import com.tencent.qqmusiccommon.util.MLog;

public class a implements c {
  public void d(String paramString1, String paramString2) {
    byte[] arrayOfByte = SwordSwitches.switches2;
    if (arrayOfByte != null && (arrayOfByte[1259] >> 3 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramString1, paramString2 }, this, 21276)).isSupported)
      return; 
    MLog.d(paramString1, paramString2);
  }
  
  public void e(String paramString1, String paramString2) {
    byte[] arrayOfByte = SwordSwitches.switches2;
    if (arrayOfByte != null && (arrayOfByte[1262] >> 5 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramString1, paramString2 }, this, 21302)).isSupported)
      return; 
    MLog.e(paramString1, paramString2);
  }
  
  public void i(String paramString1, String paramString2) {
    byte[] arrayOfByte = SwordSwitches.switches2;
    if (arrayOfByte != null && (arrayOfByte[1260] >> 3 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramString1, paramString2 }, this, 21284)).isSupported)
      return; 
    MLog.i(paramString1, paramString2);
  }
  
  public void d(String paramString1, String paramString2, Object... paramVarArgs) {
    byte[] arrayOfByte = SwordSwitches.switches2;
    if (arrayOfByte != null && (arrayOfByte[1265] >> 3 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramString1, paramString2, paramVarArgs }, this, 21324)).isSupported)
      return; 
    MLog.d(paramString1, paramString2, paramVarArgs);
  }
  
  public void e(String paramString1, String paramString2, Throwable paramThrowable) {
    byte[] arrayOfByte = SwordSwitches.switches2;
    if (arrayOfByte != null && (arrayOfByte[1275] >> 3 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramString1, paramString2, paramThrowable }, this, 21404)).isSupported)
      return; 
    MLog.e(paramString1, paramString2, paramThrowable);
  }
  
  public void i(String paramString1, String paramString2, Object... paramVarArgs) {
    byte[] arrayOfByte = SwordSwitches.switches2;
    if (arrayOfByte != null && (arrayOfByte[1267] >> 2 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramString1, paramString2, paramVarArgs }, this, 21339)).isSupported)
      return; 
    MLog.i(paramString1, paramString2, paramVarArgs);
  }
  
  public void e(String paramString, Throwable paramThrowable) {
    byte[] arrayOfByte = SwordSwitches.switches2;
    if (arrayOfByte != null && (arrayOfByte[1276] >> 5 & 0x1) > 0 && (SwordProxy.proxyMoreArgs(new Object[] { paramString, paramThrowable }, this, 21414)).isSupported)
      return; 
    MLog.e(paramString, paramThrowable);
  }
}
