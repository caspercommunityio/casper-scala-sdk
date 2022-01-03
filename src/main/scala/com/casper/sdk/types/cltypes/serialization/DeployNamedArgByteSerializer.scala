package com.casper.sdk.types.cltypes.serialization
import com.casper.sdk.domain.deploy.*
import com.casper.sdk.types.cltypes.*
import com.casper.sdk.util.{ByteUtils, HexUtils}

import java.nio.charset.StandardCharsets
import scala.collection.mutable.ArrayBuilder

/**
 * DeployNamedArg bytes serializer
 */
class DeployNamedArgByteSerializer extends BytesSerializable[DeployNamedArg] {

  def toBytes(value: DeployNamedArg): Array[Byte] = {
    assert(value!=null)
    val builder = new ArrayBuilder.ofByte
    builder.addAll(CLValue.U32(value.name.getBytes().length).bytes)
    .addAll(value.name.getBytes())
    .addAll(new CLValueByteSerializer().toBytes(value.value))
      builder.result()
  }
}