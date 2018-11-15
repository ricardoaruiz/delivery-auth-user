package com.rar.deliveryauthuser.domain;

/**
 * Regras de acesso que estamos utilizando na aplicação.
 */

public enum Authorities {

    ROLE_USER,
    ROLE_ADMIN;

    public static String[] names() {
        String[] names = new String[values().length];
        for(int index = 0; index < values().length; index++) {
            names[index] = values()[index].name();
        }

        return names;
    }

}
