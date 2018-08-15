public class FleetOfThings {

    public static void main(String[] args) {

        Fleet fleet = new Fleet();
        fleet.add(new Thing("Get milk"));
        fleet.add(new Thing("Remove the obstacles"));
        Thing thing = new Thing("Stand up");
        thing.complete();
        fleet.add(thing);
        Thing thing2 = new Thing("Eat lunch");
        thing2.complete();
        fleet.add(thing2);


        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}