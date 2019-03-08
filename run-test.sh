#!/usr/bin/env bash

REPORT="reports/benchmarks-$(uname -s)_$(date +%Y%m%d%H%M%S).txt"
java -jar test/dist/benchmarks.jar -f 1 -wi 1 -i 1 -o $REPORT
git add "$REPORT"
git ci -m "Add $REPORT"
