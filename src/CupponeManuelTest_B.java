import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @before
 *
 */

class CupponeManuelTest_B {

	@Test
	void test() {
		CupponeManuelClass a = new CupponeManuelClass();
		int risultatoOttenuto = a.cupponeMet(2, 3);
		int risultatoAtteso = 8;
		assertEquals(risultatoAtteso, risultatoOttenuto);
		System.out.println(risultatoOttenuto); //0
	}
	
	@Test
	void test1() {
		CupponeManuelClass a = new CupponeManuelClass();
		int risultatoOttenuto = a.cupponeMet(2, 4);
		int risultatoAtteso = 16;
		assertEquals(risultatoAtteso, risultatoOttenuto);
		System.out.println(risultatoOttenuto);
		
	}
	
	@Test
	void test2() {
		CupponeManuelClass a = new CupponeManuelClass();
		int risultatoOttenuto = a.cupponeMet(2, 5);
		int risultatoAtteso = 32;
		assertEquals(risultatoAtteso, risultatoOttenuto);
		System.out.println(risultatoOttenuto);
		
	}

}
