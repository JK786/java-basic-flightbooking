package com.barebones;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BasicTest {

    @Mock
    List<String> mockedList;

    private static final Logger log = LoggerFactory.getLogger(BasicTest.class);


    @Test
    void mockWorks() {
        log.info("Hey whatsup how are you doing");
    }

}
