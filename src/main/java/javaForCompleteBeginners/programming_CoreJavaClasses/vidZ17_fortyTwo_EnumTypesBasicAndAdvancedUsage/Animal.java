package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ17_fortyTwo_EnumTypesBasicAndAdvancedUsage;

public enum Animal {
    CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "This animal is called: " + name;
    }
}
