package ydzhao.weixin.tuisong.util;


import com.alibaba.fastjson.JSONObject;


/**
 * 天气数据获取
 *
 * @author teng
 */
public class Weather {

    private static String appid = "";

    private static String appsecret = "";

    /**
     * 获取天气 Json 数据
     *
     * @param cityId 城市id
     */
    public static JSONObject getWeather(String cityId) {
        String result = null;
        JSONObject today = new JSONObject();
        try {
            String url = "https://v0.yiketianqi.com/api?unescape=1&version=v61&appid=" + appid + "&appsecret=" + appsecret + "&cityid=";
            result = HttpUtil.getUrl(url + cityId);
            System.out.println(result);
            JSONObject jsonObject = JSONObject.parseObject(result);
//            System.out.println(jsonObject.getString("wea")); // 实时天气情况
//            System.out.println(jsonObject.getString("tem")); // 实时温度
//            System.out.println(jsonObject.getString("tem1")); // 高温
//            System.out.println(jsonObject.getString("tem2")); // 低温
            today = jsonObject;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return today;
    }

    public static void main(String[] args) {
        System.out.println(getWeather("101044000"));
    }
}