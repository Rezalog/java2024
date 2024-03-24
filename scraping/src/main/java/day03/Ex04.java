package day03;

import org.json.JSONArray;
import org.json.JSONObject;

public class Ex04 {
    public static void main(String[] args) {
        String jsonString="{\"root\":[{\"id\":1111,\"name\":\"guest\"},{\"id\":2222,\"name\":\"admin\"}]}";
        JSONObject obj = new JSONObject(jsonString);
        JSONArray arr = obj.getJSONArray("root");
        for(int i = 0; i < arr.length(); i++){
            JSONObject item = arr.getJSONObject(i);
            // 배열 내 아이템 사용
            int id=item.getInt("id");
            String name=item.getString("name");
            System.out.println(String.format("%s:%s", id,name));
        }
        
    }
}
