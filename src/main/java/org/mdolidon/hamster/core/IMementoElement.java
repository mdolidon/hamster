package org.mdolidon.hamster.core;

import java.io.Serializable;

/**
 * 
 * This open source project doesn't pay me enough for me to accept dealing with
 * Java's Cloneable lack of genericity.
 * 
 * Hence this interface. It is simply my own "Cloneable". Things that want to go
 * into the Memento may need to implement this.
 * 
 * @author mathias
 *
 */
public interface IMementoElement extends Serializable {

	/** I'd like to call this method "clone"... But afer all, no. */
	public IMementoElement cryogenize();

	public void setConfiguration_afterDeserialization(IConfiguration cfg);
}
