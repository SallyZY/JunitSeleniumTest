package junit_test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by yingzhang on 15/12/2017.
 */
public class TestRunner {

    public static void main(String[] args){
        System.out.println("Hello Runner!");
        Result result = JUnitCore.runClasses(TestSuite.class);

        for (Failure failure:result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}


//    TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class );
//    TestResult result = new TestResult();
//      suite.run(result);
//              System.out.println("Number of test cases = " + result.runCount());
