public class IntermittentReinforcement {

    public IntermittentReinforcement() {}

    private static final String[] REWARDS = {"A", "B", "C", "D"};
    private static final float REWARD_PROBABILITY = 0.25f;

    public String getReward() {

        if (Math.random() <=  REWARD_PROBABILITY) {
            return "No reward.";
        }

        return REWARDS[(int) (Math.random() * REWARDS.length)];

    }

}
