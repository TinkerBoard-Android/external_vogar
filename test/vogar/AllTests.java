package vogar;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import vogar.android.DeviceRuntimeAdbTargetTest;
import vogar.android.DeviceRuntimeSshTargetTest;
import vogar.android.HostRuntimeLocalTargetTest;
import vogar.target.AssertTest;
import vogar.target.JUnitRunnerTest;

/**
 * Run the selection of tests that we know work.
 *
 * <p>This is needed as some of the tests do not run on the host. The tests will be removed if/when
 * we switch over to use standard JUnit.
 */
@SuiteClasses({
        AssertTest.class,
        DeviceRuntimeAdbTargetTest.class,
        DeviceRuntimeSshTargetTest.class,
        HostRuntimeLocalTargetTest.class,
        JUnitRunnerTest.class,
        ScriptBuilderEscapingTest.class
})
@RunWith(Suite.class)
public class AllTests {
}
