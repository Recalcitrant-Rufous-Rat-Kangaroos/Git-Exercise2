public class ExJessieJames {
    public int jessieMethod(){
        int count = 1;
        for (int i = 0; i < 10; i++) {
            count = count*2;
        }
        return count;
    }

    public int jamesMethod(int a, int b){
        int product = a*b;
        return product;
    }

    public String jessieJamesMethod(){
        String string1 = "Prepare for trouble";
        String string2 = "and make it double!";
        return (string1 + "... " + string2);
    }
}
