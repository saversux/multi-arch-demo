package de.bernhart;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;
import lombok.extern.slf4j.Slf4j;

@QuarkusMain
@Slf4j
public class MultiApp {
    public static void main(String ... args) {
        log.info("Hello, I am running on: " + System.getProperty("os.arch"));
        Quarkus.run(args);
    }
}
