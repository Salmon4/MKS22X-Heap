public class MyHeap{
  private static void pushDown(int[] data,int size,int index){
    //left
    int left = (index * 2) + 1;
    //right
    int right = (index * 2) + 2;
    if (size % 2 == 0 && left == size - 1){
      if (data[index] < data[left]){
        int temp = data[index];
        data[index] = data[left];
        data[left] = temp;
        return;
      }
    }
    else{
      if (right < size && data[index] < data[left]){
        if (data[left] > data[right]){
          int temp = data[index];
          data[index] = data[left];
          data[left] = temp;
          pushDown(data,size,left);
        }
        else{
          int temp = data[index];
          data[index] = data[right];
          data[right] = temp;
          pushDown(data,size,right);
        }
      }

      if (right < size && data[index] < data[right]){
        if (data[left] > data[right]){
          int temp = data[index];
          data[index] = data[left];
          data[left] = temp;
          pushDown(data,size,left);
        }
        else{
          int temp = data[index];
          data[index] = data[right];
          data[right] = temp;
          pushDown(data,size,right);
        }
      }
    }
  }

  private static void pushUp(int[] data,int index){
    int left = (index-1)/2;
    if (index == 0){
      return;
    }
    if (data[index] > left){
    int temp = data[index];
    data[index] = data[left];
    data[left] = temp;
    pushUp(data,left);
  }
  return;
  }

  public static void heapify(int[] data){
    for (int i = data.length-1; i >= 0; i--){
      pushDown(data,data.length,i);
    }
  }

  public static void heapsort(int[] data){
    heapify(data);
    int current = data.length - 1;

    while (current >= 0){
      int temp = data[current];
      data[current] = data[0];
      data[0] = temp;
      pushDown(data,current,0);
      current--;
    }
  }

  public static void main(String[] args){
    int[] test1 = new int[]{3,5,1,2,6};
    HeapPrinter.print(test1);
    heapify(test1);
    HeapPrinter.print(test1);
    heapsort(test1);
    HeapPrinter.print(test1);

    int[] test2 = new int[]{3,5,1,2,6,5,1,2,0,35,2,78,31};
    HeapPrinter.print(test2);
    heapify(test2);
    HeapPrinter.print(test2);
    heapsort(test2);
    String ans = "";
    for (int i = 0; i < test2.length; i++){
      ans += test2[i] + ", ";
    }
    System.out.println(ans);
  }

}
