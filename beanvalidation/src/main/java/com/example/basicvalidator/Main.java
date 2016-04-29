package com.example.basicvalidator;

/**
 * @ClassName   : Main
 * @Description : BasicValidatior Example
 * @Author      : Jo Wontae
 * @Date        : 2016. 4. 24.
 */
public class Main {
    /**
     * @Title       : main
     * @Description : test execution
     * @date        : 2016. 4. 24.
     * @throws      : Exception
     */
    public static void main(String[] arg) throws Exception {
        Main main = new Main();

        User user = new User();
        user.setName(null);
        user.setAge(0);
        // test
        main.validate(user);
    }

    /**
     * @Title       : validate
     * @Description : user domain validate
     * @date        : 2016. 4. 24.
     * @throws      : Exception
     */
    public void validate(User user) throws Exception {
        if(user.getName() == null) {
            throw new IllegalArgumentException("이름은 필수 정보입니다.");
        }
        if(user.getAge() <= 19) {
            throw new IllegalArgumentException("나이는 19살 이상이어야 합니다.");
        }
    }
}