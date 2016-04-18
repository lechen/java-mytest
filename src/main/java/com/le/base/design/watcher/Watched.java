package com.le.base.design.watcher;
/**
 * 抽象主题角色，watched：被观察
 * @author LE
 *
 */
public interface Watched {
  public void addWatcher(Watcher watcher);

  public void removeWatcher(Watcher watcher);

  public void notifyWatchers(String str);
}
