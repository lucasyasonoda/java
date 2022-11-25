public class Teacher
{
    private String Name;
    private String Titulation;    //Especialista, Mestre, Doutor
    private int workload;

    public Teacher(String Name, String Titulation, int workload)
    {
        this.Name = Name;
        this.Titulation = Titulation;
        this.workload = workload;
    }

    public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTitulation() {
		return Titulation;
	}

	public void setTitulation(String titulation) {
		Titulation = titulation;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

    public void Print()
    {
        System.out.println(">>> Teacher <<<");
        System.out.println("Name: " + Name);
        System.out.println("Titulation: " + Titulation);
        System.out.println("Workload: " + workload);
    }
}