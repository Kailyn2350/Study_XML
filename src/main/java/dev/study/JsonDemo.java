package dev.study;

import com.google.gson.Gson;
import java.util.Map;

public class JsonDemo {
    public static void main(String[] args) {
        Map<String, Object> m = Map.of("msg", "Hello", "ok", true, "n", 123); // Key-value 자료 구조인데 Map.of는 Map초기화 메서드로써
                                                                              // 여러개의 키, 값을 초기화 하는게 가능함 결과는 불변
        String json = new Gson().toJson(m); // Gson은 구글에서 만든 JSON 라이브러리로, 객체를 JSON 문자열로 변환하는 기능을 제공함
        System.out.println(json);
    }
}
