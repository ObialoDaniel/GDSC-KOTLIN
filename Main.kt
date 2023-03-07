fun main(args: Array<String>) {
   val input =15
    var num1 =0
    var num2 = 1
     print ("upto $input: ")
    while (num1 <= input){
        print ("$num1 + ")
        val sum = num1 + num2
        num1 = num2
        num2 = sum


    }
}