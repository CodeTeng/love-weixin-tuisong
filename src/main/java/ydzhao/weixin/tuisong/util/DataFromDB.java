package ydzhao.weixin.tuisong.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟推送人数据
 *
 * @author teng
 */
public class DataFromDB {

    private static String OPENID_TENG = "";

    private static String OPENID_XIAO = "";

    /**
     * 模拟从数据库中查找需要通知的女友信息
     */
    public static Map<String, DateFromOpenId> getDataFromDB() {
        Map<String, DateFromOpenId> data = new HashMap<>(2);
        DateFromOpenId dateFromOpenId1 = DateFromOpenId.builder().openId(OPENID_TENG)
                .birthday("2023-06-13")
                .loveDate("2022-10-21")
                .cityId("101044000")
                .hasLoveDate(AnniversariesDate.after("2022-10-21"))
                .remainBirthday(AnniversariesDate.before("2023-06-13"))
                .build();
        data.put(OPENID_TENG, dateFromOpenId1);
        DateFromOpenId dateFromOpenId2 = DateFromOpenId.builder().openId(OPENID_XIAO)
                .birthday("2023-06-13")
                .loveDate("2022-10-21")
                .cityId("101044000")
                .hasLoveDate(AnniversariesDate.after("2022-10-21"))
                .remainBirthday(AnniversariesDate.before("2023-06-13"))
                .build();
        data.put(OPENID_XIAO, dateFromOpenId2);
        return data;
    }
}
