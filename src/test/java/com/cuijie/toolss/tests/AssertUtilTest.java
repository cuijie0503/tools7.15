package com.cuijie.toolss.tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.cuijie.toolss.utils.AssertExc;
import com.cuijie.toolss.utils.AssertUtil;
/**
 * 
 * @ClassName: AssertUtilTest 
 * @Description: 工具类测试类
 * @author:崔杰 
 * @date: 2019年7月15日 上午8:56:26
 */
public class AssertUtilTest {
/**
 * 
 * @Title: testIsTrue 
 * @Description: 断言为真，如果为假，则抛出自定义异常，
 * 异常消息为第2个参数默认消息。 (5分)
 * @return: void
 * @throws AssertExc 
 */
	@Test
	public void testIsTrue() throws AssertExc {
		
		//AssertUtil.isTrue(1>2, "参数为假");
	
		AssertUtil.isTrue(2>1, "参数为假");
	}
	/**
	 * 
	 * @Title: testIsFalse 
	 * @Description: 断言为假，如果为真，则抛出自定义异常，
	 * 异常消息为第2个参数默认消息。 (5分)
	 * @return: void
	 * @throws AssertExc 
	 */
	@Test
	public void testIsFalse() throws AssertExc {
//		AssertUtil.isFalse(1>2, "参数为真");
		AssertUtil.isFalse(2>1, "参数为真");
		
	}
	/**
	 * 
	 * @Title: testNotNull 
	 * @Description:：断言对象不为空，如果为空，则抛出自定义异常，
	 * 异常消息为第2个参数默认消息。 (5分)
	 * @return: void
	 * @throws AssertExc 
	 */
	@Test
	public void testNotNull() throws AssertExc {
		
//		AssertUtil.notNull(new String("123"), "参数为空");
		AssertUtil.notNull(null, "参数为空");
	}

	/**
	 * 
	 * @Title: testIsNull 
	 * @Description: ：断言对象必须空，如果不为空，则抛出自定义异常，
	 * 异常消息为第2个参数默认消息。 (5
	 * @return: void
	 * @throws AssertExc 
	 */
	@Test
	public void testIsNull() throws AssertExc {
//		AssertUtil.isNull(null, "参数不为空");
		AssertUtil.isNull(new String("123"), "参数不为空");
	}
	/**
	 * 
	 * @Title: testNotEmptyCollectionOfQString 
	 * @Description:断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，
	 * 则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @return: void
	 * @throws AssertExc 
	 */
	@Test
	public void testNotEmptyCollectionOfQString() throws AssertExc {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
//		AssertUtil.notEmpty(list, "参数为空");
		AssertUtil.notEmpty(list, "参数为空");
		
	}
	/**
	 * 
	 * @Title: testNotEmptyMapOfQQString 
	 * @Description: 断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，
	 * 则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @return: void
	 * @throws AssertExc 
	 */
	@Test
	public void testNotEmptyMapOfQQString() throws AssertExc {
		HashMap<Object, Object> map = new HashMap<>();
		map.put("a", 1);
//		AssertUtil.notEmpty(map, "参数为空");
		AssertUtil.notEmpty(map, "参数为空");
	}
	/**
	 * 
	 * @Title: testHasText 
	 * @Description: 断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，
	 * 如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @return: void
	 * @throws AssertExc 
	 */
	@Test
	public void testHasText() throws AssertExc {
		
//		AssertUtil.hasText(new String("123"), "参数没有值");
		AssertUtil.hasText(new String(""), "参数没有值");
	}
	/**
	 * 
	 * @Title: testGreaterThanZero 
	 * @Description: 断言值必须大于0，如果小于或等于0，
	 * 则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @return: void
	 * @throws AssertExc 
	 */
	@Test
	public void testGreaterThanZero() throws AssertExc {
		
//		AssertUtil.greaterThanZero(new BigDecimal("12"), "参数小于或等于0");
		AssertUtil.greaterThanZero(new BigDecimal("-1"), "参数小于或等于0");
		
	}

}
