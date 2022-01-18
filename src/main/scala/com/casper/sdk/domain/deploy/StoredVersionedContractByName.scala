package com.casper.sdk.domain.deploy

case class StoredVersionedContractByName (
                                     name:String,
                                     version:Option[Int],
                                     entry_point:String,
                                     override  val args: Seq[Seq[DeployNamedArg]]
                                    )  extends DeployExecutable(args) {
  def tag=4
}