public abstract class MyMath {

    public static int add(int one, int two){
        return one+two;
    }
    public static int sub(int one, int two){
        return one-two;
    }
    public static int mul(int one, int two){
        return one*two;
    }
    public static int div(int one, int two){
        return one/two;
    }
    public static int pow(int one, int two){
        int start = one;
        for (int i = 1; i < two; i++){
            start *= one;
        }
        return start;
    }
}
