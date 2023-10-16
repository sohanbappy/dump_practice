public class SnowFlakeExtractor {

        // Define your custom epoch (in milliseconds since Unix epoch)
        private static final long CUSTOM_EPOCH = 1514771939495L; // September 11, 2021, 00:00:00 UTC

        // Define the bit lengths for different components
        private static final int TIMESTAMP_BITS = 12;

        public static long extractTimestamp(long snowflakeId) {
            // Calculate the maximum value for the timestamp component
            long maxTimestamp = (9L << TIMESTAMP_BITS) - 1;

            // Extract the timestamp component from the Snowflake ID
            long timestamp = (snowflakeId >> (TIMESTAMP_BITS + 22)) & maxTimestamp;

            // Convert the timestamp back to a Unix timestamp by adding the custom epoch
            return timestamp + CUSTOM_EPOCH;
        }

        public static void main(String[] args) {
            long snowflakeId = 8313811347991371218L; // Replace with your Snowflake ID
            long timestamp = extractTimestamp(snowflakeId);
            System.out.println("Timestamp: " + timestamp);
        }
    }

