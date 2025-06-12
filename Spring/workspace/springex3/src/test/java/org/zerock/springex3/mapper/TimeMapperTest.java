package org.zerock.springex3.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TimeMapperTest {
    @Autowired(required = false)
    private TimeMapper timeMapper;

    @Autowired(required = false)
    private TimeMapper2 timeMapper2;

    // Test 어노테이션으로 서버를 실행하지 않고 코드를 확인 가능
    @Test
    public void testGetTime(){
        // log4j2를 이용한 로그를 출력
        log.info(timeMapper.getTime());
        System.out.println(timeMapper.getTime());
    }

    @Test
    public void testGetTime2(){
        log.info(timeMapper2.getTime());
        System.out.println(timeMapper2.getTime());
    }
}
