package 코딩테스트합격자되기_자바편.스트림;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream API
 * 간결한 코드 : Stream API를
 * 일관된 메서드 : 컬렉션, 배열 등 다양한 데이터소스를 동일한 방식으로 처리할 수 있다.
 * 선언적 프로그래밍: 어떻게 처리할지 명령형으로 작성하지 않고, 무엇을 할지를 선언적으로 표현할 수 있다.
 * 병렬 처리: 쉡게 병렬 스트림을 사용할 수 있어서 멀티코어 프로세서를 활용한 병렬 처리를 간편하게 구현할 수 있다.
 */
public class Stream {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana");
        List<String> filteredWords = list.stream() //스트림으로 변환
                .filter(word -> word.startsWith("a")) //조건에 맞는 요소만 포함하는 스트림 반환
                .collect(Collectors.toList());//다시 리스트로

        System.out.println(filteredWords);


        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number) // 요소를 다른 형태로 변환하는 스트림 반환
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);

        List<String> names = Arrays.asList("John", "Jane", "Doe");
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("sortedNames = " + sortedNames);

        //최종연산은 스트림을 소비하여 결과를 생성한다.
        // collect: 스트림의 요소를 컬렉션으로 수집한다.
        List<String> collect = names.stream().collect(Collectors.toList());
        names.stream().forEach(name -> System.out.println("for each " + name));
    }


}






