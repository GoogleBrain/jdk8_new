package cn.k;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/**
 * ɸѡ����Ƭ
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
		 * Filter
		 */
		// Stream<String> filter = list.stream().filter((x)-> x.length()>3);
		// filter.forEach(System.out::println);

		/**
		 * limit��ֻҪǰ����
		 */
		// list.stream().limit(2).forEach(System.out::println);

		/**
		 * ����ǰ����
		 */
		// list.stream().skip(2).forEach(System.out::println);

		list.stream().distinct().forEach(System.out::println);
	}
}
