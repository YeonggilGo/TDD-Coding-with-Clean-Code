package study;

import java.util.*;

public class StrikeBall {
    public Scanner sc;
    public boolean success;

    public void startgame() {
        sc = new Scanner(System.in);
        int[] answer = generateRandomNumbers();
        success = false;
        do {
            System.out.println("숫자를 입력해 주세요 : ");
            int[] input = getInput();
            System.out.println(checkAnswer(input));
        } while (!success);
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        int cond = sc.nextInt();
        if (cond == 1) {
            startgame();
        }
        return;
    }

    public int[] generateRandomNumbers() {
        Random random = new Random();
        Set<Integer> tempResult = new HashSet<>();
        while (tempResult.size() < 3) {
            tempResult.add(random.nextInt(8) + 1);
        }
        int[] result = new int[3];
        int index = 0;
        for (int num : tempResult) {
            result[index] = num;
            index += 1;
        }
        return result;
    }

    public String checkAnswer(int[] input) {
        String output = new String();
        if (input[1] != 0) {
            output = output.concat(String.valueOf(input[1]) + "볼 ");
        }
        if (input[0] == 3) {
            success = true;
        }
        if (input[0] != 0) {
            output = output.concat(String.valueOf(input[0]) + "스트라이크");
        }
        if (output.isEmpty()) {
            output = output.concat("낫씽");
        }
        return output;
    }

    public int[] getInput() {
        int[] result = new int[3];
        for (int i = 0; i < 3; i++) {
            result[i] = sc.nextInt();
        }
        return result;
    }

    public int[] getAnswer(int[] input, int[] answer) {
        int[] result = {0, 0};
        checkStrike(input, answer, result);
        checkBall(input, answer, result);
        return result;
    }

    public void checkStrike(int[] input, int[] answer, int[] result) {
        for (int i = 0; i < 3; i++) {
            if (input[i] == answer[i]) {
                result[0] += 1;
            }
        }
    }

    public void checkBall(int[] input, int[] answer, int[] result) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) continue;
                if (input[i] == answer[j]) {
                    result[1] += 1;
                    break;
                }
            }
        }
    }
}