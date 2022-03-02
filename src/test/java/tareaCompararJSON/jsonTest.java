package tareaCompararJSON;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;




public class jsonTest {

    @Test
    public void jsonAreEqualTest1() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar5\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": 1545645456\r\n" +
                "}";

        TareaJson t = new TareaJson();
        //t.jsonAreEqual(json1, json2, "ErrorEnMetodo");
        Assertions.assertThrows(Exception.class, ()->{t.jsonAreEqual(json1, json2, "ErrorEnMetodo");});
    }

    @Test
    public void jsonAreEqualTest2() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        TareaJson t = new TareaJson();
        t.jsonAreEqual(json1, json2, "ErrorEnMetodo");
    }


    @Test
    public void jsonAreEqualTest3() throws Exception {
        String json1 = "{\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        TareaJson t = new TareaJson();
        t.jsonAreEqual(json1, json2, "ErrorEnMetodo");
    }


    @Test
    public void jsonAreEqualTest4() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"abcd\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        TareaJson t = new TareaJson();
        t.jsonAreEqual(json1, json2, "ErrorEnMetodo");
    }

    @Test
    public void jsonAreEqualTest5() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": false,\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        TareaJson t = new TareaJson();
        t.jsonAreEqual(json1, json2, "ErrorEnMetodo");
    }

    @Test
    public void jsonAreEqualTest6() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "}";

        String json2 = "";

        TareaJson t = new TareaJson();
        Assertions.assertThrows(Exception.class, ()->{t.jsonAreEqual(json1, json2, "ErrorEnMetodo");});
    }

    @Test
    public void jsonAreEqualTest7() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "}";

        String json2 = "{\r\n" +
                "}";

        TareaJson t = new TareaJson();
        Assertions.assertThrows(Exception.class, ()->{t.jsonAreEqual(json1, json2, "ErrorEnMetodo");});
    }

    @Test
    public void jsonAreEqualTest8() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "}";

        TareaJson t = new TareaJson();
        Assertions.assertThrows(Exception.class, ()->{t.jsonAreEqual(json1, json2, "ErrorEnMetodo");});
    }

    @Test
    public void jsonAreEqualTest9() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "}";

        TareaJson t = new TareaJson();
        Assertions.assertThrows(Exception.class, ()->{t.jsonAreEqual(json1, json2, "ErrorEnMetodo");});
    }
}