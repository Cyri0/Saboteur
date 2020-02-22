package tests;

import org.junit.jupiter.api.Test;

import service_layer_physics.Table;


class TableTest {
	
	@Test
	void testTableView() {
		
		Table.initTable();
		Table.printTableTypes();		
	}
}