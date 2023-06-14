package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // viewResolver 가 기능하지 않고 return문의 string을 바로 반환해준다.
public class LogTestController {
    /**
     * 1. 쓰레드 정보, 클래스 이름 같은 부가 정보를 함께 볼 수 있고, 출력 모양을 조정할 수 있다.
     * 2. 로그 레벨에 따라 개발 서버에서는 모든 로그를 출력하고, 운영서버에서는 출력하지 않는 등 로그를 상황에 맞게 조절할 수 있다.
     * 3. 파일이나 네트워크 등, 로그를 별도의 위치에 남길 수 있다.
     */

//    @Slf4j 를 사용하면 log를 선언해주지 않아도 사용이 가능하다.
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log=  {} " , name);
        log.debug("debug log=  {} " , name);
        log.info("info log=  {} " , name);
        log.warn("warn log=  {} " , name);
        log.error("error log=  {} " , name);

        return "ok";
    }
}
