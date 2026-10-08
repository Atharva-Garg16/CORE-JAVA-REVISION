public static class Student {
    private final String name;
    private final char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public char getGrade() {
        return grade;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", grade=" + grade + "]";
    }
}

static void main() {
    PriorityQueue<Student> pq = new PriorityQueue<>(new  Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getGrade()-o2.getGrade();
        }
    });
    pq.add(new Student("kamal",'C'));
    pq.add(new Student("kamaal",'D'));
    pq.add(new Student("ramesh",'A'));
    pq.add(new Student("kamlesh",'B'));
    System.out.println(pq);
    while (!pq.isEmpty()) {
        System.out.println(pq.poll());
    }

}
