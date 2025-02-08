package StrategyPattern;

public interface Authenticator {
    void logIn();

    Authenticator passwordAuthenticator = () -> System.out.println("Logging in with username and password");

    Authenticator singleSignOn = () -> System.out.println("Logging in with single sign-on");
}
