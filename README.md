# 🐓 咕咕鸡 Web 脚手架

## 🚀 功能

- 用户管理：用户是系统操作者，该功能主要完成系统用户配置。
- 部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
- 岗位管理：配置系统用户所属担任职务。
- 菜单管理：配置系统菜单，操作权限，按钮权限标识等。
- 角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
- 字典管理：对系统中经常使用的一些较为固定的数据进行维护。
- 参数管理：对系统动态配置常用参数。
- 通知公告：系统通知公告信息发布维护。
- 操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
- 登录日志：系统登录日志记录查询包含登录异常。
- 在线用户：当前系统中活跃用户状态监控。
- 定时任务：在线（添加、修改、删除）任务调度包含执行结果日志。
- 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
- 系统接口：根据业务代码自动生成相关的api接口文档。
- 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
- 缓存监控：对系统的缓存信息查询，命令统计等。
- 在线构建器：拖动表单元素生成相应的HTML代码。
- 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

## 💻 技术栈

### 后端

> 基于 [RuoYi-Vue](https://gitee.com/y_project/RuoYi-Vue) 开发

| 名称 | 版本 | 备注 |
| --- | --- | --- |
| Java | 1.8 | 开发语言 |
| Apache Maven | 3.6.3 | 构建工具 |
| MySQL | 8.4.0 | 数据库 |
| Redis | 7.2 | 缓存 |
| Spring Boot | 2.5.15 | 基础框架 |
| Spring Security | 5.5.8 | 安全框架 |
| Alibaba Druid | 1.2.20 | 数据库连接池 |
| Hibernate Validation | 6.2.5.Final | 数据校验 |
| Apache MyBatis | 3.5.13 | 持久层框架 |

### 前端

> 基于 [RuoYi-Vue3](https://github.com/yangzongzhuan/RuoYi-Vue3) 开发

| 名称 | 版本 | 备注 |
| --- | --- | --- |
| JavaScript | | 开发语言 |
| NodeJS | v20.14.0 | 运行环境 |
| PNPM | 9.x | 包管理 |
| Vue | 3.3.9 | 基础框架 |
| Vite | 5.0.4 | 构建工具 |
| VueRouter | 4.2.5 | 路由 |
| Axios | 0.27.2 | 请求库 |
| ElementPlus | 2.4.3 | UI库 |
| Pina | 2.1.7 | 状态管理 |

## 💪 贡献者

<table>
  <tr>
    <td>
      <a href="https://github.com/shilohooo">
        <img src="https://avatars.githubusercontent.com/u/46670399?v=4" width="100px" style="border-radius: 50%; overflow: hidden" alt="shilohooo" />
      </a>
    </td>
    <td>
      <a href="https://github.com/magicShu">
        <img src="https://avatars.githubusercontent.com/u/49185512?v=4" width="100px" style="border-radius: 50%; overflow: hidden" alt="magicShu" />
      </a>
    </td>
    <td>
      <a href="https://github.com/yuanLucks">
        <img src="https://avatars.githubusercontent.com/u/46663841?v=4" width="100px" style="border-radius: 50%; overflow: hidden" alt="yuanLucks" />
      </a>
    </td>  
  </tr>
</table>
