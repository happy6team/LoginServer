# API URL 

| Function | Type | URL | ETC |
|:---|:---:|:---|:---|
| 사용자 추가 | Post | /api/users | 사용자 Id(userId), 사용자 전화번호(phoneNumber)는 중복 X, RequestBody에 사용자 정보 담아 전달 |
| 사용자 조회 | Get | /api/users/{userId} | |
| 사용자 전체 조회 | Get | /api/users/all | |
| 사용자 삭제 | Delete | /api/users/{userId} | |
| 사용자 수정 | Put | /api/users/{userId} | 사용자 Id(userId)는 수정 불가 | 
| 사용자 로그인 | Get | /api/users/login | true/false 반환, RequestBody에 id, pw 담아 전달 | 

# API 사용방법

1. Local에 해당 레포를 git clone한다.
2. build.gradle 파일을 실행해 Run 한다.
3. Vue.js를 이용해 실습(url 요청)한다.

**서버는 h2 데이터베이스 기반이고 다시 실행하면 전체 테이블 내용이 삭제되니 주의**
