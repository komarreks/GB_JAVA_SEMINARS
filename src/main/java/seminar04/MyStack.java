package seminar04;


    //size(), empty(), push(), peek(), pop().
    public class MyStack {
        private int[] arr = new int[10];
        private int size = 0;

        public int size(){
            return size;
        }

        boolean empty(){
            return size == 0;
        }

        public void push(int elem){
            if (size >= arr.length){
                int[] arr2 = new int[arr.length * 2];
                System.arraycopy(arr, 0, arr2, 0, arr.length);
                arr = arr2;
            }
            arr[size++] = elem;
        }

        public int peek(){
            return arr[size - 1];
        }

        public int pop(){
            return arr[--size];
        }
    }

