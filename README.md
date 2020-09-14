# gmall0105 本地修改版本

# gmall-user用户服务8080 

gmall-user 添加了查看用户的功能和查看用户地址的功能
添加了gmall-parent与gmall-api将版本与SQL表格剥离开来

gmall-user-service 用户服务的service层8070
gmall-user-web 用户服务的web层8080

在Linux上搭建服务器，dubbo zookeeper并设置开机自启

gmall-manage-service用户服务的service层8071
gmall-manage-web用户服务的web层8081
完善了管理的service和web层，在Linux上搭建了fastdfs(将上传的图片存储在服务器上)
和nginx(返回图片URL以及可通过客户端访问到该图片)以及两者的联动和设置了开机自启动

# gmall-item-service前台的商品详情服务8072 (不做)
gmall-item-web前台的商品详情展示8082

gmall-search-web 搜索服务的前台 8083
gmall-search-service 搜索服务的后台 8073

gmall-cart-web 搜索服务的前台 8084
gmall-cart-service 搜索服务的后台 8074

gmall-passport-web 用户认证中心 8085
gmall-user-service 用户服务的service层8070

gmall-order-web 用户认证中心 8086
gmall-order-service 用户服务的service层8076

gmall-payment 用户服务的service层8087     