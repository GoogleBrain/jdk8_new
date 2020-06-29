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
		Student stu1 = new Student("����",22);
		Student stu2 = new Student("��2",43);
		Student stu3 = new Student("��3",28);
		Student stu4 = new Student("��5",42);
		
		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu3);
		list2.add(stu4);
		
		/**
		 * map:����lambda����Ԫ��ת����������ʽ����ȡ��Ϣ������һ��������Ϊ�������ú����ᱻӦ�õ�ÿ��Ԫ���ϣ�
		 * ������ӳ���һ���µ�Ԫ�أ�
		 */
		list2.stream().map(Student::getName).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------");
		
	    /**
	     * flatmap:����һ��������Ϊ�����������е�ÿ��ֵ��������һ������Ȼ�����������ӳ�һ������
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
