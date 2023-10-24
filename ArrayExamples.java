public class ArrayExamples {

  // Changes the input array to be in reversed order
  // bug here
  static void reverseInPlace(int[] arr) {
    int[] copiedArr = new int[arr.length];
    
    // makes sure copiedArr is its own array
    for (int i = 0; i < arr.length; i += 1) {
      copiedArr[i] = arr[i];
    }

    // reverses the array by taking the values from copiedArr and updated the original array
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = copiedArr[copiedArr.length - 1 - i];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  // bug here
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1]; // reversed arr[i] = newArray[arr.length - i - 1] to newArray[i] = arr[arr.length - i - 1];
    }
    return newArray; // returns newArray instead of arr
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }


}

