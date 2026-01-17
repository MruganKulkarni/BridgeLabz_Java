package Methods.Level3;

public class FootballTeamHeightAnalyzer {

    /*
     * Problem Statement:
     * Store the heights of football team players and determine the
     * shortest height, tallest height, and average height using methods.
     */

    double calculateAverage(double[] heights) {
        double sum = 0;

        // Accumulates total height
        for (double height : heights) {
            sum += height;
        }

        // Returns average height
        return sum / heights.length;
    }

    double findTallest(double[] heights) {
        double max = heights[0];

        // Finds maximum height
        for (double height : heights) {
            if (height > max) {
                max = height;
            }
        }

        return max;
    }

    double findShortest(double[] heights) {
        double min = heights[0];

        // Finds minimum height
        for (double height : heights) {
            if (height < min) {
                min = height;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        FootballTeamHeightAnalyzer obj = new FootballTeamHeightAnalyzer();

        double[] heights = {165.5, 170.2, 168.0, 172.8, 169.4};

        System.out.println("Average height: " + obj.calculateAverage(heights));
        System.out.println("Tallest height: " + obj.findTallest(heights));
        System.out.println("Shortest height: " + obj.findShortest(heights));
    }
}
