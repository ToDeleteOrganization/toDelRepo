package com.test.dp.observer;

import com.test.dp.main.DPArguments;
import com.test.dp.main.DPExecutor;

public class ObserverDPExecutor implements DPExecutor{

	public void execute(DPArguments args) {
		Parent adina = new Mother();
		Parent ioan = new Mother();
		
		Children simo = new GirlChild("simo");
		Children raul = new BoyChild("raul");
		
		adina.watchOver(raul);
		adina.watchOver(simo);
		
		ioan.watchOver(raul);
		ioan.watchOver(simo);
	
		raul.whatDidYouDoKid(new CustomEvent("he broke the vase", EventType.BAD));
		raul.whatDidYouDoKid(new CustomEvent("He kissed a girl", EventType.GOOD));
		raul.whatDidYouDoKid(new CustomEvent("He got in a fight with a colleague", EventType.VERY_BAD));
	}

}
