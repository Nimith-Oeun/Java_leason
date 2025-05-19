package classAndObject;

public class Employee {
    private Integer id;
    private String uuid;
    private String name;
    private String position;
    private Double salary;

    public void setEmployee(Integer id, String uuid, String name, String position, Double salary) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{\n" +
                "  id=" + id +
                "\n, uuid='" + uuid + '\'' +
                "\n, name='" + name + '\'' +
                "\n, position='" + position + '\'' +
                "\n, salary=" + salary +
                '}';
    }
}
