// Create a function that calculates the area of a rectangle. If either the height or width is zero or negative, return -1.

// Examples
// area(3, 4) ➞ 12

// area(10, 11) ➞ 110

// area(-1, 5) ➞ -1

// area(0, 2) ➞ -1
// Notes
// N/A

int area(int h,int w){
  if(h<=0||w<=0){
return -1;
  }
return h*w;
}
