package java.com.gateway;


import com.ruoyi.gateway.filter.BlackListUrlFilter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class ServiceExceptionTest {

    @BeforeEach
    void setUp() {
        System.out.println("up");
    }

    @AfterEach
    void tearDown() {
        System.out.println("down");
    }

    @Test
    void testThirdTest() {
        BlackListUrlFilter.Config blackListUrlFilter = new BlackListUrlFilter.Config();
        blackListUrlFilter.setBlacklistUrl(null);
        List<String> blacklistUrl =
                blackListUrlFilter.getBlacklistUrl();
        System.err.println(blacklistUrl);
    }
}