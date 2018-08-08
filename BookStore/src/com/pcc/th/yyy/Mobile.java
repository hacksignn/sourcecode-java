package com.pcc.th.yyy;

public interface Mobile {
	void call();
	void playMusic();
}

interface Mobile2018 {
	void takePhoto();
}

class IPhone implements Mobile, Mobile2018 {
	@Override
	public void takePhoto() {
	}

	@Override
	public void call() {
	}

	@Override
	public void playMusic() {
	}
}

class Samsung implements Mobile {
	@Override
	public void call() {
	}

	@Override
	public void playMusic() {
	}
}