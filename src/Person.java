public class Person {
    int puppyAge;

    public Person(String name) {
        // This constructor has one parameter, name.
        System.out.println("The Name of the Puppy is : " + name );
    }

    public void setAge( int age ) {
        puppyAge = age;
    }

    public int getAge( ) {
        System.out.println("Puppy's age is : " + puppyAge );
        return puppyAge;
    }

    public static void main(String []args) {
      /* Object creation */
        Person myPuppy = new Person( "Tommy" );

      /* Call class method to set puppy's age */
        myPuppy.setAge( 4 );

      /* Call another class method to get puppy's age */
        myPuppy.getAge( );

      /* You can access instance variable as follows as well */
        System.out.println("Age in Dog Years : " + myPuppy.puppyAge * 7 );
    }
}