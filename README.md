# 프로젝트 실행 방법
springboot 프로젝트 빌드하기. 각자 환경에 맞는 명령어로 빌드해 주세요.

*자바 21 버전 필요

```
// 윈도우 명령어
./gradlew.bat clean build // 빌드
   

// 맥 명령어
chmod +x ./gradlew // 권한 부여
./gradlew clean build // 빌드
./gradlew bootRun // 실행

```
LoginServerApplication.java 파일에서 삼각형 버튼(run) 눌러서 run

브라우저에서 localhost:8080/api/users/all 확인해보기.
실행 직후에는 h2 데이터베이스에 아무것도 없기때문에 [] 빈 리스트 나오면 프로젝트 실행 성공입니다.


# API URL 

| Function |  Type  | URL | ETC |
|:---|:------:|:---|:---|
| 사용자 추가 |  Post  | /api/users | 사용자 Id(userId), 사용자 전화번호(phoneNumber)는 중복 X, RequestBody에 사용자 정보 담아 전달 |
| 사용자 조회 |  Get   | /api/users/{userId} | |
| 사용자 전체 조회 |  Get   | /api/users/all | |
| 사용자 삭제 | Delete | /api/users/{userId} | |
| 사용자 수정 |  Put   | /api/users/{userId} | 사용자 Id(userId)는 수정 불가 | 
| 사용자 로그인 |  Post  | /api/users/login | true/false 반환, RequestBody에 id, pw 담아 전달 | 

# API 사용방법

1. Local에 해당 레포를 git clone한다.
2. build.gradle 파일을 실행해 Run 한다.
3. Vue.js를 이용해 실습(url 요청)한다.

**서버는 h2 데이터베이스 기반이고 다시 실행하면 전체 테이블 내용이 삭제되니 주의**


# API requestBody, responseBody 예시
> 위에는 요청에 들어가는 requestBody, 아래는 응답에 들어가는 responseBody입니다.


| api description | examples |
|:---|:---|
|회원가입 (사용자 추가) | ![image](https://github.com/user-attachments/assets/c028673f-eb23-4f44-8425-3b335441b9da) |
|사용자 조회 | ![image](https://github.com/user-attachments/assets/07e8e785-cd10-45cb-8707-872181d594e6) |
| 사용자 전체 조회 | ![image](https://github.com/user-attachments/assets/fb4082ec-9b71-49b9-972b-78ec1b5841fe) |
| 사용자 삭제 | ![image](https://github.com/user-attachments/assets/ffe4b378-4c7e-4a5f-aac4-ef93cb90ebca) |
| 사용자 수정 | ![image](https://github.com/user-attachments/assets/14519f1c-37d4-4682-a8aa-57ddd7dedd96) |
| 사용자 로그인 | 로그인 성공시 true 반환 <br/> ![image](https://github.com/user-attachments/assets/ef61cb95-3dbf-41ab-b744-59121bd913d2)  <br/>  로그인 실패 시 false 반환 <br/> ![image](https://github.com/user-attachments/assets/fd3c653e-e6da-47b2-900e-1822d3dceedc) |



