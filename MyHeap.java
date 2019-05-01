public class MyHeap{
  private static void pushDown(int[] data,int size,int index){
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

  private static void pushUp(int[] data,int index){
    int left = (index-1)/2;
    if (index == 0){
      return;
    }
    int temp = data[index];
    data[index] = data[left];
    data[left] = temp;
  }

  public static void heapify(int[] data){
    for (int i = data.length-1; i >= 0; i--){
      pushDown(data,data.length,i);
    }
  }

  public static void heapsort(int[]){
    heapify(data);
    int current = data.length - 1;
    while (current > 0){
      int temp = data[current];
      data[current] = data[0];
      data[0] = temp;
      pushDown(data,current,0);
      i--;
    }
  }

  public static void main(String[] args){
    int[] test1 = new int[]{}
  }

}
