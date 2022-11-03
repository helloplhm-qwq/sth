package com.tencent.qqmusic.business.lyricnew.load.listener;

import com.tencent.qqmusic.business.lyricnew.load.manager.l;
import com.tencent.qqmusicplayerprocess.qplayauto.LyricInfo;
import java.util.ArrayList;

public interface b {
  void onLoadOther(String paramString, int paramInt);
  
  void onLoadStrLyric(LyricInfo paramLyricInfo);
  
  void onLoadSuc(com.lyricengine.base.b paramb1, com.lyricengine.base.b paramb2, com.lyricengine.base.b paramb3, int paramInt);
  
  void onLyricSeek(long paramLong, float paramFloat);
  
  void onLyricStart(boolean paramBoolean);
  
  void onSearchSuc(ArrayList<l.n> paramArrayList);
}


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\listener\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */