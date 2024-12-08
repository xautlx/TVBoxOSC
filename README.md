# TVBoxOSC

基于 https://github.com/takagen99/Box 开源分支版本。

主要变更项：

* 添加GitHub Actions自动构建配置文件 [build.yml](.github/workflows/build.yml) ，可自行参考本地源码打包构建apk文件
* GitHub Actions自动化构建推送至 [releases](https://github.com/xautlx/TVBoxOSC/releases)

播放源获取：

* 关注微信公众号"一点小助手"后访问"TVBox"菜单

=== Source Code - Editing the app default settings ===
/src/main/java/com/github/tvbox/osc/base/App.java

    private void initParams() { 

        putDefault(HawkConfig.HOME_REC, 2);       // Home Rec 0=豆瓣, 1=推荐, 2=历史
        putDefault(HawkConfig.PLAY_TYPE, 1);      // Player   0=系统, 1=IJK, 2=Exo
        putDefault(HawkConfig.IJK_CODEC, "硬解码");// IJK Render 软解码, 硬解码
        putDefault(HawkConfig.HOME_SHOW_SOURCE, true);  // true=Show, false=Not show
        putDefault(HawkConfig.HOME_NUM, 2);       // History Number
        putDefault(HawkConfig.DOH_URL, 2);        // DNS
        putDefault(HawkConfig.SEARCH_VIEW, 2);    // Text or Picture

    }