import java.util.Random;

public class QuoteGenerator {
    public static void main(String[] args) {
        String[] quotes = {
            "Believe you can and you're halfway there.",
            "Stay curious, stay foolish.",
            "Code like a girl. Break systems. Build better ones.",
            "The only limit is the one you set yourself.",
            "Push your limits, not just your commits."
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        System.out.println("🌟 Your Quote of the Day 🌟");
        System.out.println(quotes[index]);
    }
}
