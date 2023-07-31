# LzhBaidu

> 南京大学
>
>姓名：刘子恒
>
>学号：211870018
>

## 项目介绍
LzhBaidu是一个类似于“百度”手机App的应用。它旨在提供一个简单而实用的搜索引擎应用，用户可以使用它进行搜索、浏览新闻、观看视频和查询天气信息等功能。

## 项目架构
LzhBaidu采用传统的单一Activity架构，所有的功能页面都是通过一个主Activity来承载的。以下是该应用的软件架构说明：

1. **主Activity（HomepageActivity.java）**：这是应用的主页面Activity，负责承载各个功能页面的切换和导航。

2. **功能页面Activity**：
    - `MainActivity.java`：主页Activity，包含了底部导航栏等主要功能入口。
    - `NewsActivity.java`：新闻页面的Activity。
    - `VideoActivity.java`：视频页面的Activity。
    - `WeatherPageActivity.java`：天气页面的Activity。
    - `SearchActivity.java`：搜索功能的Activity。
    - `WebActivity.java`：WebView加载网页的Activity。

3. **Adapter类**：
    - `NewsAdapter.java`：用于新闻列表的适配器，负责将新闻数据与列表项布局进行绑定。
    - `VideoAdapter.java`：用于视频列表的适配器，负责将视频数据与列表项布局进行绑定。
    - `WeatherAdapter.java`：用于天气列表的适配器，负责将天气数据与列表项布局进行绑定。

4. **Item类**：
    - `News_item.java`：新闻列表项的数据模型，用于存储新闻的相关信息。
    - `video_item.java`：视频列表项的数据模型，用于存储视频的相关信息。
    - `Weather_Item.java`：天气列表项的数据模型，用于存储天气的相关信息。


## 运行

- 实体机：找到下载的APK文件并点击进行安装

- 虚拟机：请选用api30

## 学习中遇到的问题及解决方法

### 1. 布局问题：
- 问题描述：界面布局显示不正常，控件位置错乱等问题。
- 解决方法：检查布局文件的层次结构，确保控件属性设置正确，并适配各种屏幕尺寸和密度。

### 2. 程序崩溃：
- 问题描述：应用可能因为空指针异常、数组越界等原因导致崩溃。
- 解决方法：通过Log信息或调试器定位异常的代码行，并对可能出现问题的地方进行合理的判断和处理。

### 3. 性能问题：
- 问题描述：应用可能会出现卡顿、内存泄漏等性能问题，影响用户体验。
- 解决方法：进行性能优化，使用图片压缩、内存优化等措施来提高应用性能。

### 4. API版本兼容性：
- 问题描述：不同的Android设备和版本可能对API的支持程度不同，导致应用在某些设备上运行不稳定。
- 解决方法：检查设备API版本，使用兼容性库或条件判断来处理不同设备和版本的情况。

## 学习心得

学习编写自己的第一个安卓App是一次令人难忘的经历。在这个过程中，我从零开始探索了安卓开发的世界，体验了编写代码、设计界面、处理逻辑等全方位的开发过程。

首先，我对安卓开发的整体架构和生命周期有了初步的了解。学习了Activity、Fragment、Adapter等组件的作用和使用方式，以及如何通过布局文件进行界面的设计和展示。了解了单一Activity架构在简单应用中的应用场景，以及它的优缺点。

在编写代码的过程中，我遇到了一些挑战，例如布局问题、程序崩溃、性能优化等。通过查阅文档、搜索解决方案以及与其他学习者交流，我逐渐解决了这些问题。遇到困难并成功解决它们，让我感到成就感满满。

在学习过程中，我也发现了自己的不足之处。虽然完成了一个简单的App，但在代码的组织和优化方面还有很大的提升空间。我意识到代码的可维护性和性能优化同样重要，这将是我接下来继续学习和进步的方向。

这次学习的过程不仅教会了我很多。我衷心感谢百度公司提供了这样一个学习课程，让我有机会开启安卓开发之旅，并为我未来的发展打下坚实的基础。