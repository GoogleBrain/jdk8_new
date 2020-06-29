package cn.k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPI4 {

	/**
	 * allMatch--����Ƿ�ƥ������Ԫ�أ�
	 * anymatch--����Ƿ�����ƥ��һ��Ԫ�أ�
	 * noneMatch--����Ƿ�û��ƥ������Ԫ�أ�
	 * findFirst--���ص�һ��Ԫ�أ�
	 * findAny--���ص�ǰ���е�����Ԫ�أ�
	 * count--��������Ԫ�ص��ܸ�����
	 * max--�����������ֵ��
	 * min--����������Сֵ�� 
	 */
	public static void main(String[] args) {
		List<Student> list2 = new ArrayList<Student>();
		Student stu1 = new Student("����", 22);
		Student stu2 = new Student("��2", 433);
		Student stu3 = new Student("��3", 28);
		Student stu4 = new Student("��5", 4442);
		Student stu5 = new Student("��6", 42);
		Student stu6 = new Student("��6", 32);

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
