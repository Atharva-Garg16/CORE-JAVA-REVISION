class CSE_DEPT{
    static String DeptName="CSE";
    int id;
    // single shared copy
    // static members and methods can't directly access non-static members of class
    // but non-static members can access static method or variable
    static void getHodName() {
        System.out.println("kamal kumar");
//        System.out.println(id);
        // Non-static field 'id' cannot be referenced from a static context
    }
}
class CSE_DEPTTest{
    public static void main(String[] args) {
        System.out.println(CSE_DEPT.DeptName);
        CSE_DEPT.getHodName();
        // Static methods and members are member of class not of specific object
        CSE_DEPT d1=new CSE_DEPT();
        d1.DeptName="DATA SCIENCE";// if we try to modify it for some object it'll be modified for all
        System.out.println(d1.DeptName);// we can also access by object but not recommended
        System.out.println(CSE_DEPT.DeptName);// this will also change as static means class behavior
    }
}
