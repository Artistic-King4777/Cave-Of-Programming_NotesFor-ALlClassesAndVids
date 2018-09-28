package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ17_fortyTwo_EnumTypesBasicAndAdvancedUsage.jojoTestCode;

public enum Creatures {
    BASILISK("Dash"), MERMAN("Orion"), DRAGON("Toothless");

    private String name;

    Creatures(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // You have to type out a toString your self and don't forget syntax
    public String toString() {
        return "This rare jojoTestCode is called: " + name;
    }

}
