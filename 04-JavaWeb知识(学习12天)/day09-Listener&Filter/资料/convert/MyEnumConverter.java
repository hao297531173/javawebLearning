package cn.itcast.convert;

import org.apache.commons.beanutils.Converter;

/**
 * 自定义枚举转换器
 * 
 * 
 */
public class MyEnumConverter implements Converter {

	@Override
	// 将value 转换为 c类型 --- 枚举通用转换器
	public Object convert(Class c, Object value) {
		String strVal = (String) value;
		// 等价于 Type.valueOf(strVal);
		return Enum.valueOf(c, strVal);
	}

}
