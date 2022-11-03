package com.tencent.qqmusic.business.lyricnew.load.listener;

import com.tencent.qqmusicplayerprocess.songinfo.SongInfo;

public interface a {
  void onAllTaskFinish(int paramInt1, int paramInt2);
  
  void onLoadSongStarted();
  
  void onOneTaskFinish(SongInfo paramSongInfo);
  
  void onOneTaskStart(SongInfo paramSongInfo, int paramInt1, int paramInt2);
}


/* Location:              E:\code1\QM\QM_lyric.jar!\com\tencent\qqmusic\business\lyricnew\load\listener\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */