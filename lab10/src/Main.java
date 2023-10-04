/**
 * Part 1:
 * 1 B)  3
 *
 * 3 C) maximumCount = 5, minimumCount = 1, count = 1
 *
 * 4 A) Yes
 * B) Yes
 *
 * At the very end the count will reset once it hits its maximum
 *
 * Part2:
 * maximumCount = 5, minimumCount = 1, count = 1
 *
 * The count will start at its minimum, once it's maximum is hit the ".maximum" function will return true.
 * Once countUp() is called again the counter will just sit at the maximum value.
 *
 */

public class Main {
    public static void main(String[] args){
        RollOverCounter count1 = new RollOverCounter(1,5);
        System.out.println("At maximum: " + count1.maximumCount());
        System.out.println("At minimum: " + count1.minimumCount());
        System.out.println("count: " + count1.count());
        System.out.println("At minimum: " + count1.isAtMinimum());
        count1.countUp();
        System.out.println("count: " + count1.count());
        count1.countUp();
        System.out.println("count: " + count1.count());
        count1.countUp();
        System.out.println("count: " + count1.count());
        count1.countUp();
        System.out.println("count: " + count1.count());
        System.out.println("At maximum: " + count1.isAtMaximum());
        count1.countUp();
        System.out.println("count: " + count1.count());
        System.out.println("At minimum: " + count1.isAtMinimum());


        //Limited counter
        System.out.println("\nThis is the Limited counter");
        LimitedCounter count2 = new LimitedCounter(1,5);
        System.out.println("At maximum: " + count2.maximumCount());
        System.out.println("At minimum: " +count2.minimumCount());
        System.out.println(count2.count());
        System.out.println("At minimum: " + count2.isAtMinimum());
        count2.countUp();
        System.out.println("count: " + count2.count());
        count2.countUp();
        System.out.println("count: " + count2.count());
        count2.countUp();
        System.out.println("count: " + count2.count());
        count2.countUp();
        System.out.println("count: " + count2.count());
        System.out.println("At maximum: " + count2.isAtMaximum());
        count2.countUp();
        System.out.println("count: " + count2.count());
        System.out.println("At minimum: " + count2.isAtMinimum());

        //Testing Counter method
        System.out.println("\nTesting Counter method");
        Counter count3;
        count3 = count2;
        System.out.println("At maximum: " + count3.maximumCount());
        System.out.println("At minimum: " + count3.minimumCount());
        System.out.println("count: " + count3.count());
        System.out.println("At minimum: " + count3.isAtMinimum());
        count3.countUp();
        System.out.println("count: " + count3.count());
        count3.countUp();
        System.out.println("count: " + count3.count());
        count3.countUp();
        System.out.println("count: " + count3.count());
        count3.countUp();
        System.out.println("count: " + count3.count());
        System.out.println("At maximum: " + count3.isAtMaximum());
        count3.countUp();
        System.out.println("count: " + count3.count());
        System.out.println("At minimum: " + count3.isAtMinimum());

        //Testing RollOver Count Down
        System.out.println("Testing CountDown method for RollOver");
        System.out.println("count: " + count1.count());
        System.out.println("At minimum: " + count1.isAtMinimum());
        count1.countUp();
        System.out.println("count: " + count1.count());
        count1.countUp();
        System.out.println("count: " + count1.count());
        count1.countUp();
        System.out.println("count: " + count1.count());
        count1.countUp();
        System.out.println("count: " + count1.count());
        System.out.println("At maximum: " + count1.isAtMaximum());
        count1.countDown();
        System.out.println("count: " + count1.count());
        count1.countDown();
        System.out.println("count: " + count1.count());
        count1.countDown();
        System.out.println("count: " + count1.count());
        count1.countDown();
        System.out.println("count: " + count1.count());
        count1.countDown();
        System.out.println("count: " + count1.count());
        System.out.println("At minimum: " + count1.isAtMaximum());

        //Limited counter going down
        System.out.println("\nThis is the Limited counter testing count down");
        System.out.println(count2.count());
        System.out.println("At minimum: " + count2.isAtMinimum());
        count2.countUp();
        System.out.println("count: " + count2.count());
        count2.countUp();
        System.out.println("count: " + count2.count());
        count2.countUp();
        System.out.println("count: " + count2.count());
        count2.countUp();
        System.out.println("count: " + count2.count());
        System.out.println("At maximum: " + count2.isAtMaximum());
        count2.countDown();
        System.out.println("count: " + count2.count());
        count2.countDown();
        System.out.println("count: " + count2.count());
        count2.countDown();
        System.out.println("count: " + count2.count());
        count2.countDown();
        System.out.println("count: " + count2.count());
        count2.countDown();
        System.out.println("count: " + count2.count());
        System.out.println("At minimum: " + count2.isAtMinimum());

    }
}
