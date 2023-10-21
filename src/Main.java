public class Main {
    public static void main(String[] args) {
        public class Main {
            private static java.lang.String superAbility;

            public static void main(String[] args) {
                Hero[] heroes = new Hero[3];
                heroes[0] = new Magic(100, 50, "Teleportation");
                heroes[1] = new Medic(150, 20, "Healing", 50);
                heroes[2] = new Warrior(200, 100, "Critical Damage");

                public void increaseExperience() {
                    healPoints += healPoints * 0.1;
                }
                for (Hero hero : heroes) {
                    hero.applySuperAbility();

                    if (hero instanceof Medic) {
                        Medic medic = (Medic) hero;
                        medic.increaseExperience();
                    }
                    @Override
                    public void applySuperAbility() {
                        increaseExperience();
                        System.out.println("Medic применил суперспособность: " + superAbility);
                    }
                }
            }
        };
    }
}