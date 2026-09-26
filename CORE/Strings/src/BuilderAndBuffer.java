public class BuilderAndBuffer {
    // StringBuilder fastest immutable we'll use it mostly
    // StringBuffer between String and Builder thread safe
    // buffer and builder are stored in heap whereas normal string in string pool
    static void main() {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello World");
        System.out.println(sb2);
        // in toString() method we can also implement via StringBuilder or StringBuffer
    }
}
