package usantatecla.tictactoe.launchers.server.dispatchers;

import usantatecla.tictactoe.controllers.interfaces.PlayController;

public class PlayerTypeDispatcher extends Dispatcher {

    public PlayerTypeDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).getTypeOfTokenPlayerFromTurn());
	}
    
}