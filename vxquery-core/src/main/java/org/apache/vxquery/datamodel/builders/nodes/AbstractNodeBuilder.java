package org.apache.vxquery.datamodel.builders.nodes;

import java.io.IOException;

import edu.uci.ics.hyracks.data.std.util.ArrayBackedValueStorage;

public abstract class AbstractNodeBuilder {
    public abstract void reset(ArrayBackedValueStorage abvs) throws IOException;

    public abstract void finish() throws IOException;
}