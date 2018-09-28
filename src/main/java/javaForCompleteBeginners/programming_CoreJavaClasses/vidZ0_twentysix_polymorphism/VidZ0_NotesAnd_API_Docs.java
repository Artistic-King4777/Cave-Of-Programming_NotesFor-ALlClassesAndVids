package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ0_twentysix_polymorphism;

import javaForCompleteBeginners.programming_CoreJavaClasses.vidY_twentyFive_PublicPrivateProtected.world.Flower;

public class VidZ0_NotesAnd_API_Docs {
    public static void main(String[] args) {

        /**
         * Polymorphism in a nutshell:
         *  If you have a child class of some parent class you can
         *    always use the child class anywhere you would normally
         *    use the parent class
         *
         *
         */
        Plant plant1 = new Plant();

        // Tree is a kind of Plant (it extends Plant)
        Tree tree = new Tree();

        // Polymorphism guarantees that we can use a child class
        //   wherever a parent class is expected.
        //   it will call thr methods in Tree becuase what the variable
        //     is pointing at
        Plant plant2 = tree;

        // plant2 references a Tree, so the Tree grow() method is called.
        plant2.grow();

        // The type of the reference decided what methods you can actually call;
        // we need a Tree-type reference to call tree-specific methods.
        tree.shedLeaves();

        // ... so this won't work.
        //   becuase even though its pointing to tree
        //    its object is a Plant so it cant call the Tree methods
        //plant2.shedLeaves();

        // Another example of polymorphism.
        //   Wherever a parent class is expected I can use a child
        //     class of that parent
        doGrow(tree);
        System.out.println("////////////// MY CODE ////////////////////");

        Plant plant = new Plant();
        Tree trees = new Tree();
        Flowersz flow = new Flowersz();
        Beez bee = new Beez();

        // made flower extend plant
        doGrow(flow);

        // bee extends flower which extends plant so it
        //   can call it to
        doGrow(bee);
        // works cuz flowersz is extend from plant
        Plant tree2 = flow;

        // wont work error
        //Tree tree3 = flow;






    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }



}
