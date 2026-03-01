package LambdaExpression;

public class test {
    public static void main(String[] args) {
        employee Employee = () -> "Engineer";
        System.out.println(Employee.getName()); 
        employee Editor = () -> "Editor";
        System.out.println(Editor.getName());
    }
}


// if we use lambda expression in functional interfaces then we dont need separate classes for the implementation;;

// And also in our interface it consist of single method then we dont need separate classes for the implementation;;