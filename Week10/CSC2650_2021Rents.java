public class CSC2650_2021Rents {
    
    public static void main(String[] args) {
        
        int [][] monthyRents ={ {650, 700, 760},
        {750, 810, 880},
        {875, 926, 990},
        {1250, 1500, 1850}
        };
        int floor, bedrooms;

        for(floor = 0; floor < monthyRents.length; ++floor){
            for(bedrooms = 0; bedrooms < monthyRents[floor].length; ++bedrooms){
                System.out.println("\nFloor " + (floor +1) + " Bedrooms " + (bedrooms + 1) + " Rent is $: " + monthyRents[floor][bedrooms]);

            }

        }
    }

}
