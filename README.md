# BuilderPattern
builder And director

# 사용 이유
생성자의 인자가 많아지면 코드 변경이 잦아져서, build() 메소드를 통해서 인스턴스를 생성한다.

# 상세 내용
Builder가 필드와 동일한 이름의 메소드를 Builder 타입으로 반환하고, build()로 타겟 인스턴스를 생성한다.
