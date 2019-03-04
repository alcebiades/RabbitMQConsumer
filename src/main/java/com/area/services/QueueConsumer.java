package com.area.services;

import com.area.models.Person;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Controller;

@Controller
public class QueueConsumer {

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void getMessage(Person person) {
        System.out.println("Message got from the RabbitMQ = " + person);
    }
}
