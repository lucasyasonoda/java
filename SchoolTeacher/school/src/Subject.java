public class Subject{
    private String name;
    private int workload;
    private Teacher teacher;    

    public Subject(String name, int workload, Teacher teacher) {
        this.name = name;
        this.workload = workload;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }
    
    public int getWorkload() {
        return workload;
    }

    public Teacher getTeacher() {
        return teacher;
    }    
    
    public void Print(){
        System.out.println(">>> Subject <<<");
        System.out.println("Name: " + getName());
        System.out.println("Workload: " + getWorkload());
        teacher.Print();
    }
    
}
