package annotation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration//声明当前类是一个配置类（见1.3.3节），相当于一个Spring的XML配置文件。
@ComponentScan({"dao","service","controller","annotation"})
//自动扫描包下使用的注解，并注册为Bean。
/*相当于在Spring的XML配置文件使用<context:component-scan base-package="Bean所在的包路径"/>
语句。*/
public class ConfigAnnotation {
}
