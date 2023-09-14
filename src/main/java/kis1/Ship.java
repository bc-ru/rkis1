package kis1;

import java.util.Objects;

/**
 * This class represents a "Корабль"
 */
public class Ship {
    private String name;
    private String codeNumber;
    private int yearMade;
    private int capacity;
    private int weight;

    /** A constructor with no args. */
    public Ship() {
        this.name = "undefined";
        this.codeNumber = "undefined";
        this.yearMade = -1;
        this.capacity = -1;
        this.weight = -1;
    }

    /**
     * A constructor with args which defines all of the fields of class
     * 
     * @param name
     * @param codeNumber
     * @param yearMade
     * @param weight
     * @param capacity
     */
    public Ship(String name, String codeNumber, int yearMade, int weight, int capacity) {
        this.name = name;
        this.codeNumber = codeNumber;
        this.yearMade = yearMade;
        this.capacity = capacity;
        this.weight = weight;
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
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ship person = (Ship) obj;
        return this.yearMade == person.yearMade && name.equals(person.name);
    }

    /**
     * Returns a hash code value for the object. This method is supported for the
     * benefit of hash tables such as those provided by java.util.HashMap.
     * 
     * @return a cash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, codeNumber, yearMade, capacity,
                weight);
    }

    /**
     * Returns a string representation of the object.
     * 
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "name=" + name
                + ", codeNumber=" + codeNumber
                + ", yearMade=" + yearMade
                + ", capacity=" + capacity
                + ", weight=" + weight
                + '\n';
    }

    /**
     * Returns a value of {@code name} field of the class object
     * 
     * @return String {@code name}
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns a value of {@code codeNumber} field of the class object
     * 
     * @return String {@code codeNumber}
     */
    public String getCodeNumber() {
        return this.codeNumber;
    }

    /**
     * Returns a value of {@code yearMade} field of the class object
     * 
     * @return int {@code yearMade}
     */
    public int getYearMade() {
        return this.yearMade;
    }

    /**
     * Returns a value of {@code capacity} field of the class object
     * 
     * @return int {@code capacity}
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Returns a value of {@code weight} field of the class object
     * 
     * @return int {@code weight}
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Set {@code name} field value to an class' obj
     * 
     * @param name
     */
    public void setName(String name) throws IllegalArgumentException {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Argument does not match a defined format");
        }
        this.name = name;
    }

    /**
     * Set {@code codeNumber} field value to an class' obj
     * 
     * @param codeNumber
     */
    public void setCodeNumber(String codeNumber) throws IllegalArgumentException {
        if (codeNumber == null || codeNumber.length() == 0) {
            throw new IllegalArgumentException("Argument does not match a defined format");
        }
        this.codeNumber = codeNumber;
    }

    /**
     * Set {@code yearMade} field value to an class' obj
     * 
     * @param yearMade
     */
    public void setYearMade(int yearMade) throws IllegalArgumentException {
        if (yearMade <= 0) {
            throw new IllegalArgumentException("Argument does not match a defined format");
        }
        this.yearMade = yearMade;
    }

    /**
     * Set {@code capacity} field value to an class' obj
     * 
     * @param capacity
     */
    public void setCapacity(int capacity) throws IllegalArgumentException {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Argument does not match a defined format");
        }
        this.capacity = capacity;
    }

    /**
     * Set {@code weight} field value to an class' obj
     * 
     * @param weight
     */
    public void setWeight(int weight) throws IllegalArgumentException {
        if (weight <= 0) {
            throw new IllegalArgumentException("Argument does not match a defined format");
        }
        this.weight = weight;
    }

}