package ru.Ryabov.seminar2.HW2.task1;

/*
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Данные для фильтрации приведены ниже в виде json-строки.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

public class Program1 {
    public static void main(String[] args) {
        StringBuilder fromWhere = new StringBuilder();
        String[] json = {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
        int jLen = json.length;
        for (int i = 0; i < jLen; i++) {
            if (json[i].indexOf("null") == (-1)) {
                fromWhere.append(json[i].replace(":", "="));
                if (i != jLen - 2) {
                    fromWhere.append(" & ");
                }
            }
        }
        System.out.println("\nWHERE имеет вид: " + fromWhere);
    }
}
