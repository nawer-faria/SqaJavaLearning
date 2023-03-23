package Class2;

public class Operators {
    public static void main(String[] args) {

        //Unary Operator: expr++ expr-- ++expr --expr
        int num = 1;
        System.out.println(">>>>>Unary Operators: expr++ expr-- ++expr --expr <<<<<");
        System.out.println("expr++ = " + num++);
        System.out.println("expr++ = " + ++num);
        System.out.println("expr++ = " + num--);
        System.out.println("expr++ = " + --num);
        System.out.println("Final Value of num = " + num);
        System.out.println("=====================================");

        //Arithmetic Operator: * / % +
        int a = 9;
        int b = 4;
        System.out.println(">>>>> Arithmetic Operators: * / % + - <<<<<");
        System.out.println("SUM the numbers = " + a + b);
        System.out.println("SUBTRACT the numbers = " + (a - b));
        System.out.println("MULTIPLY the numbers = " + a * b);
        System.out.println("DIVIDE the numbers = " + a / b);
        System.out.println(" REMINDER of the numbers= " + a % b);
        System.out.println("=====================================");


        // Assignment Operator: = += -= *= /= %=
        a += 5;
        b -= 2;
        System.out.println(">>>>> Assignment Operator: = += -= *= /= %= <<<<<");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        a /= 2;
        b *= 5;
        b %= a;
        System.out.println("Final Value of a= " + a);
        System.out.println("Final Value of b= " + b);
        System.out.println("=====================================");

        //Relational Operator: < > <= >= == !=
        System.out.println(">>>>> //Relational Operator: < > <= >= == != <<<<<");
        System.out.println("a > b is " + (a > b));
        System.out.println("a < b is " + (a < b));
        System.out.println("a >= b is " + (a >= b));
        System.out.println("a <= b is " + (a <= b));
        System.out.println("a == b is " + (a == b));
        System.out.println("a != b is " + (a != b));
        System.out.println("=====================================");

        //Logical Operator: && ||
        System.out.println(">>>>> Logical Operator: && || <<<<<");
        System.out.println("(a>b) && (a!=b) is " + ((a > b) && (a != b)));
        System.out.println("(a>b) && (a<b) is " + ((a > b) && (a < b)));
        System.out.println("(a>b) || (a!=b) is " + ((a > b) || (a != b)));
        System.out.println("(a>b) || (a<b) is " + ((a <= b) || (a < b)));
        System.out.println("=====================================");

        //Ternary Operator and : ? : (int min=(a<b)?a:b)
        System.out.println(">>>>> Ternary Operator and : ? : (int min=(a<b)?a:b) <<<<<");
        System.out.println("Final Value of a= " + a);
        System.out.println("Final Value of b= " + b);
        int updateVariable_a = (a < b) ? a : b;
        int updateVariable_b = (b < a) ? a : b;
        System.out.println("Updated Value of a = " + updateVariable_a);
        System.out.println("Updated Value of b = " + updateVariable_b);
        System.out.println("=====================================");

    }

}
