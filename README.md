# Test API Demo

간단한 **Spring Boot REST API** 데모 프로젝트입니다.  
`/hello` 엔드포인트를 호출하면 현재 한국 시간, 타임스탬프, 메시지를 JSON 형식으로 응답합니다.

---

### 🚀 기술 스택
- Java 17
- Spring Boot 3.5.6
- Gradle
- Lombok
---

## 📂 프로젝트 구조
src/main/java/com/test/hwk/test_api_demo
├─ TestApiDemoApplication.java # 스프링 부트 실행 클래스
└─ controller
└─ HelloCtrl.java # /hello REST API 컨트롤러

yaml
코드 복사

---

## ⚡ 실행 방법

### 1. 로컬 실행 (Gradle)
```bash
./gradlew bootRun
```
### 2. Jar 빌드 & 실행
```bash
./gradlew clean build
java -jar build/libs/test_api_demo-0.1.1.jar
```



