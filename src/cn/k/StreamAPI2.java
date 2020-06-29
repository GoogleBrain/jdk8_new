package cn.k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI2 {
	
	public static void main(String[] args) {
		List<String> list =Arrays.asList("aaa","bbb","ccc","ddd","eee");
		
		list.stream().map((str)->str.toUpperCase()).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------");
		List<Student>list2 = new ArrayList<Student>();
		Student stu1 = new Student("李四",22);
		Student stu2 = new Student("李2",43);
		Student stu3 = new Student("李3",28);
		Student stu4 = new Student("李5",42);
		
		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu3);
		list2.add(stu4);
		
		/**
		 * map:接收lambda，将元素转换成其他形式或提取信息。接收一个函数作为参数，该函数会被应用到每个元素上，
		 * 并将其映射成一个新的元素；
		 */
		list2.stream().map(Student::getName).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------");
		
	    /**
	     * flatmap:接收一个函数作为参数，将流中的每个值都换成另一个流，然后将所有流连接成一个流。
	     */
		list.stream().flatMap(StreamAPI2::erery).forEach(System.out::println);
		
	}
	
	public static Stream<Character>erery(String str){
		List<Character> list = new ArrayList<>();
		for(Character ch:str.toCharArray()){
			list.add(ch);
		}
		return list.stream();
	}

}
