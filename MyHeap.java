public class MyHeap{
  private static void pushDown(int[]data,int size,int index){
    //left
    int left = (index * 2) + 1;
    //right
    int right = (index * 2) + 1;
    if (size % 2 == 0 && left == size - 1){
      if (data[index] < data[left]){
        int temp = data[index];
        data[index] = data[left];
        data[left] = temp;
        return;
      }
    }
    else{
      if (right < size && data[index] > data[left]){
        int temp = data[index];
        data[index] = data[left];
        data[left] = temp;
        pushDown(data,size,left);
      }
      else{
        int temp = data[index];
        data[index] = data[right];
        data[right] = temp;
      }
      if (right < size && data[index] < data[right]){
        int temp = data[index];
        data[index] = data[left];
        data[left] = temp;
        pushDown(data,size,left);
      }
      else{
        int temp = data[index];
        data[index] = data[right];
        data[right] = temp;
      }
    }

  }

  private static void pushUp(int[]data,int index){

  }

  public static void heapify(int[]){

  }

  public static void heapsort(int[]){

  }

}
