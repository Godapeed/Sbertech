package OOP.Phone;

public class Phone {
        private final String number;
        private final String model;
        private String weight;

        Phone(String n, String m, String w){
            this.number = n;
            this.model = m;
            this.weight = w;
        }
        Phone(String n, String m){
            this.number = n;
            this.model = m;
        }
        Phone(){
            this.number = "Standart";
            this.model = "Standart";
            this.weight = "Standart";
        }
        public void receiveCall(String name) {
            System.out.println("Звонит: " + name);
        }
        public String getNumber(){
            return this.number;
        }
        public void receiveCall(String name, String number){
            return;
        }
        public void sendMessage(String[] numbers){
            for (String number: numbers){
                System.out.println(number);
            }
        }
        public String toString() {
            return number+" "+model+" "+weight;
        }
}