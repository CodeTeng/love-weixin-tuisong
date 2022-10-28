package ydzhao.weixin.tuisong.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 推送人需要的类
 *
 * @author teng
 */
@AllArgsConstructor
@Builder
@Data
public class DateFromOpenId {
    /**
     * 推送人OpenId
     */
    String openId;

    /**
     * 城市
     */
    String cityId;

    /**
     * 恋爱
     */
    String loveDate = "2022-10-21";

    /**
     * 生日
     */
    String birthday = "2023-06-13";

    /**
     * 在一起多久了
     */
    Integer hasLoveDate;

    /**
     * 还剩多少天生日
     */
    Integer remainBirthday;
}
