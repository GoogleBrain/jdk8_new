package cn.k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

public class LambdaLearn {

	/**
	 * Consumer<T> 消费型接口 void accept(T t);
	 */
	@Test
	public void test1() {
		happy(1000, (x) -> System.out.print("金额：" + x));
	}

	public void happy(double money, Consumer<Double> dd) {
		dd.accept(money);
	}

	// -------------------------------------------------------------------------
	/**
	 * Supplier<T>供给型接口 T get();
	 * 
	 */
	@Test
	public void test2() {
		List<Integer> numList = getNumList(10, () -> (int) (Math.random() * 100));
		numList.forEach(System.out::println);
	}

	public List<Integer> getNumList(int num, Supplier<Integer> sup) {
		List<Integer> lists = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			Integer integer = sup.get();
			lists.add(integer);
		}
		return lists;
	}

	// -------------------------------------------------------------------------
	/**
	 * Function<T,R>:函数型接口 R apply(T t);
	 */

	@Test
	public void test3() {
		String strHandler = strHandler("abc", (x) -> x.toUpperCase());
		System.out.print(strHandler);
	}

	public String strHandler(String str, Function<String, String> fun) {
		return fun.apply(str);
	}

	// -------------------------------------------------------------------------
	/**
	 * Predicate<T>:断言型接口 boolean test(T t);
	 */
	@Test
	public void test4() {
		List<String> lists = Arrays.asList("hello", "atguigu", "www", "ok");
		List<String> ls = filterStr(lists, (a) -> a.length() > 3);
		ls.forEach(System.out::println);
	}

	public List<String> filterStr(List<String> list, Predicate<String> pre) {
		List<String> strList = new ArrayList<>();
		for (String str : list) {
			if (pre.test(str)) {
				strList.add(str);
			}
		}
		return strList;
	}
}
