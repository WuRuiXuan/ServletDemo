# ServletDemo



# 项目运行说明
1. 选中项目 -> 鼠标右键 -> Run As -> Run on Server
2. 报错"The server cannot be started because one or more of the ports are invalid."解决办法：<br/>
Window -> Show View -> Servers -> 在Servers窗口双击第一项，弹出Server配置界面（如未创建Server则会创建，然后再次双击） -> Ports -> 修改Tomcat admin port端口号为8005 -> 保存
3. 报错"Port 8080 required by Tomcat v9.0 Server at localhost is already in use."解决办法：<br/>
打开windows任务管理器 -> 结束进程Tomcat9.exe



# 安装Tomcat
1. 下载地址：https://tomcat.apache.org/download-90.cgi <br/>
2. 选择文件：32-bit/64-bit Windows Service Installer <br/>



# 安装eclipse(for Java EE Developers)
1. 下载地址：https://www.eclipse.org/downloads/packages/release/2018-09/r
2. 选择文件：Eclipse IDE for Java EE Developers
3. eclipse配置Tomcat运行环境：Window -> Preferences -> Server -> Runtime Environments -> Add -> Apache Tomcat v9.0 -> Next -> 选择Tomcat安装根目录 -> Finish
4. eclipse新建Servlet项目：File -> New -> Dynamic Web Project -> 输入项目名 -> 选择Dynamic web module version（本项目为2.4）-> Finish
