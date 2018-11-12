package genericsClass;

// Dlaczego nie Object?
// Object sprawia dużo problemów, związanych
// przykłąd klasy generycznej - ArrayList
// - z ciągłą koniecznością rzutowania obiektów
// - braku informacji o faktycznym typie obiektu

import java.util.ArrayList;
import java.util.List;

class MyGenericClass<U, V>{

    private U uField;
    private V vField;

    public MyGenericClass(U objU, V objV){
        this.uField = objU;
        this.vField = objV;
    }

    public void printFieldTypes(){
        System.out.println("U jest typem: "+ uField.getClass().getName());
        System.out.println("V jest typem: "+ vField.getClass().getName());
    }

    public void printFieldValues(){
        System.out.println(uField);
        System.out.println(vField);
    }
}