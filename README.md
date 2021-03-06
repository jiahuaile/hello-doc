
# Hello doc


> Hello doc是一款快译通通过代码生成漂亮的api在线文档工具，支持java快速生成接口文档

运行demo：[demo](https://yoqu.gitee.io/hello-doc-demo)

## 文档

Link： [详细文档](https://yoqu.gitee.io/hello-doc/#/guide)


## 特性
* 支持markdown（包含flowchat流程图）
* 参数实体跳转
* java注解支持
* 菜单快速筛选
* 接口搜索
* 接口统计

## 待实现功能
- [ ] mock接口
- [ ] swagger配置文件转换为hello doc
- [ ] markdown功能增强时序图等功能
- [ ] 文档工具国际化支持
- [ ] 文档工具接入在线评论支持评论功能
- [ ] 文档导出为pdf和word格式



## 截图展示：

![demo3](docs/images/demo3.png)

![demo1](docs/images/demo1.png)


## 更新日志

-- 1.0.3-SNAPSHOT

* 允许ApiDto中的enName属性为空，自动获取注解类的属性
* 优化在线文档的日志消息
* 优化在spring mvc模式下注解默认参数可允许为空

-- 1.0.2

* 修复spring mvc 运行丢失静态页面资源的bug
* 增加spring mvc 默认路径访问功能

-- 1.0.1

* 修复windows下字符编码的bug
* 增加spring mvc运行时生成文档支持
* 修复spring mvc下菜单渲染的bug
