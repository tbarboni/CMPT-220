public class mistery {
    public static void main(String[] args) {
        int tooty = 12;
        int fruity = 3;
        int under = 9;
        int dog = 9;
        int bat = 1;
        int man = 3;
        System.out.println(!(under == dog || (bat * 3) == man));
        System.out.println(!((man * 3) == dog) || fruity < under);
        System.out.println(tooty > fruity && fruity < man);
        System.out.println(!(tooty > fruity) || !(fruity < man));
        System.out.println(tooty < man && man * fruity == under);
        
        int n = 20;
        System.out.print(n + " ");
        if (n > 10) {
        n = n / 2;
        } else {
        n = n + 7;
        }
        if (n * 2 < 25) {
        n = n + 10;
        }
        System.out.println(n);
    }
} 
