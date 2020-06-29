package cn.k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI3 {
	
	/**
	 * sort ����
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list =Arrays.asList("ccc","ddd","aaa","fff","eee");
		
		list.stream().map((str)->str.toUpperCase()).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------");
		
		list.stream().sorted().forEach(System.out::println);
		
		
		System.out.println("---------------------------------------------------------------");
		List<Student>list2 = new ArrayList<Student>();
		Student stu1 = new Student("����",22);
		Student stu2 = new Student("��2",43);
		Student stu3 = new Student("��3",28);
		Student stu4 = new Student("��5",42);
		Student stu5 = new Student("��6",42);
		Student stu6 = new Student("��6",32);
		
		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu3);
		list2.add(stu4);
		list2.add(stu5);
		list2.add(stu6);
		
		list2.stream().sorted((x,y)->Integer.compare(x.getAge(), y.getAge())
				).forEach(System.out::println);
	}
}
