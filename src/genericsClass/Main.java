package genericsClass;

import java.util.ArrayList;

public class Main {

    // Do typów generycznych można używać tylko typów obiektowych ‐ korzystamy z klas opakowujących typów prostych
    // wykorzystanie:
    // wszędzie gdzie liczy się dla uniwersalność (zamiast tworzyć metodę w 5 przeciążonych wersjach różnych typów można zdefiniować 1 metodę generyczną)
    // przy kolekcjach

/*    T - Type
    E - Element
    K - Key
    N - Number
    V - Value*/

    public static void main(String a[]){
        MyGenericClass<String, Integer> myGenericClass = new MyGenericClass<>("SDA", 100);
        myGenericClass.printFieldTypes();
        myGenericClass.printFieldValues();
    }
}
