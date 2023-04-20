/*
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.

Пример 1:
Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';

Пример 2:
Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
Результат: SELECT * FROM USER;
 */


import java.util.Arrays;


public class TaskJava1 {
    public static void main(String[] args) {
        String stringToFilter = "\"name:Ivanov\" \"country:null\" \"city:null\" \"age:null\"";
        String[] stringToFilterArrayNew = stringToFilter.split("\"?\\s+\"?|:\"?");
        System.out.println(Arrays.toString(stringToFilterArrayNew));
        //if (stringToFilterArrayNew.length > 0) { // проверяем, что массив не пустой
            //String[] keyValuePairs = stringToFilterArrayNew[0].split(",");
        StringBuilder filterBuilder = new StringBuilder();

        for (int i = 0; i < stringToFilterArrayNew.length + 1; i += 2) {
            if (i + 1 < stringToFilterArrayNew.length) { // проверяем, что есть следующий элемент
                String key = stringToFilterArrayNew[i];
                String value = stringToFilterArrayNew[i + 1];
                if (!value.equals("null\"") && !value.equals("null")) {
                    if (filterBuilder.length() > 0) {
                            filterBuilder.append(" and ");
                    }
                    filterBuilder.append(key).append(" = '").append(value).append("'\"");
                }
            }
        }

        String filter = filterBuilder.toString();
        System.out.println(filter);
        //} else {
           //System.out.println("Массив пустой");
        //}
    }
}



/*
По поводу HashMap https://metanit.com/java/tutorial/5.8.php
 */