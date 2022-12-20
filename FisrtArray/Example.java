public class Example {
    public static void main(String args[]){

        // Arrays store one datatype
        int numberOfChristmasGifts[];
        numberOfChristmasGifts = new int[200];
/*
        numberOfChristmasGifts[0] = 7;
        numberOfChristmasGifts[1] = 3;

        System.out.println(numberOfChristmasGifts[0]);

        numberOfChristmasGifts[0] = 42;
        numberOfChristmasGifts[1] = 6;

        System.out.println(numberOfChristmasGifts[0]);
        System.out.println(numberOfChristmasGifts[1]);
*/
        for(int x = 0; x < numberOfChristmasGifts.length; x++){
            numberOfChristmasGifts[x] = 6;
            System.out.println(numberOfChristmasGifts[x]);
        }




    }

}