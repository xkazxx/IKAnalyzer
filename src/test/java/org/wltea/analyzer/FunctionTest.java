package org.wltea.analyzer;

import org.junit.Test;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: org.wltea.analyzer
 * date:2021/12/30
 */
public class FunctionTest {

  @Test
  public void test1() throws IOException {
    String target = "调查情况：城区供电公司西城供电所抢修运行班班长张永生于一个工作日2019年2月28日 17:30 分使用电话66014827与客户取得联系，随后接电话的是客户本人。户号为0010371448的客户反映，其用电正常，抄表人员自2018年5月至2019年2月，连续10个周期无抄表示数，电表编号为：013003201798505。经核实，2019年2月28日接到此工单后，我中心安排抢修人员于当日17:40 分，到达北京市西城区铸钟胡同30号现场。经现场检查，客户处供电产权线路及电表运行正常。该客户编号：0010371448，电表号：3201798505，抄表方式：远采集抄。对于客户反映，抄表人员连续10个周期无抄表示数的情况为：我中心工作人员通过采集系统及现场核实，该客户现场所用电表及抄表均正常。2018年4月至2019年1月期间，抄表员所抄电表用电示数：0、系统内抄见电表用电示数：0、现场核实电表用电示数：0，不存在错抄、估抄或未抄的现场。客户反映存在连续10个周期抄表为0度的原因是，客户家中有两块电表，自2018年4月至2019年1月期间，此块电表（电表号：3201798505）一直未用电。所以，此期间电表抄表示数为0，客户反映连续10个周期无抄表示数的情况不存在。采取措施：城区供电公司西城供电所抢修运行班班长张永生于2019年2月28日 18:15 分再次通过电话与客户取得联系，接电话的是客户本人。张永生通过电话向客户解释并说明以上情况后，客户对供电公司的工作处理流程表示理解，并对此次的处理结果表示满意。处置人：西城供电所抢修运行班班长张永生。审核人员：西城供电所主任王佩全。处置日期：2019年2月28日。";

    final IKSegmenter ikSegmenter = new IKSegmenter(new StringReader(target), true);
    Lexeme next;
    final ArrayList<String> list = new ArrayList<String>();
    while ((next = ikSegmenter.next()) != null) {
        list.add(next.getLexemeText());
    }
    System.out.println(list);
  }
}
