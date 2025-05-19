public class Stringlinearsearch {
    public static String String(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) { // String operation 
                System.out.println("Food at Menu no. "+i);
                return key;
            }
        }
        System.out.println("Food not found");
        return null; // Returning String as null object 
    }

    public static void main(String[] args) {
        String menu[] = { "Butter Chicken",
                "Chole Bhature",
                "Biryani",
                "Dosa",
                "Paneer Tikka",
                "Samosa",
                "Naan",
                "Gulab Jamun",
                "Palak Paneer",
                "Tandoori Chicken",
                "Rogan Josh",
                "Masala Dosa",
                "Aloo Gobi",
                "Dal Makhani",
                "Idli Sambar",
                "Pav Bhaji",
                "Vada Pav",
                "Rajma Chawal",
                "Malai Kofta",
                "Rasgulla" };
                String(menu,"Tandoori Chicken");
    }
}
