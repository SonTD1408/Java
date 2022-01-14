class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}
public class TestCustomException {
    static void validate(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("sai thông tin rồi bạn ei!");
        }else{
            System.out.println("đúng r bạn ơi!");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        }catch (InvalidAgeException e){
            System.out.println("bắt exception đây, đứng lại");
            System.out.println(e);
        }
    }
}
