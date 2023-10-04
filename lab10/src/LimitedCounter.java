public class LimitedCounter extends Counter
{
    /**
     * Constructs a new LimitedCounter whose current count is
     * initialized to DEFAULT_MINIMUM, and which counts between
     * DEFAULT_MINIMUM and DEFAULT_MAXIMUM, inclusive.
     */
    public LimitedCounter()
    {
        super();
    }

    /**
     * Constructs a new LimitedCounter whose current count is
     * initialized to minCount, and which counts between
     * minCount and maxCount, inclusive.
     */
    public LimitedCounter(int minCount, int maxCount)
    {
        super(minCount,maxCount);
    }

    /**
     * increments the count by 1, if it hits the maximum it will stay there and will not progress further.
     */
    public void countUp()
    {
        // If we've reached the maximum count, invoking this
        // method doesn't change the state of the counter.
        if (super.count() != super.maximumCount()) {
            super.countUp();
        }
    }

    /**
     * Decrements the count by 1, if it hit's the minimum it will not progress.
     */
    public void countDown()
    {
        // If we've reached the maximum count, invoking this
        // method doesn't change the state of the counter.
        if (super.count() != super.minimumCount()) {
            super.decrementCount();
        }
    }
}
