package com.example.beanvalidation.groups;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @ClassName   : Main
 * @Description : BeanValidation Groups example
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

        // test insert
        main.insertValidate();

        // test update
        main.updateValidate();
    }

    /**
     * @Title       : insertValidate
     * @Description : user domain validate
     * @date        : 2016. 4. 24.
     * @throws      : Exception
     */
    public void insertValidate() throws Exception {

        System.out.println("***************************** start insert Validation *****************************");
        User user = new User();
        user.setName(null);
        user.setAge(0);
        
        ValidatorFactory validatorfactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorfactory.getValidator();

        Set<ConstraintViolation<User>> constraintviolation = validator.validate(user, GroupsInterface.Insert.class);

        System.out.println("the number of constraint violation is " + constraintviolation.size());

        Iterator<ConstraintViolation<User>> iterator = constraintviolation.iterator();

        if(constraintviolation.size() == 0) {
            System.out.println("success");
        }else{
            while(iterator.hasNext()) {
                ConstraintViolation<User> constraintViolation = iterator.next();

                System.out.println("----------------------------------------------");
                System.out.println("class name      : " + constraintViolation.getRootBeanClass().getSimpleName());
                System.out.println("variable        : " + constraintViolation.getPropertyPath());
                System.out.println("invalid value   : " + constraintViolation.getInvalidValue());
                System.out.println("message         : " + constraintViolation.getMessage());
            }
        }
        System.out.println("***************************** end insert Validation *****************************");
    }

    /**
     * @Title       : updateValidate
     * @Description : user domain validate
     * @date        : 2016. 4. 24.
     * @throws      : Exception
     */
    public void updateValidate() throws Exception {

        System.out.println("***************************** start update Validation *****************************");
        User user = new User();
        user.setName(null);
        user.setAge(0);

        ValidatorFactory validatorfactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorfactory.getValidator();

        Set<ConstraintViolation<User>> constraintviolation = validator.validate(user, GroupsInterface.Update.class);
        
        System.out.println("the number of constraint violation is " + constraintviolation.size());
        
        Iterator<ConstraintViolation<User>> iterator = constraintviolation.iterator();
        
        if(constraintviolation.size() == 0) {
            System.out.println("success");
        }else{
            while(iterator.hasNext()) {
                ConstraintViolation<User> constraintViolation = iterator.next();

                System.out.println("----------------------------------------------");
                System.out.println("class name      : " + constraintViolation.getRootBeanClass().getSimpleName());
                System.out.println("variable        : " + constraintViolation.getPropertyPath());
                System.out.println("invalid value   : " + constraintViolation.getInvalidValue());
                System.out.println("message         : " + constraintViolation.getMessage());
            }
        }
        System.out.println("***************************** end update Validation *****************************");
    }
}