package zhSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestChinese {
	public static void main(String[] args) throws Exception {
		sortCN();
	}

	// 中文排序示列代码
	public static void sortCN() {
		// 创建 list
		List<String> list2 = new ArrayList<String>();
		list2.add("网易汽车 - W");
		list2.add("新民汽车网 - X");
		list2.add("钛媒体 - T");
		list2.add("瘾科技 - Y");
		list2.add("昕薇网 - X");
		list2.add("安倍 - A");
		list2.add("中国 - Z");
		list2.add("中心 - Z");

		// 创建 Comparator 比较对象
		@SuppressWarnings("unchecked")
		Comparator<Object> cmp2 = com.ibm.icu.text.Collator.getInstance(com.ibm.icu.util.ULocale.SIMPLIFIED_CHINESE);

		// 排序
		Collections.sort(list2, cmp2);
		// 输出排序后的list
		for (String str : list2) {
			System.out.println(str);
		}
	}
}
