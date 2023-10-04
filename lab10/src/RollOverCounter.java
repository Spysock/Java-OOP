public class RollOverCounter extends Counter
{

    public RollOverCounter()
    {
        super();

    }

    /**
     * Constructs a new RollOverCounter whose current count is
     * initialized to minCount, and which counts between
     * minCount and maxCount, inclusive.
     */
    public RollOverCounter(int minCount, int maxCount)
    {
        super(minCount, maxCount);
    }

    /**
     * Increment this counter by 1, if it hits the maximum value it will go back to it's minimum value on the next incrementation
     */
    public void countUp()
    {
        // If we've reached the maximum count, invoking this
        // method rolls the counter over to its minimum value.
        if (super.count() == super.maximumCount()) {
            super.reset();
        } else {
            super.countUp();
        }
    }

    /**
     * Decrement this counter by 1. If we've reached the minimum count,
     * invoking this method rolls the counter over to its maximum value.
     */
    public void countDown()
    {
        if (isAtMinimum()) {
            setToMaximum();
        } else {
            super.decrementCount();
        }
    }

}
