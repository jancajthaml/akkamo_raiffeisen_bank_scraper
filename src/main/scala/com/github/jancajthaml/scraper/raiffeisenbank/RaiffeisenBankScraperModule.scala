package com.github.jancajthaml.scraper.raiffeisenbank

import akka.event.LoggingAdapter
import eu.akkamo
import eu.akkamo.{Context, Dependency, LoggingAdapterFactory, Res}

import scala.util.Try

class RaiffeisenBankScraperModule extends akkamo.Module with akkamo.Initializable {

  override def dependencies(dependencies: Dependency): Dependency = dependencies
    .&&[akkamo.LogModule]

  override def initialize(ctx: Context): Res[Context] = Try {
    // inject dependencies
    val log: LoggingAdapter = ctx.get[LoggingAdapterFactory] apply getClass

    log.info("Initializing RaiffeisenBank Scraper module")

    ctx
  }
}