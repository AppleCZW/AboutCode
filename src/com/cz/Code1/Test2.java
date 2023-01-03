package com.cz.Code1;

/*
@author cz

*/

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Person p1 = new Person("小明",222);
        Person p2 = new Person("小亮",33);
        List<Person> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
//        System.out.println(list);
//        List res=list.stream()
//                .map(Person::getAge)
//                .collect(Collectors.toList());
//        System.out.println(res);

//        List<String> list = new ArrayList<String>();
//        list.add("I am a boy");
//        list.add("I love the girl");
//        list.add("But the girl loves another girl");
        //System.out.println(list);

//        Function<Person, Integer> getAge = Person::getAge;
//        Integer apply = getAge.apply(p1);
//        System.out.println(apply);


        list.sort(Comparator.comparing(Person::getName,
                (s,t)->Integer.compare(s.length(),t.length())));
        //按照人名的长度进行排序

        for (Person person : list) {
            System.out.print( person);
        }


    }
}
