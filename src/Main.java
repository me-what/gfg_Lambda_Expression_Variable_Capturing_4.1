public class Main {
    int data = 170;

    public static void main(String[] args) {
        int number = 10;

        MyFunction myLambda = (n) ->
        {
            int value = number + n;
            return value;
        };
        System.out.println("GFG!\n");


// 2
        Main gfg = new Main();

        MyInterface intFace = () ->
        {
            System.out.println("Data : " + gfg.data);
            gfg.data += 500;

            System.out.println("Data : " + gfg.data);
        };

        intFace.myFunction();
        gfg.data += 200;

        System.out.println("Data : " + gfg.data);
    }
}