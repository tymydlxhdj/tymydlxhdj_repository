package com.test.todel.test;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.todel.jsondatabind.UserEntity;

public class JsonTEST {

//	 public static void main( String[] args ) {
//		Entity entity = new Entity("James", "James");

		  public static void main(String[] args) throws JsonProcessingException {
			  UserEntity user = new UserEntity();
		        user.setName("zhangsan");
		        user.setUid("zhangsan@163.com");
//		        user.setAge(20);
//
//		        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
//		        user.setBirthday(dateformat.parse("1996-10-01"));

		        /**
		         * ObjectMapper是JSON操作的核心，Jackson的所有JSON操作都是在ObjectMapper中实现。
		         * ObjectMapper有多个JSON序列化的方法，可以把JSON字符串保存File、OutputStream等不同的介质中。
		         * writeValue(File arg0, Object arg1)把arg1转成json序列，并保存到arg0文件中。
		         * writeValue(OutputStream arg0, Object arg1)把arg1转成json序列，并保存到arg0输出流中。
		         * writeValueAsBytes(Object arg0)把arg0转成json序列，并把结果输出成字节数组。
		         * writeValueAsString(Object arg0)把arg0转成json序列，并把结果输出成字符串。
		         */
		        ObjectMapper mapper = new ObjectMapper();

		        //User类转JSON
		        //输出结果：{"name":"zhangsan","age":20,"birthday":844099200000,"email":"zhangsan@163.com"}
		        String json = mapper.writeValueAsString(user);
		        System.out.println(json);

		        //Java集合转JSON
		        //输出结果：[{"name":"zhangsan","age":20,"birthday":844099200000,"email":"zhangsan@163.com"}]
		        List<UserEntity> users = new ArrayList<UserEntity>();
		        users.add(user);
		        String jsonlist = mapper.writeValueAsString(users);
		        System.out.println(jsonlist);
		    }
}
