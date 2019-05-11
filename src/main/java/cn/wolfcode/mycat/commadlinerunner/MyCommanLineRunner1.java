package cn.wolfcode.mycat.commadlinerunner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * MyCommanLineRunner1
 */
@Component
@Order(1)
public class MyCommanLineRunner1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("runner1:" + Arrays.toString(args));
    }

}