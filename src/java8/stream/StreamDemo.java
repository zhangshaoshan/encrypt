package java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        method1();
    }
    private static void method1(){
        People p1 = new People("11",11);
        People p2 = new People("22",22);
        People p3 = new People("大红",33);
        People p4 = new People("44",44);
        ArrayList<People> peopleArrayList = new ArrayList<>();
        peopleArrayList.add(p3);
        peopleArrayList.add(p4);
        peopleArrayList.add(p1);
        peopleArrayList.add(p2);
        //forEach  我要遍历
        peopleArrayList.forEach(p-> System.out.println(p.getAge()));
        //filter  我要过滤
        List<People> collect = peopleArrayList.stream().filter(p -> p.getAge() > 22).collect(Collectors.toList());
        //map  我要修改元素
        List<String> stringCollect = peopleArrayList.stream().map(p -> p.getName()).collect(Collectors.toList());
        stringCollect.forEach(p-> System.out.println(p));
        //Collectors 我要变换成另一种类型
        Map<Long, String> mapCollect = peopleArrayList.stream().collect(Collectors.toMap(p -> (long) p.getAge(),p->p.getName()));
        System.out.println(mapCollect);
        //sorted  我要排序   按照一定的规则排序   Comparator.comparing
        //逆序 peopleArrayList.stream().sorted(Comparator.reverseOrder())
        //指定规则排序  peopleArrayList.stream().sorted(Comparator.comparing(People::getAge))
        peopleArrayList.stream().sorted(Comparator.comparing(People::getName)).forEach(p-> System.out.println(p.getName()));
        //limit  我要获取排名前三的
        peopleArrayList.stream().sorted(Comparator.comparing(p -> p.getName())).limit(3).forEach(p-> System.out.println(p.getName()));

        Map<String,String> map = new HashMap<>();
        map.put("aa","11");
        map.put("bb","22");

    }
}
