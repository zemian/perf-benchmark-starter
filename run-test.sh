#!/usr/bin/env bash

java -jar test/dist/benchmarks.jar | tee reports/test-$(uname -s)_$(date +%s).txt
