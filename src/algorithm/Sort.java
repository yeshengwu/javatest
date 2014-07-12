package algorithm;

public class Sort {
    public static void main(String args[]) {
        // int vec[] = new int[] { 3, 5, 1, 4, 2 };
        int vec[] = new int[] { 37, 47, 23, -5, 19, 56 };

        // bubbleSort
        int temp;
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length - 1; j++) {
                if (vec[j + 1] > vec[j]) {
                    temp = vec[j + 1];
                    vec[j + 1] = vec[j];
                    vec[j] = temp;
                }
                // System.out.println("i="+i+" j="+j);
            }
        }

        // other impl
        /*  int temp;
        for (int i = 0; i < vec.length - 1; i++) {
        	for (int j = i + 1; j < vec.length; j++) {
        		if (vec[i] < vec[j]) {
        			temp = vec[i];
        			vec[i] = vec[j];
        			vec[j] = temp;
        		}
        	}
        }*/

        System.out.println("ð������");
        // ��ӡ����õĽ��
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }

        // ��������(Insertion Sort)
        // for (int i = 1; i < vec.length; i++) {
        // int j = i;
        // while (vec[j - 1] < vec[i]) {
        // vec[j] = vec[j - 1];
        // j--;
        // if (j <= 0) {
        // break;
        // }
        // }
        // vec[j] = vec[i];
        // }

        new Sort().sort(vec);

        System.out.println("���뷨");
        // ��ӡ����õĽ��
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }

        // ѡ������ ��ѡ���ϴ󣬺����ٸ��ϴ�� ð�ݵĸĽ�
        for (int i = 0; i < vec.length; i++) {
            for (int j = i + 1; j < vec.length; j++) {
                if (vec[j] > vec[i]) {
                    temp = vec[i];
                    vec[i] = vec[j];
                    vec[j] = temp;
                }
            }
        }
        System.out.println("ѡ������");
        // ��ӡ����õĽ��
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }

    }

    /**
     * ���뷨
     * 
     * @param data
     */
    public void sort(int[] data) {
        int temp;
        for (int i = 1; i < data.length; i++) {
            for (int j = i; (j > 0) && (data[j] > data[j - 1]); j--) {

                temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
            }
        }
    }

}
