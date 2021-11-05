public class AddVariedParameterList {
    public static void main(String[] args) {
        
        System.out.println("\nAdd 25 and 65: " + addElements(25, 65));
        System.out.println("\nAdd 235, 68, 213 and 27: " + addElements(235, 66, 213, 27));
    }

    public static int addElements(int ... NumberList) {
        
        int sum = 0;
    //Total of all elementsin the NumberList
        for (int index = 0; index < NumberList.length; index++) {
            sum += NumberList[index];
            //System.out.println(sum);
        }
        System.out.println();
        for (int addList : NumberList) {
            System.out.println("\nDisplay elements: " + addList);           
            sum += addList;
            System.out.println(sum);
        }
        return sum;
    }
}
