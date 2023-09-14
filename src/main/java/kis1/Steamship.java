package kis1;

import java.util.Objects;

/*
 * This class represents an "Пароход".
 */
public class Steamship extends Ship {

    private String captainName;
    private int wheelDiameter;

    /** A constructor with no args. */
    public Steamship() {
        super();
        this.captainName = "undefined";
        this.wheelDiameter = -1;
    }

    /**
     * A constructor with args which defines all of the fields of a parent class +
     * Employee class.
     * 
     * @param name
     * @param codeNumber
     * @param yearMade
     * @param weight
     * @param capacity
     * @param captainName
     * @param wheelDiameter
     */
    public Steamship(String name, String codeNumber, int yearMade, int weight, int capacity,
            String captainName, int wheelDiameter) {

        super(name, codeNumber, yearMade, weight, capacity);
        this.captainName = captainName;
        this.wheelDiameter = wheelDiameter;
    }

    /**
     * Returns a string representation of the object.
     * 
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString() + "captainName=" + captainName
             + ", wheelDiameter= " + wheelDiameter;
    }

    /**
     * Returns a hash code value for the object. This method is supported for the
     * benefit of hash tables such as those provided by java.util.HashMap.
     * 
     * @return a cash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.captainName, this.wheelDiameter);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * The {@code equals} method implements an equivalence relation
     * on non-null object references:
     * <ul>
     * <li>It is <i>reflexive</i>: for any non-null reference value
     * {@code x}, {@code x.equals(x)} should return
     * {@code true}.
     * <li>It is <i>symmetric</i>: for any non-null reference values
     * {@code x} and {@code y}, {@code x.equals(y)}
     * should return {@code true} if and only if
     * {@code y.equals(x)} returns {@code true}.
     * <li>It is <i>transitive</i>: for any non-null reference values
     * {@code x}, {@code y}, and {@code z}, if
     * {@code x.equals(y)} returns {@code true} and
     * {@code y.equals(z)} returns {@code true}, then
     * {@code x.equals(z)} should return {@code true}.
     * <li>It is <i>consistent</i>: for any non-null reference values
     * {@code x} and {@code y}, multiple invocations of
     * {@code x.equals(y)} consistently return {@code true}
     * or consistently return {@code false}, provided no
     * information used in {@code equals} comparisons on the
     * objects is modified.
     * <li>For any non-null reference value {@code x},
     * {@code x.equals(null)} should return {@code false}.
     * </ul>
     *
     * <p>
     * An equivalence relation partitions the elements it operates on
     * into <i>equivalence classes</i>; all the members of an
     * equivalence class are equal to each other. Members of an
     * equivalence class are substitutable for each other, at least
     * for some purposes.
     *
     * @implSpec
     *           The {@code equals} method for class {@code Object} implements
     *           the most discriminating possible equivalence relation on objects;
     *           that is, for any non-null reference values {@code x} and
     *           {@code y}, this method returns {@code true} if and only
     *           if {@code x} and {@code y} refer to the same object
     *           ({@code x == y} has the value {@code true}).
     *
     *           In other words, under the reference equality equivalence
     *           relation, each equivalence class only has a single element.
     *
     * @apiNote
     *          It is generally necessary to override the {@link hashCode hashCode}
     *          method whenever this method is overridden, so as to maintain the
     *          general contract for the {@code hashCode} method, which states
     *          that equal objects must have equal hash codes.
     *
     * @param obj the reference object with which to compare.
     * @return {@code true} if this object is the same as the obj
     *         argument; {@code false} otherwise.
     * @see #hashCode()
     * @see java.util.HashMap
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Steamship employee = (Steamship) obj;
        return wheelDiameter == employee.wheelDiameter && captainName.equals(
                employee.captainName);
    }

    /**
     * Returns a value of {@code captainName} field of the class object
     * 
     * @return String {@code captainName}
     */
    public String getWorkPlace() {
        return this.captainName;
    }



    /**
     * Returns a value of {@code wheelDiameter} field of the class object
     * 
     * @return int {@code wheelDiameter}
     */
    public int getWheelDiameter() {
        return this.wheelDiameter;
    }

    /**
     * Set {@code captainName} field value to an class' obj
     * 
     * @param captainName
     */
    public void setWorkPlace(String captainName) throws IllegalArgumentException {
        if (captainName == null || captainName.length() == 0) {
            throw new IllegalArgumentException("Argument does not match a defined format");
        }
        this.captainName = captainName;
    }


    /**
     * Set {@code position} field value to an class' obj
     * 
     * 
     * @param wheelDiameter
     */
    public void setWheelDiameter(int wheelDiameter) throws IllegalArgumentException {
        if (wheelDiameter < 0) {
            throw new IllegalArgumentException("Argument does not match a defined format");
        }
        this.wheelDiameter = wheelDiameter;
    }
}
