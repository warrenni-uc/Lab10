class Cookie {

private int bakeTime;
private int bakeTemp;
private int numberCookies;
private boolean isBaked;

Cookie() {
bakeTime = 0;
bakeTemp = 0;
numberCookies = 0;
isBaked = false;
} //end of constructor.

Cookie(int aBakeTime, int aBakeTemp, int aNumberCookies) {
bakeTime = aBakeTime;
bakeTemp = aBakeTemp;
numberCookies = aNumberCookies;
isBaked = false;
} //end of constructor.

int getBakeTime() {
return bakeTime;
} //end of BakeTime accessor.

int getBakeTemp() {
return bakeTemp;
} //end of BakeTemp accessor.

int getNumberCookies() {
return numberCookies;
} //end of NumberCookie accessor.

boolean getIsBaked() {
return isBaked;
} //end of IsBaked accessor.

void setBakeTime(int aBakeTime) {
bakeTime = aBakeTime;
} //end of BakeTime mutator.

void setBakeTemp(int aBakeTemp) {
bakeTemp = aBakeTemp;
} //end of BakeTemp mutator.

void setNumberCookies(int aNumberCookies) {
numberCookies = aNumberCookies;
} //end of NumberCookies mutator.

void bake(int aBakeTime, int aBakeTemp) {
bakeTime = aBakeTime;
bakeTemp = aBakeTemp;
isBaked = true;
System.out.println(numberCookies + " cookies were baked at " + bakeTemp + " degrees F for " + bakeTime + " minutes.");
} //end of Bake method.

void print() {
System.out.println("Bake Time: " + bakeTime);
System.out.println("Bake Temp: " + bakeTemp);
System.out.println("Number of Cookies " + numberCookies);
System.out.println("Is Baked: " + isBaked);
} //end of print method.

} //end of class.

