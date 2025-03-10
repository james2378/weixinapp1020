### 介绍
java毕业设计，微信小程序汽车保养系统
### 3000多套系统，需要联系
抠：3565014707 微：a13424421017

#### 整体架构模式
这是一个 多端协同的汽车保养/配件商城系统，采用 前后端分离架构，包含以下模块：

微信小程序端（mp-weixin）：面向终端用户，提供保养预约、配件购买、订单管理等功能。

管理后台（ssml5768/src/main/webapp/admin）：基于 Vue.js + ElementUI 的后台管理系统，供商家管理商品、订单、门店等信息。

H5用户端（ssml5768/src/main/webapp/front）：基于 uni-app 的跨端应用，适配 H5 和小程序，功能与微信端互补。

后端服务（ssml5768）：基于 Spring Boot + MyBatis 的 Java 服务，提供统一 API 和业务逻辑。
#### 分层架构设计
后端分层（ssml5768模块）：

Controller层：controller 包（如 AddressController）处理 HTTP 请求，返回 JSON 数据。

Service层：service 包（AddressService）实现业务逻辑（如地址管理、订单结算）。

DAO层：dao 包（AddressDao）通过 MyBatis XML 文件（AddressDao.xml）操作数据库。
#### 实体与数据模型：
entity 包定义数据库实体（如 AddressEntity 地址实体）；

vo（值对象）和 view（视图模型）用于接口数据传输和复杂查询结果封装。

前端分层（以微信小程序为例）：

视图层：pages 目录定义页面（如 shop-order-confirm 订单确认页），通过 .wxml（模板）和 .wxss（样式）构建界面。

组件层：components 封装可复用组件（如 mescroll-uni 滚动加载组件、w-picker 地址选择器）

状态管理：通过 Vuex（管理后台）或全局变量（小程序端）管理用户登录状态和购物车数据。
#### 关键技术特性
多端适配：

微信小程序端使用原生组件（如 uni-popup 弹窗）；

H5 端复用 uni-app 跨端组件（如 uni-calendar 日历组件），实现代码复用。

权限控制：

后端通过 AuthorizationInterceptor 拦截器校验用户 Token 和权限；

前端管理后台通过路由（router-static.js）控制页面访问权限。

第三方服务集成：

BaiduUtil 可能用于地图服务（如门店定位）；

支付模块通过 config.properties 配置密钥，支持微信/支付宝支付。
#### 核心功能模块解析
##### 用户端功能（微信小程序 + H5）
保养预约与配件购买：

baoyangxinxi（保养信息）：用户预约汽车保养服务，选择门店和时间。

peijianxinxi（配件信息）：浏览和购买汽车配件（如轮胎、机油）。

shop-cart（购物车）：管理待结算商品，支持数量修改和删除。

订单管理：

shop-order-confirm（订单确认）：选择收货地址，确认支付方式。

shop-order（订单列表）：查看订单状态（待支付、已发货、已完成）。

shop-recharge（充值）：用户账户余额充值。

用户中心：

user-info（用户信息）：修改个人信息、绑定手机号。

shop-address（地址管理）：添加/编辑收货地址，支持默认地址设置。
##### 管理后台功能（Vue.js）

商品与门店管理：

peijianxinxi（配件管理）：维护配件名称、库存、价格等信息。

mendianxinxi（门店管理）：设置门店位置、服务范围、联系方式。

订单与售后：

shop-order（订单管理）：查看所有订单详情，处理退款申请。

discusspeijianxinxi（配件评价）：审核用户对配件的评价内容。

数据统计：

yuangongxinxi（员工管理）：统计员工绩效（如订单处理量）。
##### 后端核心服务
通用业务逻辑：

CommonController 提供通用 CRUD 接口，支持动态 SQL（AddressDao.xml）；

MyMetaObjectHandler 实现 MyBatis-Plus 自动填充（如 create_time、update_time）。

支付与订单：

支付模块通过 config.properties 读取密钥，调用第三方支付 API；

订单超时未支付自动取消（通过定时任务实现）。
