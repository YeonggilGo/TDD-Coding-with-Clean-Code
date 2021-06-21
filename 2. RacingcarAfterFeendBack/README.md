# After FeedBack

> 피드백 받으면서 생각한 점들

- Protected + Override를 사용하여 Random같이 test하기 힘든 부분을 해소 할 수 있다.

  - Test를 위해 Production Code가 Refactor 되면 안된다...
  - Test를 위해 구조체를 따로 만드는게 났다. Main production code의 방향을 수정하진 마라.

- 유지 보수 할 때 확장성을 위해서 어디까지 Class, Interface를 설계 할 지 고민 하면서 설계하자.

  - 그래도 과도한 건 안된다... 효율적으로 설계해라.

- 함수형 프로그래밍, DI, DesignPatturn을 어떻게 활용 할 수 있을지 고려해보자.

- Getter method로 property를 사용하려고 하지 말고 객체 지향적으로, equal method 같은걸 구현해라.

- Immutable object를 만듬으로써 bug가 날 수 있는 상황을 줄일 수 있다. 하지만 property change -> new instance 로 인해 Memory cost가 증가 하기 때문에 성능과 비용을 고려해야한다.

  
