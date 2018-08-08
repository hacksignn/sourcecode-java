package com.pcc.th.yyy;

abstract class Report {
	abstract void createHeader();
	abstract void createBody();
	abstract void createFooter();
}

class Report1 extends Report {

	@Override
	void createHeader() {
	}

	@Override
	void createBody() {
	}

	@Override
	void createFooter() {
	}
	
}