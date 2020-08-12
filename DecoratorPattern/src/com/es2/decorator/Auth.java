package com.es2.decorator;

public class Auth implements AuthInterface {

    @Override
    public void auth(String username, String password) throws AuthException {
        if (!username.equals("admin") || !password.equals("admin")) {
            throw new AuthException();
        }
    }
}
