# Transaction
Spring MVC, Transaction 처리 시뮬레이션 프로젝트

## Transacntion은 Business 단에서 동작하기 때문에 ServiceTest에서 Junit test 진행. 

## 구성 
 - Controller X : View를 사용하게 된다면 향후 검토.
 - Sample1Mapper - Query1
 - Sample2MApper - Query2
 - SampleTxService - addData interface
 - SampleTxServiceImpl - addData의 구현.
 - SampleTxServiceTests - SampleTxServiceImpl의 JunitTest class.
 
## ReConfiguration
 - 예시상황
    - 현금 A, 포인트 B 가 있다. 
    - 홍길동은 A+B로 C금액에 해당하는 물건을 구입하려한다.
    - A+B는 50000원 이상 일 때 사용 가능하다.
    - C는 50000원 짜리 물건이고, 현재 A는 40000원, B는 10000원이 있다.
    - 홍길동이 구매버튼을 누르기 바로 직전 B(포인트)의 기간미사용 차감으로 포인트가 5000원 차감되었다.
    - 홍길동은 그 사실을 모른채 구매버튼을 눌렀다.
    - Transaction 처리를 하지않는다면, A+B 는 50000원도 안될뿐더러 금액이 모자라 현금만 고스란히 빠져나간다.
    - Transaction 처리를 통하여 길동이의 돈을 사수해주어라.