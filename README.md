# 사다리 게임
## 요구사항
### 기능 요구사항
- 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다. 사다리를 출력할 때 사람 이름도 같이 출력한다.
- 사람 이름은 쉼표(,)를 기준으로 구분한다.
- 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
- 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
    - |-----|-----| 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.

### 프로그래밍 요구사항
- **자바 8의 스트림과 람다를 적용해 프로그래밍한다.**
- **규칙 6: 모든 엔티티를 작게 유지한다.**

### 기능 목록
- 플레이어의 이름을 입력 받는다
- 이름을 `,`를 기준으로 나눠 플레이어를 생성한다
    - 이름은 1자 이상 5자 이하
- 사다리의 높이를 입력 받는다
    - 사다리의 높이는 1 이상
- 사람 수  * 높이 의 사다리를 생성한다
    - 라인을 순서대로 생성 한다.
        - 라인은 여려 지점으로 이뤄졌다.
    - 라인은 겹치지 않는다  
- 결과를 출력한다 