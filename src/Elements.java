class Fire {

    public String toString() {
            return "Fire";
    }

    public void method1() {
      System.out.println("Fire 1");
            }

    public void method2() {
      System.out.println("Fire 2");
    }
}


class Ice extends Fire {

    public void method1() {
    System.out.println("Ice 1");
    }
}

class Rain extends Fire {

    public String toString() {
    return "Rain";
    }

    public void method1() {
    System.out.println("Rain 1");
    }
}

class Snow extends Rain {
 
    public void method2() {
        System.out.println("Snow 2");
    }
}

public class Elements {

    public static void main(String[] args) {
    	Fire[] elements = { new Fire(), new Snow(), new Rain(), new Ice()};
    	for (int i = 0; i < elements.length; i++) {
    		System.out.println(elements[i]);
        	elements[i].method1();
                elements[i].method2();
            	if (elements[i] instanceof Snow)
        		System.out.println("Element is a Snow");
        	else if (elements[i] instanceof Rain)
        		System.out.println("Element is a Rain");
        	else if (elements[i] instanceof Ice)
        		System.out.println("Element is a Ice");
        	else if (elements[i] instanceof Fire)
        		System.out.println("Element is a Fire");
    	    }
    }
}

