package ru.hh.web.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/credentials.properties"
})

public interface CredentialsConfig extends Config{
    @Key("loginAccount")
    String getLoginAccount();

    @Key("passwordAccount")
    String getPasswordAccount();
}