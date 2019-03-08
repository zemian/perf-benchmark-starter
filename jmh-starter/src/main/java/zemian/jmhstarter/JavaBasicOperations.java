/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package zemian.jmhstarter;

import java.math.BigDecimal;
import org.openjdk.jmh.annotations.Benchmark;

public class JavaBasicOperations {
    public static class Foo {
        int hello() {
            return 0;
        }
    }

    @Benchmark
    public void emptyMethod() {
    }

    @Benchmark
    public Foo newInstance() {
        return new Foo();
    }

    @Benchmark
    public Foo[] newArray() {
        return new Foo[1];
    }

    @Benchmark
    public int newInstanceAndCallMethod() {
        return new Foo().hello();
    }

    @Benchmark
    public int ifStatementWithBooleanParse() {
        boolean ifStatementFlag = Boolean.parseBoolean(System.getProperty("ifStatementFlag", "true"));
        if (ifStatementFlag) {
            return 0;
        }
        return -1;
    }

    @Benchmark
    public int for1000Loop() {
        int c = 0;
        for (int i = 0; i < 1000; i++) {
            c++;
        }
        return c;
    }

    @Benchmark
    public int while1000Loop() {
        int c = 0;
        while (c < 1000) {
            c++;
        }
        return c;
    }

    @Benchmark
    public int simpleIntMath() {
        return (1 + 2) * 3 / 4 - 5;
    }

    @Benchmark
    public double simpleDoubleMath() {
        return (1.0 + 2.0) * 3.0 / 4.0 - 5.0;
    }

    @Benchmark
    public BigDecimal simpleBigDecimalMath() {
        BigDecimal ret = BigDecimal.valueOf(1.0)
            .add(BigDecimal.valueOf(2.0))
            .multiply(BigDecimal.valueOf(3.0))
            .divide(BigDecimal.valueOf(4.0))
            .subtract(BigDecimal.valueOf(5.0));
        return ret;
    }

    @Benchmark
    public double[] complexMathWithSqrt() {
        double a = 2.3, b = 4, c = 5.6;
        double determinant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
        return new double[]{root1, root2};
    }

    @Benchmark
    public int complexMathWithTrig() {
        double i = Math.PI - 1;
        double a = Math.sin(i) / Math.cos(i);
        double b = Math.tan(i);
        return Double.compare(a, b);
    }

    @Benchmark
    public boolean parseBoolean() {
        return Boolean.parseBoolean("true");
    }

    @Benchmark
    public int parseInteger() {
        return Integer.parseInt("99");
    }

    @Benchmark
    public double parseDouble() {
        return Double.parseDouble("0.399999");
    }
}
