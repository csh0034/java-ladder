# 사다리 게임

## 기능 목록
- LadderController
  - 사다리 게임을 실행한다.
- ResultConverter
  - 사다리와 참가자, 실행결과 값을 전달 받아 결과 Dto 를 생성한다.
- InputView
  - 참여할 사람을 입력받는다.
  - 최대 사다리 높이를 입력받는다.
  - 사다리의 게임의 실행 결과를 입력 받는다.
  - 사람 이름을 입력받을 경우 결과에 맞는 당첨 결과를 보여준다.
- ResultView
  - 생성된 사다리를 출력한다.
- Generator
  - RandomGenerator
    - random 으로 boolean 값을 생성한다.
- Domain
  - Height
    - 사다리 높이를 저장한다.
    - 양수인지 체크한다.
  - Participant
    - 참여자 이름을 저장한다. (최대 5자리)
  - Participants
    - Participant 일급 컬렉션
    - 참여자 목록을 관리한다.
  - Direction
    - 왼쪽, 오른쪽으로 가야하는 방향값을 Boolean 으로 보관한다.
  - Point
    - 각 사다리 교차 지점을 나타낸다.
    - Direction 값을 갖는다.
    - 이전 Point 의 정보를 계산하여 새로운 포인트를 생성한다.
  - Line
    - Point 일급 컬렉션
    - 사다리의 한 라인에 포인트를 저장한다.
    - index 입력시 해당 Point 의 이동결과 값을 반환한다.
  - Ladder
    - Line 일급 컬렉션
    - 사다리의 모든 Line 을 저장한다.
    - 인덱스를 입력받아 Point 정보에 따라 사다리를 1회 이동한후 결과의 인덱스를 반환한다.
  - ExecutionResult
    - 사다리 실행 결과를 저장한다.
    - 인덱스를 입력받아 실행 결과를 반환한다.
- Dto
  - LadderResultDto
    - 사람 또는 all 입력시 사다리 수행결과를 리턴한다.