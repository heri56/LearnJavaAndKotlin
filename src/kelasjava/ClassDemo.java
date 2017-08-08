package kelasjava;

public class ClassDemo {
    public static void main(String[] args) {

        ClassDemo k = new ClassDemo();
        Package pack = ClassDemo.class.getPackage();
        Class cls = k.getClass();

        String TAG = ClassDemo.class.getSimpleName();

        String name = cls.getName();

        System.out.println("Nama class = " + name);
        System.out.println("Nama package = " + name);

        String sname = cls.getSimpleName();
        System.out.println("Nama kelas = " + sname);

        String ok = pack.getName();
        System.out.println("Nama PACKAGE = " + ok);
        System.out.println("Nama KELAS = " + TAG);

//        public static void main(String[] args) {
//
//            try {
//                Class cls = Class.forName("java.lang.Integer");
//
//                // returns the name and package of the class
//                System.out.println("Class = " + cls.getName());
//                System.out.println("Package = " + cls.getPackage());
//            } catch(ClassNotFoundException ex) {
//                System.out.println(ex.toString());
//            }
//        }
    }
}