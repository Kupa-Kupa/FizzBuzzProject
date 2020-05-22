public class fizzbuzz {
    // public static void main(String[] args) { // my first attempt
    // for (int i = 1; i <= 100; i++) {
    //     if (i % 15 == 0) {
    //         System.out.println("fizzbuzz");
    //     }
    //     else if (i % 3 == 0) {
    //         System.out.println("fizz");
    //     }
    //     else if (i % 5 == 0) {
    //         System.out.println("buzz");
    //     }
    //     else {
    //         System.out.println(i);
    //     }
    // }
    // }

    // public static void main(String[] args) { // https://www.youtube.com/watch?v=QPZ0pIK_wsc solution
    //     for (int i = 1; i <= 100; i++) {
    //         String output = "";
    //         if (i % 3 == 0) {
    //             output += "fizz";
    //         }
    //         if (i % 5 == 0) {
    //             output += "buzz";
    //         }
    //         if (output == "") {
    //             output += i;
    //         }
    //         System.out.println(output);
    //     }
    //     }


    public static void main(String[] args) { // my improvedment on https://www.youtube.com/watch?v=QPZ0pIK_wsc solution
        int divisibleBy [] = {3, 5};
        String words [] = {"fizz", "buzz"};
        for (int i = 1; i <= 100; i++) {
            String output = "";
            int iteration = 0;
            for (int num : divisibleBy) {   // can't get the current interation in the foreach loop in java apparently https://stackoverflow.com/questions/3431529/java-how-do-i-get-current-index-key-in-for-each-loop
                                            // could also use a normal for loop here: for(int i = 0; i < divisibleBy.lenth; i++)
                    if (i % num == 0) {
                        output += words [iteration];
                    }
                    iteration++;
                }
            if (output == "") {
                output += i;
            }
            System.out.println(output);
        }
        }
}

// Version with a normal for loop - this might be cleaner code

// public static void main(String[] args) {
//     int divisibleBy [] = {3, 5};
//     String words [] = {"fizz", "buzz"};
//     for (int i = 1; i <= 100; i++) {
//         String output = "";
//         for (int j = 0; j < divisibleBy.length; j++) {
//                 if (i % divisibleBy[j] == 0) {
//                     output += words[j];
//                 }
//             }
//         if (output == "") {
//             output += i;
//         }
//         System.out.println(output);
//     }
//     }