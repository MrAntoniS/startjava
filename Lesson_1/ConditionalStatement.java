public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if(age > 20) {
            System.out.println("Родился до 2000 года");
        }
        boolean isMaleSex = true;
        if(isMaleSex == true) {
            System.out.println("Мужик");
        }
        boolean isNotMaleSex = true;
        if(isNotMaleSex == true) {
            System.out.println("Женщина");
        }
        double height = 1.90;
        if(height < 1.80) {
            System.out.println("Низкий");
        } else {
            System.out.println("Высокий");
        }
        char firstLetterOfName = 'K';
        if(firstLetterOfName == 'M') {
            System.out.println("Его зовут Michael");
        }else if(firstLetterOfName == 'I') {
            System.out.println("Его зовут Ivan");
        }else {
            System.out.println("Его имя неизвестно");
        }
    }
}
