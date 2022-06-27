import com.learn.demo.bean.Student;
import com.learn.demo.controller.Login;
import com.learn.demo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Tezt {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private StudentService studentService;
    public static void main(String[] args) {
        ObjectUtils.isEmpty(new HashMap<>());
        boolean a=new HashMap<>().equals(new HashMap<>());
        String a2="sss";
        System.out.println(a2=="sss");
        System.out.println();
    }
    @Test
    public void aVoid(){
        List<String> list = Arrays.asList("a,b,c", "1,2,3");

//将每个元素转成一个新的且不带逗号的元素
        Stream<String> s1 = list.stream().map(s -> s.replaceAll(",", ""));
        s1.forEach(
            System.out::println
        ); // abc  123
        Stream<String> s3 = list.stream().flatMap(s -> {
            //将每个元素转换成一个stream
            String[] split = s.split(",");
            Stream<String> s2 = Arrays.stream(split);
            return s2;
        });
        s3.forEach(System.out::println); // a b c 1 2 3
        Arrays.asList();
    }
    @Test
    public void test(){
        List<Student> students=new Login().lists();
    }
}
