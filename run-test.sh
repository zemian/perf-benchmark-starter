#!/usr/bin/env bash

REPORT="reports/test-$(uname -s)_$(date +%Y%m%d%H%M%S).txt"
java -jar test/dist/benchmarks.jar | tee $REPORT
git add "$REPORT"
git ci -m "Add $REPORT"
