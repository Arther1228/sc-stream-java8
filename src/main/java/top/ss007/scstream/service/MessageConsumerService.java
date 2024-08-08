package top.ss007.scstream.service;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import top.ss007.scstream.model.DkMonitorDevice;

@Service
public class MessageConsumerService {

    @RabbitListener(queues = "DK_MONITOR_DEVICE")
    public void handleMessage(String message) {
        try {
            DkMonitorDevice monitorDevice = JSON.parseObject(message, DkMonitorDevice.class);
            System.out.println("Received message: " + monitorDevice);
        } catch (Exception e) {
            System.err.println("Failed to parse the message: " + message);
            e.printStackTrace();
        }

    }
}
