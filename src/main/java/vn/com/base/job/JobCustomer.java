package vn.com.base.job;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class JobCustomer {

//    @Async
//    @Scheduled(fixedRate = 1000)
//    public void scheduleFixedRateTask() throws InterruptedException {
//        System.out.println(
//                "Fixed rate task - START: " + System.currentTimeMillis() / 1000);
//        for (int i=0; i < 10000; i++) {
//            int a = 1;
//            Thread.sleep(1);
//        }
//        System.out.println(
//                "Fixed rate task - END: " + System.currentTimeMillis() / 1000);
////        Thread.sleep(2000);
//    }

//    @Scheduled(cron = "0,2,5,6 23 7 19 * ?")
//    public void scheduleTaskUsingCronExpression() {
//
//        long now = System.currentTimeMillis() / 1000;
//        System.out.println(
//                "schedule tasks using cron jobs - " + now);
//    }
}
