package cn.k;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/**
 * 筛选与切片
 * @author googlebrain
 *
 */
public class StreamAPI {

	@Test
	public void test1() {
		/*
		 * filter; limit; skip;
		 * 
		 */

		List<String> list = new ArrayList<>();
		list.add("112312");
		list.add("2324235423123");
		list.add("3098");
		list.add("412312");
		list.add("123");
		list.add("41231");
		list.add("324");
		list.add("324");

		/**
		 * Filter:接收lambda，从流中排除某些元素
		 */
		// Stream<String> filter = list.stream().filter((x)-> x.length()>3);
		// filter.forEach(System.out::println);

		/**
		 * limit，截断流，使其元素不超过指定数量;
		 */
		// list.stream().limit(2).forEach(System.out::println);

		/**
		 * skip：调过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。
		 */
		// list.stream().skip(2).forEach(System.out::println);
		
		
        /**
         * distinct:筛选,通过流所生成元素的hashcode()和equals()去除重复元素；
         */
		list.stream().distinct().forEach(System.out::println);
	}
}
