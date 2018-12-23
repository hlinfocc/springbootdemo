# springbootdemo
Spring Boot + mybatis项目实例，基于spring boot 2.1.1.RELEASE，集成mybatis，
阿里巴巴druid数据库连接池，beetl模板引擎，项目默认使用postgresql数据库，
当然也可以使用MySQL等其他数据库的。

项目高度集成，使用了SqlSessionTemplate，无需写mapper，只需要写mybatis的xml文件即可。
## 注意事项
1. 项目只是写了一个queryList的数据库操作方法，需要自己在CoreService 和CoreDao 以及相应得的impl中写自己的方法。
2. mybatis的xml目录在resources下mybatis/mapper/

