package de.jungblut.math.squashing;

import junit.framework.TestCase;

import org.junit.Test;

import de.jungblut.math.DoubleMatrix;
import de.jungblut.math.dense.DenseDoubleMatrix;

public class LogisticErrorFunctionTest extends TestCase {

  @Test
  public void testSigmoidError() {
    DoubleMatrix y = new DenseDoubleMatrix(new double[] { 0d, 1d, 0d, 1d, 0d },
        1, 5);
    DoubleMatrix hypothesis = new DenseDoubleMatrix(new double[] { 0d, 0d, 0d,
        1d, 0d }, 1, 5);
    double error = new LogisticErrorFunction().calculateError(y, hypothesis);
    assertEquals(10d, error);
  }

}