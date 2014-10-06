package org.mockito.junit;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class MockitoJUnitRuleTest {

    @Rule
    public MockitoJUnitRule mockitoJUnitRule = new MockitoJUnitRule();

    @Mock
    private Injected injected;

    @InjectMocks
    private InjectInto injectInto;

    @Test
    public void testInjectMocks() throws Exception {
        assertNotNull("Mock created", injected);
        assertNotNull("Object created", injectInto);
        assertEquals("A injected into B", injected, injectInto.getInjected());

    }

    public static class Injected {
    }

    public static class InjectInto {

        private Injected injected;

        public Injected getInjected() {
            return injected;
        }
    }
}