package com.example.beanvalidation.payload;

import javax.validation.Payload;

public class PayloadInterface {
    public static interface Warning extends Payload {
    };

    public static interface Error extends Payload {
    };
}