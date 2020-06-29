package cn.k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPI4 {

	/**
	 * allMatch--检查是否匹配所有元素；
	 * anymatch--检查是否至少匹配一个元素；
	 * noneMatch--检查是否没有匹配所有元素；
	 * findFirst--返回第一个元素；
	 * findAny--返回当前流中的任意元素；
	 * count--返回流中元素的总个数；
	 * max--返回流中最大值；
	 * min--返回流中最小值； 
	 */
	public static void main(String[] args) {
		List<Student> list2 = new ArrayList<Student>();
		Student stu1 = new Student("李四", 22);
		Student stu2 = new Student("李2", 433);
		Student stu3 = new Student("李3", 28);
		Student stu4 = new Student("李5", 4442);
		Student stu5 = new Student("李6", 42);
		Student stu6 = new Student("李6", 32);

		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu3);
		list2.add(stu4);
		list2.add(stu5);
		list2.add(stu6);
        
//		boolean allMatch = list2.stream().allMatch((x) -> x.getName().equals(22));
//		System.out.print(allMatch);
		
//		boolean anyMatch = list2.stream().anyMatch((x)->x.getAge()==22);
//		System.out.print(anyMatch);
		
//		boolean anyMatch = list2.stream().noneMatch((x)->x.getAge()==992);
//		System.out.print(anyMatch);
		
//		Optional<Student> anyMatch = list2.stream().findFirst();
//		System.out.print(anyMatch);
		
//		Optional<Student> anyMatch = list2.stream().findAny();
//		System.out.print(anyMatch);
		
//		long count = list2.stream().count();
//		System.out.print(count);
		
//		Optional<Student> max = list2.stream().max((x,y)->Integer.compare(x.getAge(),y.getAge()));
//      System.out.print(max);
		
		Optional<Integer> min = list2.stream().map(Student::getAge).min((x,y)->Integer.compare(x, y));
		System.out.print(min);
	}
}
