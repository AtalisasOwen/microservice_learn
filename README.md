### 说明
#### 使用
1.  cd 到该目录下
2. `./gradlew.bat build`
2. `docker-compose build`
2. 使用`docker-compose up -d`启动
3. 使用`docker-compose ps` 查看状态
4. 使用`docker-compose down` 停止

或`gradlew build && docker-compose build && docker-compose up -d`

#### 详情
- Swagger (OpenAPI): 有待学习
- Mybatis
    - Spring Data: PagingAndSortingRepository有待学习
    - Optional对于MyBatis没作用
    - ProductId对于product_id没作用（@Results，已解决）
    - 响应式编程,Reactor,跳过第7章：响应式
- Entity的作用？？
- 各个服务的Test还没写，集成测试也没写（最后写吧）！！
- 微服务架构组件
    - 服务发现：解决DNS不能负载均衡，
    - 网关：隐藏，安全
    - 中心配置：
    - 断路器：防止雪崩式失效，流量限制，并发限制，重试次数，超时
    - 分布式追踪：
- Consul:
    - 目前关闭Health Check
    - product,recommendation,review只注册不发现
    - product-compose只发现不注册

