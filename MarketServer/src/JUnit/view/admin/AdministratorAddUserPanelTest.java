package JUnit.view.admin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import view.admin.AdministratorAddUserPanel;

public class AdministratorAddUserPanelTest {

	AdministratorAddUserPanel panel;
	@Before
	public void setUp() throws Exception 
	{
		panel=new AdministratorAddUserPanel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdministratorAddUserPanel() {
//		fail("Not yet implemented");
		assertNotNull(panel);
	}

	@Test
	public void testShowPanel() {
//		fail("Not yet implemented");
		panel.showPanel();
	}

	@Test
	public void testLoadPersonInfoPane() {
//		fail("Not yet implemented");
		panel.loadPersonInfoPane();
	}
}
