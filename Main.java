public class Main {
    public static void main(String[] args) {
        CourierServiceInventory inventory = new CourierServiceInventory();
        inventory.addPackage(new Package(new Sender("Anam","03004209211","Faisalabad"), new Receiver("Marva", "0300123455", "Faisalabad"), PackageType.MEDIUM, 45.3, 22.5));
        inventory.addPackage(new Package(new Sender("Anam","03004209211","Faisalabad"), new Receiver("Muaz", "03001234", "Lahore"), PackageType.LARGE, 45.3, 22.5));
        inventory.addPackage(new Package(new Sender("Anam","03004209211","Faisalabad"), new Receiver("Asad", "03001255", "Faisalabad"), PackageType.MEDIUM, 45.3, 22.5));
        System.out.println("=== Package Inventory ===");
        inventory.displayPackages();
        inventory.removePackageById(2);
        System.out.println();
        System.out.println();
        System.out.println("=== Updated Package Inventory ===");
        inventory.displayPackages();
        System.out.println();
        System.out.println();
        System.out.println("=== Getting Package From Inventory ===");
        System.out.println(inventory.searchPackage(2));

    }
}