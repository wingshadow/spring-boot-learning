# spring-boot-learning
### BaseService
该接口整合比较常用的方法

### BaseServiceImpl
该实现类引用BaseService接口，同时继承AbstractBaseServiceImpl实现获取主键

### BaseMapper
所有数据库操作的基类，继承tk.mybatis的Mapper、MySqlMapper实现常用方法的实现。

### 实现效果
数据库操作采用上述类型继承，减少代码量和开发量，有效提高开发效率。估算减少代码量占比在60%左右。
