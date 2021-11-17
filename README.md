# 사다리 게임

## 기능 목록
- LadderController
  - 사다리 게임을 실행한다.
- InputView
  - 참여할 사람을 입력받는다.
  - 최대 사다리 높이를 입력받는다.
- ResultView
  - 생성된 사다리를 출력한다.
- PointGenerator
  - RandomPointGenerator
    - 넓이와 높이를 값 만큼 랜덤 Point 리스트를 생성한다.
- Domain
  - Height
    - 사다리 높이를 저장한다.
    - 양수인지 체크한다.
  - Participant
    - 참여자 이름을 저장한다. (최대 5자리)
  - Participants
    - Participant 일급 컬렉션
    - 참여자 목록을 관리한다.
  - Point
    - 각 사다리 교차 지점을 나타낸다.
    - 교차 지점에서 오른쪽으로 사다리가 있는지 Boolean 값으로 보관한다.
    - 이전 Point 의 정보를 계산하여 새로운 포인트를 생성한다.
  - Ladder
    - 사다리 전체의 각 Point(교차 지점) 을 관리한다.