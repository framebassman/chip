/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package tech.romashov.dale.tests.api

import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test fun appHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}