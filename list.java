public class list {
    private int id;
    private String name;
    private double salary;

    public list(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "list [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    
    
}
