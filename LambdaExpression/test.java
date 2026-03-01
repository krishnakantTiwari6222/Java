package LambdaExpression;

public class test {
    public static void main(String[] args) {
        employee Employee = () -> "Engineer";
        System.out.println(Employee.getName()); 
        employee Editor = () -> "Editor";
        System.out.println(Editor.getName());
    }
}
