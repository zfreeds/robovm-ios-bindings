package org.robovm.bindings.gpgs;

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSError;

public interface GPGTurnBasedMatchesBlock {
	void invoke(NSArray matches, NSError error);
}
