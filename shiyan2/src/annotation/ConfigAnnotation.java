package annotation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration//������ǰ����һ�������ࣨ��1.3.3�ڣ����൱��һ��Spring��XML�����ļ���
@ComponentScan({"dao","service","controller","annotation"})
//�Զ�ɨ�����ʹ�õ�ע�⣬��ע��ΪBean��
/*�൱����Spring��XML�����ļ�ʹ��<context:component-scan base-package="Bean���ڵİ�·��"/>
��䡣*/
public class ConfigAnnotation {
}
