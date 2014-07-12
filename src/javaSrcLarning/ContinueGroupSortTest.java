package javaSrcLarning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinueGroupSortTest {

    public static void main(String[] args) {
        ContinueGroupSort();
    }

    static void ContinueGroupSort() {
        Integer i[] = { 1, 3, 4, 5, 8 };
        // Integer i[] = {2, 1, 3, 5, 6, 7, 8, 10, 12, 14, 16, 17, 18, 19,
        // 21,13};
        // 1 6 7
        Arrays.sort(i);
        List<String> values = new ArrayList<String>();
        int start = i[0];// ��¼ÿһ�������ĵ�һ����
        int begin = i[0];

        for (int j = 1; j < i.length; j++) {
            System.out.println("j=" + j);
            if (begin + 1 == i[j] && j != i.length - 1) {
                begin = i[j];
                continue;
            }

            begin = i[j];
            if (start == begin
                    || (start != begin && start == i[j - 1] && j != i.length - 1)) {// û�������ģ�ֻ��һ����
                values.add(String.valueOf(start));
            } else if (j == i.length - 1 && i[j - 1] == begin - 1) { // ���һ������
                values.add(String.valueOf(start) + "-" + String.valueOf(i[j]));
            } else { // ���һ�鲻����
                if (start != i[j - 1]) {
                    values.add(String.valueOf(start) + "-"
                            + String.valueOf(i[j - 1]));
                } else {
                    values.add(String.valueOf(start));
                }
                if (j == i.length - 1) {
                    values.add(String.valueOf(i[j]));
                }
            }
            start = begin;
        }
        System.out.println(values);
    }
}
