package ydzhao.weixin.tuisong.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ydzhao.weixin.tuisong.util.Pusher;
import ydzhao.weixin.tuisong.util.Template;


/**
 * @author teng
 */
@Component
@Lazy(false)
public class JobWorker {
    @Autowired
    Pusher pusher;

    /**
     * 每天早晨 7：30 发送
     */
    @Scheduled(cron = "0 30 7 * * ?")
    public void goodMorning() {
        pusher.push(Template.MorningTemplateId);
    }

//    @Scheduled(cron = "0 30 16 * * ?")
//    public void goodAfternoon() {
//        pusher.push(Template.AfternoonTemplateId);
//    }
//
//    @Scheduled(cron = "0 30 22 * * ?")
//    public void goodEvening() {
//        pusher.push(Template.EveningTemplateId);
//    }
}
