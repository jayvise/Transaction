package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import lombok.Setter;
import lombok.extern.log4j.Log4j;



/**
 * @author wisdomose
 * Controller 가 아닌 Service에서 Test가 진행되는 이유,
 * Transaction 은 비즈니스 계층에서 이루어짐.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
//Java설정의 경우 
//@ContextConfiguration(classes= {RootConfig.class})

public class SampleTxServiceTests {

  @Setter(onMethod_ = { @Autowired })
  private SampleTxService service;
  
  
   

  @Test
  public void testLong() {
    
    String str ="Starry\r\n" + 
        "Starry night\r\n" + 
        "Paint your palette blue and grey\r\n" + 
        "Look out on a summer's day";
    
    log.info(str.getBytes().length);
    
    service.addData(str);    
  }
  
  
}


