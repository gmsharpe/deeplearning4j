// automatically generated by the FlatBuffers compiler, do not modify

package nd4j.graph;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FlatResult extends Table {
  public static FlatResult getRootAsFlatResult(ByteBuffer _bb) { return getRootAsFlatResult(_bb, new FlatResult()); }
  public static FlatResult getRootAsFlatResult(ByteBuffer _bb, FlatResult obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FlatResult __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public nd4j.graph.FlatVariable variables(int j) { return variables(new nd4j.graph.FlatVariable(), j); }
  public nd4j.graph.FlatVariable variables(nd4j.graph.FlatVariable obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int variablesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }

  public static int createFlatResult(FlatBufferBuilder builder,
      int id,
      int variablesOffset) {
    builder.startObject(2);
    FlatResult.addVariables(builder, variablesOffset);
    FlatResult.addId(builder, id);
    return FlatResult.endFlatResult(builder);
  }

  public static void startFlatResult(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static void addVariables(FlatBufferBuilder builder, int variablesOffset) { builder.addOffset(1, variablesOffset, 0); }
  public static int createVariablesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startVariablesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endFlatResult(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishFlatResultBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
}

