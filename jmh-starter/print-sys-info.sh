#!/usr/bin/env bash
java -cp lib/benchmarks.jar zemian.oshi.PrintSystemInfo "$@" | tee target/sys-info.txt
