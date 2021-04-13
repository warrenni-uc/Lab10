/*
Nick Warren
Lab 10
4 12 2021
*/
class Main {
  public static void main(String[] args) {
    
    Sugar tree = new Sugar("tree");
    tree.cut("Tree", 10);
    tree.bake(12, 350);
    tree.decor();

    Sugar aCookie = new Sugar();
    aCookie.decor();

  } //end of main method/
} //end of main class.
