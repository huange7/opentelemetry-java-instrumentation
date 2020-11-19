/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.javaagent.instrumentation.finatra;

import io.opentelemetry.instrumentation.api.tracer.BaseTracer;

public class FinatraTracer extends BaseTracer {
  private static final FinatraTracer TRACER = new FinatraTracer();

  public static FinatraTracer tracer() {
    return TRACER;
  }

  @Override
  protected String getInstrumentationName() {
    return "io.opentelemetry.javaagent.finatra";
  }
}
