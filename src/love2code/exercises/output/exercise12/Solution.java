package love2code.exercises.output.exercise12;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

    /*
     * Complete the 'countPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY numbers
     *  2. INTEGER k
     */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.countPairs(numbers, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    public class Result {


        public static int countPairs(List<Integer> numbers, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            int count = 0;
            for (int number : numbers) {
                map.put(number, map.getOrDefault(number, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (k == 0) {
                    if (entry.getValue() >= 2) {
                        count++;
                    }
                } else {
                    if (map.containsKey(entry.getKey() + k)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

}
