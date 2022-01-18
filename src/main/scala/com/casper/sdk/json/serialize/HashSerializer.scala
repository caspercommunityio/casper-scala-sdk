package com.casper.sdk.json.serialize

import com.casper.sdk.domain.deploy.Hash
import com.casper.sdk.util.HexUtils
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.{JsonSerializer, SerializerProvider}

/**
 * Hash Custom Json serializer
 */

class HashSerializer extends JsonSerializer[Hash] {
  override def serialize(value: Hash, gen: JsonGenerator, serializers: SerializerProvider): Unit ={
    assert(value!=null)
    gen.writeString(HexUtils.toHex(value.hash))
  }
}
