package main;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.time.LocalDateTime;

/**
 * @author: fcx
 * @date: 2019-11-03 21:22
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("开始……");
            String url = "mybatis-config.xml";
            Reader reader = Resources.getResourceAsReader(url);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = factory.openSession();

            VehicleMapper mapper = session.getMapper(VehicleMapper.class);
//            Student student = new Student();
//            student.setName("冯昌鑫");
//            student.setAge(24);
//            student.setSex("男");
//            studentMapper.save(student);
            Vehicle vehicle = mapper.getById(3L);
            System.out.println(vehicle.getName());

            LocalDateTime dateTime = LocalDateTime.of(2019, 12, 11, 23, 2, 0);
            System.out.println(dateTime.getDayOfWeek().name());
            //session.commit();
            session.close();
            //Student s = studentMapper.getById()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
