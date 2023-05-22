public class Main {

    static Student[] students = new Student[]{
            Student.of("Ahmad", 20, Gender.MALE, true, Course.MATH, Course.CHEMISTRY, Course.JAVA),
            Student.of("Mohammad", 25, Gender.MALE, true, Course.MATH, Course.JAVA),
            Student.of("ESA", 27, Gender.MALE, false, Course.MATH, Course.JAVA),
            Student.of("ESRA", 19, Gender.FEMALE, true, Course.MATH, Course.ENGLISH),
            Student.of("DANA", 20, Gender.FEMALE, true, Course.MATH, Course.ENGLISH, Course.PHYSICS),
            Student.of("RUBA", 22, Gender.FEMALE, true, Course.MATH, Course.PHYSICS)
    };
    public static void main(String[] args) {
        MyHashMap<Integer,Student> hashMap=new MyHashMap<>();
//        hashMap.add(1001,students[0]);
//        hashMap.add(1001,students[1]);
//        hashMap.add(1001,students[2]);
//        hashMap.add(1001,students[1]);

        int hashCode = Integer.valueOf(1002).hashCode();
        System.out.println("hashCode = " + hashCode);
    }
}