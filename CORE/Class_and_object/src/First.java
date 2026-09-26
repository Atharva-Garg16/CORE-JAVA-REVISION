 class Box {
    int length;// data members or attributes of BOX
    int width;
    int height;
    int getVolume(){
        return length*width*height;// this is method
    }
    Box (int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }
    // let us set box height if user don't give to 10
     Box(int l, int w){
        this(l,w,10);
     }
     Box getBox(){
        return this;
     }

//     @Override
//     public String toString(this) {
//         return "Box{" +
//                 "length=" + this.length +
//                 ", width=" + this.width +
//                 ", height=" + this.height +
//                 '}';
//     }
 }
class Test{
    public static void main(String[] args) {
        /**
         * we can access member function and methods which are public by dot operator
         * class is blueprint object is real
         * this keyword used to refer current instance
         * we can also return object by using return this;
         * this() used for constructor call invoke a constructor of same class
         * we can also pass this AS argument for function call*/
        Box box = new Box(10,10,9);
        System.out.println(box.length);
        System.out.println("The volume of the box is "+box.getVolume());
        // By default, class data members are initialized with default values
        System.out.println("The volume of the box is "+box.getVolume());
        Box box2 = new Box(10,4);
        System.out.println(box2.getVolume());
        System.out.println(box2.getBox());// return current instance HashCode followed by @
    }
}