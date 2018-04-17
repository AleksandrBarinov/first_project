package seventh.calc;

import org.junit.Test;

import static org.junit.Assert.*;


public class CalcTests {

    //create object test
    @Test
    public void createServiceObject() {
        Service testCreateService = new Service();
        assertFalse(testCreateService.equals(null));
    }
    //wrong input test
    @Test(expected = CustomException.class)
    public void input() throws CustomException {
        Service wrongInput = new Service();
        wrongInput.addition("wrong", "input");
        //wrongInput.addition("4", "2");
    }
    //wrong operation symbol test
    @Test(expected = CustomException.class)
    public void charTest() throws CustomException {
        Service charTest = new Service();
        charTest.makeOperationChar('s');

    }
    //***********************************************
        //addiction test
        @Test
        public void add () throws CustomException {
            Service testAdd = new Service();
            testAdd.addition("20", "15");
        }
        //subtraction test
        @Test
        public void sub () throws CustomException {
            Service testSub = new Service();
            testSub.subtraction("20", "15");
        }
        //multiplication test
        @Test
        public void mul () throws CustomException {
            Service testMul = new Service();
            testMul.multiplication("20", "2");
        }
        //division test
        @Test
        public void div () throws CustomException {
            Service testDiv = new Service();
            testDiv.division("20", "2");
        }
        //division by zero test
        @Test(expected = CustomException.class)
        public void divByZero () throws CustomException {
            Service test = new Service();
            test.division("3", "0");
        }
    }
