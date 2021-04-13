class Sugar extends Cookie {
private String shape;
private boolean isDecor;

Sugar() {
shape = "";
isDecor = false;
} //end of constructor.

Sugar(String aShape) {
shape = aShape;
isDecor = false;
} //end of constructor.

String getShape() {
return shape;
} //end of getShape.

boolean getIsDecor() {
return isDecor;
} //end of getIsDecor.

void setShape(String aShape) {
shape = aShape;
} //end of setShape.

void setIsDecor(boolean aIsDecor) {
isDecor = aIsDecor;
} //end of setIsDecor method.

void cut(String aShape, int aNumber) {
shape = aShape;
System.out.println(aNumber + " cookies were cut into a " + aShape + " shape.");
setNumberCookies(aNumber);
} //end of cut method.

void decor() {
if (getIsBaked() == true) {
setIsDecor(true);
System.out.println("The cookies have been decorated.");
} //end of if statement.

else {
System.out.println("Make sure to bake the cookies first!");
} //end of else statement.

}  //end of decor method.

void print() {
System.out.println("Shape " + shape);
System.out.println("Has Been Decorated: " + isDecor);
}//end of print method.

} //end of class.

