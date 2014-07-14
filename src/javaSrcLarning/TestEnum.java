package javaSrcLarning;

import java.util.EnumMap;
import java.util.EnumSet;

public class TestEnum {

    private Teacher mTeacher;

    class Teacher {

        private int age;
        private String name;

        public Teacher(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Teacher [age=" + age + ", name=" + name + "]";
        }
    }

    private enum TypeEnum {
        type1, type2, type3
    }

    public static void main(String[] args) {
        // TestImplentInterface testImplentInterface=new TestImplentInterface();
        // System.out.println("InClass->getValue:"+testImplentInterface.getData());

        // TestEnum testObject = new TestEnum();
        // testObject.mTeacher = testObject.new Teacher(10, "lili");
        // System.out.println(testObject.mTeacher.toString());
        //
        // TestEnum.Teacher teacher = testObject.mTeacher;
        // teacher.age = 10000;
        // System.out.println(testObject.mTeacher.toString());

        TypeEnum typeEnum = TypeEnum.type3;
        System.out.println("InClass->getValue:" + typeEnum.ordinal());

        for (TypeEnum string : TypeEnum.values()) {
            System.out.println("each typeEnum:" + string);
        }

        // EnumSet的使用
        EnumSet<TypeEnum> typeMap = EnumSet.allOf(TypeEnum.class);
        for (TypeEnum typeEnum2 : typeMap) {
            System.out.println("EnumSet each typeEnum:" + typeEnum2);
        }
        // EnumMap的使用
        EnumMap<TypeEnum, String> enumMap = new EnumMap<TestEnum.TypeEnum, String>(TypeEnum.class);
        enumMap.put(TypeEnum.type1, "is type1");
        enumMap.put(TypeEnum.type2, "is type2");
        enumMap.put(TypeEnum.type3, "is type3");
        for (TypeEnum s : TypeEnum.values()) {
            System.out.println("name:" + s.name() + " value:" + enumMap.get(s));
        }

    }

}
